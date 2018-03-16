package edu.kit.ipd.sdq.kamp.ruledsl.ui.wizards;

import java.util.concurrent.Callable;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;

public class WizardArtifact<T extends WizardPage> {
	private final String name;
	private final T page;
	private final Callable<Boolean> performFinishRunnable;
	
	public WizardArtifact(String name, T page, Callable<Boolean> r) {
		this.name = name;
		this.page = page;
		this.performFinishRunnable = r;
	}
	
	public String getName() {
		return name;
	}
	
	public T getWizardPage() {
		return page;
	}
	
	public boolean performFinish() throws Exception {
		return this.performFinishRunnable.call();
	}
}
