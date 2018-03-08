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

import de.uhd.ifi.se.pcm.bppcm.converter.EMFModelLoader;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel;
import de.uhd.ifi.se.pcm.bppcm.spec.DayActor;
import de.uhd.ifi.se.pcm.bppcm.spec.DayProfileActor;
import de.uhd.ifi.se.pcm.bppcm.spec.Period;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;

/**
 * ActorCalendar which extends from ViewPart is a View.
 * It visualizes a Group of elements to choose and load
 * an OrganizationEnvironmentModel, a calendar with a 
 * label, that has the current month and two buttons to
 * navigate through the months. 
 * It visualizes two buttons at the bottom. One to open
 * the wizard to organize day profiles and a button to
 * switch to the ProcessCalendarView.
 * 
 * @param dayprofiles 		list of available day profiles
 * @param days				list of 365 days of the year	
 * @param periodList		the list of periods from the profile "Working Day"
 * @param calendar 			instead of the this operator
 * @param actorDayProfilesLists list of dayprofiles
 * @param actorIndex		index of the selected actor
 * @param helpList			fills the list of actorDayProfilesLists where is no dayprofiles list
 * @param comboBox			the box to select an actor
 * @param selectedActor		the actor which was selected in the comboBox
 * @param scenarioList		the list of all scenarios in the project of the chosen model
 * @param actorList			the list of all actors in the chosen model 
 * @param month				the current month on the calendar
 * @param textOrganization	the location of the chosen actor
 * @param container			container for the UI elements
 * @param modifyListener	a modify listener
 * @param model				the chosen model
 * @param loader			is used to load/persist the model (and project)
 * @param processModel		the Usage Model in the project where the chosen Organization
 * 							Environment Model is located
 * @param textUsage			the location of the processModel
 * @param projectName		the name of the project where the model is located
 * @param FILE_NAME			the name of the text file, which has the information about the 
 * 							current time unit in the project
 * @param selectedTimeUnit	the selected time unit in the wizard time unit
 * @param oldTimeUnit		the time unit the project had before
 * @param count				counts how often the ProcessCalendar Button was clicked 
 * 
 * @author Annika
 *
 */
public class ActorCalendar extends ViewPart implements IDoubleClickListener {

	private ArrayList<DayProfileActor> dayprofiles;
	protected ArrayList<DayActor> days;
	protected ArrayList<Period> periodList;
	protected ActorCalendar calendar = this;
	public ArrayList<ArrayList<DayProfileActor>> actorDayProfilesLists; 
	protected Integer actorIndex;
	public ArrayList<DayProfileActor> helpList;
	
	// the box to select a certain actor from the selected organization 
	// environment model
	protected Combo comboBox;
	// the actor selected from the combo box
	public ActorResource selectedActor;
	
	protected ArrayList<UsageScenario> scenarioList;
	protected ArrayList<ActorResource> actorList;

	protected String month;
	
	protected Text textOrganization;
	
	/** Container for UI elements. */
	protected Composite container;
	
	protected ModifyListener modifyListener;
	protected OrganizationEnvironmentModel model;
	protected EMFModelLoader loader;
	
	protected UsageModel processModel;
	protected String textUsage;
	protected String projectName;
	
	final static String FILE_NAME = "conf.txt";
	
	protected String selectedTimeUnit;
	protected String oldTimeUnit;
	
	protected int count; 
	
