package de.uhd.ifi.se.pcm.bppcm.ui;

import java.util.ArrayList;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
/**
 * MayContentProvider is a ContentProvider, that is need
 * to visualize the month May in the calendar.
 * 
 * @author Annika
 *
 */
public class MayContentProvider extends AdapterFactoryContentProvider {

	public MayContentProvider() {
		super(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
	}

	@Override
	public Object[] getElements(Object object) {
		ArrayList<MyWeek> weeks = new ArrayList<MyWeek>();
		String[] tmp1 = {"","1","2","3","4","5","6"};
		MyWeek one = new MyWeek(tmp1);
		String[] tmp2 = {"7","8","9","10","11","12","13"};
		MyWeek two = new MyWeek(tmp2);
		String[] tmp3 = {"14","15","16","17","18","19","20"};
		MyWeek three = new MyWeek(tmp3);
		String[] tmp4 = {"21","22","23","24","25","26","27"};
		MyWeek four = new MyWeek(tmp4);
		String[] tmp5 = {"28","29","30","31","","",""};
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