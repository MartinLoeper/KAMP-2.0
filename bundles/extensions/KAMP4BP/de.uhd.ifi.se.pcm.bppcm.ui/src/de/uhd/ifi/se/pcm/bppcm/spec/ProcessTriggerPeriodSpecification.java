package de.uhd.ifi.se.pcm.bppcm.spec;

/**
 * 
 * ProcessTriggerPeriodSpecification is extended from AbstractPeriod.
 * This class needs a String for the inter arrival time.
 *
 * @param interArrivalTime 		the inter arrival time of the periods
 * 
 * @author Annika
 */
public class ProcessTriggerPeriodSpecification extends AbstractPeriod{
	
	// time in hh:mm:ss
	private String interArrivalTime;
	
	public String getInterArrivalTime() {
		return interArrivalTime;
	}
	public void setInterArrivalTime(String interArrivalTime) {
		this.interArrivalTime = interArrivalTime;
	}
	
	// based on the specification the ProcessTriggerPeriod for simulation is 
	// created/updated after pushing "OK" button
	// thereby time is transferred into abstract time units

}
