package edu.nyu.cs.fb1258.oop.sandwich_example;

import edu.nyu.cs.fb1258.oop.sandwich_example.Topping.Temperature;

/**
 * A class that represents base ingredients used in Sandwiches, such as the roast beef in a roast beef sandwich, the tofu in a tofu sandwhich, etc.
 * @author Foo Barstein
 * @version 1
 *
 */
public class Base {

	/**
	 * Constructor to set up every new Base object
	 */
	public Base(String name, Temperature temperature, Preparation preparation) {
		// set the three properties at once
		this.setName(name);
		this.setTemperature(temperature);
		this.setPreparation(preparation);
	}

	/**
	 * A set of related constants that indicate the temperature of the Base
	 * An enum is a useful data structure for grouping constants together under a single name
	 */
	public static enum Temperature {
		HOT,
		MEDIUM,
		COLD
	}
	
	/**
	 * A set of related constants that indicate the preparation method of a Base
	 */
	public static enum Preparation {
		SLICED,
		DICED,
		GRATED,
		PULLED,
		CHOPPED,
		GROUND
	}
	
	/**
	 * The name of the base
	 */
	private String name;
	
	/**
	 * This base's temperature
	 */
	private Temperature temperature;
	
	/**
	 * Preparation method
	 */
	private Preparation preparation;
	
	/**
	 * Setter method for the 'name' property
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter method for the 'name' property
	 * @return The name of this base
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Setter method for the 'temperature' property
	 */
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
		
		// check whether we are setting this base to hot
		switch (temperature) {
			case HOT:
				// make all other bases hot as well
				// make the entire sandwich hot!
				break;
			case MEDIUM:
				// do any other steps that are side-effects of this being medium heat
				break;
			case COLD:
				// do any other side-effects of this being cold
				break;
			
		}
	}

	/**
	 * Getter method for the 'temperature' property
	 * @return The temperature of this topping
	 */
	public Temperature getTemperature() {
		return this.temperature;
	}	

	/**
	 * Setter method for the 'preparation' property
	 */
	public void setPreparation(Preparation preparation) {
		this.preparation = preparation;
	}

	/**
	 * Getter method for the 'preparation' property
	 * @return The temperature of this topping
	 */
	public Preparation getPreparation() {
		return this.preparation;
	}	

}
