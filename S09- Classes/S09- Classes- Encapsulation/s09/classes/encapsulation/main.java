package s09.classes.encapsulation;

public class main {

	public static void main(String[] args) {
		Person john = new Person("john", 25, "Male");
		System.out.println(john);

		Person brandon = new Person("Brandon", 23, "Male");
		System.out.println(brandon);
		brandon.setAge(25);
	}

}
