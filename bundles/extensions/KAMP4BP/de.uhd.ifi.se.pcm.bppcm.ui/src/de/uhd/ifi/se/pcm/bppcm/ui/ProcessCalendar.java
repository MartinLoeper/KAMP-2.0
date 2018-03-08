package de.uhd.ifi.se.pcm.bppcm.ui;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessWorkload;
import de.uhd.ifi.se.pcm.bppcm.converter.CalendarModelConverter;
import de.uhd.ifi.se.pcm.bppcm.converter.EMFModelLoader;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel;
import de.uhd.ifi.se.pcm.bppcm.spec.Day;
import de.uhd.ifi.se.pcm.bppcm.spec.DayProfile;
import de.uhd.ifi.se.pcm.bppcm.spec.ProcessTriggerPeriodSpecification;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.pcm.usagemodel.Workload;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;
import org.palladiosimulator.analyzer.workflow.ConstantsContainer;
/**
 * ProcessCalendar which extends from ViewPart is a View.
 * It visualizes a Group of elements to choose and load
 * an UsageModel, a calendar with a 
 * label, that has the current month and two buttons to
 * navigate through the months. 
 * It visualizes three buttons at the bottom. One to open
 * the wizard to organize day profiles, a button 
 * to persist both models (UsageModel and 
 * OrganizationEnvironmentModel) and a button to
 * switch to the ProcessCalendarView.
 * 
 * @param selectedTimeUnit	the selected time unit in the wizard time unit
 * @param oldTimeUnit		the time unit the project had before
 * @param dayprofiles 		list of available day profiles
 * @param days				list of 365 days of the year	
 * @param periodList		the list of periods from the profile "Working Day"
 * @param calendar 			instead of the this operator
 * @param actorCalendarView	the ActorCalendar which is opened from this view
 * @param scenarioDayProfilesLists list of scenarios
 * @param scenarioIndex		index of the selected scenario
 * @param helplist			fills the list of scenarioDayProfilesLists where is no dayprofile list
 * @param month				the current month on the calendar
 * @param textUsage			the location of the chosen scenario
 * @param container			container for the UI elements
 * @param modifyListener	a modify listener
 * @param model				the chosen model
 * @param loader			to load and persist the model
 * @param actorModel		the OrganizationEnvironmentModel in the project where the chosen
 * 							UsageModel is located
 * @param textOrganization	the location of the actorModel
 * @param projectName		name of the Project, where the model is located 
 * @param comboBox			the box to select a scenario
 * @param selectedScenario	the scenario which was selected in the comboBox
 * @param scenarioList		the list of all scenarios in the project of the chosen model
 * @param actorList			the list of all actors in the chosen model 
 * @param FILE_NAME			the name of the text file, which has the information about the 
 * 							current time unit in the project
 * @param persistButton		Persist Button to save the changed models
 * @param count				counts how often ActorCalendar Button was clicked
 * 
 * @author Annika
 *
 */
public class ProcessCalendar extends ViewPart implements IDoubleClickListener {
	
	private String selectedTimeUnit;
	protected String oldTimeUnit;

	protected ArrayList<DayProfile> dayprofiles;
	private ArrayList<Day> days;
	protected ArrayList<ProcessTriggerPeriodSpecification> periodList;
	protected ProcessCalendar calendar = this;
	protected ActorCalendar actorCalendarView;
	public ArrayList<ArrayList<DayProfile>> scenarioDayProfilesLists; 
	protected Integer scenarioIndex;
	public ArrayList<DayProfile> helpList;

	protected String month;
	
	protected Text textUsage;
	
	/** Container for UI elements. */
	protected Composite container;
	
	protected ModifyListener modifyListener;
	protected UsageModel model;
	protected EMFModelLoader loader;
	
	protected OrganizationEnvironmentModel actorModel;
	protected String textOrganization;
	protected String projectName;
	
	// the box to select a certain actor from the selected organization 
	// environment model
	protected Combo comboBox;
	// the actor selected from the combo box
	public UsageScenario selectedScenario;
	
	protected ArrayList<UsageScenario> scenarioList;
	protected ArrayList<ActorResource> actorList;

	final static String FILE_NAME = "conf.txt";
	
	protected Button persistButton;
	
	protected int count; 
	
