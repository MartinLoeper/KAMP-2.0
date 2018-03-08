package de.uhd.ifi.se.pcm.bppcm.converter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelFactory;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessWorkload;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelFactory;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod;
import de.uhd.ifi.se.pcm.bppcm.ui.ActorCalendar;
import de.uhd.ifi.se.pcm.bppcm.ui.ProcessCalendar;
import org.palladiosimulator.pcm.core.CoreFactory;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.pcm.usagemodel.Workload;

/**
 * CalendarModelConverter updates the model by information
 * from the process and actor calendar specification. It calculates 
 * the periods to a given time unit, e.g. Hours, Minutes, Seconds, 
 * Milliseconds.
 * <p>
 * It get's the time unit from the process or
 * actor calendar.
 * <p>
 * All periods, which are given in the 
 * SimpleDateFormat are calculated to doubles. The 
 * time counts for the whole year. 
 * <p>
 * So e.g. if it's the 17th January at 
 * 13:00:00 o'Clock it calculates into seconds:
 * (because there were 16 days before that day: )
 * (16 * 24 * 60 * 60) + (13 * 60 * 60) +
 * (0 * 60) + 0 = 1382400 + 46800 =
 * 1429200.  
 * 
 * @param processCalendar 		the instance of ProcessCalendar, 
 * 								where this instance was created
 * @param actorCalendar			the instance of ActorCalendar, 
 *								where this instance was created
 * @param v						needed for the inter arrival time
 * @param timeUnit				the selected time unit in the calendar
 * @param oldTimeUnit			the old time unit of the model
 * 
 * @author Annika Boldt
 */
public class CalendarModelConverter {
	
	protected ProcessCalendar processCalendar;
	protected ActorCalendar actorCalendar;
	
	private PCMRandomVariable v;
	protected String timeUnit;
	protected String oldTimeUnit;
	
	/**
	 * Constructor in case there is an instance of this class in 
	 * the class ProcessCalendar.
	 * <p>
	 * The time unit is set to the selectedTimeUnit from ProcessCalendar
	 * The oldTimeUnit is set to the oldTimeUnit from ProcessCalendar.
	 * The class variable is set with the variable, of the calendar which 
	 * created the instance
	 * 
	 * @param calendar 		the calendar, where the instance was created
	 */
	public CalendarModelConverter(ProcessCalendar calendar) {
		processCalendar = calendar;
		timeUnit = calendar.getSelectedTimeUnit();
		oldTimeUnit = calendar.getOldTimeUnit();
	}
	
	/**
	 * Constructor in case there is an instance of this class in 
	 * the class ActorCalendar.
	 * <p>
	 * The time unit is set to the selectedTimeUnit from ProcessCalendar
	 * The oldTimeUnit is set to the oldTimeUnit from ProcessCalendar.
	 * The class variable is set with the variable, of the calendar which 
	 * created the instance
	 * 
	 * @param pCalendar 		the calendar, where the instance of ActorCalendar
	 * 							was created
	 * @param aCalendar 		the calendar, where the instance of this class 
	 * 							was created
	 */
	public CalendarModelConverter(ProcessCalendar pCalendar, ActorCalendar aCalendar) {
		processCalendar = pCalendar;
		actorCalendar = aCalendar;
		timeUnit = pCalendar.getSelectedTimeUnit();
		oldTimeUnit = pCalendar.getOldTimeUnit();
	}


