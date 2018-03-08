package de.uhd.ifi.se.pcm.bppcm.ui;

import java.text.SimpleDateFormat;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * ActorEditPeriodPage is extended from WizardPage
 * and is the third Page of the Wizard ActorDayProfilesWizard.
 * On this page the actor can edit the period, if the new start time
 * point and end time point are valid. 
 * The actor can press the Cancel or Finish button to close the Wizard.
 * 
 * @param container		the Composite of the WizardPage
 * @param calendar		the ActorCalendar which opened the Wizard
 * @param pageOne		the first page of the Wizard
 * @param pageTwo		the second page of the Wizard
 * @param text1			the start time point
 * @param text2			the end time point
 * 
 * @author Annika
 *
 */
public class ActorEditPeriodPage extends WizardPage {  
	  
	  private Composite container;
	  protected ActorCalendar calendar;
	  protected IWizardPage pageOne;
	  protected IWizardPage pageTwo;
	  
	  protected Text text1;
	  protected Text text2;

	  /**
	   * constructor sets the parameters. sets the title of the page.
	   * 
	   * @param actorCalendar		the Actor Calendar which opened the wizard
	   * @param one					the first page of the wizard
	   * @param two					the second page of the wizard
	   */
	  public ActorEditPeriodPage(ActorCalendar actorCalendar, IWizardPage one, 
			  IWizardPage two) {
	    super("Edit a period");
	    setTitle("Edit a period");
	    
	    pageOne = one;
	    pageTwo = two;
	    calendar = actorCalendar;
	    
	    setDescription("Here you can edit a period");
	  }

	  /**
	   * implements the UI elements of the page.
	   * <p>
	   * The two text fields to edit the period and a Button to 
	   * save the changes.
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
	    layout.numColumns = 2;
	    
	    // start time point
	    Label label1 = new Label(container, SWT.NULL);
	    label1.setText("Start time:");
	    
	    text1 = new Text(container, SWT.BORDER | SWT.SINGLE);
	    
	    // end time point
	    Label label2 = new Label(container, SWT.NULL);
	    label2.setText("End Time:");
	    
	    text2 = new Text(container, SWT.BORDER | SWT.SINGLE);
	    
	    Button saveButton = new Button(container, SWT.PUSH); 
	    saveButton.setText("Save changes");
	    saveButton.addSelectionListener(new SelectionAdapter() {
	    	
	    	public void widgetSelected(SelectionEvent e) {
	    		
	    		editPeriod();
	    	}
	    	
	    });
	    
	    // Required to avoid an error in the system
	    setControl(container);
	    setPageComplete(false);
	  }
	  
	  /**
	   * fills the text fields in case, that a period is selected 
	   * on page two.
	   */
	  public void fillTexts() {
		  
		  int indexPeriod = ((ActorEditDayProfile)pageTwo).periodList.getSelectionIndex();
		  int indexDayProfile = ((ActorDayProfilesPage)pageOne).getList().getSelectionIndex();
		  
		  text1.setText(calendar.getDayprofiles().get(indexDayProfile).getPeriods().get(indexPeriod).getStartTimePoint().toPattern());
		  text2.setText(calendar.getDayprofiles().get(indexDayProfile).getPeriods().get(indexPeriod).getEndTimePointtime().toPattern());
	  }
	  
	  /**
	   * edit the period if it's valid
	   */
	  public void editPeriod() {
		  
		  // only if the two text fields are not empty
		  if (!text1.getText().isEmpty() && !text2.getText().isEmpty()) {
		  
			  String start = text1.getText();
		  	  String end = text2.getText();
		  		
		  	  // check if the format is not a regex fault
		  	  if (start.matches("^(?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d):)?([0-5]?\\d)$"
		  			  ) && end.matches("^(?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d):)?([0-5]?\\d)$")) {
		  	  
		  		// change the String in the format hh:mm:ss to an integer  
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
			    int index = ((ActorEditDayProfile)pageTwo).periodList.
			    		getSelectionIndex();
			    
			    boolean notOverlap = true;
			    
			    // check if the new period overlaps with an already existing period
			    for (int j = 0; j < calendar.getDayprofiles().get(i).getPeriods().size(); 
			    		j++) {
			    	
			    	if (j != index) {
			    	
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
					    
					    // checks if overlaps
					    if (startInt < endIntValue && endInt > startIntValue) {
					    	notOverlap = false;
					    	setDescription("this period overlaps with an already " +
					    			"existing period");
					    	setPageComplete(false);
					    }
				    
			    	}
			    	
			    }
			    
			    if (notOverlap == true) {
			  	  
			    	if(startInt < endInt) {
			    		edit(start, end);
			    		((ActorEditDayProfile)pageTwo).fillList();
			    		setPageComplete(true);
			    	}
			    	else {
			    		setDescription("end time is earlier than start time");
			    		setPageComplete(false);
			    	}
			    }
			  }
		  	  else {
		  		  setDescription("invalid period definition");
		  		  setPageComplete(false);
		  	  }
		  }
		  else {
			  setPageComplete(false);
		  }
	  }
	  
	  /**
	   * edit the period.
	   * 
	   * @param startTime		start time of the period
	   * @param endTime			end time of the period
	   */
	  public void edit(String startTime, String endTime) {
		  
		  int indexPeriod = ((ActorEditDayProfile)pageTwo).periodList.
				  getSelectionIndex();
		  int indexDayProfile = ((ActorDayProfilesPage)pageOne).getList().
				  getSelectionIndex();
		  
		  SimpleDateFormat start = new SimpleDateFormat(startTime);
		  SimpleDateFormat end = new SimpleDateFormat(endTime);
		  
		  calendar.getDayprofiles().get(indexDayProfile).getPeriods().get(indexPeriod).setStartTimePoint(start);
		  calendar.getDayprofiles().get(indexDayProfile).getPeriods().get(indexPeriod).setEndTimePointtime(end);
		  
		  setPageComplete(true);
		  setDescription(" ");
	  }
	} 