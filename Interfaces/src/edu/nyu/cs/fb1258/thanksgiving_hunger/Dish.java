package edu.nyu.cs.fb1258.thanksgiving_hunger;

/**
 * A dish in a meal
 * @author Foo Barstein
 * @version 1
 *
 */
public class Dish {
	
	/**
	 * Constructor
	 * @param name The name of the dish
	 * @param kilocalories The number of 'calories' in the dish
	 * @param temperature The temperature, in Celsius
	 */
	public Dish(String name, int kilocalories, int temperature) {
		this.setName(name);
		this.setTemperature(temperature);
		this.setKilocalories(kilocalories);
	}
	
	// properties
	
	/**
	 * The name of the dish
	 */
	private String name;
	
	/**
	 * The number of 'calories' in the dish
	 */
	private int kilocalories;
	
	/**
	 * The temperature of the dish, in Celsius (a.k.a. centigrade)
	 */
	private int temperature;
	

	// behaviors
	
	// classic setters and getters
	
	/**
	 * @return the temperature
	 */
	public int getTemperature() {
		return temperature;
	}
	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	/**
	 * @return the kilocalories
	 */
	public int getKilocalories() {
		return kilocalories;
	}
	/**
	 * @param kilocalories the kilocalories to set
	 */
	public void setKilocalories(int kilocalories) {
		this.kilocalories = kilocalories;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		//validate the name
		if (name.length() > 2) {
			this.name = name;
		}
	}
	
}
