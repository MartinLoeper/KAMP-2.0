package de.uhd.ifi.se.pcm.bppcm.spec;

/**
 * Day represents a day in the calendar.
 * It has an ID e.g. "5Apr" and a DayProfile
 * 
 * @param ID 		specification of the day
 * @param profile	the profile of that day
 * 
 * @author Annika Boldt
 */
public class Day {
	
	private String ID;
	private DayProfile profile;
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public DayProfile getProfile() {
		return profile;
	}

	public void setProfile(DayProfile profile) {
		this.profile = profile;
	}

	/**
	 * Constructor which sets ID and profile
	 * 
	 * @param id 			of the form "5Apr"
	 * @param dayprofile	a profile with specific periods
	 */
	public Day(String id, DayProfile dayprofile) {
		ID = id;
		profile = dayprofile;
		
	}

}