	/**
	 * the constructor which sets the parameters
	 * and specificates the 365 days of the year.
	 * It creates two day profiles in the beginning. 
	 * Working Day and Free Day.
	 * The default month is January and the selected
	 * time unit is Seconds.  
	 */
	public ProcessCalendar() {
		
		count = 0;
		month = "January";
		selectedTimeUnit = "Seconds";
		oldTimeUnit = selectedTimeUnit;
		
		scenarioList = new ArrayList<UsageScenario>();
		
		scenarioDayProfilesLists = new ArrayList<ArrayList<DayProfile>>();
		
		helpList = new ArrayList<DayProfile>();
		
		dayprofiles = new ArrayList<DayProfile>();
		dayprofiles.addAll(new ArrayList<DayProfile>());
		
		dayprofiles.add(new DayProfile("Working Day"));
		
		periodList = new ArrayList<ProcessTriggerPeriodSpecification>();
		
		dayprofiles.get(0).setPeriods(periodList);
		
		dayprofiles.add(new DayProfile("Free Day"));
		
		days = new ArrayList<Day>();
		days.addAll(new ArrayList<Day>());
		
		// 365 days of the year
		
		//January
		for(int i = 1; i <= 31; i++) {
			days.add(new Day(i + "Jan", dayprofiles.get(0)));
		}
		
		//February
		for(int i = 1; i <= 28; i++) {
			days.add(new Day(i + "Feb", dayprofiles.get(0)));
		}
		
		//March
		for(int i = 1; i <= 31; i++) {
			days.add(new Day(i + "Mar", dayprofiles.get(0)));
		}
		
		//April
		for(int i = 1; i <= 30; i++) {
			days.add(new Day(i + "Apr", dayprofiles.get(0)));
		}
		
		//May
		for(int i = 1; i <= 31; i++) {
			days.add(new Day(i + "May", dayprofiles.get(0)));
		}
		
		//June
		for(int i = 1; i <= 30; i++) {
			days.add(new Day(i + "Jun", dayprofiles.get(0)));
		}
		
		//July
		for(int i = 1; i <= 31; i++) {
			days.add(new Day(i + "Jul", dayprofiles.get(0)));
		}
		
		//August
		for(int i = 1; i<= 31; i++) {
			days.add(new Day(i + "Aug", dayprofiles.get(0)));
		}
		
		//September
		for(int i = 1; i <= 30; i++) {
			days.add(new Day(i + "Sep", dayprofiles.get(0)));
		}
		
		//October
		for(int i = 1; i <= 31; i++) {
			days.add(new Day(i + "Oct", dayprofiles.get(0)));
		}
		
		//November
		for(int i = 1; i <= 30; i++) {
			days.add(new Day(i + "Nov", dayprofiles.get(0)));
		}
		
		//December
		for(int i = 1; i <= 31; i++) {
			days.add(new Day(i + "Dec", dayprofiles.get(0)));
		}
			
	}
	
	public ArrayList<DayProfile> getDayprofiles() {
		return dayprofiles;
	}

	public void setDayprofiles(ArrayList<DayProfile> dayprofiles) {
		this.dayprofiles = dayprofiles;
	}

