package s09.classes.polymorphism.phone;

public class Phone {
	private String model;

	public Phone(String model) {
		this.model = model;
	}
	
	public void features() {
		System.out.println("Feature Phone");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
