package de.uhd.ifi.se.pcm.bppcm.ui;

import java.util.ArrayList;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
/**
 * AugustContentProvider is a ContentProvider, that is need
 * to visualize the month August in the calendar.
 * 
 * @author Annika
 *
 */
public class AugustContentProvider extends AdapterFactoryContentProvider {

	public AugustContentProvider() {
		super(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
	}

	@Override
	public Object[] getElements(Object object) {
		ArrayList<MyWeek> weeks = new ArrayList<MyWeek>();
		String[] tmp1 = {"","","1","2","3","4","5"};
		MyWeek one = new MyWeek(tmp1);
		String[] tmp2 = {"6","7","8","9","10","11","12"};
		MyWeek two = new MyWeek(tmp2);
		String[] tmp3 = {"13","14","15","16","17","18","19"};
		MyWeek three = new MyWeek(tmp3);
		String[] tmp4 = {"20","21","22","23","24","25","26"};
		MyWeek four = new MyWeek(tmp4);
		String[] tmp5 = {"27","28","29","30","31","",""};
		MyWeek five = new MyWeek(tmp5);
		String[] tmp6 = {"", "", "", "", "", "", ""};
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