package s10.CoreConcepts.Abstraction;

import s10.CoreConcepts.Abstraction.Person.NonVegan;
import s10.CoreConcepts.Abstraction.Person.Person;
import s10.CoreConcepts.Abstraction.Person.Vegan;

public class main {
	public static void main(String[] args) {
		Person john = new Vegan();
		john.breathe();
		john.message();
		john.speak();
		john.eat();
		
		Person mia = new NonVegan();
		mia.speak();
		mia.eat();
	}
}
