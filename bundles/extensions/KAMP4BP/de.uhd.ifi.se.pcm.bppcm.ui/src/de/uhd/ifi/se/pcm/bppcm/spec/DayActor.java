package de.uhd.ifi.se.pcm.bppcm.spec;

/**
 * DayActor represents a day in the calendar.
 * It has an ID e.g. "5Apr" and a DayProfile
 * 
 * @param ID 		specification of the day
 * @param profile	the profile of that day
 * 
 * @author Annika Boldt
 */
public class DayActor {
	
	private String ID;
	private DayProfileActor profile;
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public DayProfileActor getProfile() {
		return profile;
	}

	public void setProfile(DayProfileActor profile) {
		this.profile = profile;
	}

	/**
	 * Constructor which sets ID and profile
	 * 
	 * @param id 			of the form "5Apr"
	 * @param dayprofile	a profile with specific periods
	 */
	public DayActor(String id, DayProfileActor dayprofile) {
		ID = id;
		profile = dayprofile;
		
	}

}