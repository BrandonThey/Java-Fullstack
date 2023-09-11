package s09.classes.inheritance;
import s09.classes.inheritance.child.Bike;
public class main {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.setHandle("Short");
		//the motorbike's engine is inherited from the vehicle's parent class
		System.out.println(bike.getEngine());
		
		//super diesel and beyond to the vehicle class.
		Bike newBike = new Bike("long", "Diesel", 4,4,40,"Led");
		System.out.println(newBike.getEngine() + newBike.getFuelTank());
		
		//using the boosting method in the bike class to print out the
		//methods and their returns
		System.out.println(newBike);
		newBike.run();
	}
}
