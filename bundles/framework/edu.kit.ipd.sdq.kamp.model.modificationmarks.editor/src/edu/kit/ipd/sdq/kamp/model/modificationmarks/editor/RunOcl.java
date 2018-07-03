package edu.kit.ipd.sdq.kamp.model.modificationmarks.editor;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import thesis.KampOclTest;
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.propagation.UserDecisionAnalysis;
import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;

/**
 * Runs user defined ocl queries.
 * This is part of the KAMP CPRL Evaluation.
 * 
 * @generated NOT
 */
public class RunOcl implements IActionDelegate {
	
	private ISelection selection;
	
	@Override
	public void run(IAction action) {
		PlatformUI.getWorkbench().saveAllEditors(false);	
		Object selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			if (((IStructuredSelection)selection).size() == 1) {
				selectedElement = ((IStructuredSelection)selection).getFirstElement();
			}
		}
		
		if (selectedElement != null && selectedElement instanceof AbstractModification) {
			AbstractModification<?, ?> element = (AbstractModification<?, ?>) selectedElement;
			KampOclTest.run(element);
		}
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
