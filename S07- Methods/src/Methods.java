
public class Methods {

	public static void main(String[] args) {
		loop1(); 
		System.out.println();
		loop2();
		System.out.println();
		mainLoop(1,10);
		System.out.println();
		System.out.println("area of a rectanle: " + area(10.2, 20.4));
		System.out.println();
		System.out.println("area of a square: " + area(10.2));
		System.out.println();
		System.out.println("area of a square in integer: " + area(5));
	}

	//methods
	public static void loop1() {
		for(int i = 0; i <= 10; i++) {
			System.out.println(i+1);
		}
	}
	
	public static void loop2() {
		for(int j = 20; j <= 40; j++) {
			System.out.println(j);
		}
	}
	
	//params and return types
	public static void mainLoop(int step, int finalValue) {
		while(step < finalValue) {
			System.out.println(step);
			step++;
		}
	}
	
	public static double area(double length, double width) {
		return (length * width);
	}
	
	//method overloading of the area method
	public static double area(double side) {
		return (side * side);
	}
	
	//overloading with different return type
	public static int area(int side) {
		return (side * side);
	}
}
