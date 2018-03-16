package edu.kit.ipd.sdq.kamp.ruledsl.ui.wizards;

import java.util.ArrayList;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
	
public class ChooseArtifactTypePage extends WizardPage {
	private boolean done = false;
	private WizardArtifact cArtifact = null;
	private final java.util.List<WizardArtifact> artifacts;

	public ChooseArtifactTypePage(ISelection selection, java.util.List<WizardArtifact> artifacts) {
		super("selectArtifactType");
		setTitle("Select Rule Language Artifact Type");
		setDescription("Choose the artifact to generate.");
		this.artifacts = artifacts;
	}
	
	public WizardArtifact getSelectedArtifcat() {
		return cArtifact;
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		ListViewer listViewer = new ListViewer(container, SWT.BORDER | SWT.V_SCROLL);
		List list = listViewer.getList();
		for(WizardArtifact cArtifact : this.artifacts) {
			list.add(cArtifact.getName());
		}
		
		listViewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				setSelectedArtifact(list.getSelectionIndex());
				if(cArtifact.getWizardPage() != null) {
					getWizard().getContainer().showPage(cArtifact.getWizardPage());
				} else {
					getWizard().performFinish();
					((Window) getWizard().getContainer()).close();
				}
			}
		});
		
		listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if(list.getSelectionIndex() >= 0) {
					setSelectedArtifact(list.getSelectionIndex());
				}
				
				getWizard().getContainer().updateButtons();
			}

		});
	}

	private void setSelectedArtifact(int selectionIndex) {
		cArtifact = this.artifacts.get(selectionIndex);
		this.done = true;
		setPageComplete(true);
	}
	
	@Override
	public boolean isPageComplete() {
		return done;
	}
}