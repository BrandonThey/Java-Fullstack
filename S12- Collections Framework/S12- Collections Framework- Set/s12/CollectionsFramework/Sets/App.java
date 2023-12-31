package s12.CollectionsFramework.Sets;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//A Set has some properties that might prove useful
//Sets are not allowed to have duplicate elements
//There is no indexing, and the sequence of elements is not constant
//in a LinkedHashSet the elements are kept in order 
//in a tree set objects are sorted
public class App {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Brandon");
		set.add("John");
		set.add("Jason");
		set.add("Lauren");
		set.add("Mia");
		set.add("Brandon"); //will not show up twice in the set
		
		for(String name: set) {
			System.out.println(name);
		}
		
		//sets dont have a get method but we can use contains to determine if it has the 
		//element or not
		System.out.println(set.contains("Brandon"));
		System.out.println();
		
		//creating and filling a linked hash set
		Set<Integer> intSet = new LinkedHashSet<Integer>();
		for(int i = 0; i < 10; i++) {
			intSet.add(i);
		}
		
		//we see that the order is preserved
		for(int num : intSet) {
			System.out.println(num);
		}
	}

}
