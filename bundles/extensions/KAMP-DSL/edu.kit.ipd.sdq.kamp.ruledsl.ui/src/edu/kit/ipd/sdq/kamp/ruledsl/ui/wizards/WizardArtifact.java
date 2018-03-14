package edu.kit.ipd.sdq.kamp.ruledsl.ui.wizards;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;

public class WizardArtifact<T extends WizardPage> {
	private final String name;
	private final T page;
	
	public WizardArtifact(String name, T page) {
		this.name = name;
		this.page = page;
	}
	
	public String getName() {
		return name;
	}
	
	public T getWizardPage() {
		return page;
	}
}
