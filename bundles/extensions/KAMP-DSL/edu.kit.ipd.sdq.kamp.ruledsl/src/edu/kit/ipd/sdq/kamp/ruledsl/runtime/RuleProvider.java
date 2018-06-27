package edu.kit.ipd.sdq.kamp.ruledsl.runtime;

import static edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup.lookUpMarkedObjectsOfAType;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;
import edu.kit.ipd.sdq.kamp.ruledsl.support.ChangePropagationStepRegistry;
import edu.kit.ipd.sdq.kamp.ruledsl.support.IConfiguration;
import edu.kit.ipd.sdq.kamp.ruledsl.support.IRecursiveRule;
import edu.kit.ipd.sdq.kamp.ruledsl.support.IRule;
import edu.kit.ipd.sdq.kamp.ruledsl.support.IRuleProvider;
import edu.kit.ipd.sdq.kamp.ruledsl.support.KampRuleLanguageUtil;
import edu.kit.ipd.sdq.kamp.ruledsl.support.KampRuleStub;
import edu.kit.ipd.sdq.kamp.ruledsl.support.RegistryException;
import edu.kit.ipd.sdq.kamp.ruledsl.util.ErrorContext;
import edu.kit.ipd.sdq.kamp.ruledsl.util.RecursiveRuleBlock;
import edu.kit.ipd.sdq.kamp.ruledsl.util.ResultMap;
import edu.kit.ipd.sdq.kamp.ruledsl.util.RollbarExceptionReporting;
import edu.kit.ipd.sdq.kamp.ruledsl.util.RuleBlock;

/**
 * This class is also called the RuleRegistry.
 * It instantiates the rules which are registered by the Activator.
 * The Activator in contrast contains a dependency graph. 
 * This dependency graph is broken down into a list which constitutes a topological order in which the rules are instantiated and wired together.
 * <br /><br/>
 * The {@link RuleProvider#applyAllRules(AbstractArchitectureVersion, ChangePropagationStepRegistry, AbstractChangePropagationAnalysis)}
 * method is called by the KAMP propagation analysis once the user requests step 3: calculate change propagation.
 * <br /><br />
 * The rules are ran in arbitrary order. The registry does not guarantee any order. It is guaranteed that each rule is run exactly once unless
 * it was disabled by the user or a dependency injection default.
 * 
 * @author Martin Loeper
 *
 */
public class RuleProvider<T extends AbstractArchitectureVersion<M>, M extends AbstractModificationRepository<?, ?>> implements IRuleProvider<T, M> {
	
	private static final RollbarExceptionReporting REPORTING = RollbarExceptionReporting.INSTANCE;
	private final Map<IRule<EObject, EObject, T, M>, KampRuleStub> rules = new LinkedHashMap<>();
	private Consumer<Set<IRule<EObject, EObject, T, M>>> preHook;
	private IConfiguration configuration;

