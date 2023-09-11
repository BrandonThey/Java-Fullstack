package s12.CollectionsFramework.TreeMaps;

import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		Map<Integer,String> lectures = new TreeMap<Integer, String>();
		
		lectures.put(3, "Generics");
		lectures.put(1, "Files Under Java");
		lectures.put(2, "Network Programming");
		lectures.put(7, "OOP");
		lectures.put(5, "Methods");
		
		for(Map.Entry<Integer, String> entry: lectures.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
	}

}
