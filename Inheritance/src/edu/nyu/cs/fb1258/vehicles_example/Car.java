package edu.nyu.cs.fb1258.vehicles_example;

/**
 * A car is a more specific sub-variety of a Vehicle
 * @author Foo Barstein
 * @version 1
 *
 */
public class Car extends Vehicle {

	/**
	 * No-args constructor simply calls the Vehicle class constructor to do basic Vehicle setup
	 */
	public Car() {
		super(); // call the parent class's no-args constructor
	}

	// properties of a car that are distinct from those of all Vehicles
	
	/**
	 * Whether the Car is on or not
	 */
	private boolean on = false;
	
	// behaviors a Car can do that are distinct from what all Vehicles can do
	
	/**
	 * Cars can be turned on!  This is not something all Vehicles can do.
	 */
	public void turnOn() {
		this.setOn(true); // if you've got a setter, use it!
		
		// output something
		System.out.printf("Car #%d is now on!\n", this.getVehicleId());
	}

	/**
	 * Cars can be turned off!  This is not something all Vehicles can do.
	 */
	public void turnOff() {
		this.setOn(true); // if you've got a setter, use it!

		// output something
		System.out.printf("Car #%d is now off!\n", this.getVehicleId());
	}

	/**
	 * Move the Car forwards... for Cars, this only works if the car is on
	 */
	public void goForward() {
		// check whether the car is on
		if (this.isOn()) {
			// call the Vehicle class's implementation of the goForward method, rather than write our own redundant implementation
			super.goForward();
		}
		else {
			System.out.printf("Sorry, Car #%d is off.\n", this.getVehicleId());
		}
	}
	
	/**
	 * Move the Car backwards... this only works if the car is on
	 */
	public void goBackward() {
		if (this.isOn()) {
			// call the Vehicle class's implementation of the goBackward method, rather than write our own redundant implementation
			super.goBackward();
		}
		else {
			System.out.printf("Sorry, Car #%d is off.\n", this.getVehicleId());
		}
	}
	
	/**
	 * @return what type of Vehicle, and which Vehicle number this Car has
	 */
	public String toString() {
		return String.format("Car #%d", this.getVehicleId());
	}

	
	
	// generic getters and setters
	
	/**
	 * @return the on
	 */
	public boolean isOn() {
		return this.on;
	}

	/**
	 * @param on the on to set
	 */
	public void setOn(boolean on) {
		this.on = on;
	}	
	
}
