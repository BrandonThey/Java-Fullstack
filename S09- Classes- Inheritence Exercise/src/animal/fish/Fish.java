package animal.fish;

import animal.Animal;

public class Fish extends Animal{
	private boolean hasBone;
	private boolean hasGills;
	
	public Fish(boolean hasBone, boolean hasGills) {
		super();
		this.hasBone = hasBone;
		this.hasGills = hasGills;
	}

	public Fish() {
		super();
		this.hasBone = true;
		this.hasGills = true;
	}

	public Fish(float height, float weight, String animalType, String bloodType,
			boolean hasBone, boolean hasGills) {
		super(height, weight, animalType, bloodType);
		this.hasBone = hasBone;
		this.hasGills = hasGills;
	}

	
	public String showInfo() {
		return "Fish [isHasBone()=" + isHasBone() + ", isHasGills()=" + isHasGills() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType() + ", getBloodType()="
				+ getBloodType() + "]";
	}

	public boolean isHasBone() {
		return hasBone;
	}

	public void setHasBone(boolean hasBone) {
		this.hasBone = hasBone;
	}

	public boolean isHasGills() {
		return hasGills;
	}

	public void setHasGills(boolean hasGills) {
		this.hasGills = hasGills;
	}
	
	
}
