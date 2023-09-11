package s09.classes.inheritance.parent;

public class Vehicle {
	private String engine;
	private int wheels;
	private int seats;
	private int fuelTank;
	private String lights;
	
	public Vehicle() {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fuelTank = 35;
		this.lights = "LED";
		
	}

	public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;
	}

	
	public void run() {
		System.out.println("Running Vehicle");
	}
	
	//getters and setters
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}

	public String getLights() {
		return lights;
	}

	public void setLights(String lights) {
		this.lights = lights;
	}
}
