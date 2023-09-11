package s09.classes.inheritance.child;

import s09.classes.inheritance.parent.Vehicle;

public class Car extends Vehicle{
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
	
	public Car() {
		super(); //call to the super default constructor aka the Vehicle's default constructor
		this.steering = "";
		this.musicSystem = "";
		this.airConditioner = "";
		this.fridge = "";
		this.entertainmentSystem = "";
	}
	
	public Car(String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem,
			String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank, lights); //initializes all the super vars first ex lights, fueltank etc
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entertainmentSystem;
	}

	
	
	@Override
	public String toString() {
		return "Car [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getFridge()=" + getFridge()
				+ ", getEntertainmentSystem()=" + getEntertainmentSystem() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank()
				+ ", getLights()=" + getLights() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	//getters and setters
	public String getSteering() {
		return steering;
	}

	public void setSteering(String steering) {
		this.steering = steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	public void setAirConditioner(String airConditioner) {
		this.airConditioner = airConditioner;
	}

	public String getFridge() {
		return fridge;
	}

	public void setFridge(String fridge) {
		this.fridge = fridge;
	}

	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}

	public void setEntertainmentSystem(String entertainmentSystem) {
		this.entertainmentSystem = entertainmentSystem;
	}
	
	
}
