package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class RuleBlock {
	protected final ResultMap resultMap;
	protected final SeedMap seedMap;
	private final List<IRule<EObject, EObject, ?, ?>> rules = new ArrayList<>();
	private boolean finished;

	public RuleBlock(ResultMap resultMap, SeedMap seedMap) {
		this.resultMap = resultMap;
		this.seedMap = seedMap;
	}

	public void addRule(IRule<EObject, EObject, ?, ?> cRule) {
		this.rules.add(cRule);
	}
	
	public boolean isFinished() {
		return this.finished;
	}

	public BlockResult runLookups(BlockResult previousRunResult) {
		finished = true;
		List<Result<EObject, EObject>> ruleResults = new ArrayList<>();
		
		for(IRule<EObject, EObject, ?, ?> cRule : this.rules) {
			Class<EObject> sourceClass = (Class<EObject>) cRule.getSourceElementClass();
			//Class<EObject> resultClass = (Class<EObject>) cRule.getAffectedElementClass();

			// use seed map and result map elements as source
			// this separation ensures, we can distinguish between looked up elements and seeded elements
			// at the end when applying affected elements
			Set<CausingEntityMapping<EObject, EObject>> sourceElements = this.resultMap.<EObject>getWithAllSubtypes(sourceClass, true).collect(Collectors.toSet());
			sourceElements.addAll(this.seedMap.<EObject>getWithAllSubtypes(sourceClass, true).collect(Collectors.toSet()));

			try {
				// delay insertion to avoid concurrent modification exception!
				List<CausingEntityMapping<EObject, EObject>> newElements = new ArrayList<>();
				Result<EObject, EObject> source = new Result<>(sourceElements);
				RuleResult<EObject, EObject> ruleResult = cRule.lookup(source);
				
				// TODO: the following is a quickfix which is necessary until there is
				// a mapping language for CPRL
				cRule.apply(source);				
				
				ruleResults.add(ruleResult);
				ruleResult.getOutputElements().forEach((e) -> {
					newElements.add(e);
				});

				// batch insert
				for(CausingEntityMapping<EObject, EObject> e : newElements) {
					// we do not put the element in based on resultClass, but based on actual class
					// this is important because a lookup may return a more specific element (aka subclass)
					// of its declared type
					
					// we must init a set if not already present
					// this is necessary because new subtypes may be introduced (see above)
					Class<EObject> eClass = (Class<EObject>) e.getAffectedElement().getClass();
					this.resultMap.init(eClass);
					
					if(this.resultMap.put(eClass, e)) {
						finished = false;
					}
				}
			} catch(final Exception e) {
				displayRuleException(e, cRule);
			}
		}
		
		return new BlockResult(ruleResults, previousRunResult);
	}
	
	protected void displayRuleException(Exception e, IRule<?, ?, ?, ?> cRule) {
		// show the exception in the log
		e.printStackTrace();
		
		// display message to user
		Display.getDefault().syncExec(new Runnable() {
		    public void run() {
		    	MultiStatus status = IRuleProvider.createMultiStatus(e.getLocalizedMessage(), e);
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
                ErrorDialog.openError(shell, "Rule caused error", "The following rule caused an " + e.getClass().getSimpleName() + ": " + cRule.getClass(), status);
		    }
		});
	}
	
	public void runFinalizers() {
//		for(IRule<EObject, EObject, ?, ?> cRule : this.rules) {
//			Class<EObject> resultClass = (Class<EObject>) cRule.getAffectedElementClass();
//			
//			Stream<CausingEntityMapping<EObject, EObject>> resultElements = this.resultMap.<EObject>getWithAllSubtypes(resultClass, false);
//			try {				
//				cRule.apply(resultElements);
//			} catch(final Exception e) {
//				displayRuleException(e, cRule);
//			}
//		}
	}
	
	/**
	 * Returns the number of contained active rules.
	 * @return the number of active rules inside this block
	 */
	public int size() {
		return this.rules.size();
	}
}
