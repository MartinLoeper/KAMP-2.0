package de.uhd.ifi.se.pcm.bppcm.ui;

import java.text.SimpleDateFormat;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

import de.uhd.ifi.se.pcm.bppcm.spec.Period;
/**
 * ActorEditDayProfile is extended from WizardPage
 * and is the second Page of the Wizard ActorDayProfilesWizard.
 * On this page the actor can change the name of the period, 
 * add new Periods, if they are valid ones,
 * and a list of all existing periods to this day profile is visible. 
 * The actor can select a period and delete it, or press the 
 * Next Button to edit this period on the next page. 
 * 
 * @param text1 		text field to put in new name for the period
 * @param text2			text field to put in a new start time point
 * @param text3			text field to put in a new end time point
 * @param periodList	list of all existing periods
 * @param container		Composite of this View
 * @param calendar		the ActorCalendar which opened this Wizard
 * @param pageOne		the first page of this Wizard
 * @param wizard		the Wizard of this WizardPage
 * 
 * @author Annika
 */
public class ActorEditDayProfile extends WizardPage {
  private Text text1;
  private Text text2;
  private Text text3;
  protected List periodList;
  private Composite container;
  protected ActorCalendar calendar;
  private IWizardPage pageOne;
  protected ActorDayProfilesWizard wizard;

  /**
   * the constructor sets the title and the parameters
   * 
   * @param actorCalendar		the actor Calendar which opened the wizard
   * @param one					the first page of the wizard
   * @param w					the wizard this page belongs to
   */
  public ActorEditDayProfile(ActorCalendar actorCalendar, IWizardPage one, ActorDayProfilesWizard w) {
    super("Edit a DayProfile");
    setTitle("Edit a DayProfile, press the 'Add'-Button to add a new Period");
    
    pageOne = one; 
    setDescription(" ");
    setControl(text1);
    
    calendar = actorCalendar;
    wizard = w;
  }

