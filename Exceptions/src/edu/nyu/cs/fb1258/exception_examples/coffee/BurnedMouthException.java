package edu.nyu.cs.fb1258.exception_examples.coffee;

/**
* A special type of exception that is thrown whenever a beverage that is too hot has been drunk.
* @author Foo Barstein
* @version 2
* 
*/
public class BurnedMouthException extends Exception {

	/**
	 * Constructor that accepts the temperature of the beverage that burned the mouth as an argument.
	 * @param temperature The temperature of the beverage that triggered this exception
	 */
	public BurnedMouthException(String beverage, int temperature) {
		this.temperature = temperature;
		this.beverage = beverage;
	}
	
	/**
	 * The temperature of the beverage
	 */
	private int temperature;
	
	/**
	 * The name of the beverage that burned the mouth
	 */
	private String beverage;
	
	/**
	 * How to represent an exception of this type as a String.
	 * @return String representation of the object
	 */
	public String toString() {
		return String.format("OUCH!!!  That %d°F %s burned my mouth!", this.temperature, this.beverage);
	}

}