	/**
	* This method updates the model by information
	* from the process calendar specification.
	* It has a loop over all the scenarios from the list. If 
	* the current element equals the selectedScenario (which
	* is selected in the ProcessCalendar) It updates the 
	* model with the edited periods in the ProcessCalendar.
	* There is a loop over all the Days of the year in the calendar. 
	* In that loop there is another one over all the Periods the
	* DayProfile of that current Day has.
	* In the end of the loop it adds the new Period to the
	* ProcessWorkload.
	*  
	*  @param scenarioList 		list of all the senarios in the 
	*  							selected model
	*  @param selectedScenario	the selected Scenario on the 
	*  							ProcessCalendar View
	*/
	public void updateUsageModel(ArrayList<UsageScenario> scenarioList, 
			UsageScenario selectedScenario) {
		
		for (int y = 0; y < scenarioList.size(); y++) {
		
			// get the workload from all usage scenarios
			Workload w = scenarioList.get(y).getWorkload_UsageScenario();
			assert (w instanceof ProcessWorkload) : "only ProcessWorkloads allowed";
			
			if (scenarioList.get(y).equals(selectedScenario) && 
					selectedScenario.equals(processCalendar.selectedScenario)) {
				
				// to be initialized in the following
				ProcessTriggerPeriod p;
				
				((ProcessWorkload)w).getProcessTriggerPeriods().clear();
			
				// initialize the ProcessTriggerPeriod with values from specification
		
				// code toggled for testing purposes
				for(int i = 0; i < processCalendar.getDays().size(); i++) {
			
					for(int j = 0; j < processCalendar.getDays().get(i).
							getProfile().getPeriods().size(); j++) {
				
						//create a new ProcessTriggerPeriod
						p = BpusagemodelFactory.eINSTANCE.createProcessTriggerPeriod();
				
						SimpleDateFormat start = processCalendar.getDays().get(i).
								getProfile().getPeriods().get(j).getStartTimePoint();
						p.setPeriodStartTimePoint(calculateTimeUnits(start, i));
						
						SimpleDateFormat end = processCalendar.getDays().get(i).
								getProfile().getPeriods().get(j).getEndTimePointtime();
						p.setPeriodEndTimePoint(calculateTimeUnits(end, i));
				
						// create a new random variable
						v = CoreFactory.eINSTANCE.createPCMRandomVariable();
				
						// initialize the random variable by value from calendar
						v.setSpecification(processCalendar.getDays().get(i).getProfile().
								getPeriods().get(j).getInterArrivalTime());
				
						// add random variable to period
						p.setInterArrivalTime_ProcessWorkload(v);
				
						// add period to workload
						((ProcessWorkload)w).getProcessTriggerPeriods().add(p);	
				
					}
				}
			
			}
			else if( !processCalendar.scenarioDayProfilesLists.get(y).
					equals(processCalendar.helpList) ) {
				
				// to be initialized in the following
				ProcessTriggerPeriod p;
				
				((ProcessWorkload)w).getProcessTriggerPeriods().clear();
				
				// initialize the ProcessTriggerPeriod with values from specification
				
				// code toggled for testing purposes
				for(int i = 0; i < processCalendar.getDays().size(); i++) {
					
					int x = 0;
					
					for (int z = 0; z < processCalendar.scenarioDayProfilesLists.get(y).size(); z++) {
						
						if (processCalendar.getDays().get(i).getProfile().getName().equals(
								processCalendar.scenarioDayProfilesLists.get(y).get(z).getName())) {
						
							x = z;
						}
					}
					
					for(int j = 0; j < processCalendar.scenarioDayProfilesLists.get(y).
							get(x).getPeriods().size(); j++) {
				
						//create a new ProcessTriggerPeriod
						p = BpusagemodelFactory.eINSTANCE.createProcessTriggerPeriod();
						
						SimpleDateFormat start = processCalendar.scenarioDayProfilesLists.get(y).
								get(x).getPeriods().get(j).getStartTimePoint();
						p.setPeriodStartTimePoint(calculateTimeUnits(start, i));
						
						SimpleDateFormat end = processCalendar.scenarioDayProfilesLists.get(y).
								get(x).getPeriods().get(j).getEndTimePointtime();
						p.setPeriodEndTimePoint(calculateTimeUnits(end, i));
					
						// create a new random variable
						v = CoreFactory.eINSTANCE.createPCMRandomVariable();
				
						// initialize the random variable by value from calendar
						v.setSpecification(processCalendar.scenarioDayProfilesLists.get(y).
								get(x).getPeriods().get(j).getInterArrivalTime());
						
						// add random variable to period
						p.setInterArrivalTime_ProcessWorkload(v);
				
						// add period to workload
						((ProcessWorkload)w).getProcessTriggerPeriods().add(p);	
					}
				}
			}
			else {
				// update the scenario which was not the selected
				updateListUSM(w);
			}
		}
		
	}
	
