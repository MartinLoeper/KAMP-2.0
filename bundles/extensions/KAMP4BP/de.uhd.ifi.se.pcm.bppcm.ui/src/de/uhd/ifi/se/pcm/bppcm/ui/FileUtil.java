package de.uhd.ifi.se.pcm.bppcm.ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The class FileUtil reads and writes the File, which contains the 
 * selected time unit in the chosen Project. 
 * If the File doesn't exist, it can be created with this class. 
 * 
 * @author Annika
 *
 */
public class FileUtil {
	
	/**
	 * Reads the file and returns the time unit, which was saved in the Project
	 * 
	 * @param file		the path of the file, which contains the time unit
	 * @return timeUnit	the time unit which was contained in the file
	 * @throws Exception
	 */
	public String readTxtFile(String file) throws Exception {
		
		String timeUnit;
		
		FileReader fr = new FileReader(file);
		BufferedReader buf = new BufferedReader(fr);
		
		timeUnit = buf.readLine();
		
		buf.close();
		fr.close();
		
		return timeUnit;
	}
	
	/**
	 * Writes the time unit in the file, which was selected from the user in the 
	 * combo box. 
	 * If the file doesn't already exist, it writes "Seconds"
	 * 
	 * @param tU		the selected time unit
	 * @param path		the path of the file in the project
	 * @throws IOException
	 */
	public void writeTxtFile(String tU, String path) throws IOException {
		
		FileWriter fw = new FileWriter(path);
		
		fw.write(tU);
		
		fw.flush();
		fw.close();
	}
}
