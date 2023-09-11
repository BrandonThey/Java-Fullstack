package s13.ComparableGenerics;

//creating a class that implements Comparable that will allow us to use ordering
//we need to bind T to comparable first thouhg
class Data<T extends Comparable <T>> implements Comparable<T>{
	private T storedData;

	public Data(T storedData) {
		super();
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

	@Override
	public int compareTo(T obj) {
		return getStoredData().compareTo(obj);
	}
}
public class App {

	public static void main(String[] args) {
		//creating a data object with integer value of 1
		Data<Integer> data = new Data<Integer>(1);
		
		//comparing it to 1, natural ordering states: 
		//if both are  equal, it results in 0
		//if data.compare is greater to the second value it returns 1
		//if data.compare is lesser to the second value it returns -1
		System.out.println(data.compareTo(1));

	}

}
