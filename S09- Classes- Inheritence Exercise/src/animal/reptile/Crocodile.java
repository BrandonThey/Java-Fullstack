package animal.reptile;

public class Crocodile extends Reptile{
	public Crocodile() {
		super("Dry Skin", "Hard Shelled", true);
	}

	public String showInfo() {
		return "Crocodile [getSkinType()=" + getSkinType() + ", getEggType()=" + getEggType() + ", isHasBackbone()="
				+ isHasBackbone() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}
	
}
