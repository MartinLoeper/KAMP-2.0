package de.uhd.ifi.se.pcm.bppcm.ui;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

/**
 * DayWizard is extended from Wizard 
 * and is the Wizard for the page to handle
 * the day. 
 * 
 * @param one 		the first WizardPage
 * @param calendar	the ProcessCalendar which opened the Wizard
 * @param item		the number, that was clicked on
 * @param month		the current month of the calendar
 * 
 * @author Annika
 *
 */
public class DayWizard extends Wizard {
	
	protected WizardPage one;
	protected ProcessCalendar calendar;
	
	protected String item;
	protected String month;
	
	/**
	 * the constructor which sets the parameters.
	 * 
	 * @param processCalendar	the process Calendar view which opened the wizard
	 * @param i					the number, that was clicked on
	 * @param m					the current month of the calendar
	 */
	public DayWizard(ProcessCalendar processCalendar, String i, String m) {
		super();
		setNeedsProgressMonitor(true);
		calendar = processCalendar;
		
		item = i;
		month = m;
		
		// WizardPage
		one = new DayPage(calendar, item, month);
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

