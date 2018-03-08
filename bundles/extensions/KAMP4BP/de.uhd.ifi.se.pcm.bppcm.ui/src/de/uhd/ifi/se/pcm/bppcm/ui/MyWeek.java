package de.uhd.ifi.se.pcm.bppcm.ui;
/**
 * represents a week in the calendar
 * 
 * @param text		the numbers of the week
 * 
 * @author Annika
 *
 */
public class MyWeek {
	private String[] text;
	
	public MyWeek(String[] text) {
		this.text = text;
	}

	
	
	public String getText(int position) {
		return text[position];
	}

	public void setText(String[] text) {
		this.text = text;
	}
	
}
