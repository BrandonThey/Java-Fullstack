package s09.classes.composition;

import s09.classes.composition.laptop.Laptop;
import s09.classes.composition.laptop.components.GraphicsCard;
import s09.classes.composition.laptop.components.Processor;

public class main {

	public static void main(String[] args) {
		Processor processor = new Processor();
		GraphicsCard graph = new GraphicsCard();
		Laptop lappy = new Laptop(15.6f, processor, "DDR4", "2TB", graph, "MLT Layer",
				"backlit");
		
		System.out.println(lappy);
		//System.out.println(lappy.getProcessor().getBrand());
		
		Processor gamingProcessor = new Processor("intel", "7200U", "GMB", "2.5Ghz",
				"2.5Ghz", "3.1Ghz", 7, 4,4);
		GraphicsCard gamingGraph = new GraphicsCard("Nvidia", 1050, "4GB");
		Laptop gamingLaptop = new Laptop(17f, gamingProcessor, "DDR4", "2TB", gamingGraph,
				null, "backlit");
		
		System.out.println(gamingLaptop);
		gamingLaptop.Overclock();
		System.out.println(gamingLaptop.getProcessor().getFrequency());
	}

}
