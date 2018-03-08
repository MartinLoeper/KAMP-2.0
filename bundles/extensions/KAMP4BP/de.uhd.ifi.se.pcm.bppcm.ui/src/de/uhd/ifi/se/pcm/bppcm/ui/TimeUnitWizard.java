package de.uhd.ifi.se.pcm.bppcm.ui;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
/**
 * TimeUnitWizard is extended from Wizard 
 * and is the Wizard for the page to handle
 * the time unit. 
 * 
 * @param one 		the first WizardPage
 * @param pCalendar	the ProcessCalendar which opened the Wizard
 * 
 * @author Annika
 *
 */
public class TimeUnitWizard extends Wizard {
	
	protected WizardPage one;
	protected ProcessCalendar pCalendar;
	
	/**
	 * the constructor sets the parameters and the wizard page.
	 * 
	 * @param processCalendar		the Process Calendar which opened the wizard
	 */
	public TimeUnitWizard(ProcessCalendar processCalendar) {
		super();
		setNeedsProgressMonitor(true);
		pCalendar = processCalendar;
		
		// WizardPage
		one = new TimeUnitPage(pCalendar);
	}
	/**
	 * adds the page to the Wizard
	 * 
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		addPage(one);
	}
	
	@Override
	public boolean performFinish() {
		// Print the result to the console
		
		return true;
	}

}

