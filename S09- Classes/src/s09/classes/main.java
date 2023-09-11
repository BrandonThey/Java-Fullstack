package s09.classes;

public class main {

	public static void main(String[] args) {
		Car car = new Car("open", "off", "absent", 20);
		car.setSpeed(10);
		System.out.println(car.getSpeed());
		car.setDoors("closed");
		System.out.println(car.getDoors());
		car.setDriver("seated");
		car.setEngine("on");
		
		//running the run method in car, requires certain vars to be initialized
		System.out.println(car.run());
	}

}
