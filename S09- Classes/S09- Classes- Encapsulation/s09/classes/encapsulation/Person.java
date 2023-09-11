package s09.classes.encapsulation;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String toString() {
		return "Person [getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender() + "]";
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public boolean setAge(int age) {
		if(age >= 0 && age <= 100) {
			this.age = age;
			return true;
		}
		return false;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
