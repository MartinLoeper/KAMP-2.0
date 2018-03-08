package de.uhd.ifi.se.pcm.bppcm.ui;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

/**
 * DayProfilesWizard is extended from Wizard 
 * and is the Wizard for the pages to handle
 * the day profiles. 
 * 
 * @param one 		the first WizardPage
 * @param two		the second WizardPage
 * @param three		the third WizardPage
 * @param calendar	the ProcessCalendar which opened the Wizard
 * 
 * @author Annika
 *
 */
public class DayProfilesWizard extends Wizard {
	
	protected IWizardPage one;
	protected IWizardPage two;
	protected IWizardPage three;
	protected ProcessCalendar calendar;
	
	/**
	 * the constructor sets the parameters of the wizard pages. 
	 * 
	 * @param processCalendar		the process Calendar view which opened the wizard
	 */
	public DayProfilesWizard(ProcessCalendar processCalendar) {
		super();
		setNeedsProgressMonitor(true);
		calendar = processCalendar;
		
		// WizardPages
		one = new DayProfilesPage(calendar, DayProfilesWizard.this);
		two = new EditDayProfile(calendar, one, DayProfilesWizard.this);
		three = new EditPeriodPage(calendar, one, two);
	}
	
	/**
	 * adds the pages to the Wizard
	 * 
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		addPage(one);
		addPage(two);
		addPage(three);
	}
	
	@Override
	public boolean performFinish() {
		// Print the result to the console
		
		return true;
	}

}