	/** 
	 * Converts the date format in the ProcessCalendar to a double 
	 * value that describes the number of time units (e.g. seconds)
	 * e.g. 1.Jan 14:00 is 50400 time units 
	 * 
	 * @param date 		the time in the String format "hh:mm:ss"
	 * @param i			the current day
	 * @return			the calculated time in the right time unit
	 */
	private double calculateTimeUnits(SimpleDateFormat date, int i){
		
		double time = 0;
		
		String stringDate = date.toPattern(); 
		
		// all parts are already contained in the string array partsOne
		String[] partsOne = stringDate.split(":");
		String hoursString = partsOne[0];
		String minutesString = partsOne[1];
		String secondsString = partsOne[2];
		
		// get integers from the String
		int hours = Integer.parseInt(hoursString);
		int minutes = Integer.parseInt(minutesString);
		int seconds = Integer.parseInt(secondsString);
		
		if (timeUnit.equals("Milliseconds") || timeUnit.equals("Milliseconds\n")) {
			
			// add the milliseconds from that day to time
			time += (hours * 60 * 60 * 1000);
			time += (minutes * 60 * 1000);
			time += (seconds * 1000);
			
			// add milliseconds for days in that year before this day
			time += (i * 24 * 60 * 60 * 1000);
		}
		
		else if (timeUnit.equals("Seconds") || timeUnit.equals("Seconds\n")) {
			
			// add the seconds from that day to time
			time += (hours * 60 * 60);
			time += (minutes * 60);
			time += seconds;
			
			// add seconds for days in that year before this day
			time += (i * 24 * 60 * 60);
		}
		
		else if (timeUnit.equals("Minutes") || timeUnit.equals("Minutes\n")) {
			
			// add the minutes from that day to time
			time += (hours * 60);
			time += (minutes);
			time += (seconds / 60);
			
			// add minutes for days in that year before this day
			time += (i * 24 * 60);
		}
		
		else if (timeUnit.equals("Hours") || timeUnit.equals("Hours\n")) {
			
			// add the hours from that day to time
			time += (hours);
			time += (minutes / 60);
			time += (seconds / (60*60));
			
			// add hours for days in that year before this day
			time += (i * 24);
		}
		
		return time;
		
	}
	
	/**
	 * Changes the time unit by calculation from 
	 * the old time unit to the new selected one. 
	 * Only for the scenarios/actors which haven't 
	 * been edited.
	 * 
	 * @param t 		the time which was written in the model before
	 * @return 			the given time changed in the right time unit
	 */
	public double calculate (double t) {
		
		if (!oldTimeUnit.equals(timeUnit)) {
			
			if (oldTimeUnit.equals("Milliseconds\n") || oldTimeUnit.equals("Milliseconds")) {
				if (timeUnit.equals("Seconds") || timeUnit.equals("Seconds\n")) {
					t = t /1000;
				}
				else if(timeUnit.equals("Minutes") || timeUnit.equals("Minutes\n")) {
					t = t / (1000 * 60);
				}
				else if(timeUnit.equals("Hours") || timeUnit.equals("Hours\n")) {
					t = t / (1000 * 60 * 60);
				}
			}
			else if (oldTimeUnit.equals("Seconds\n") || oldTimeUnit.equals("Seconds")) {
				if (timeUnit.equals("Milliseconds") || timeUnit.equals("Milliseconds\n")) {
					t = t * 1000;
				}
				else if(timeUnit.equals("Minutes") || timeUnit.equals("Minutes\n")) {
					t = t / 60;
				}
				else if(timeUnit.equals("Hours") || timeUnit.equals("Hours\n")) {
					t = t / (60 * 60);
				}
			}
			else if (oldTimeUnit.equals("Minutes\n") || oldTimeUnit.equals("Minutes")) {
				if (timeUnit.equals("Milliseconds") || timeUnit.equals("Milliseconds\n")) {
					t = t * 1000 * 60;
				}
				else if(timeUnit.equals("Seconds") || timeUnit.equals("Seconds\n")) {
					t = t * 60;
				}
				else if(timeUnit.equals("Hours") || timeUnit.equals("Hours\n")) {
					t = t / 60;
				}
			}
			else if (oldTimeUnit.equals("Hours\n") || oldTimeUnit.equals("Hours")) {
				if (timeUnit.equals("Milliseconds") || timeUnit.equals("Milliseconds\n")) {
					t = t * 1000 * 60 * 60;
				}
				else if(timeUnit.equals("Seconds") || timeUnit.equals("Seconds\n")) {
					t = t * 60 * 60;
				}
				else if(timeUnit.equals("Minutes") || timeUnit.equals("Minutes\n")) {
					t = t * 60;
				}
			}
			
		}
		
		
		return t;
	}
	
