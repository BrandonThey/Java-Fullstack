package animal.fish;

public class Eel extends Fish{
	private String ability;

	public Eel() {
		super();
		this.ability = "Releases electric shock";
	}
	
	public Eel(boolean hasBone, boolean hasGills, String ability) {
		super(hasBone, hasGills);
		this.ability = ability;
	}

	public String showInfo() {
		return "Eel [getAbility()=" + getAbility() + ", isHasBone()=" + isHasBone() + ", isHasGills()=" + isHasGills()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}

	/**
	 * @return the ability
	 */
	public String getAbility() {
		return ability;
	}

	/**
	 * @param ability the ability to set
	 */
	public void setAbility(String ability) {
		this.ability = ability;
	}
	
	
}
