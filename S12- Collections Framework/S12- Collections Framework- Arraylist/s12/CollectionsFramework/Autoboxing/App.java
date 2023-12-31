package s12.CollectionsFramework.Autoboxing;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		//we want to make an int list but ArrayList only accepts object types
		//and int is a primitive so instead we use Integer which is a wrapper class
		//wrapping the primitive into a class AKA Autoboxing and Unboxing
		ArrayList<Integer> studentNumbers = new ArrayList<>(); 
		studentNumbers.add(25);
		
		//Using our integer wrapper class
		ArrayList<intWrapper> studNumbers = new ArrayList<>(); 
		//in order to prevent an error we need to box and unbox manually
		// the boxing happens with the "new intWrapper(12)"
		studNumbers.add(new intWrapper(12)); 
		System.out.println(studNumbers.get(0).getIntValue());//unboxing
	}
}

//example of how a wrapper class works
class intWrapper {
	public int intValue;
	
	public intWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	
}

