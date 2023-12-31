package s16.LambdaExpressions.LambdaExpanded2;

interface Lambda{
	abstract public int demo(int x, float y);
}
public class App {

	public static void main(String[] args) {
		
		Lambda lambda = (int x, float y)->{
			System.out.println("Value of x: " + x + " Value of y: " + y);
			System.out.println("Statement from demo method");
			return x+(int)y;
		};

		System.out.println(lambda.demo(201, 503.12f));
		
	}

}
