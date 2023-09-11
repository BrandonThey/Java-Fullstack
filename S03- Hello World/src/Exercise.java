public class Exercise {

	public static void main(String[] args) {
		//implement (a+b)^2 = ((a^2) + 2ab + (b^2)) into java if a is an integer and b is a float
		int a = 25;
		float b = 42.159f;
		
		double result = (a*a) + 2*(a*b) + (b*b);
		int value = (int)result;
		System.out.println("Value of equation is: " + result);
		System.out.println("Integer value of equation is: " + value);
	}

}