	/**
	 * the constructor which sets the parameters
	 * and specificates the 365 days of the year.
	 * It creates two day profiles in the beginning. 
	 * Working Day and Free Day.
	 * The default month is January and the selected
	 * time unit is Seconds.  
	 */
	public ActorCalendar() {
		
		count = 0;
		month = "January";
		selectedTimeUnit = "Seconds";
		oldTimeUnit = new String();
		
		actorList = new ArrayList<ActorResource>();
		scenarioList = new ArrayList<UsageScenario>();
		
		actorDayProfilesLists = new ArrayList<ArrayList<DayProfileActor>>();
		
		helpList = new ArrayList<DayProfileActor>();
		
		setDayprofiles(new ArrayList<DayProfileActor>());
		getDayprofiles().addAll(new ArrayList<DayProfileActor>());
		
		getDayprofiles().add(new DayProfileActor("Working Day"));
		
		periodList = new ArrayList<Period>();
		
		getDayprofiles().get(0).setPeriods(periodList);
		
		getDayprofiles().add(new DayProfileActor("Free Day"));
		
		days = new ArrayList<DayActor>();
		days.addAll(new ArrayList<DayActor>());
		
		// 365 days of the year
		
		//January
		for(int i = 1; i <= 31; i++) {
			days.add(new DayActor(i + "Jan", getDayprofiles().get(0)));
		}
		
		//February
		for(int i = 1; i <= 28; i++) {
			days.add(new DayActor(i + "Feb", getDayprofiles().get(0)));
		}
		
		//March
		for(int i = 1; i <= 31; i++) {
			days.add(new DayActor(i + "Mar", getDayprofiles().get(0)));
		}
		
		//April
		for(int i = 1; i <= 30; i++) {
			days.add(new DayActor(i + "Apr", getDayprofiles().get(0)));
		}
		
		//May
		for(int i = 1; i <= 31; i++) {
			days.add(new DayActor(i + "May", getDayprofiles().get(0)));
		}
		
		//June
		for(int i = 1; i <= 30; i++) {
			days.add(new DayActor(i + "Jun", getDayprofiles().get(0)));
		}
		
		//July
		for(int i = 1; i <= 31; i++) {
			days.add(new DayActor(i + "Jul", getDayprofiles().get(0)));
		}
		
		//August
		for(int i = 1; i<= 31; i++) {
			days.add(new DayActor(i + "Aug", getDayprofiles().get(0)));
		}
		
		//September
		for(int i = 1; i <= 30; i++) {
			days.add(new DayActor(i + "Sep", getDayprofiles().get(0)));
		}
		
		//October
		for(int i = 1; i <= 31; i++) {
			days.add(new DayActor(i + "Oct", getDayprofiles().get(0)));
		}
		
		//November
		for(int i = 1; i <= 30; i++) {
			days.add(new DayActor(i + "Nov", getDayprofiles().get(0)));
		}
		
		//December
		for(int i = 1; i <= 31; i++) {
			days.add(new DayActor(i + "Dec", getDayprofiles().get(0)));
		}
			
	}
	
