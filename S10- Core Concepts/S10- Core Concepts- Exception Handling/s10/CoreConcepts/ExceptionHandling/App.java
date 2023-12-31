package s10.CoreConcepts.ExceptionHandling;

public class App {

	public static void main(String[] args) {
		App object = new App();
		object.caseOne(10, 2);
		object.caseTwo(10, 0);
		object.caseThree(10, 0);

	}

	//in case one we do manual, compile time error checking using conditions
	public void caseOne(int x, int y) {
		if(y != 0) {
			System.out.println(x / y);
		}
		else{
			System.out.println("The value of y is 0");
		}
	}
	
	//error checking using runtime try catches
	public void caseTwo(int x, int y) {
		try {
			System.out.println(x / y);
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occured"); //catches the arithmetic exception
		} catch(Exception e) { //the general exception block should be last block to let specific exceptions to be caught
			e.printStackTrace(); //prints the error message of any other exceptions
			System.out.println("Inside the exception block");
		}
	}
	
	//exception handling using a finally block
	public void caseThree(int x, int y) {
		try {
			System.out.println("The out come is printed");
		} catch(RuntimeException e) {
			System.out.println("Runtime Exception");
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		finally { //finally runs whenever the try block runs without exceptions
			//or if the exception was sucessfully handled
			System.out.println("This will be executed if there is no error");
		}
	}
}
