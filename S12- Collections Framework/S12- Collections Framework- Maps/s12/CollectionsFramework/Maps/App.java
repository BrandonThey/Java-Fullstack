package s12.CollectionsFramework.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//maps keys to values, allows unique keys mapped to repeated values
public class App {

	public static void main(String[] args) {
		Map<Integer, String> student = new HashMap<>();

		//the map tries orders based on key but no gaurentees
		student.put(3, "Brandon");
		student.put(1, "Mia");
		student.put(2, "John");
		student.put(20, "Angel");
		student.put(5, "Jason");
		student.put(11, "Bob");
		
		//looping over all entries to print
		for(Map.Entry<Integer,String> entry: student.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
		
		System.out.println();
		
		//looping over all keys in the student set to print
		for(Integer key: student.keySet()) {
			System.out.println("Key: " + key + " Value: " + student.get(key));
		}
		System.out.println();
		//using an iterator to print elements
		Iterator<Entry<Integer,String>> entry = student.entrySet().iterator();
		
		while(entry.hasNext()) {
			Entry<Integer, String> temp = entry.next();
			System.out.println("Key: " + temp.getKey() + " Value: " + temp.getValue());
		}
		
	}

}
