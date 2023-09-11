package animal;

public class Animal {
	private float height;
	private float weight;
	private String animalType;
	private String bloodType;
	
	
	public Animal() {
		this.height = 0;
		this.weight = 0;
		this.animalType = "unknown";
		this.bloodType = "unknown";
	}

	public Animal(float height, float weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	public String showInfo() {
		return "Animal [heightInFeet=" + height + ", weightInKilos=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	
}