	@Override
	public final void applyAllRules(T version, ChangePropagationStepRegistry registry) {
		if(!REPORTING.isInitialized()) {
			REPORTING.init();
		}
				
		System.out.println("Applying all custom dsl rules...");
		
		if(this.preHook != null) {
			System.out.println("Running pre hook...");
			this.preHook.accept(this.rules.keySet());
		}
		
		// convert the rules into a sortable data structure
		ArrayList<Entry<IRule<EObject, EObject, T, M>, KampRuleStub>> rules = new ArrayList<Entry<IRule<EObject, EObject, T, M>, KampRuleStub>>(this.rules.entrySet());
		
		// 1. sort the rules
		rules.sort(new Comparator<Entry<IRule<EObject, EObject, T, M>, KampRuleStub>>() {

			@Override
			public int compare(Entry<IRule<EObject, EObject, T, M>, KampRuleStub> o1, Entry<IRule<EObject, EObject, T, M>, KampRuleStub> o2) {
				if (o1.getKey().getPosition() < o2.getKey().getPosition()) {
					return -1;
				} else if(o1.getKey().getPosition() > o2.getKey().getPosition()) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		
		// 2. iterate over rules + prepare rules and ResultMap
		ResultMap resultMap = new ResultMap();
		for(Entry<IRule<EObject, EObject, T, M>, KampRuleStub> cRuleEntry : rules) {
			IRule<?, ?, T, M> cRule = cRuleEntry.getKey();
			
			// prepare the rule
			cRule.setArchitectureVersion(version);
			cRule.setChangePropagationStepRegistry(registry);
			
			// prepare the storage of affected elements
			resultMap.init(cRule.getAffectedElementClass());
			resultMap.init(cRule.getSourceElementClass());
		}
		
		// 3. query the seed elements
		resultMap.populateSeedElements(version);
		
		// 4. build recursive and non-recursive blocks
		List<RuleBlock> blocks = new ArrayList<>();
		RuleBlock currentBlock = null;

		for(Entry<IRule<EObject, EObject, T, M>, KampRuleStub> cRuleEntry : rules) {
			IRule<EObject, EObject, T, M> cRule = cRuleEntry.getKey();
			if(cRule instanceof IRecursiveRule) {
				if(currentBlock == null || !(currentBlock instanceof RecursiveRuleBlock)) {
					// create a new recursive block
					currentBlock = new RecursiveRuleBlock(resultMap);
					blocks.add(currentBlock);
				}
			} else {
				if(currentBlock == null || currentBlock instanceof RecursiveRuleBlock) {
					// create new standard block
					currentBlock = new RuleBlock(resultMap);
					blocks.add(currentBlock);
				}
			}
			
			if(cRuleEntry.getValue().isActive()) {
				currentBlock.addRule(cRule);
			}
		}
		
		// 5. iterate over blocks and call lookup
		for(RuleBlock block : blocks) {
			block.runLookups();
		}
		
		// 6. iterate over blocks and run apply
		for(RuleBlock block : blocks) {
			block.runFinalizers();
		}
	}
	
	/**
	 * Registers the given {@code rule's class} by instantiating the given rule and storing it.
	 * Each concrete rule class may be present in registry only once.
	 *  
	 * @param rule the class of the rule which will be instantiated
	 */
	@Override
	public final void register(KampRuleStub ruleStub) throws RegistryException {	
		if(ruleStub.hasParent()) {
			// get the dependency first
			IRule<?, ?, T, M> parentRule = null;
			for(IRule<?, ?, T, M> cRule : this.rules.keySet()) {
				if(cRule.getClass().equals(ruleStub.getParent())) {
					parentRule = cRule;
				}
			}
			
			if(parentRule == null) {
				throw new IllegalStateException("Error, the dependency injection failed. Rule with the following class missing: " + ruleStub.getParent().getSimpleName());
			}
			
			try {
				IRule<EObject, EObject, T, M> newRule = ruleStub.getClazz().getConstructor(ruleStub.getParent()).newInstance(parentRule);
				this.rules.put(newRule, ruleStub);
			} catch (InstantiationException e) {
				throw new RegistryException("Could not access a constructor which accepts the parent rule: " + parentRule.getClass().getSimpleName(), e);
			} catch (IllegalAccessException e) {
				throw new RegistryException("IllegalAccess Exception while reflectively trying to create the rule: " + ruleStub.getClazz().getSimpleName(), e);
			} catch (IllegalArgumentException e) {
				throw new RegistryException("A programming error inside the DI logic occured. Please contact the KAMP-DSL developer.", e);
			} catch (InvocationTargetException e) {
				throw new RegistryException("The constructor for the following rule threw an exception:" + ruleStub.getClazz().getSimpleName(), e);
			} catch (NoSuchMethodException e) {
				throw new RegistryException("Could not find a constructor which accepts the parent rule: " + parentRule.getClass().getSimpleName(), e);
			} catch (SecurityException e) {
				throw new RegistryException("Security Exception while reflectively trying to create the rule: " + ruleStub.getClazz().getSimpleName(), e);
			}
		} else {
			try {
				IRule<EObject, EObject, T, M> newRule = ruleStub.getClazz().newInstance();
				this.rules.put(newRule, ruleStub);
			} catch (InstantiationException e) {
				throw new RegistryException("Could not find a standard constructor for rule: " + ruleStub.getClazz().getSimpleName(), e);
			} catch (IllegalAccessException e) {
				throw new RegistryException("IllegalAccess Exception while reflectively trying to create the rule: " + ruleStub.getClazz().getSimpleName(), e);
			}
		}
	}

	@Override
	public long getNumberOfRegisteredRules() {
		return this.rules.size();
	}

	@Override
	public void runEarlyHook(Consumer<Set<IRule<EObject, EObject, T, M>>> preHook) {
		this.preHook = preHook;
	}

	@Override
	public void setConfiguration(IConfiguration config) {
		this.configuration = config;
	}

	@Override
	public IConfiguration getConfiguration() {
		return this.configuration;
	}
	
	 public static MultiStatus createMultiStatus(String msg, Throwable t) {
	        List<Status> childStatuses = new ArrayList<>();
	        StackTraceElement[] stackTraces = t.getStackTrace();
	
	        for (StackTraceElement stackTrace: stackTraces) {
	            Status status = new Status(IStatus.ERROR, KampRuleLanguageUtil.BUNDLE_NAME + ".xxxxxxxx", stackTrace.toString());
	            childStatuses.add(status);
	        }
	
	        MultiStatus ms = new MultiStatus(KampRuleLanguageUtil.BUNDLE_NAME + ".xxxxxxxx",
	                IStatus.ERROR, childStatuses.toArray(new Status[] {}), t.toString(), t);
	        
	        return ms;
	    }
}