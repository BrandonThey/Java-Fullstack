package s12.CollectionsFramework.DataManipulation;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Sorting {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		
		//adding countries to the end of the linked list
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		
		Sorting app = new Sorting();
		app.iterateCountries(countries);
		System.out.println();
		
		//sorting countries with defualt arguments, which is alpabetical order for strings
		countries.sort(null);
		app.iterateCountries(countries);
		System.out.println();
		
		//reversing the order of the list, but not necessarily ordering it
		Collections.reverse(countries);
		app.iterateCountries(countries);
		System.out.println();
	}

	//a method that uses an iterator to iterate over the list instead of a loop
	void iterateCountries(List<String> countries) {
		ListIterator<String> iterator = countries.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println("Country: " + iterator.next());
		}
	}

}
