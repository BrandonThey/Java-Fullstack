package s12.CollectionsFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		
		//adding countries to the end of the linked list
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		new App().printCountries(countries);
		
		//adding countries based on index
		countries.add(1, "Canada");
		
		//modifying a country by index
		countries.set(6, "Brazil");
		new App().printCountries(countries);
		
		//removing country at third index
		countries.remove(3);
		new App().printCountries(countries);
	}

	//by using List<String> instead of LinkedList<String> we accept any list
	//includinng ArrayList not just LinkedLists
	void printCountries(List<String> countries) { 
		for(String country: countries) {
			System.out.println("Country: " + country);
		}
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
