package s10.CoreConcepts.Throws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
	public static void main(String[] args) {
		try {
			testMethod();
		} catch(FileNotFoundException e){ //catching the thrown exception
			System.out.println("File not found");
		} catch(Exception e) {
			System.out.println("There was an exception");
		}
		
		//try catching our user generated exception
		try {
			userGenerated();
		} catch(FileNotFoundException e){ //catching the thrown exception
			System.out.println("File not found");
		} catch(UserDefinedException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("There was an exception");
		}
	}
	
	//working on throws and throwing with opening files
	public static void testMethod() throws Exception{ 
		//we can either use a try catch or throw exceptions
		//throwing the exception will throw it to the outside calling method
		FileReader input = new FileReader("file.txt");
		System.out.println("Message from test method");
		//creates new exception and any statement after this will not be executed
		throw new FileNotFoundException();
	}
	
	//working with user defined exceptions
	public static void userGenerated() throws Exception, UserDefinedException{
		int x = 3;
		
		switch(x) {
			case 1: 
				throw new FileNotFoundException(); 
			case 2: 
				throw new Exception();
			default:
				//our user defined exception acting as the default option
				throw new UserDefinedException();
		}
	}
}

class UserDefinedException extends Throwable{
	//you would have to add ways to check and handle the exception in here
}