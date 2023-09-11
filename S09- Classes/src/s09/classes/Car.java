package s09.classes;

//car class that will be used in the main
public class Car {
	//private variables for the car class
	private String doors = "opened";
	private String engine = "off";
	private String driver = "absent";
	private int speed = 0;
	
	//car default constructor
	public Car() {
		this.doors = "opened";
		this.engine = "off";
		this.driver = "absent";
		this.speed = 0;
	}
	
	//car class's constructor
	public Car(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
	public String run() {
		if(this.doors.equals("closed") && this.engine.equals("on")
				&& this.driver.equals("seated") && this.speed > 0) {
			return "running";
		}
		else {
			return "not running";
		}
	}
	//getters and setters for the car variables
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	public String getDoors() {
		return this.doors;
	}
	public String getEngine() {
		return this.engine;
	}
	public String getDriver() {
		return this.driver;
	}
}
