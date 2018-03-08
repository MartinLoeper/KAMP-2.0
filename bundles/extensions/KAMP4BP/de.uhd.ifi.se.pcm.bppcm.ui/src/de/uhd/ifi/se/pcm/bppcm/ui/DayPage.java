package de.uhd.ifi.se.pcm.bppcm.ui;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
/**
 * 
 * DayPage implements the Page of the Wizard DayWizard.
 * The user is able to choose a day profile for the selected 
 * day. The current day is shown in the head. 
 * 
 *  @param calendar 	the ProcessCalendar where this wizard was opened
 *  @param item			the number, that was clicked on
 *  @param month		the current month of the calendar
 *  @param index		the index of the date 
 *  @param list			the list of day profiles
 * 
 * @author Annika
 *
 */
public class DayPage extends WizardPage {  
	  private Composite container;
	  
	  protected ProcessCalendar calendar;
	  protected String item;
	  protected String month;
	  protected int index;
	  protected List list;

	  /**
	   * the constructor which sets the parameters.
	   * 
	   * @param processCalendar		the processCalendar view which opened the wizard 
	   * @param i					the number, that was clicked on
	   * @param m					the current month of the calendar
	   */
	  public DayPage(ProcessCalendar processCalendar, String i, String m) {
	    super("Day Page");
	    
	    item = i;
	    month = m;
	    setTitle(item + ". " + month);
	    
	    calendar = processCalendar;
	    index = calendar.getIndex(item);
	    
	    setDescription("Current day profile: " + calendar.getDays().get(index).
	    		getProfile().getName());
	  }

	  /**
	   * Implements the ui elements of this wizard page. There is a list 
	   * with all available day profiles. There the day profile of the day 
	   * can be changed. 
	   * 
	   * @param parent		parent Composite of this page
	   * 
	   * (non-Javadoc)
	   * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	   */
	  @Override
	  public void createControl(Composite parent) {
	    container = new Composite(parent, SWT.NULL);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 1;

	    Label label1 = new Label(container, SWT.NULL);
	    label1.setText("Select day profile: ");
	    
	    // list for dayprofiles
	    GridData gd = new GridData(GridData.FILL_BOTH);
	    list = new List(container, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
	    
	    list.setLayoutData(gd);
	    list.addSelectionListener(new SelectionListener() {
			
	    	/**
	    	 * when a new day profile is selected the Finish Button of the 
	    	 * page is enabled.
	    	 * 
	    	 * @param e		a day profile name is selected from the list
	    	 * 
	    	 * (non-Javadoc)
	    	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	    	 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (list.getSelectionCount() > 0) {
					int i = list.getSelectionIndex();
					calendar.getDays().get(index).setProfile(calendar.dayprofiles.get(i));
					setPageComplete(true);
				}
				else {
					setPageComplete(false);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	    
	    // fill list with the names of the dayprofiles
	    for(int i = 0; i < calendar.dayprofiles.size(); i++) {
	    	list.add(calendar.dayprofiles.get(i).getName());
	    }
	    
	    
	    
	    
	    // Required to avoid an error in the system
	    setControl(container);
	    setPageComplete(false);

	  }
	} 