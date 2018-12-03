package edu.nyu.cs.fb1258.exception_examples.coffee;

public class OutOfCoffeeException extends Exception {

	/**
	 * Constructor that accepts the temperature of the beverage that burned the mouth as an argument.
	 * @param temperature The temperature of the beverage that triggered this exception
	 */
	public OutOfCoffeeException(String beverage) {
		this.beverage = beverage;
	}
	
	/**
	 * The name of the beverage that burned the mouth
	 */
	private String beverage;
	

	/**
	 * How to represent an exception of this type as a String.
	 * @return String representation of the object
	 */
	public String toString() {
		return String.format("Bummer... my %s is gone!", this.beverage);
	}
}
