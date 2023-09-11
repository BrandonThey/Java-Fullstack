package s12.CollectionFramework.CustomSorting;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//custom sorting using comparators

class Data<K,V>{
	private K key;
	private V value;
	
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
}
public class App {

	public static void main(String[] args) {
		//creating a linked set of Data type with a key value pair
		Set<Data> set = new LinkedHashSet<>();

		set.add(new Data("Key", "Value"));
		set.add(new Data(1, "One"));
		set.add(new Data(5, "Five"));
		set.add(new Data(9, "Nine"));
		set.add(new Data(5, "Five"));
		
		for(Data element: set) {
			System.out.println(element);
		}
	
		//creating a comparator object of Data type by using an anonymous method
		//to override the compare method
		Comparator<Data<Integer,String>> COMPARE_KEY = new Comparator<Data<Integer,String>>(){
			@Override
			public int compare(Data<Integer,String> obj1, Data<Integer,String> obj2) {
				
				if(obj1.getKey() < obj2.getKey()) {
					return -1;
				}
				else if(obj1.getKey() > obj2.getKey()) {
					return 1;
				}
				else {
					return 0;
				}
			}
		};
		
		//using the previouse comparator as a criteria for treeset to sort on
		Set<Data> treeSet = new TreeSet<>(COMPARE_KEY);
		treeSet.add(new Data(2, "Value"));
		treeSet.add(new Data(1, "One"));
		treeSet.add(new Data(5, "Five"));
		treeSet.add(new Data(9, "Nine"));
		treeSet.add(new Data(5, "Ten")); //will not show up
		
		System.out.println();
		for(Data element: treeSet) {
			System.out.println(element);
		}
	}

}
