package s12.CollectionsFramework.DataManipulation;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ComparableConcept {

	public static void main(String[] args) {
		//creating a list of objects of name class
		List names = new LinkedList<>();
		names.add(new Names("Brandon"));
		names.add(new Names("Ed"));
		names.add(new Names("John"));
		names.add(new Names("Mia"));
		
		ComparableConcept app = new ComparableConcept();
		app.iterateList(names);
		System.out.println();
		//this sorting is done using our overriden compareTo method
		//which sorts it by the length of the name
		Collections.sort(names);
 		app.iterateList(names);
	}

	//a method that uses an iterator to iterate over the list instead of a loop
	void iterateList(List<Names> list) {
		ListIterator<Names> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}

}

class Names implements Comparable<Names>{
	private String name;
	
	public Names(String name) {
		this.name = name;
	}
	
	//a compareto Method that will compare two objects based on their name's length
	//this can be change based on what criteria an object should be compared on
	@Override
	public int compareTo(Names obj) {
		if(name.length() == obj.name.length()) {
			return 0;
		}
		else if(name.length() < obj.name.length()) {
			return -1;
		}
		else{
			return 1;
		}
	}
	
	
	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}