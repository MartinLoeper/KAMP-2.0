package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
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

	public RuleBlock(ResultMap resultMap, SeedMap seedMap) {
		this.resultMap = resultMap;
		this.seedMap = seedMap;
	}

	public void addRule(IRule<EObject, EObject, ?, ?> cRule) {
		this.rules.add(cRule);
	}

	public boolean runLookups() {
		AtomicBoolean newInsertion = new AtomicBoolean(false);
		
		for(IRule<EObject, EObject, ?, ?> cRule : this.rules) {
			Class<EObject> sourceClass = (Class<EObject>) cRule.getSourceElementClass();
			Class<EObject> resultClass = (Class<EObject>) cRule.getAffectedElementClass();

			// use seed map and result map elements as source
			// this separation ensures, we can distinguish between looked up elements and seeded elements
			// at the end when applying affected elements
			Stream<CausingEntityMapping<EObject, EObject>> sourceElements = Stream.concat(
						this.resultMap.<EObject>getWithAllSubtypes(sourceClass),
						this.seedMap.<EObject>getWithAllSubtypes(sourceClass));

			try {
				// delay insertion to avoid concurrent modification exception!
				List<CausingEntityMapping<EObject, EObject>> newElements = new ArrayList<>();
				cRule.lookup(sourceElements).forEach((e) -> {
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
						newInsertion.set(true);
					}
				}
			} catch(final Exception e) {
				displayRuleException(e, cRule);
			}
		}
		
		return newInsertion.get();
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
		for(IRule<EObject, EObject, ?, ?> cRule : this.rules) {
			Class<EObject> resultClass = (Class<EObject>) cRule.getAffectedElementClass();
			
			Stream<CausingEntityMapping<EObject, EObject>> resultElements = this.resultMap.<EObject>getWithAllSubtypes(resultClass);
			try {				
				cRule.apply(resultElements);
			} catch(final Exception e) {
				displayRuleException(e, cRule);
			}
		}
	}
	
	/**
	 * Returns the number of contained active rules.
	 * @return the number of active rules inside this block
	 */
	public int size() {
		return this.rules.size();
	}
}
