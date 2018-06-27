package edu.kit.ipd.sdq.kamp.ruledsl.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import edu.kit.ipd.sdq.kamp.ruledsl.runtime.RuleProvider;
import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;
import edu.kit.ipd.sdq.kamp.ruledsl.support.IRule;
import edu.kit.ipd.sdq.kamp.ruledsl.support.KampRuleLanguageUtil;

public class RuleBlock {
	protected final ResultMap resultMap;
	protected final SeedMap seedMap;
	private final List<IRule<EObject, EObject, ?, ?>> rules = new ArrayList<>();
	private static final RollbarExceptionReporting REPORTING = RollbarExceptionReporting.INSTANCE;

	public RuleBlock(ResultMap resultMap, SeedMap seedMap) {
		this.resultMap = resultMap;
		this.seedMap = seedMap;
	}

	public void addRule(IRule<EObject, EObject, ?, ?> cRule) {
		this.rules.add(cRule);
	}

	public boolean runLookups(ResultMap sourceMap) {
		if(sourceMap == null) {
			sourceMap = this.seedMap;
		}

		AtomicBoolean newInsertion = new AtomicBoolean();
		
		for(IRule<EObject, EObject, ?, ?> cRule : this.rules) {
			Class<EObject> sourceClass = (Class<EObject>) cRule.getSourceElementClass();
			Class<EObject> resultClass = (Class<EObject>) cRule.getAffectedElementClass();
			
			Stream<CausingEntityMapping<EObject, EObject>> sourceElements = sourceMap.<EObject>getWithAllSubtypes(sourceClass);
			try {				
				cRule.lookup(sourceElements).forEach((e) -> {
					if(this.resultMap.put(resultClass, e)) {
						newInsertion.set(true);
					}
				});
			} catch(final Exception e) {
				displayRuleException(e, cRule);
			}
		}
		
		return newInsertion.get();
	}
	
	protected void displayRuleException(Exception e, IRule<?, ?, ?, ?> cRule) {
		// send exception to our rollbar server for examination and bug tracking
		REPORTING.log(e, ErrorContext.CUSTOM_RULE, null);
		
		// show the exception in the log
		e.printStackTrace();
		
		// display message to user
		Display.getDefault().syncExec(new Runnable() {
		    public void run() {
		    	MultiStatus status = RuleProvider.createMultiStatus(e.getLocalizedMessage(), e);
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
}
