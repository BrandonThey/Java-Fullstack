package s13.Generics;

class Data{
	private Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
}

//generic class of type T, 
//T indicates we dont know what the type is yet but any type can be used
class GenericClass<T>{
	private T data;

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
}

public class App {
	public static void main(String[] args) {
		
		/*
		Data data = new Data("Some String");
		String variable = (String) data.getObj(); //casting the returned object to a string
		System.out.println(variable);*/
		
		//now lets create a generic object
		GenericClass<String> genericData = new GenericClass("Some String");
		//Skip casting since we previously defined the object type already
		String data = genericData.getData();
		System.out.println(data);
		
		//the point of using a generic over the previous object is 
		//prevent type casting which takes time.
		//Also helps with type safety
	}
}
