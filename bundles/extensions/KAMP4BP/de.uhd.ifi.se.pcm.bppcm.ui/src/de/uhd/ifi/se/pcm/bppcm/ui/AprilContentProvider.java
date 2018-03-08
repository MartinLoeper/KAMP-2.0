package de.uhd.ifi.se.pcm.bppcm.ui;

import java.util.ArrayList;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
/**
 * AprilContentProvider is a ContentProvider, that is need
 * to visualize the month April in the calendar.
 * 
 * @author Annika
 *
 */
public class AprilContentProvider extends AdapterFactoryContentProvider {

	public AprilContentProvider() {
		super(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
	}

	@Override
	public Object[] getElements(Object object) {
		ArrayList<MyWeek> weeks = new ArrayList<MyWeek>();
		String[] tmp1 = {"","","","","","","1"};
		MyWeek one = new MyWeek(tmp1);
		String[] tmp2 = {"2","3","4","5","6","7","8"};
		MyWeek two = new MyWeek(tmp2);
		String[] tmp3 = {"9","10","11","12","13","14","15"};
		MyWeek three = new MyWeek(tmp3);
		String[] tmp4 = {"16","17","18","19","20","21","22"};
		MyWeek four = new MyWeek(tmp4);
		String[] tmp5 = {"23","24","25","26","27","28","29"};
		MyWeek five = new MyWeek(tmp5);
		String[] tmp6 = {"30", "", "", "", "", "", ""};
		MyWeek six = new MyWeek(tmp6);
		
	
		weeks.add(one);
		weeks.add(two);
		weeks.add(three);
		weeks.add(four);
		weeks.add(five);
		weeks.add(six);

		return weeks.toArray();
	}
}