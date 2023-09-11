package s13.GenericMethods;

import java.util.ArrayList;
import java.util.List;

class Data{
	//creating a generic method that prints list elements
	public <E> void printListData(List<E> list) {
		for(E element : list) {
			System.out.println(element);
		}
	}
	
	//creating a generic method that prints array elements
	public <E> void printArrayData(E[] array) {
		for(E element : array) {
			System.out.println(element);
		}
	}
}

public class App {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Data data = new Data();
		data.printListData(list);
		
		String[] stringArray = {"One", "Two", "Three"};
		data.printArrayData(stringArray);
	}

}
