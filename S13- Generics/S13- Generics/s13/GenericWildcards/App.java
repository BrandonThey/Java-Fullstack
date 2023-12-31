package s13.GenericWildcards;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private int VehicleId;

	void info() {
		System.out.println("Vehicle ID is: " + getVehicleId());
	}
	
	public Vehicle(int vehicleId) {
		VehicleId = vehicleId;
	}

	public int getVehicleId() {
		return VehicleId;
	}

	public void setVehicleId(int vehicleId) {
		VehicleId = vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [VehicleId=" + VehicleId + "]";
	}
}

class Car extends Vehicle{
	private String Model;

	@Override
	void info() {
		System.out.println("Car model is: " + getModel());
	}
	
	public Car(int vehicleId, String model) {
		super(vehicleId);
		Model = model;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	@Override
	public String toString() {
		return "Car [Model=" + Model + "]";
	}
}
public class App {

	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(14, "A14"));
		printList(list);
	}

	//the ? is a wildcard which allows us to accept Vehicle type and Car Types
	//since we dont know which we could get at any moment
	//the extends Vehicle specifies we only accept Vehicles or its child classes
	//we want to restrict the wildcard to any super class of Car then we use
	// ? super Car, includes car and its superclasses
	public static void printList(List<? extends Vehicle> list) {
		for(Vehicle element: list) {
			System.out.println(element);
			element.info();
			System.out.println();
		}
	}
}
