package edu.nyu.cs.fb1258.oop.cruise_ship_example;

/**
 * A destination that a CruiseShip might try to reach
 * @author Foo Barstein
 * @version 0.1
 *
 */
public class Destination {

	/**
	 * The name of the destination
	 */
	private String name;
	
	/**
	 * The distance of the destination from the ship's starting point, in nautical miles
	 */
	private int distance;
	
	/**
	 * Constructor that sets the name and distance of this destination from the ship
	 * @param name The name to give the destination
	 * @param distance The distance from the ship, in nautical miles
	 */
	public Destination(String name, int distance) {
		// maintain the internal state of the destination
		this.name = name;
		this.distance = distance; // in nautical miles
	}
	
	/**
	 * Classic 'getter' method that returns the distance of this destination from the ship
	 * @return The distance, in nautical miles
	 */
	public int getDistance() {
		return this.distance;
	}
	
	/**
	 * Classic 'getter' for the name property
	 * @return The name of this destination
	 */
	public String getName() {
		return this.name;
	}
	

}
