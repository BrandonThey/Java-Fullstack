package animal.bird;

import animal.Animal;

public class Bird extends Animal{
	private boolean hasFeathers;
	private boolean canFly;
	
	public Bird(boolean hasFeathers, boolean canFly) {
		super();
		this.hasFeathers = hasFeathers;
		this.canFly = canFly;
	}

	public Bird() {
		super();
		this.hasFeathers = true;
		this.canFly = true;
	}

	public Bird(float height, float weight, String animalType, String bloodType,
			boolean hasFeathers, boolean canFly) {
		super(height, weight, animalType, bloodType);
		this.hasFeathers = hasFeathers;
		this.canFly = canFly;
	}

	public String showInfo() {
		return "Bird [isHasFeathers()=" + isHasFeathers() + ", isCanFly()=" + isCanFly() + ", getHeight()="
				+ getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType()
				+ ", getBloodType()=" + getBloodType() + "]";
	}

	/**
	 * @return the hasFeathers
	 */
	public boolean isHasFeathers() {
		return hasFeathers;
	}

	/**
	 * @param hasFeathers the hasFeathers to set
	 */
	public void setHasFeathers(boolean hasFeathers) {
		this.hasFeathers = hasFeathers;
	}

	/**
	 * @return the canFly
	 */
	public boolean isCanFly() {
		return canFly;
	}

	/**
	 * @param canFly the canFly to set
	 */
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	
}
