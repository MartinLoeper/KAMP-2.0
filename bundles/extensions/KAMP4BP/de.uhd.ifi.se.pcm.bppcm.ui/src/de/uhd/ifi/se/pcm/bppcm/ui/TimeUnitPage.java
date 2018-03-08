package de.uhd.ifi.se.pcm.bppcm.ui;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
/**
 * TimeUnitPage implements the Page of the Wizard TimeUnitWizard.
 * The user is able to choose a time unit for the selected 
 * project. The current time unit is shown in the comboBox. 
 * 
 * @param container		the composite of the WizardPage
 * @param pCalendar 	the ProcessCalendar where this wizard was opened
 * @param comboBox		the box filled with the time units 
 *  
 * @author Annika
 *
 */
public class TimeUnitPage extends WizardPage {  
	  private Composite container;
	  
	  protected ProcessCalendar pCalendar;
	  protected Combo comboBox;
	  
	  /**
	   * the constructor sets the title, the description and the parameters.
	   * 
	   * @param processCalendar		the Process Calendar which opened the wizard
	   */
	  public TimeUnitPage(ProcessCalendar processCalendar) {
	    super("Time Unit Page");
	    
	    setTitle("Choose the time units to save the model");
	    
	    pCalendar = processCalendar;
	    
	    setDescription("Choose from the combo box");
	  }
	  
	  /**
	   * implements the UI elements of the page.
	   * <p>
	   * The comboBox with all available time units. 
	   * 
	   * @param parent		the parent Composite of the page
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
	    
	    // new group
	    Group group = new Group(container, SWT.FILL);
	    GridLayout layoutGroup = new GridLayout();
	    layoutGroup.numColumns = 2;
	    group.setLayout(layoutGroup);
	    group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    group.setText("Select a time unit");
	    
	    comboBox = new Combo(group, SWT.NONE);
	    comboBox.setEnabled(true);
	    comboBox.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	    comboBox.setText(pCalendar.getSelectedTimeUnit());
	    
	    // add elements to the comboBox
	    comboBox.add("Hours");
	    comboBox.add("Minutes");
	    comboBox.add("Seconds");
	    comboBox.add("Milliseconds");
	    
	    comboBox.addSelectionListener(new SelectionListener() {
			/**
			 * change the selectedTimeUnit of the processCalendar
			 * 
			 * @param e		an element of the comboBox has been chosen
			 * 
			 * (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				// get the selected String from the list
				pCalendar.setSelectedTimeUnit(comboBox.getItem(comboBox.getSelectionIndex()));
				
				
				setPageComplete(true);
			
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
	    });

	    // Required to avoid an error in the system
	    setControl(container);
	    setPageComplete(true);

	  }
}

