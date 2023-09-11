package animal.reptile;

import animal.Animal;

public class Reptile extends Animal{
	private String skinType, eggType;
	private boolean hasBackbone;
	
	public Reptile() {
		//super with average 5 feet in height and 20 kg 
		//weight of reptiles, and type and bloodtype
		super(5, 20, "Reptile", "Cold Blooded");
		this.skinType = "Dry Skin";
		this.eggType = "Soft Shelled";
		this.hasBackbone = true;
	}

	public Reptile(String skinType, String eggType, boolean hasBackbone) {
		super(5, 20, "Reptile", "Cold Blooded");
		this.skinType = skinType;
		this.eggType = eggType;
		this.hasBackbone = hasBackbone;
	}

	public Reptile(float height, float weight, String animalType, String bloodType,
			String skinType, String eggType, boolean hasBackbone) {
		super(height, weight, animalType, bloodType);
		this.skinType = skinType;
		this.eggType = eggType;
		this.hasBackbone = hasBackbone;
	}

	public String showInfo() {
		return "Reptile [getSkinType()=" + getSkinType() + ", getEggType()=" + getEggType() + ", isHasBackbone()="
				+ isHasBackbone() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}

	public String getSkinType() {
		return skinType;
	}

	public void setSkinType(String skinType) {
		this.skinType = skinType;
	}

	public String getEggType() {
		return eggType;
	}

	public void setEggType(String eggType) {
		this.eggType = eggType;
	}

	public boolean isHasBackbone() {
		return hasBackbone;
	}

	public void setHasBackbone(boolean hasBackbone) {
		this.hasBackbone = hasBackbone;
	}
	
	
}
