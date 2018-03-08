package de.uhd.ifi.se.pcm.bppcm.ui;

import java.util.ArrayList;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
/**
 * OctoberContentProvider is a ContentProvider, that is need
 * to visualize the month October in the calendar.
 * 
 * @author Annika
 *
 */
public class OctoberContentProvider extends AdapterFactoryContentProvider {

	public OctoberContentProvider() {
		super(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
	}

	@Override
	public Object[] getElements(Object object) {
		ArrayList<MyWeek> weeks = new ArrayList<MyWeek>();
		String[] tmp1 = {"1","2","3","4","5","6","7"};
		MyWeek one = new MyWeek(tmp1);
		String[] tmp2 = {"8","9","10","11","12","13","14"};
		MyWeek two = new MyWeek(tmp2);
		String[] tmp3 = {"15","16","17","18","19","20","21"};
		MyWeek three = new MyWeek(tmp3);
		String[] tmp4 = {"22","23","24","25","26","27","28"};
		MyWeek four = new MyWeek(tmp4);
		String[] tmp5 = {"29","30","31","","","",""};
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