  /**
   * implements the UI elements of this page. 
   * <p>
   * The text field to change the name of the day profile.
   * The two text fields to add a new period. The Buttons to Add and 
   * Delete a period and the list of all existing periods.
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
    layout.numColumns = 1;
    container.setLayout(layout);
    
    // composite for name of the day profile
    Composite nameContainer = new Composite(container, SWT.NULL);
    GridLayout layoutNameContainer = new GridLayout();
    nameContainer.setLayout(layoutNameContainer);
    layoutNameContainer.numColumns = 2;
    nameContainer.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

    
    // the name of the day profile
    Label label1 = new Label(nameContainer, SWT.NULL);
    label1.setText("Day Profile Name: ");

    text1 = new Text(nameContainer, SWT.BORDER | SWT.SINGLE);
    text1.addKeyListener(new KeyListener() {

      @Override
      public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

      }

      /**
       * changes the name of the day profile
       * 
       * @param e		the text has changed 
       * 
       * (non-Javadoc)
       * @see org.eclipse.swt.events.KeyListener#keyReleased(org.eclipse.swt.events.KeyEvent)
       */
      @Override
      public void keyReleased(KeyEvent e) {
        if (!text1.getText().isEmpty()) {
          
          int index = ((ActorDayProfilesPage)pageOne).getList().getSelectionIndex();
        	
          // edit name and save changes
          String name = text1.getText();
          calendar.getDayprofiles().get(index).setName(name);
          
          setPageComplete(true);
          
        }
      }

    });
    
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    text1.setLayoutData(gd);
    
    // the group of period attributes
    Group group = new Group(container, SWT.FILL);
    GridLayout layoutGroup = new GridLayout();
    layoutGroup.numColumns = 2;
    group.setLayout(layoutGroup);
    
    group.setText("Period");
    
    // fill page horizontal
    group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    
    // start time point
    Label label2 = new Label(group, SWT.NULL);
    label2.setText("Start Time Point: ");
    
    text2 = new Text(group, SWT.BORDER | SWT.SINGLE);
    text2.setText("00:00:00");
    
    // end time point
    Label label3 = new Label(group, SWT.NULL);
    label3.setText("End Time Point: ");
    
    text3 = new Text(group, SWT.BORDER | SWT.SINGLE);
    text3.setText("00:00:00");
    
    Composite container2 = new Composite(container, SWT.NULL);
    GridLayout layoutContainer2 = new GridLayout();
    container2.setLayout(layoutContainer2);
    layoutContainer2.numColumns = 2;
    
    // fill page horizontal
    container2.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    
    Label help = new Label(container2, SWT.NULL);
    help.setText("");
    
    Composite buttons = new Composite(container2, SWT.NULL);
    GridLayout layoutButtons = new GridLayout();
    buttons.setLayout(layoutButtons);
    layoutButtons.numColumns = 2;
    
    // ADD button
    Button add = new Button(buttons, SWT.PUSH);
    add.setText("Add");
    add.setImage(Activator.getImageDescriptor("/icons/add.png").createImage());
    
    add.addSelectionListener(new SelectionAdapter() {
    	/**
    	 * adds the new period, in case it's valid
    	 * 
    	 * @param e		button ADD is clicked
    	 * 
    	 * (non-Javadoc)
    	 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
    	 */
    	public void widgetSelected(SelectionEvent e) {
    		
    		setDescription(" ");
    		
    		String start = text2.getText();
    		String end = text3.getText();
    		
    		// check if regex is correct
    		if (start.matches("^(?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d):)?([0-5]?\\d)$"
    				) && end.matches("^(?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d):)?([0-5]?\\d)$")) {
    		
    			// make the string in the format hh:mm:ss to an integer
	    		String[] partsStart = start.split(":");
	    		String hoursPartsStart = partsStart[0];
	    		String minutesPartsStart = partsStart[1];
	    		String secondsPartsStrart = partsStart[2];
	    		
	    		int hoursStart = Integer.parseInt(hoursPartsStart);
	    		int minutesStart = Integer.parseInt(minutesPartsStart);
	    		int secondsStart = Integer.parseInt(secondsPartsStrart);
	    		
	    		String[] partsEnd = end.split(":");
	    		String hoursPartsEnd = partsEnd[0];
	    		String minutesPartsEnd = partsEnd[1];
	    		String secondsPartsEnd = partsEnd[2];
	    		
	    		int hoursEnd = Integer.parseInt(hoursPartsEnd);
	    		int minutesEnd = Integer.parseInt(minutesPartsEnd);
	    		int secondsEnd = Integer.parseInt(secondsPartsEnd);
	    		
	    		int startInt = secondsStart + 60 * minutesStart + 3600 * 
	    				hoursStart;
			    int endInt = secondsEnd + 60 * minutesEnd + 3600 * hoursEnd;
			   	
			    int i = ((ActorDayProfilesPage)pageOne).getList().
			    		getSelectionIndex();
			    
			    boolean notOverlap = true;
			    
			    // check for all already existing periods if it overlaps with 
			    // the new one
			    for (int j = 0; j < calendar.getDayprofiles().get(i).getPeriods().
			    		size(); j++) {
			    	
			    	String st = calendar.getDayprofiles().get(i).getPeriods().get(j).
			    			getStartTimePoint().toPattern();
			    	String en = calendar.getDayprofiles().get(i).getPeriods().get(j).
			    			getEndTimePointtime().toPattern();
			    	
			    	String[] partsSt = st.split(":");
		    		String hoursPartsSt = partsSt[0];
		    		String minutesPartsSt = partsSt[1];
		    		String secondsPartsSt = partsSt[2];
		    		
			    	int hoursSt = Integer.parseInt(hoursPartsSt);
			    	int minutesSt = Integer.parseInt(minutesPartsSt);
			    	int secondsSt = Integer.parseInt(secondsPartsSt);
			    		
			    	String[] partsEn = en.split(":");
			    	String hoursPartsEn = partsEn[0];
			    	String minutesPartsEn = partsEn[1];
			    	String secondsPartsEn = partsEn[2];
			    			
				    int hoursEn = Integer.parseInt(hoursPartsEn);
				    int minutesEn = Integer.parseInt(minutesPartsEn);
				    int secondsEn = Integer.parseInt(secondsPartsEn);
				    
				    int startIntValue = secondsSt + 60 * minutesSt + 3600 * 
				    		hoursSt;
				    int endIntValue = secondsEn + 60 * minutesEn + 3600 * 
				    		hoursEn;
				    
				    // check if it overlaps
				    if (startInt < endIntValue && endInt > startIntValue) {
				    	notOverlap = false;
				    	setDescription("this period overlaps with an already " +
				    			"existing period");
				    }
			    	
			    }
			    
			    if (notOverlap == true) {
			    	
			    	if(startInt < endInt) {
			    		addInterval(start, end);
		    			setDescription(" ");
			    	}
			    	else {
			    		setDescription("end time is earlier than start time");
			    	}
		    		
		    	}
    		}
    		else {
    			setDescription("invalid period definition");
    		}
    	}
    });
    
    // DELTE button
    Button delete = new Button(buttons, SWT.PUSH);
    delete.setText("Delete");
    delete.setImage(Activator.getImageDescriptor("/icons/delete.png").
    		createImage());
    
    // delete the period
    delete.addSelectionListener(new SelectionAdapter() {
    	/**
    	 * deletes the selected period
    	 * 
    	 * @param e 		Delete button is pressed
    	 * 
    	 * (non-Javadoc)
    	 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
    	 */
    	public void widgetSelected(SelectionEvent e) {
    		
    		if(periodList.getSelection() != null) {
    			
    			int index = periodList.getSelectionIndex();
    			int i = ((ActorDayProfilesPage)pageOne).getList().
    					getSelectionIndex();
    			
    			calendar.getDayprofiles().get(i).getPeriods().remove(index);
    			periodList.remove(index);
    			
    			setPageComplete(false);
    		
    		}
    	}
    });
    
    Label label5 = new Label(container2, SWT.NULL);
    label5.setText("Existing Periods: ");
    
    GridData gd1 = new GridData(GridData.FILL_BOTH);
    periodList = new List(container2, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
    
    periodList.setLayoutData(gd1);
    
    periodList.addSelectionListener(new SelectionListener() {

    	/**
    	 * if a period is selected, fill the Texts on page three,
    	 * the text for the start and end time point.
    	 * 
    	 * @param e		a period is selected
    	 * 
    	 * (non-Javadoc)
    	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
    	 */
		@Override
		public void widgetSelected(SelectionEvent e) {
			// TODO Auto-generated method stub
			
			if(periodList.getSelectionCount() > 0) {
				
				((ActorEditPeriodPage)wizard.three).fillTexts();
				setPageComplete(true);
			}
			
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			// TODO Auto-generated method stub
			
		}
    	
    	
    });
    
    // Required to avoid an error in the system
    setControl(container);
    setPageComplete(false);
  }
  
  /**
   * the method to add the period 
   * 
   * @param start		the start time point
   * @param end			the end time point
   */
  public void addInterval(String start, String end) {
	  
	  int i = ((ActorDayProfilesPage)pageOne).getList().getSelectionIndex();
		
		// create a new period
		Period period = new Period();
		
		// set new start time
      SimpleDateFormat startDate = new SimpleDateFormat(start);
      
      period.setStartTimePoint(startDate);
      
      // set new end time
      SimpleDateFormat endDate = new SimpleDateFormat(end);
      
      period.setEndTimePointtime(endDate);
     
		// add new period to period list
		periodList.add(period.getStartTimePoint().toPattern() + " - " + 
		period.getEndTimePointtime().toPattern());
		
		// add new period to day profile
		calendar.getDayprofiles().get(i).getPeriods().add(period);
		
		// clear text fields
		text2.setText("00:00:00");
		text3.setText("00:00:00");
  }
  
  /**
   * fills the list with periods, if a day profile is selcted on 
   * page one.
   */
  public void fillList() {
	  
	periodList.removeAll();  
	  
	int i = ((ActorDayProfilesPage)pageOne).getList().getSelectionIndex();
	
	// show current profile name
	text1.setText(calendar.getDayprofiles().get(i).getName());
	 
	// fill List with all existing periods
  	for(int j = 0; j < calendar.getDayprofiles().get(i).getPeriods().size(); j++) {
  	
  		periodList.add(calendar.getDayprofiles().get(i).getPeriods().get(j).
  				getStartTimePoint().toPattern() + " - " + 
  			calendar.getDayprofiles().get(i).getPeriods().get(j).getEndTimePointtime().
  			toPattern());
  	}
  }
 
  public String getText1() {
    return text1.getText();
  }
} 