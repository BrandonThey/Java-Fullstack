package animal.bird;

public class Eagle extends Bird{

	public Eagle() {
		super();
	}

	public Eagle(boolean hasFeathers, boolean canFly) {
		super(hasFeathers, canFly);
	}

	public Eagle(float height, float weight, String animalType, String bloodType, boolean hasFeathers, boolean canFly) {
		super(height, weight, animalType, bloodType, hasFeathers, canFly);
	}

	public String showInfo() {
		return "Eagle [isHasFeathers()=" + isHasFeathers() + ", isCanFly()=" + isCanFly() + ", getHeight()="
				+ getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType()
				+ ", getBloodType()=" + getBloodType() + "]";
	}
	
	
	
}
