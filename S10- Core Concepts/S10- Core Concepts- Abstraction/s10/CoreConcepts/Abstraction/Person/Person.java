package s10.CoreConcepts.Abstraction.Person;

public abstract class Person implements IsAlive,LiveLife{ // class inherits multiple interfaces
	public void speak() {
		System.out.println("Shares his/her thoughts.");
	}
	
	@Override
	public void breathe() {
		System.out.println("To be alive, keep breathing");
	}
	
	@Override
	public void message() {
		System.out.println("Life is a journey, keep moving and meet new people");
	}
	public abstract void eat(); //an abstract method that will describe the eating habits
	
}