	/** 
	 * implements the ui elements in this class, the group to load a model,
	 * the comboBox to choose an Actor, the calendar and the buttons to edit
	 * day profiles and to switch to the ProcessCalendarView.
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
			 *  this method loads the organization environment model 
			 *  in case the text has changed in the text box. 
			 *  
			 *  @param e 	the event that the text has changed
			 *  
			 *  (non-Javadoc)
			 * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
			 */
			public void modifyText(ModifyEvent e) {
				
				// load the organization environment model
				loader = new EMFModelLoader();
				model = loader.loadOrganizationEnvironmentModel
						(textOrganization.getText());
				
				String temp;
				temp = textOrganization.getText();
				temp = temp.substring(0, temp.lastIndexOf("/"));
				textUsage = temp + "/default.usagemodel";
				processModel = loader.loadUsageModel(textUsage);
				
				// set the project Name
				projectName = temp.substring(temp.lastIndexOf("/")+1);
				
				// add the actors from the model to the combo box
				// the array of names of the actors
				ArrayList<String> actorNames = new ArrayList<String>();
				
				// iterate over all the actors in the model
				Iterator<ActorResource> actors = model.getActorResources().
						iterator();
				while(actors.hasNext()){
					// add a name to the array
					actorNames.add(actors.next().getEntityName());
				}
				
				// convert the array list to a simple array
				String[] simpleArray = new String[actorNames.size()];
				actorNames.toArray(simpleArray);
				         
				// initialize the combo box with the simple array
				comboBox.setItems(simpleArray);
				
				// activate the combo box after the model has been loaded
				comboBox.setEnabled(true);
				comboBox.select(0);
				
				for (int i = 0; i < actorNames.size(); i++) {
					actorDayProfilesLists.add(helpList);
				}
			}
		};
		
		container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout());
		 GridLayoutFactory.fillDefaults().numColumns(1).applyTo(parent);
		
		/**
		 * Create organization environment section
		 */
		// First set the text like this, will be changed to the right parent
		// in createFileInputSection
		textOrganization = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, 
				"Oganization Environment File", new String[] { 
				"*.organizationenvironmentmodel" }, textOrganization, 
				"Select Organization Environment Model", parent.getShell(), "");

	    
	    // new outside Composite-instance 
	    final Composite compositeOut = new Composite(parent, 0);
	    // get properties from parent
	    compositeOut.setBackground(parent.getBackground());
	    compositeOut.setForeground(parent.getForeground());
	    compositeOut.setFont(parent.getFont());
	    // set position and bounds
	    compositeOut.setBounds(100,200,30,30);
	    
	    // group contains a comboBox to choose and actor
	    Group group = new Group(compositeOut, SWT.FILL);
	    GridLayout layoutGroup = new GridLayout();
	    layoutGroup.numColumns = 2;
	    group.setLayout(layoutGroup);
	    group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    group.setText("Select an actor");
	    
	    comboBox = new Combo(group, SWT.NONE);
	    comboBox.setEnabled(false);
	    comboBox.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    comboBox.addSelectionListener(new SelectionListener() {
			
	    	/**
	    	 * handles the event if there is selected an actor 
	    	 * in the comboBox. 
	    	 * <p>
	    	 * It loads the selected actor in the program and adds all
	    	 * existing periods in the actor to the  day profile Working
	    	 * Day.
	    	 * <p>
	    	 * It writes all actors to the actorList from this model and all
	    	 * scenarios from the Usage Model in the same project to the list 
	    	 * scenarioList. 
	    	 * 
	    	 * @param e 	the event that an Actor was choosen 
	    	 * 
	    	 * (non-Javadoc)
	    	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	    	 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if (actorIndex != null) {
					ArrayList<DayProfileActor> dpList = new ArrayList<DayProfileActor>();
					
					for (int i = 0; i < getDayprofiles().size(); i++) {
						ArrayList<Period> periodL = new ArrayList<Period>(getDayprofiles().get(i).getPeriods());
						dpList.add(new DayProfileActor(getDayprofiles().get(i).getName()));
						dpList.get(i).setPeriods(periodL);
					}
					actorDayProfilesLists.add(actorIndex, dpList);
					actorDayProfilesLists.remove(actorIndex +1);
				}
				
				// clear dayprofile periods
				for (int i = 0; i < getDayprofiles().size(); i++) {
					getDayprofiles().get(i).getPeriods().clear();
				}
				
				// clear periods in periodlist of dayprofile "Working Day"
				periodList.clear();
				
				// get the selected String from the list
				String name = comboBox.getItem(comboBox.getSelectionIndex());
				
				actorList.clear();
				
				int counter = 0;
				
				for (ActorResource actorResource : model.getActorResources()) {
					
					if (actorResource.getEntityName().equals(name)) {
						selectedActor = actorResource;
						actorIndex = counter;
					}
					
					actorList.add(actorResource);
					counter++;
					
				}
	    		
				scenarioList = new ArrayList<UsageScenario>();
				scenarioList.clear();
				
				for (UsageScenario usageScenario : processModel.
						getUsageScenario_UsageModel()) {
					// get the scenarios
					scenarioList.add(usageScenario);
				}
				
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
				
	    		if (actorDayProfilesLists.get(actorIndex) == helpList) {
	    		
	    			int length = selectedActor.getWorkingPeriods().size();
	    		
	    			for (int i = 0; i < length; i++) {
	    		
	    				Period period = new Period();
	    			
	    				// get period to workload
	    				double st = selectedActor.getWorkingPeriods().get(i).
	    						getPeriodStartTimePoint();
	    				double en = selectedActor.getWorkingPeriods().get(i).
	    						getPeriodEndTimePoint();
	    				
	    				String startString = calculateUnit(st);
	    				String endString = calculateUnit(en);
	    			
	    				// prepare for new period
	    				SimpleDateFormat start = new SimpleDateFormat(startString);
	    				SimpleDateFormat end = new SimpleDateFormat(endString);
	    			
	    				boolean existingPeriod = false;
	    			
	    				for (int j = 0; j < periodList.size(); j++) {
	    			
	    					String oldStart = periodList.get(j).getStartTimePoint().
	    							toPattern();
	    					String oldEnd = periodList.get(j).getEndTimePointtime().
	    							toPattern();
	    				
	    					// check if this period already exists
	    					if (startString.equals(oldStart) && endString.equals
	    							(oldEnd) ) {
	    						existingPeriod = true;
	    					}
	    				}
	    
	    				// if this period doesn't already exist
	    				if (!existingPeriod) {
	    			
	    					// add the new period to the list
	    					period.setStartTimePoint(start);
	    					period.setEndTimePointtime(end);
	    			
	    					/*
	    					 * new periods always to the dayprofile "WorkingDay" 
	    					 * later on it must be possible to allocate the periods 
	    					 * to specific and different dayprofiles
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
					
					ArrayList<Period> periodL = new ArrayList<Period>();
					
					for (int i = 0; i < actorDayProfilesLists.get(actorIndex).size(); i++) {
						
						for (int j = 0; j < actorDayProfilesLists.get(actorIndex).get(i).
								getPeriods().size(); j++) {
							
							Period period = new Period();
							period.setStartTimePoint(actorDayProfilesLists.get(actorIndex).
									get(i).getPeriods().get(j).getStartTimePoint());
							period.setEndTimePointtime(actorDayProfilesLists.get(actorIndex).
									get(i).getPeriods().get(j).getEndTimePointtime());
							
							if (i == 0) {
								
								periodList.add(period);
							}
							else {
								
								periodL.add(period);
							}
						}
						
						if (i == 0) {
							
							getDayprofiles().add(new DayProfileActor(actorDayProfilesLists.
									get(actorIndex).get(i).getName()));
							getDayprofiles().get(i).setPeriods(periodList);
						}
						else {
							getDayprofiles().add(new DayProfileActor(actorDayProfilesLists.
									get(actorIndex).get(i).getName()));
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
	    // get properties from parent
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
	    
	    final Button buttonLeft = new Button(compositeIn, SWT.ARROW | SWT.LEFT);
	    
	    // this layout makes sure, that the right button can't move
	    RowData gd = new RowData ();
	    gd.width = 60;
	    
	    final Label monthLabel = new Label(compositeIn,SWT.SHADOW_NONE);
	    monthLabel.setLayoutData(gd);
	    monthLabel.setText("January");
		
		final Button buttonRight = new Button(compositeIn, SWT.ARROW | SWT.RIGHT);
        
		// table of the calendar
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
			 * Fill the first column for the day Monday in the table with 
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
		 * fill the second column for the day Tuesday in the table with numbers 
		 * of the weeks
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
		
		// add double click listener to the table
		viewer.addDoubleClickListener(this);
		
		final Composite compositeButton = new Composite(compositeOut, 0);
		GridLayout gridlayout3 = new GridLayout();
	    gridlayout3.numColumns = 2;
	    
	    compositeButton.setLayout(gridlayout3);
		
		// Dayprofiles button
		final Button button = new Button(compositeButton, SWT.PUSH);
	    button.setText("Day profiles");
		
		// day profiles buttonclick listener
	    button.addSelectionListener(new SelectionAdapter() {
	    	/**
	    	 * opens the wizard to edit day profiles
	    	 * 
	    	 * @param e 	the button was clicked
	    	 * 
	    	 * (non-Javadoc)
	    	 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	    	 */
	    	public void widgetSelected(SelectionEvent e) {
	    		
	    		WizardDialog wizardDialog = new WizardDialog(parent.getShell(),
	    			      new ActorDayProfilesWizard(calendar));
	    			    if (wizardDialog.open() == Window.OK) {
	    			    } else {
	    			       }
	    	}
	    });
	    
	    final Button processCalendarButton = new Button(compositeButton, SWT.PUSH);
	    processCalendarButton.setText("Process Calendar");
	    
	    // processCalendarButton click listener
	    processCalendarButton.addSelectionListener(new SelectionAdapter() {
	    	
	    	/**
	    	 * switches to the Process Calendar View
	    	 * 
	    	 * @param e 	the button was clicked
	    	 * 
	    	 * (non-Javadoc)
	    	 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	    	 */
	    	public void widgetSelected(SelectionEvent e) {
	    		
	    		count++;
	    		ProcessCalendar processCalendarView = new ProcessCalendar();
	    		
	    		try {
					IViewPart view = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("de.uhd.ifi.se.pcm.bppcm.ui.processCalendarView");
					if (view instanceof ProcessCalendar) {
		    			   processCalendarView = (ProcessCalendar) view;
		    			   processCalendarView.oldTimeUnit = oldTimeUnit;
		    			   processCalendarView.setSelectedTimeUnit(selectedTimeUnit);
		    			  }
	    		} catch (PartInitException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    		
	    		if (!textOrganization.getText().equals("") && count == 1) {
 				   processCalendarView.open(textUsage);
 			   	}
	    	}
	    });
	    	
	    // button for change to earlier month
		buttonLeft.addSelectionListener(new SelectionAdapter() {
			
			/**
			 * Changes month of the calendar to the previous month.
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
			 * Changes month of the calendar to the next month.
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
			 * @param event		double click event on a day in the calendar
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
						
						// DayWizard opens here
						WizardDialog wizardDialog = new WizardDialog(parent.getShell(),
			    			      new ActorDayWizard(calendar, tableItem.getText(tempColumn), month));
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
	
	public ArrayList<DayActor> getDays() {
		return days;
	}
	
	public ArrayList<Period> getPeriodList() {
		return periodList;
	}
	
	public void setSelectedTimeUnit(String selectedTimeUnit) {
		this.selectedTimeUnit = selectedTimeUnit;
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
				if (selectedTimeUnit.equals("Milliseconds\n")
						|| selectedTimeUnit.equals("Milliseconds")) {
					t = t/1000;
				}
				
				// convert t from minutes to seconds
				else if (selectedTimeUnit.equals("Minutes\n")
						|| selectedTimeUnit.equals("Minutes")) {
					t = t * 60;
				}
				
				// convert t from hours to seconds
				else if (selectedTimeUnit.equals("Hours\n")
						|| selectedTimeUnit.equals("Hours")) {
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
	 * this method is performed, when the Buton "Actor Calendar" is clicked 
	 * on the view ProcessCalendar.
	 * 
	 * @param textO		the location of the OrganizationEnvironmentModel in the 
	 * 					same Project as the UsageModel in the ProcessCalendar
	 */
	public void open(String textO) {
		// TODO Auto-generated method stub
		
		if (textOrganization.getText().equals("")) {
			textOrganization.setText(textO);
		}
	}

	public ArrayList<DayProfileActor> getDayprofiles() {
		return dayprofiles;
	}

	public void setDayprofiles(ArrayList<DayProfileActor> dayprofiles) {
		this.dayprofiles = dayprofiles;
	}
}

