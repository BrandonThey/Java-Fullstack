package s13.TypeParameters;

/*naming convetion of generic type parameters are:
T- Type
E- Element
K- Key
V- Value
N- Number
*/

//making a generic class that takes a key value pair
class Data<K,V>{
	private K key;
	private V value;
	
	//creating a generic method, usually using element(E) and number(N)
	//if we need N to actaully be a number and not anything else then we 
	//bind it using "N extends Number", we can do the same with String, Char, etc
	public <E,N extends Number> void display(E element, N number) {
		System.out.println("Element: " + element + " Number: " + number);
	}
	
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
		Data<Integer, String> data = new Data<Integer,String>(1,"Brandon");
		System.out.println("Key: " + data.getKey() + " Value: " + data.getValue());
		//since we bound N to be a number, the second argument must be a number
		//but the first arg can be anything
		data.display("element", 1.0); 
	}

}
