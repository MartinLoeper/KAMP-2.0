package de.uhd.ifi.se.pcm.bppcm.spec;

import java.util.ArrayList;
import java.util.List;

/**
 * DayProfileActor contains the specification of the 
 * day profiles. It has a name and a list of periods.
 * 
 * @param name 		the name of the profile
 * @param periods   the list of periods
 * 
 * @author Annika Boldt
 */
public class DayProfileActor {

	// profile name
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}

	// profile period list
	private List<Period> periods;
	
	public List<Period> getPeriods() {
		return periods;
	}

	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}

	public DayProfileActor(String n){
		
		name = n;
		this.periods = new ArrayList<Period>();
	}

	/**
	 * this method adds a period to the list
	 * 
	 * @param period	the period, which should be added
	 */	
	public void addPeriod(Period period){
		this.periods.add(period);
	}
}