	/**
	* This method updates the model by information
	* from the actor calendar specification.
	* It has a loop over all the actors from the list. If 
	* the current element equals the selectedActor (which
	* is selected in the ActorCalendar) It updates the 
	* model with the edited periods in the ActorCalendar.
	* There is a loop over all the Days of the year in the calendar. 
	* In that loop there is another one over all the Periods the
	* DayProfile of that current Day has.
	* In the end of the loop it adds the new Period to the
	* selectedActor.
	*  
	*  @param actorList 		list of all the actors in the 
	*  							selected model
	*  @param selectedActor		the selected Actor on the 
	*  							ActorCalendar View
	 */
	public void updateOganizationEnvironmentModel(ActorResource selectedActor, 
			ArrayList<ActorResource> actorList) {
		
		for (int y = 0; y < actorList.size(); y++) {
			
			if (selectedActor.equals(actorList.get(y)) && 
					selectedActor.equals(actorCalendar.selectedActor)) {
			
				// to be initialized in the following
				WorkingPeriod p;
				
				selectedActor.getWorkingPeriods().clear();
				
				// initialize the WorkingPeriod with values from specification
				
				// code toggled for testing purposes
				for(int i = 0; i < actorCalendar.getDays().size(); i++) {
					
					for(int j = 0; j < actorCalendar.getDays().get(i).getProfile().
							getPeriods().size(); j++) {
				
						//create a new WorkingPeriod
						p = OrganizationenvironmentmodelFactory.eINSTANCE.
								createWorkingPeriod();
						
						SimpleDateFormat start = actorCalendar.getDays().get(i).
								getProfile().getPeriods().get(j).getStartTimePoint();
						p.setPeriodStartTimePoint(calculateTimeUnits(start, i));
						
						SimpleDateFormat end = actorCalendar.getDays().get(i).
								getProfile().getPeriods().get(j).getEndTimePointtime();
						p.setPeriodEndTimePoint(calculateTimeUnits(end, i));
					
						// add period
						selectedActor.getWorkingPeriods().add((WorkingPeriod)p);
					}
				} 
			}
			else if( !actorCalendar.actorDayProfilesLists.get(y).
					equals(actorCalendar.helpList) ) {
				
				// to be initialized in the following
				WorkingPeriod p;
				
				actorList.get(y).getWorkingPeriods().clear();
				
				// initialize the WorkingPeriod with values from specification
				
				// code toggled for testing purposes
				for(int i = 0; i < actorCalendar.getDays().size(); i++) {
					
					int x = 0;
					
					for (int z = 0; z < actorCalendar.actorDayProfilesLists.get(y).size(); z++) {
						
						if (actorCalendar.getDays().get(i).getProfile().getName().equals(
								actorCalendar.actorDayProfilesLists.get(y).get(z).getName())) {
						
							x = z;
						}
					}
					
					for(int j = 0; j < actorCalendar.actorDayProfilesLists.get(y).
							get(x).getPeriods().size(); j++) {
				
						//create a new WorkingPeriod
						p = OrganizationenvironmentmodelFactory.eINSTANCE.
								createWorkingPeriod();
						
						SimpleDateFormat start = actorCalendar.actorDayProfilesLists.get(y).
								get(x).getPeriods().get(j).getStartTimePoint();
						p.setPeriodStartTimePoint(calculateTimeUnits(start, i));
						
						SimpleDateFormat end = actorCalendar.actorDayProfilesLists.get(y).
								get(x).getPeriods().get(j).getEndTimePointtime();
						p.setPeriodEndTimePoint(calculateTimeUnits(end, i));
					
						// add period
						actorList.get(y).getWorkingPeriods().add((WorkingPeriod)p);
					}
				}
			}
			else {
				updateListOEM(actorList, y);
			}
		}
		
	}

