package s10.CoreConcepts.UserInput;

import java.util.Scanner;

import s10.CoreConcepts.UserInput.test.TestStatic;

//playing and practicing with user inputs and static variables
public class App {
	public static void main(String[] args) {
		System.out.println("What's your name");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine(); //alternatively you can use input.next to only get the next word
		System.out.println("Hello " + name + ". How old are you?");
		int age = input.nextInt();
		System.out.println("So your age is " + age);
		//closing the scanner
		input.close();
		
		//playing with the static object
		//TestStatic obj = new TestStatic();
		System.out.println("Object 1's value: " + TestStatic.getStaticVar());
		TestStatic.setStaticVar(1);
		System.out.println("Object 1's value: " + TestStatic.getStaticVar());
		
		//TestStatic obj2 = new TestStatic();
		System.out.println("Object 2's value: " + TestStatic.getStaticVar());
		TestStatic.setStaticVar(24);
		System.out.println("Object 2's value: " + TestStatic.getStaticVar());
		//since the integer variable is static, whenever it is changed the new value
		//becomes the default value of a new object
		//sine we changed the value to 1 for object 1 the default value for obkect 2 
		//is now 1 instead of 0
		//so use static classes only for classes with one instance 
		//"Classname.variablename = variable" 
		//instead of "this.variablename = variable" and use the static keyword in methods
	}
}
