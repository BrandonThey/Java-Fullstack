package s09.classes.inheritance.child;

import s09.classes.inheritance.parent.Vehicle;

public class Bike extends Vehicle{
	private String handle;

	public Bike() {
		super(); //call to the super default constructor aka the Vehicle's default constructor
		this.handle = "short";
	}
	
	public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank, lights); //initializes all the super vars first ex lights, fueltank etc
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	//overriding the super run method
	public void run() {
		System.out.println("Running Bike");
		System.out.println(toString());
	}
	
	//boosting method that prints out the class's methods and their returns
	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
