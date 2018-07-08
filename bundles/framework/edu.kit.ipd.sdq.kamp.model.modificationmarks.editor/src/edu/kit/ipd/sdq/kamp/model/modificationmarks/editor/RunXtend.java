package edu.kit.ipd.sdq.kamp.model.modificationmarks.editor;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import thesis.KampXtendTest;

/**
 * Runs user defined xtend queries.
 * This is part of the KAMP CPRL Evaluation.
 * 
 * @generated NOT
 */
public class RunXtend implements IActionDelegate {
	
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
			KampXtendTest.run(element);
		}
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
}
