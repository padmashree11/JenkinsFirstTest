package sorting_names;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting_sample {
	public static void main(String args[]) {
		List<String> firstnames = new ArrayList<String>();
		firstnames.add("Madhu");
		firstnames.add("Ramya");
		firstnames.add("Annika");
		firstnames.add("Hema");
		firstnames.add("Nitya");
	List<String> secondnames=new ArrayList<String>();
	secondnames.add("Madhu");
	secondnames.add("Ramya");
	secondnames.add("Annika");
	secondnames.add("Hema");
	secondnames.add("Nitya");
	
	Sorting_sample tester = new Sorting_sample();
		
	System.out.println("Sorting the First names using java 7");
	tester.sortusingjava7(firstnames);
	System.out.println(firstnames);
	
	System.out.println("Sortig the Second names using java 8 ");
	tester.sortusingjava8(secondnames);
	System.out.println(secondnames);
	}

	private void sortusingjava8(List<String> secondnames) {
		Collections.sort(secondnames, (s1, s2)->s1.compareTo(s2));
		
		
	}

	private void sortusingjava7(List<String> firstnames) {
		Collections.sort(firstnames, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return s1.compareTo(s2);
			}
		});
		
	
	}
	

	
}
