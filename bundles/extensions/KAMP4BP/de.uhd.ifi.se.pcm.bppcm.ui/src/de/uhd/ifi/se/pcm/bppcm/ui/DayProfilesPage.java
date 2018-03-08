package de.uhd.ifi.se.pcm.bppcm.ui;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

import de.uhd.ifi.se.pcm.bppcm.spec.DayProfile;
/**
 * DayProfilesPage is extended from WizardPage and is
 * the first page of the Wizard DayProfilesWizard.
 * The user is able to add new day profiles, delete 
 * existing ones or select a day profile and click the
 * Next button to edit it later on. 
 * 
 * @param container		the Composite of the page
 * @param calendar		the ProcessCalendar which opened this Wizard
 * @param list			the list of day profiles
 * @param wizard		the Wizard where this page belongs to
 * @param addTextfield	the textfield to add a new name for a day profile
 * 
 * @author Annika
 *
 */
public class DayProfilesPage extends WizardPage {
	
	private Composite container;
	private ProcessCalendar calendar; 
	protected List list;
	protected DayProfilesWizard wizard;
	
	private Text addTextfield;
	
	/**
	 * the constructor sets the title and description of the page and sets
	 * the parameters
	 * 
	 * @param processCalendar		the process Calendar which opened the wizard
	 * @param w						the wizard this page belongs to
	 */
	public DayProfilesPage(ProcessCalendar processCalendar, DayProfilesWizard w) {
		super("Day Profiles Page");
		setTitle("Day Profiles Page");
		setDescription("These are the available day profiles. Select Day Profile to edit and click Next.");
		calendar = processCalendar;
		
		wizard = w;
	}

	/**
	 * implements the ui elements of the page. 
	 * <p>
	 * The list of all available day profiles, the Buttons to
	 * Add and Delete a day profile and the text field to create a 
	 * new day profile. 
	 * 
	 * @param parent		the parent Composite of the page
	 * 
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		container = new Composite(parent, SWT.NULL);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 1;
	    Label label1 = new Label(container, SWT.NULL);
	    label1.setText("Day profiles:");
	    
	    // new list for dayprofiles
	    GridData gd = new GridData(GridData.FILL_BOTH);
	    list = new List(container, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
	    
	    list.setLayoutData(gd);
	    list.addSelectionListener(new SelectionListener() {
			
	    	/**
	    	 * if a day profile of the list is selected, the Next Button
	    	 * of the page is enabled. 
	    	 * 
	    	 * @param e		a day profile name was selected (clicked on)
	    	 * 
	    	 * (non-Javadoc)
	    	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	    	 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (list.getSelectionCount() > 0) {
					setPageComplete(true);
					((EditDayProfile) wizard.two).fillList();
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
	    
	    // add names of the dayprofiles to the list
	    for(int i = 0; i < calendar.dayprofiles.size(); i++) {
	    	list.add(calendar.dayprofiles.get(i).getName());
	    }
	    
	    // textfield for the new name of a new dayprofile
	    Label addLabel = new Label(container, SWT.NULL);
	    addLabel.setText("Insert Name here to add:");
	    addTextfield = new Text(container, SWT.SINGLE | SWT.BORDER);
	    addTextfield.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	   
	    Composite buttons = new Composite(container, SWT.NULL);
	    GridLayout layoutButtons = new GridLayout();
	    buttons.setLayout(layoutButtons);
	    layoutButtons.numColumns = 2;
	    
	    // ADD button
	    Button add = new Button(buttons, SWT.PUSH);
	    add.setText("Add");
	    add.setImage(Activator.getImageDescriptor("/icons/add.png").
	    		createImage());
	    
	    add.addSelectionListener(new SelectionAdapter() {
	    	/**
	    	 * adds a new day profile to the list, with the name,
	    	 * that was written in the text field. 
	    	 * It only adds the new day profile, in case that 
	    	 * the text field is not empty, and the name doesn't 
	    	 * already exist for another day profile.
	    	 * 
	    	 * @param e		button was clicked
	    	 * 
	    	 * (non-Javadoc)
	    	 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	    	 */
	    	public void widgetSelected(SelectionEvent e) {
	    		
	    		boolean check = true;
	    		if (!addTextfield.getText().equals("")) {
	    			for (int i = 0; i < calendar.dayprofiles.size(); i++) {
	    				if (addTextfield.getText().equals(calendar.dayprofiles.get(i).getName())) {
	    					check = false;
	    				}
	    			}
	    		}
	    		else {
	    			check = false;
	    		}
	    		
	    		if (check == true) {
	    			// create a new day profile
	    			DayProfile newProfile = new DayProfile(addTextfield.getText());
	    			calendar.dayprofiles.add(newProfile);
	    		
	    			// add day profile name to list
	    			list.add(newProfile.getName());
	    		
	    			// clear text field
	    			addTextfield.setText("");
	    		}
	    		check = true;
	    	}
	    });
	    
	    // DELETE button
	    Button delete = new Button(buttons, SWT.PUSH);
	    delete.setText("Delete");
	    delete.setImage(Activator.getImageDescriptor("/icons/delete.png").createImage());
	    
	    delete.addSelectionListener(new SelectionAdapter() {
	    	/**
	    	 * deletes the selected day profile
	    	 * 
	    	 * @param e		button was clicked
	    	 * 
	    	 * (non-Javadoc)
	    	 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	    	 */
	    	public void widgetSelected(SelectionEvent e) {
	    		
	    		if(list.getSelection() != null) {
	    			
	    			int index = list.getSelectionIndex();
	    			
	    			calendar.dayprofiles.remove(index);
	    			list.remove(index);
	    			
	    				setPageComplete(false);
	    		
	    		}
	    	}
	    });
	    
	    
	    // Required to avoid an error in the system
	    setControl(container);
	    setPageComplete(false);
	  }
	
	public List getList() {
		return list;
	}
	
}
