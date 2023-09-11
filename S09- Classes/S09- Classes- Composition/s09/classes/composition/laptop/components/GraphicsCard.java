package s09.classes.composition.laptop.components;

public class GraphicsCard {
	private String brand;
	private int series;
	private String memory;
	
	public GraphicsCard() {
		this.brand = "unknown";
		this.series = 0;
		this.memory = "unknown";
	}

	public GraphicsCard(String brand, int series, String memory) {
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	
	public String toString() {
		return "GraphicsCard [getBrand()=" + getBrand() + ", getSeries()=" + getSeries() + ", getMemory()="
				+ getMemory() + "]";
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the series
	 */
	public int getSeries() {
		return series;
	}

	/**
	 * @param series the series to set
	 */
	public void setSeries(int series) {
		this.series = series;
	}

	/**
	 * @return the memory
	 */
	public String getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(String memory) {
		this.memory = memory;
	}
	
	
}