	/**
	 * Updates the scenarios from the list, which weren't 
	 * equal to the selected one
	 * 
	 * @param scenarioList		list of all the scenarios in the 
	 * 							selected model
	 */
	public void updateUSM(ArrayList<UsageScenario> scenarioList) {
		
		for (int y = 0; y < scenarioList.size(); y++) {
			
			// get the workload from all usage scenarios
			Workload w = scenarioList.get(y).getWorkload_UsageScenario();
			assert (w instanceof ProcessWorkload) : "only ProcessWorkloads allowed";
			
			updateListUSM(w);
		}
	}
	
	/**
	 * updates the actors from the list, which weren't 
	 * equal to the selected one
	 * 
	 * @param actorList		list of all the actors in the 
	 * 						selected model
	 */
	public void updateOEM(ArrayList<ActorResource> actorList) {
		
		for (int y = 0; y < actorList.size(); y++) {
					
			updateListOEM(actorList, y);
		}
	}
	
	/**
	 * updates an actor which wasn't equal to the selected one. 
	 * It has a loop over all the periods, the actor has.
	 * And a loop to add all the new calculated periods to 
	 * the actor.
	 * 
	 * @param actorList		the list of all the actors in the
	 * 						selectedModel
	 * @param y				the index of the current actor in the 
	 * 						list
	 */
	public void updateListOEM(ArrayList<ActorResource> actorList, int y) {
		
		ArrayList<WorkingPeriod> period = new ArrayList<WorkingPeriod>();
		
		// code toggled for testing purposes
		for(int i = 0; i < actorList.get(y).getWorkingPeriods().size(); i++) {
						
			// to be initialized in the following
			WorkingPeriod p;
								
			// initialize the WorkingPeriod with values from specification
						
			//create a new WorkingPeriod
			p = OrganizationenvironmentmodelFactory.eINSTANCE.
					createWorkingPeriod();
									
			double start = actorList.get(y).getWorkingPeriods().get(i).getPeriodStartTimePoint();
			p.setPeriodStartTimePoint(calculate(start));
									
			double end = actorList.get(y).getWorkingPeriods().get(i).getPeriodEndTimePoint();
			p.setPeriodEndTimePoint(calculate(end));
								
			period.add(p);
		}
					
		actorList.get(y).getWorkingPeriods().clear();
					
		for (int i = 0; i < period.size(); i++) {
						
			// add period
			actorList.get(y).getWorkingPeriods().add((WorkingPeriod)period.get(i));
		}
	}
	
	/**
	 * updates a scenario which wasn't equal to the selected one. 
	 * It has a loop over all the periods, the ProcessWorkload has.
	 * And a loop to add all the new calculated periods to 
	 * the ProcessWorkload.
	 * 
	 * @param w		the Workload of the current scenario
	 */
	public void updateListUSM(Workload w) {
		
		ArrayList<ProcessTriggerPeriod> period = new ArrayList<ProcessTriggerPeriod>();
		
		for (int i = 0; i < ((ProcessWorkload)w).getProcessTriggerPeriods().size(); i++) {
			
			ProcessTriggerPeriod p;
			
			//create a new ProcessTriggerPeriod
			p = BpusagemodelFactory.eINSTANCE.createProcessTriggerPeriod();

			double start = ((ProcessWorkload)w).getProcessTriggerPeriods().
					get(i).getPeriodStartTimePoint();
			p.setPeriodStartTimePoint(calculate(start));
		
			double end = ((ProcessWorkload)w).getProcessTriggerPeriods().
					get(i).getPeriodEndTimePoint();
			p.setPeriodEndTimePoint(calculate(end));

			// create a new random variable
			v = CoreFactory.eINSTANCE.createPCMRandomVariable();

			// initialize the random variable by value from calendar
			v.setSpecification(((ProcessWorkload)w).getProcessTriggerPeriods().
					get(i).getInterArrivalTime_ProcessWorkload().getSpecification());

			// add random variable to period
			p.setInterArrivalTime_ProcessWorkload(v);

			period.add(p);
		}
		
		((ProcessWorkload)w).getProcessTriggerPeriods().clear();
		
		for (int i = 0; i < period.size(); i++) {
		
			// add period to workload
			((ProcessWorkload)w).getProcessTriggerPeriods().add(period.get(i));	
		}
	}
	
}
