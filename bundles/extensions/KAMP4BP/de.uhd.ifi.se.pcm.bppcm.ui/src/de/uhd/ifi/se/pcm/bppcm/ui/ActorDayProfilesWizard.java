package de.uhd.ifi.se.pcm.bppcm.ui;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

/**
 * ActorDayProfilesWizard is extended from Wizard 
 * and is the Wizard for the pages to handle
 * the day profiles. 
 * 
 * @param one 		the first WizardPage
 * @param two		the second WizardPage
 * @param three		the third WizardPage
 * @param calendar	the ActorCalendar which opened the Wizard
 * 
 * @author Annika
 *
 */
public class ActorDayProfilesWizard extends Wizard {
	
	protected IWizardPage one;
	protected IWizardPage two;
	protected IWizardPage three;
	protected ActorCalendar calendar;
	
	/**
	 * the constructor sets the parameters of the wizard pages. 
	 * 
	 * @param actorCalendar		the actor Calendar view which opened the wizard
	 */
	public ActorDayProfilesWizard(ActorCalendar actorCalendar) {
		super();
		setNeedsProgressMonitor(true);
		calendar = actorCalendar;
		
		// WizardPages
		one = new ActorDayProfilesPage(calendar, ActorDayProfilesWizard.this);
		two = new ActorEditDayProfile(calendar, one, ActorDayProfilesWizard.this);
		three = new ActorEditPeriodPage(calendar, one, two);
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
