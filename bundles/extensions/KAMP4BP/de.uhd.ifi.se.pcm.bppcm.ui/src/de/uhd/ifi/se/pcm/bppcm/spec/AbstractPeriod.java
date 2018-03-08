package de.uhd.ifi.se.pcm.bppcm.spec;

import java.text.SimpleDateFormat;

/**
 * AbstractPeriod is a period with a start and 
 * an end time point. Both times are in the 
 * format "hh:mm:ss" and instances of the class
 * SimpleDateFormat
 * 
 * @param startTimePoint		start of the period
 * @param endTimePointtime		end of the period
 * 
 * @author Annika Boldt
 */
public class AbstractPeriod {
	
	// time in hh:mm:ss
	private SimpleDateFormat startTimePoint = new SimpleDateFormat("HH:mm:ss");
	private SimpleDateFormat endTimePointtime = new SimpleDateFormat("HH:mm:ss");
	
	public SimpleDateFormat getStartTimePoint() {
		return startTimePoint;
	}

	public void setStartTimePoint(SimpleDateFormat startTimePoint) {
		this.startTimePoint = startTimePoint;
	}

	public SimpleDateFormat getEndTimePointtime() {
		return endTimePointtime;
	}

	public void setEndTimePointtime(SimpleDateFormat endTimePointtime) {
		this.endTimePointtime = endTimePointtime;
	}
}
