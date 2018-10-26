package edu.nyu.cs.fb1258.oop.sandwich_example;

import edu.nyu.cs.fb1258.oop.sandwich_example.Base.Preparation;
import edu.nyu.cs.fb1258.oop.sandwich_example.Base.Temperature;

public class Topping {

	/**
	 * Constructor to set up every new Topping object
	 */
	public Topping(String name, Temperature temperature) {
		// set the two properties at once
		this.setName(name);
		this.setTemperature(temperature);
	}


	/**
	 * A set of related constants that indicate the temperature of the Topping
	 * An enum is a useful data structure for grouping constants together under a single name
	 */
	public static enum Temperature {
		HOT,
		MEDIUM,
		COLD
	}
	
	/**
	 * The name of the topping
	 */
	private String name;
	
	/**
	 * This topping's temperature
	 */
	private Temperature temperature;
	
	/**
	 * Setter method for the 'name' property
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter method for the 'name' property
	 * @return The name for this topping
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Setter method for the 'temperature' property
	 */
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	/**
	 * Getter method for the 'temperature' property
	 * @return The temperature of this topping
	 */
	public Temperature getTemperature() {
		return this.temperature;
	}
	
}
