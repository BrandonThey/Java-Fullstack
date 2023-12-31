package s16.LambdaExpressions;

//we cannot have multiple methods in an interface in order to use lambda expressions
//these interfaces with only one method are called functional interfaces
interface Lambda{
	public void demo();
}

public class App {

	public static void main(String[] args) {
		
		//lambda expressions simplify anon functions from this
		/*
		Lambda lambda = new Lambda() {
			@Override
			public void demo() {
				System.out.println("Statement 1");
			}
		};
		*/
		//to this, this would be similar to an arrow function in JS
		//Lambda lambda = ()->System.out.println("Statement 1");
		
		//for multiple lines of code we use an arrow function
		Lambda lambda = ()->{
			System.out.println("Statement 1");
			System.out.println("Statement 2");
		};
		lambda.demo();
		
		//using an lambda expression to create a thread
		//using the lambda expression as the argument in the new Thread() line
		//this replaces the whole new Thread(Runnable()) block
		Thread thread1 = new Thread(()-> {
			System.out.println("I am inside thread 1");
			System.out.println("Line 2 of thread 1");
		});
		thread1.start();
	}

}
