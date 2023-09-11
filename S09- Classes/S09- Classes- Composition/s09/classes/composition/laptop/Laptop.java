package s09.classes.composition.laptop;

import s09.classes.composition.laptop.components.Processor;
import s09.classes.composition.laptop.components.GraphicsCard;
public class Laptop {
	private float screen;
	private Processor processor; //properties that have more properties
	private String ram;
	private String hardDrive;
	private GraphicsCard graphicsCard;
	private String opticalDrive;
	private String keyboard;
	
	public Laptop() {
		this.screen = 0f;
		this.processor = new Processor();
		this.ram = "unknown";
		this.hardDrive = "unknown";
		this.graphicsCard = new GraphicsCard();
		this.opticalDrive = "unknown";
		this.keyboard = "unknown";
	}

	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
			String opticalDrive, String keyboard) {
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	//overclocking method that really just changes the processor's current frequency
	//to the max 
	public String Overclock() {
		processor.setFrequency(processor.getMaxFreq());
		return "Successful";
	}
	
	public String toString() {
		return "Laptop [getScreen()=" + getScreen() + ", getProcessor()=" + getProcessor() + ", getRam()=" + getRam()
				+ ", getHardDrive()=" + getHardDrive() + ", getGraphicsCard()=" + getGraphicsCard()
				+ ", getOpticalDrive()=" + getOpticalDrive() + ", getKeyboard()=" + getKeyboard() + "]";
	}
	
	/**
	 * @return the screen
	 */
	public float getScreen() {
		return screen;
	}

	/**
	 * @param screen the screen to set
	 */
	public void setScreen(float screen) {
		this.screen = screen;
	}

	/**
	 * @return the processor
	 */
	public Processor getProcessor() {
		return processor;
	}

	/**
	 * @param processor the processor to set
	 */
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	/**
	 * @return the ram
	 */
	public String getRam() {
		return ram;
	}

	/**
	 * @param ram the ram to set
	 */
	public void setRam(String ram) {
		this.ram = ram;
	}

	/**
	 * @return the hardDrive
	 */
	public String getHardDrive() {
		return hardDrive;
	}

	/**
	 * @param hardDrive the hardDrive to set
	 */
	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}

	/**
	 * @return the graphicsCard
	 */
	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}

	/**
	 * @param graphicsCard the graphicsCard to set
	 */
	public void setGraphicsCard(GraphicsCard graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	/**
	 * @return the opticalDrive
	 */
	public String getOpticalDrive() {
		return opticalDrive;
	}

	/**
	 * @param opticalDrive the opticalDrive to set
	 */
	public void setOpticalDrive(String opticalDrive) {
		this.opticalDrive = opticalDrive;
	}

	/**
	 * @return the keyboard
	 */
	public String getKeyboard() {
		return keyboard;
	}

	/**
	 * @param keyboard the keyboard to set
	 */
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	
	
}
