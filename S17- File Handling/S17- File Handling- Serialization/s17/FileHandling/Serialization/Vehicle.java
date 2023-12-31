package s17.FileHandling.Serialization;

import java.io.Serializable;

//a vehicle class to be used to help explain the concept of serialization
public class Vehicle implements Serializable{
	/**
	 * 
	 */
	//adding an ID for the class, which helps identify the correct class
	//to be used for casting later when reading and writing
	private static final long serialVersionUID = 1985890448043772896L;
	private String type;
	private int number;
	
	public Vehicle(String type, int number) {
		this.type = type;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", number=" + number + "]";
	}

}
