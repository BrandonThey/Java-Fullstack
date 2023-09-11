package s13.GenericsContinued;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//creating a generic class for storing data
class Data<T>{
	private T storedData;

	public Data(T storedData) {
		this.storedData = storedData;
	}

	public T getStoredData() {
		return storedData;
	}

	public void setStoredData(T storedData) {
		this.storedData = storedData;
	}

	@Override
	public String toString() {
		return "Data [storedData=" + storedData + "]";
	}
	
	
}
public class App {

	public static void main(String[] args) {
		//linked list of Data objects
		List<Data<Object>> dataList = new LinkedList<>();
		
		//adding elements to the list of different types of Data
		dataList.add(new Data<Object>("Some Text"));
		dataList.add(new Data<Object>(1.0));
		dataList.add(new Data<Object>(1));
		dataList.add(new Data<Object>("%"));
		dataList.add(new Data<Object>(5.0f));
		
		//we can also limit the list of Data to only be of Strings or any specific type
		List<Data<String>> stringList = new LinkedList<>();
		stringList.add(new Data<String>("Some Text"));
		stringList.add(new Data<String>("Hello World"));
		
		App app = new App();
		app.printList(dataList); //print the list of elements
	}
	
	//method that prints the elements of a list
	void printList(List<Data<Object>> list) {
		ListIterator<Data<Object>> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element: " + iterator.next().getStoredData());
		}
	}

}