	/**
	 * implements the ui elements in this class, the group to load a model,
	 * the comboBox to choose a Scenario, the calendar and the buttons to edit
	 * day profiles and to switch to the ActorCalendarView.
	 * 
	 * @param parent		the parent composite of this view 
	 * 
	 * (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(final Composite parent) {
		// TODO Auto-generated method stub
		
		modifyListener = new ModifyListener() {

			/**
			 * this method loads the usage model 
			 * in case the text has changed in the text box. 
			 *  
			 *  @param e 	the event that the text has changed
			 *  
			 * (non-Javadoc)
			 * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
			 */
			public void modifyText(ModifyEvent e) {
				
				// load the usage model
				loader = new EMFModelLoader();
				model = loader.loadUsageModel(textUsage.getText());
				
				String temp;
				temp = textUsage.getText();
				temp = temp.substring(0, temp.lastIndexOf("/"));
				textOrganization = temp + "/My.organizationenvironmentmodel";
				actorModel = loader.loadOrganizationEnvironmentModel(textOrganization);
				
				// set the project Name
				projectName = temp.substring(temp.lastIndexOf("/")+1);
				
				// add the scenarios from the model to the combo box
				// the array of names of the scenarios
				ArrayList<String> usageScenarios = new ArrayList<String>();
				
				// iterate over all the scenarios in the model
				Iterator<UsageScenario> scenarios = model.
						getUsageScenario_UsageModel().iterator();
				while(scenarios.hasNext()){
					// add an name to the array
					usageScenarios.add(scenarios.next().getEntityName());
				}
				
				// convert the array list to a simple array
				String[] simpleArray = new String[usageScenarios.size()];
				usageScenarios.toArray(simpleArray);
				         
				// initialize the combo box with the simple array
				comboBox.setItems(simpleArray);
				
				// activate the combo box after the model has been loaded
				comboBox.setEnabled(true);
				comboBox.select(0);
				
				for (int i = 0; i < usageScenarios.size(); i++) {
					scenarioDayProfilesLists.add(helpList);
				}
			}
		};
		
		container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout());
		 GridLayoutFactory.fillDefaults().numColumns(1).applyTo(parent);
		
		/**
		 * Create usage section
		 */
		// First set the text like this, will be changed to the right parent 
		// in createFileInputSection
		textUsage = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, 
				"Usage File", ConstantsContainer.USAGEMODEL_EXTENSION, 
				textUsage, "Select Usage File", parent.getShell(), 
				ConstantsContainer.DEFAULT_USAGE_FILE);

	    
	    // new outside composite-instance
	    final Composite compositeOut = new Composite(parent, 0);
	    // get properties from parent composite
	    compositeOut.setBackground(parent.getBackground());
	    compositeOut.setForeground(parent.getForeground());
	    compositeOut.setFont(parent.getFont());
	    // set position and bounds
	    compositeOut.setBounds(100,200,30,30);
	    
	    // group contains comboBox to choose a scenario
	    Group group = new Group(compositeOut, SWT.FILL);
	    GridLayout layoutGroup = new GridLayout();
	    layoutGroup.numColumns = 2;
	    group.setLayout(layoutGroup);
	    group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    group.setText("Select a scenario");
	    
	    comboBox = new Combo(group, SWT.NONE);
	    comboBox.setEnabled(false);
	    comboBox.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    comboBox.addSelectionListener(new SelectionListener() {
			
	    	/**
	    	 * handles the event if there is selected a scenario 
	    	 * in the comboBox. 
	    	 * <p>
	    	 * It loads the selected scenario in the program and adds all
	    	 * existing periods in the scenario to the  day profile Working
	    	 * Day.
	    	 * <p>
	    	 * It writes all scenarios to the scenarioList from this model and all
	    	 * actors from the OrganizationEnvironment Model in the same project to 
	    	 * the list scenarioList. 
	    	 * 
	    	 * @param e 	the event that an Scenario was chosen 
	    	 * 
	    	 * (non-Javadoc)
	    	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	    	 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				// enable Persist-Button
				persistButton.setEnabled(true);
				
				if (scenarioIndex != null) {
					ArrayList<DayProfile> dpList = new ArrayList<DayProfile>();
					
					for (int i = 0; i < dayprofiles.size(); i++) {
						ArrayList<ProcessTriggerPeriodSpecification> periodL = new 
								ArrayList<ProcessTriggerPeriodSpecification>(dayprofiles.
										get(i).getPeriods());
						dpList.add(new DayProfile(dayprofiles.get(i).getName()));
						dpList.get(i).setPeriods(periodL);
					}
					scenarioDayProfilesLists.add(scenarioIndex, dpList);
					scenarioDayProfilesLists.remove(scenarioIndex +1);
				}
				
				// clear day profile periods
				for (int i = 0; i < dayprofiles.size(); i++) {
					dayprofiles.get(i).getPeriods().clear();
				}
				
				periodList.clear();
				
				// get the selected String from the list
				String name = comboBox.getItem(comboBox.getSelectionIndex());
				
				scenarioList.clear();
				
				int counter = 0;
				
				for (UsageScenario usageScenario : model.
						getUsageScenario_UsageModel()) {
					if(usageScenario.getEntityName().equals(name)){
						selectedScenario = usageScenario;
						scenarioIndex = counter; 
					}
					// load the other scenarios
					scenarioList.add(usageScenario);
					counter++;
				}
				
				actorList = new ArrayList<ActorResource>();
				actorList.clear();
				for (ActorResource actorResource : actorModel.getActorResources()) {
					actorList.add(actorResource);
				}
				
				// get the workload from the selected usage scenario
	    		Workload w = selectedScenario.getWorkload_UsageScenario();
	    		assert (w instanceof ProcessWorkload) : "only ProcessWorkloads " +
	    				"allowed";
	    		
	    		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	    		IProject project = workspaceRoot.getProject(projectName);
	    		
	    		String path = workspaceRoot.getLocation().toFile()
	    					+ "/" + project.getName() + "/" + FILE_NAME;
	    		
	    		FileUtil myFile = new FileUtil();
	    		
	    		if (!project.getFile(FILE_NAME).exists()) {
	    			
	    			try {
						myFile.writeTxtFile("Seconds", path);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	    		}
	    		
	    	    try {
					setSelectedTimeUnit(myFile.readTxtFile(path));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    	    
	    		oldTimeUnit = selectedTimeUnit;
	    		
	    		if (scenarioDayProfilesLists.get(scenarioIndex) == helpList) {
	    		
	    			int length = ((ProcessWorkload)w).getProcessTriggerPeriods().
		    				size();
	    			
	    			for (int i = 0; i < length; i++) {
	    		
	    				ProcessTriggerPeriodSpecification period = new 
	    						ProcessTriggerPeriodSpecification();
	    			
	    				// get period to workload
	    				double st = ((ProcessWorkload)w).getProcessTriggerPeriods().
	    						get(i).getPeriodStartTimePoint();
	    				double en = ((ProcessWorkload)w).getProcessTriggerPeriods().
	    						get(i).getPeriodEndTimePoint();
	    				String inter = ((ProcessWorkload)w).getProcessTriggerPeriods().
	    						get(i).getInterArrivalTime_ProcessWorkload().
	    						getSpecification();
	    			
	    				String startString = calculateUnit(st);
	    				String endString = calculateUnit(en);
	    			
	    				// prepare for new period
	    				SimpleDateFormat start = new SimpleDateFormat(startString);
	    				SimpleDateFormat end = new SimpleDateFormat(endString);
	    			
	    				boolean existingPeriod = false;
	    			
	    				for (int j = 0; j < periodList.size(); j++) {
	    			
	    					String oldStart = periodList.get(j).getStartTimePoint().toPattern();
	    					String oldEnd = periodList.get(j).getEndTimePointtime().toPattern();
	    				
	    					// check if this period already exists
	    					if (startString.equals(oldStart) && endString.equals(oldEnd) ) {
	    						existingPeriod = true;
	    					}
	    				}
	    
	    				// if this period doesn't already exist 
	    				if (!existingPeriod) {
	    			
	    					// add the new period
	    					period.setStartTimePoint(start);
	    					period.setEndTimePointtime(end);
	    					period.setInterArrivalTime(inter);
	    			
	    					/*
	    				 	* new periods always to the dayprofile "WorkingDay" 
	    				 	* later on it must be possible to allocate the periods to 
	    				 	* specific and different dayprofiles
	    				 	*/
	    			
	    					periodList.add(period);
	    				}
	    			}
	    		}
	    		else {
	    			// clear dayprofile periods
					for (int i = 0; i < getDayprofiles().size(); i++) {
						getDayprofiles().get(i).getPeriods().clear();
					}
					
					// clear dayprofilelist
					getDayprofiles().clear();
					
					// clear periodList of dayprofile "Working Day"
					periodList.clear();
					
					ArrayList<ProcessTriggerPeriodSpecification> periodL = new 
							ArrayList<ProcessTriggerPeriodSpecification>();
					
					for (int i = 0; i < scenarioDayProfilesLists.get(scenarioIndex).size(); i++) {
						
						for (int j = 0; j < scenarioDayProfilesLists.get(scenarioIndex).get(i).
								getPeriods().size(); j++) {
							
							ProcessTriggerPeriodSpecification period = new 
									ProcessTriggerPeriodSpecification();
							period.setStartTimePoint(scenarioDayProfilesLists.get(scenarioIndex).
									get(i).getPeriods().get(j).getStartTimePoint());
							period.setEndTimePointtime(scenarioDayProfilesLists.get(scenarioIndex).
									get(i).getPeriods().get(j).getEndTimePointtime());
							period.setInterArrivalTime(scenarioDayProfilesLists.get(scenarioIndex).
									get(i).getPeriods().get(j).getInterArrivalTime());
							
							if (i == 0) {
								
								periodList.add(period);
							}
							else {
								
								periodL.add(period);
							}
						}
						
						if (i == 0) {
							
							getDayprofiles().add(new DayProfile(scenarioDayProfilesLists.
									get(scenarioIndex).get(i).getName()));
							getDayprofiles().get(i).setPeriods(periodList);
						}
						else {
							getDayprofiles().add(new DayProfile(scenarioDayProfilesLists.
									get(scenarioIndex).get(i).getName()));
							getDayprofiles().get(i).setPeriods(periodL);
						}
					}
	    		}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	    
	    // new inner composite instance
	    final Composite compositeIn = new Composite(compositeOut, 0);
	    // get properties from parent composite
	    compositeIn.setBackground(parent.getBackground());
	    compositeIn.setForeground(parent.getForeground());
	    compositeIn.setFont(parent.getFont());
	    // set position and bounds 
	    compositeIn.setBounds(100,200,30,30);
	    
	    // Layout Manager
	    RowLayout rowlayout = new RowLayout();
	    rowlayout.center = true;
	    
	    GridLayout gridlayout2 = new GridLayout();
	    gridlayout2.numColumns = 1;
	    
	    compositeOut.setLayout(gridlayout2);
	    compositeIn.setLayout(rowlayout);
	    
	    // Buttons
	    final Button buttonLeft = new Button(compositeIn, SWT.ARROW | SWT.LEFT);
	    
	    // this layout makes sure, that the right button can't move
	    RowData gd = new RowData ();
	    gd.width = 60;
	    
	    final Label monthLabel = new Label(compositeIn,SWT.SHADOW_NONE);
	    monthLabel.setLayoutData(gd);
	    monthLabel.setText("January");
		
		final Button buttonRight = new Button(compositeIn, SWT.ARROW | SWT.RIGHT);
        
		// Table
		final TableViewer viewer = new TableViewer(compositeOut, 
				SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		viewer.setContentProvider(new JanuaryContentProvider());

		final Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		// Monday column
		TableViewerColumn column1 = new TableViewerColumn(viewer, SWT.NONE);
		column1.getColumn().setMoveable(false);
		column1.getColumn().setText("Mo");
		column1.getColumn().setWidth(30);
		ColumnLabelProvider column1Provider = new ColumnLabelProvider() {
			/**
			 * fill the first column for the day Monday in the table with 
			 * numbers of the weeks
			 * 
			 * @param element	element of the Object
			 * 
			 * (non-Javadoc)
			 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
			 */
			public String getText(Object element) {
				if (element instanceof MyWeek) {
					MyWeek week1 = (MyWeek) element;
					return week1.getText(0);
				} 
				else {
					return "";
				}
			}
		};
		column1.setLabelProvider(column1Provider);
		
		// Tuesday column
		TableViewerColumn column2 = new TableViewerColumn(viewer, SWT.NONE);
		column2.getColumn().setMoveable(false);
		column2.getColumn().setText("Di");
		column2.getColumn().setWidth(30);
		ColumnLabelProvider column2Provider = new ColumnLabelProvider() {
			/**
			 * fill the second column for the day Tuesday in the table with 
			 * numbers of the weeks
			 * 
			 * @param element	element of the Object
			 * 
			 * (non-Javadoc)
			 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
			 */
			public String getText(Object element) {
				if (element instanceof MyWeek) {
					MyWeek week1 = (MyWeek) element;
					return week1.getText(1);
				} 
				else {
					return "";
				}
			}
		};
		column2.setLabelProvider(column2Provider);
		
		// Wednesday column
		TableViewerColumn column3 = new TableViewerColumn(viewer, SWT.NONE);
		column3.getColumn().setMoveable(false);
		column3.getColumn().setText("Mi");
		column3.getColumn().setWidth(30);
		ColumnLabelProvider column3Provider = new ColumnLabelProvider() {
			/**
			 * fill the third column for the day Wednesday in the table with 
			 * numbers of the weeks
			 * 
		 	 * @param element	element of the Object
		 	 * 
		 	 * (non-Javadoc)
			 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
			 */
			public String getText(Object element) {
				if (element instanceof MyWeek) {
					MyWeek week1 = (MyWeek) element;
					return week1.getText(2);
				} 
				else {
					return "";
				}
			}
		};
		column3.setLabelProvider(column3Provider);
		
		// Thursday column
		TableViewerColumn column4 = new TableViewerColumn(viewer, SWT.NONE);
		column4.getColumn().setMoveable(false);
		column4.getColumn().setText("Do");
		column4.getColumn().setWidth(30);
		ColumnLabelProvider column4Provider = new ColumnLabelProvider() {
			/**
			 * fill the fourth column for the day Thursday in the table with 
			 * numbers of the weeks
			 * 
			 * @param element	element of the Object
			 * 
			 * (non-Javadoc)
			 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
			 */
			public String getText(Object element) {
				if (element instanceof MyWeek) {
					MyWeek week1 = (MyWeek) element;
					return week1.getText(3);
				} 
				else {
					return "";
				}
			}
		};
		column4.setLabelProvider(column4Provider);		

		// Friday column
		TableViewerColumn column5 = new TableViewerColumn(viewer, SWT.NONE);
		column5.getColumn().setMoveable(false);
		column5.getColumn().setText("Fr");
		column5.getColumn().setWidth(30);
		ColumnLabelProvider column5Provider = new ColumnLabelProvider() {
			/**
			 * fill the fifth column for the day Friday in the table with 
			 * numbers of the weeks
			 * 
		 	 * @param element	element of the Object
			 * 
			 * (non-Javadoc)
			 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
			 */
			public String getText(Object element) {
				if (element instanceof MyWeek) {
					MyWeek week1 = (MyWeek) element;
					return week1.getText(4);
				} 
				else {
					return "";
				}
			}
		};
		column5.setLabelProvider(column5Provider);	
		
		// Saturday column
		TableViewerColumn column6 = new TableViewerColumn(viewer, SWT.NONE);
		column6.getColumn().setMoveable(false);
		column6.getColumn().setText("Sa");
		column6.getColumn().setWidth(30);
		ColumnLabelProvider column6Provider = new ColumnLabelProvider() {
			/**
			 * fill the sixth column for the day Saturday in the table with 
			 * numbers of the weeks
			 * 
			 * @param element	element of the Object
			 * 
			 * (non-Javadoc)
			 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
			 */
			public String getText(Object element) {
				if (element instanceof MyWeek) {
					MyWeek week1 = (MyWeek) element;
					return week1.getText(5);
				} 
				else {
					return "";
				}
			}
		};
		column6.setLabelProvider(column6Provider);	
		
		// Sunday column
		TableViewerColumn column7 = new TableViewerColumn(viewer, SWT.NONE);
		column7.getColumn().setMoveable(false);
		column7.getColumn().setText("So");
		column7.getColumn().setWidth(30);
		ColumnLabelProvider column7Provider = new ColumnLabelProvider() {
			/**
			 * fill the seventh column for the day Sunday in the table with 
			 * numbers of the weeks
			 * 
			 * @param element	element of the Object
			 * 
			 * (non-Javadoc)
			 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
			 */
			public String getText(Object element) {
				if (element instanceof MyWeek) {
					MyWeek week1 = (MyWeek) element;
					return week1.getText(6);
				} 
				else {
					return "";
				}
			}
		};
		column7.setLabelProvider(column7Provider);	
		
		viewer.setInput(new ArrayList<MyWeek>().toArray());
		
		// add doulbe click listener to the table
		viewer.addDoubleClickListener(this);
		
		final Composite compositeButton = new Composite(compositeOut, 0);
		GridLayout gridlayout3 = new GridLayout();
	    gridlayout3.numColumns = 2;
	    
	    compositeButton.setLayout(gridlayout3);
		
		// Dayprofiles button
		final Button dayProfilesButton = new Button(compositeButton, SWT.PUSH);
	    dayProfilesButton.setText("Day profiles");
		
	    // button click listener for dayprofiles button
	    dayProfilesButton.addSelectionListener(new SelectionAdapter() {
	    	/**
	    	 * opens the wizard to edit day profiles
	    	 * 
	    	 * @param e 	the button was clicked
	    	 * 
	    	 * (non-Javadoc)
	    	 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	    	 */
	    	public void widgetSelected(SelectionEvent e) {
	    		
	    		// opens dayProfilesWizard
	    		WizardDialog wizardDialog = new WizardDialog(parent.getShell(),
	    			      new DayProfilesWizard(calendar));
	    			    if (wizardDialog.open() == Window.OK) {
	    			    } else {
	    			       }
	    	}
	    });
	    
	    final Button actorCalendarButton = new Button(compositeButton, SWT.PUSH);
	    actorCalendarButton.setText("Actor Calendar");
	    
	    // actorCalendarButton click listener
	    actorCalendarButton.addSelectionListener(new SelectionAdapter() {
	    	/**
	    	 * switches to the Actor Calendar View
	    	 * 
	    	 * @param e 	the button was clicked
	    	 * 
	    	 * (non-Javadoc)
	    	 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	    	 */
	    	public void widgetSelected(SelectionEvent e) { 
	    		
	    		count++;
	    		
	    		try {
	    			  IViewPart view = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("de.uhd.ifi.se.pcm.bppcm.ui.ActorCalendar");
	    			  if (view instanceof ActorCalendar) {
	    			   actorCalendarView = (ActorCalendar) view;
	    			  }
	    			 } catch (PartInitException ex) {
	    			  // showView() can throw an exception if view cannot be shown
	    			  ex.printStackTrace();
	    			 }
	    		
	    		if (!textUsage.getText().equals("") && count == 1) {
 				   actorCalendarView.open(textOrganization);
 			   	}
	    		
	    		// override the selectedTimeUnit in the AC-class with this one
	    		actorCalendarView.selectedTimeUnit = selectedTimeUnit;
	    	}
	    });
	    
	    // Persist button
	    persistButton = new Button(compositeButton, SWT.PUSH);
	    persistButton.setText("Persist");
	    
	    persistButton.setEnabled(false);
	    
	    // persist buttonclick listener
	    persistButton.addSelectionListener(new SelectionAdapter() {
	    	/**
	    	 * persists the project, the usagemodel and the organizationenvironmentmodel.
	    	 * all scenarios and actors are set to the new time unit.
	    	 * the edited scenario and actor (if edited) are updated.
	    	 * 
	    	 * @param e		click button Persist
	    	 * 
	    	 * (non-Javadoc)
	    	 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	    	 */
	    	public void widgetSelected(SelectionEvent e) {
	    		// the wizard to choose the time unit 
	    		WizardDialog wizardDialog = new WizardDialog(parent.getShell(),
	    			      new TimeUnitWizard(calendar));
	    			    if (wizardDialog.open() == Window.OK) {
	    			    } else {
	    			       }
	    		// write the choosen time unit to the file
	    		FileUtil myFile = new FileUtil();
	    		
	    		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	    		IProject project = workspaceRoot.getProject(projectName);
	    		
	    		String path = workspaceRoot.getLocation().toFile()
	    					+ "/" + project.getName() + "/" + FILE_NAME;
	    		
	    		try {
					myFile.writeTxtFile(selectedTimeUnit, path);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    		
	    		// update the model in case ActorCalendar wasn't opened or the model in ActorCalendar
	    		// wasn't loaded
	    		if (actorCalendarView == null || actorCalendarView.model == null) {
	    			CalendarModelConverter converter = new CalendarModelConverter(calendar);
	    			converter.updateUsageModel(scenarioList, selectedScenario);
	    			
	    			if (!selectedTimeUnit.equals(oldTimeUnit)) {
	    				converter.updateOEM(actorList);
	    				loader.persistOrganizationEnvironmentModel(textOrganization, actorModel);
	    			}
	    			// persist the model
		    		loader.persistUsageModel(textUsage.getText(), model);
		    		
		    		if (!model.getUsageScenario_UsageModel().isEmpty()) {
		    			comboBox.setEnabled(true);
		    		}
	    		}
	    		// update the model in case there is loaded a model in ActorCalendar
	    		else { 
	    			CalendarModelConverter converter = new CalendarModelConverter(calendar, actorCalendarView);
	    			// update the model in case there wasn't loaded a model in ProcessCalendar
	    			if (model == null && !selectedTimeUnit.equals(oldTimeUnit)) {  
	    				converter.updateUSM(actorCalendarView.scenarioList);
	    				actorCalendarView.loader.persistUsageModel(actorCalendarView.textUsage, 
	    						actorCalendarView.processModel);
	    				
	    				converter.updateOganizationEnvironmentModel(actorCalendarView.selectedActor, 
	    						actorCalendarView.actorList);
		    			
			    		actorCalendarView.loader.persistOrganizationEnvironmentModel(actorCalendarView.textOrganization.getText(), 
			    				actorCalendarView.model);
			    		
			    		if (!actorCalendarView.model.getActorResources().isEmpty()) {
			    			actorCalendarView.comboBox.setEnabled(true);
			    		}
	    			}
	    			// update the model in case there was loaded a model in ProcessCalendar
	    			else {
	    				converter.updateUsageModel(scenarioList, selectedScenario);
	    				// persist the model
			    		loader.persistUsageModel(textUsage.getText(), model);
			    		
			    		if (!model.getUsageScenario_UsageModel().isEmpty()) {
			    			comboBox.setEnabled(true);
			    		}
			    		
			    		converter.updateOganizationEnvironmentModel(actorCalendarView.selectedActor, 
			    				actorCalendarView.actorList);
		    			
			    		loader.persistOrganizationEnvironmentModel(actorCalendarView.textOrganization.getText(), 
			    				actorCalendarView.model);
			    		
			    		if (!actorCalendarView.model.getActorResources().isEmpty()) {
			    			actorCalendarView.comboBox.setEnabled(true);
			    		}
	    			}
	    		}
	    	}
	    });
	    
	    // button for change to earlier month
		buttonLeft.addSelectionListener(new SelectionAdapter() {
			/**
			 * changes the month of the calendar to previous month
			 * 
			 * @param e		the button was clicked
			 * 
			 * (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				
				if (monthLabel.getText() == "January") {
					viewer.setContentProvider(new DecemberContentProvider());
					monthLabel.setText("December");
				}
				
				else if (monthLabel.getText() == "December") {
					viewer.setContentProvider(new NovemberContentProvider());
					monthLabel.setText("November");
				}
				
				else if (monthLabel.getText() == "November") {
					viewer.setContentProvider(new OctoberContentProvider());
					monthLabel.setText("October");
				}
				
				else if (monthLabel.getText() == "October") {
					viewer.setContentProvider(new SeptemberContentProvider());
					monthLabel.setText("September");
				}
				
				else if (monthLabel.getText() == "September") {
					viewer.setContentProvider(new AugustContentProvider());
					monthLabel.setText("August");
				}
				
				else if (monthLabel.getText() == "August") {
					viewer.setContentProvider(new JulyContentProvider());
					monthLabel.setText("July");
				}
				
				else if (monthLabel.getText() == "July") {
					viewer.setContentProvider(new JuneContentProvider());
					monthLabel.setText("June");
				}
				
				else if (monthLabel.getText() == "June") {
					viewer.setContentProvider(new MayContentProvider());
					monthLabel.setText("May");
				}
				
				else if (monthLabel.getText() == "May") {
					viewer.setContentProvider(new AprilContentProvider());
					monthLabel.setText("April");
				}
				
				else if (monthLabel.getText() == "April") {
					viewer.setContentProvider(new MarchContentProvider());
					monthLabel.setText("March");
				}
				
				else if (monthLabel.getText() == "March") {
					viewer.setContentProvider(new FebruaryContentProvider());
					monthLabel.setText("February");
				}
				
				else if (monthLabel.getText() == "February") {
					viewer.setContentProvider(new JanuaryContentProvider());
					monthLabel.setText("January");
				}
				
				month = monthLabel.getText();
				
				compositeOut.update();
				compositeIn.update();
				parent.update();
			}
		});
		
		// button for change to later month
		buttonRight.addSelectionListener(new SelectionAdapter() {
			/**
			 * changes month of the calendar to the next month
			 * 
			 * @param e		the button was clicked
			 * 
			 * (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
						
				if (monthLabel.getText() == "January") {
					viewer.setContentProvider(new FebruaryContentProvider());
					monthLabel.setText("February");
				}
				
				else if (monthLabel.getText() == "February") {
					viewer.setContentProvider(new MarchContentProvider());
					monthLabel.setText("March");
				}
				
				else if (monthLabel.getText() == "March") {
					viewer.setContentProvider(new AprilContentProvider());
					monthLabel.setText("April");
				}
				
				else if (monthLabel.getText() == "April") {
					viewer.setContentProvider(new MayContentProvider());
					monthLabel.setText("May");
				}
				
				else if (monthLabel.getText() == "May") {
					viewer.setContentProvider(new JuneContentProvider());
					monthLabel.setText("June");
				}
				
				else if (monthLabel.getText() == "June") {
					viewer.setContentProvider(new JulyContentProvider());
					monthLabel.setText("July");
				}
				
				else if (monthLabel.getText() == "July") {
					viewer.setContentProvider(new AugustContentProvider());
					monthLabel.setText("August");
				}
				
				else if (monthLabel.getText() == "August") {
					viewer.setContentProvider(new SeptemberContentProvider());
					monthLabel.setText("September");
				}
				
				else if (monthLabel.getText() == "September") {
					viewer.setContentProvider(new OctoberContentProvider());
					monthLabel.setText("October");
				}
				
				else if (monthLabel.getText() == "October") {
					viewer.setContentProvider(new NovemberContentProvider());
					monthLabel.setText("November");
				}
				
				else if (monthLabel.getText() == "November") {
					viewer.setContentProvider(new DecemberContentProvider());
					monthLabel.setText("December");
				}
						
				else if (monthLabel.getText() == "December") {
					viewer.setContentProvider(new JanuaryContentProvider());
					monthLabel.setText("January");
				}
					
				month = monthLabel.getText();
						
				
				compositeOut.update();
				compositeIn.update();
				parent.update();
			}
		});
		
		table.addMouseListener(new MouseAdapter(){
			/**
			 * in case of a double click on a number in the calendar 
			 * the Day Wizard opens
			 * 
			 * @param event		double click on a day in the calendar
			 * 
			 * (non-Javadoc)
			 * @see org.eclipse.swt.events.MouseAdapter#mouseDoubleClick(org.eclipse.swt.events.MouseEvent)
			 */
			public void mouseDoubleClick(MouseEvent event) {
				
				/* Determine the point where the user double clicked */
				Point clickedPoint = new Point(event.x, event.y);
				
				/* Determine the row */
				final TableItem tableItem = table.getItem(clickedPoint);
				if (tableItem == null){
					return;
				}
				
				/* Determine the column */
				int tempColumn = -1;
				int columnCount = table.getColumnCount();
				for (int i = 0; i < columnCount; i++) {
					Rectangle cell = tableItem.getBounds(i);
					if (cell.contains(clickedPoint)) {
						tempColumn = i;
						
						// opens dayWizard
						WizardDialog wizardDialog = new WizardDialog(parent.getShell(),
			    			      new DayWizard(calendar, tableItem.getText(tempColumn), month));
			    			    if (wizardDialog.open() == Window.OK) {
			    			    } else {
			    			       }
					} 
				} 
			}
		});
	    	}
	
	/**
	 * this method gets the index of the day in the list of days
	 * of a given String date
	 * 
	 * @param date 		the date of which the index is to get
	 * @return 			index of the day
	 */
	public int getIndex(String date) {
		int index = 0;
		
		if(month == "January") {
			for(int i = 0; i < 31; i++) {
				Integer j = new Integer(i+1);
				if (date.equals(j.toString())) {
					index = i;
				}
			}
		}
		
		if(month == "February") {
			for(int i = 0; i < 28; i++) {
				Integer j = i + 1;
				if (date.equals(j.toString())) {
					index = i + 31;
				}
			}
			
		}
		
		if(month == "March") {
			for(int i = 0; i < 31; i++) {
				Integer j = i + 1;
				if (date.equals(j.toString())) {
					index = i + 59;
				}
			}
		}
		
		if(month == "April") {
			for(int i = 0; i < 30; i++) {
				Integer j = i + 1;
				if (date.equals(j.toString())) {
					index = i + 90;
				}
			}
		}
		
		if(month == "May") {
			for(int i = 0; i < 31; i++) {
				Integer j = i + 1;
				if (date.equals(j.toString())) {
					index = i + 121;
				}
			}
		}
		
		if(month == "June") {
			for(int i = 0; i < 30; i++) {
				Integer j = i + 1;
				if (date.equals(j.toString())) {
					index = i + 151;
				}
			}
		}
		
		if(month == "July") {
			for(int i = 0; i < 31; i++) {
				Integer j = i + 1;
				if (date.equals(j.toString())) {
					index = i + 182;
				}
			}
		}
		
		if(month == "August") {
			for(int i = 0; i < 31; i++) {
				Integer j = i + 1;
				if (date.equals(j.toString())) {
					index = i + 213;
				}
			}
		}
		
		if(month == "September") {
			for(int i = 0; i < 30; i++) {
				Integer j = i + 1;
				if (date.equals(j.toString())) {
					index = i + 243;
				}
			}
		}
		
		if(month == "October") {
			for(int i = 0; i < 31; i++) {
				Integer j = i +1;
				if (date.equals(j.toString())) {
					index = i + 273;
				}
			}
		}
		
		if(month == "November") {
			for(int i = 0; i < 30; i++) {
				Integer j = i + 1;
				if(date.equals(j.toString())) {
					index = i + 304;
				}
			}
		}
		
		if(month == "December") {
			for(int i = 0; i < 31; i++) {
				Integer j = i + 1;
				if(date.equals(j.toString())) {
					index = i + 334;
				}
			}
		}
		return index;
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doubleClick(DoubleClickEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	public ArrayList<Day> getDays() {
		return days;
	}
	
	public ArrayList<ProcessTriggerPeriodSpecification> getPeriodList() {
		return periodList;
	}
	
	public String getSelectedTimeUnit() {
		return selectedTimeUnit;
	}
	
	public void setSelectedTimeUnit(String time) {
		selectedTimeUnit = time;
	}
	
	public String getOldTimeUnit() {
		return oldTimeUnit;
	}
	
	
	/**
	 * calculates the string of the form "hh:mm:ss" to
	 * a given time of double. 
	 * <p>
	 * It calculates the string with respect to the 
	 * time unit.
	 * 
	 * @param t		given time in a time unit
	 * @return		time in the string format "hh:mm:ss"
	 */
	public String calculateUnit(double t) {
		
		// convert t from milliseconds to seconds
		if (getSelectedTimeUnit().equals("Milliseconds\n") 
				|| getSelectedTimeUnit().equals("Milliseconds")) {
			t = t/1000;
		}
		
		// convert t from minutes to seconds
		else if (getSelectedTimeUnit().equals("Minutes\n")
				|| getSelectedTimeUnit().equals("Minutes")) {
			t = t * 60;
		}
		
		// convert t from hours to seconds
		else if (getSelectedTimeUnit().equals("Hours\n")
				|| getSelectedTimeUnit().equals("Hours")) {
			t = t * 60 * 60;
		}
		
		// calculates the double time in seconds to the format hh:mm:ss
		int numberOfDays = (int)t / (24 * 60 * 60);
		t = t - (numberOfDays * 24 * 60 * 60);
		
		int first = (int)t / (60 * 60);
		t = t - (first * 60 * 60);
		
		int second = (int)t / 60;
		t = t - (second * 60);
		
		int third = (int)t;
		
		// puts together the time to a string
		String sFirst = "";
		String sSecond = ""; 
		String sThird = "";
		
		if (first < 10) {
			sFirst = "0" + first;
		}
		else {
			sFirst = "" + first;
		}
		if (second < 10) {
			sSecond = "0" + second;
		}
		else {
			sSecond = "" + second;
		}
		if (third < 10) {
			sThird = "0" + third;
		}
		else {
			sThird = "" + third;
		}
		
		String time = sFirst + ":" + sSecond + ":" + sThird;
		
		return time;
	}

	/**
	 * this method is performed, when the Button "Process Calendar" is clicked 
	 * on the view ActorCalendar.
	 * 
	 * @param textU		the location of the UsageModel in the 
	 * 					same Project as the OrganizationEnvironmentModel in the 
	 * 					ActorCalendar
	 */
	public void open(String textU) {
		// TODO Auto-generated method stub
		
		if (textUsage.getText().equals("")) {
			textUsage.setText(textU);
		}
	}
	
}