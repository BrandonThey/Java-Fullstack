package s09.classes.inheritance.child;

import s09.classes.inheritance.parent.Vehicle;

public class Truck extends Vehicle{
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private int container;
	
	public Truck() {
		super();
		this.steering = "";
		this.musicSystem = "";
		this.airConditioner = "";
		this.container = 0;
	}

	public Truck(String steering, String musicSystem, String airConditioner, int container,
			String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank, lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.container = container;
	}

	
	
	@Override
	public String toString() {
		return "Truck [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getContainer()=" + getContainer()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode();
	}

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

	public int getContainer() {
		return container;
	}

	public void setContainer(int container) {
		this.container = container;
	}
	
	
}
