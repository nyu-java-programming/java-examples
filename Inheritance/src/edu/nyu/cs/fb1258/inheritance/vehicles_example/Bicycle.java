package edu.nyu.cs.fb1258.inheritance.vehicles_example;

/**
 * A bicycle is a more specific sub-variety of a Vehicle
 * @author Foo Barstein
 * @version 1
 *
 */
public class Bicycle extends Vehicle {
	/**
	 * No-args constructor simply calls the Vehicle class constructor to do basic Vehicle setup
	 */
	public Bicycle() {
		super(); // call the parent class's no-args constructor
	}

	// Bicycle inherits all the non-private properties and methods of Vehicle
	
	/**
	 * @return what type of Vehicle, and which Vehicle number this Bicycle has
	 */
	public String toString() {
		return String.format("Bicycle #%d", this.getVehicleId());
	}
}
