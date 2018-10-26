package edu.nyu.cs.fb1258.oop.rocket_example;

/**
 * A model of a rocket
 * @author Foo Barstein
 * @version 2
 *
 */
public class Rocket {

	//no-args constructor
	public Rocket() {
		//do nothing... or set some default property values... as you wish
	}
	
	//constructor method that sets properties for the rocket
	public Rocket(int height, String agency, int maximumFuelCapacity) {
		//set property values to the corresponding parameter values using setters, if available
		this.setHeight(height); //use the height setter
		this.setAgency(agency); //use the agency setter
		this.setMaximumFuelCapacity(maximumFuelCapacity); //use the maximumFuelCapacity setter
	}
	
	//properties of rockets
	//a.k.a data fields, properties, attributes, instance variables
	
	/**
	 * The height of the rocket, in meters
	 */
	private int height;

	/**
	 * The thrust of the rocket, in Newtons
	 */
	private int thrust = 0;
	
	/**
	 * The amount of fuel in the rocket, in meters ^3
	 */
	private int fuel = 0;

	/**
	 * The maximum fuel capacity of the rocket
	 */
	private int maximumFuelCapacity;
		
	/**
	 * The agency to which the rocket belongs, e.g. "NASA"
	 */
	private String agency;
	
	/**
	 * Whether the rocket has exploded
	 */
	private boolean isExploded = false;
	
	/**
	 * The minimum thrust necessary for takeoff
	 * static means this is a property of the Class as a whole, not a property of any given instance of that class
	 */
	final static int MINIMUM_THRUST_NECESSARY_FOR_TAKEOFF = 10;
	
	/**
	 * The various agencies to which rockets may belong
	 * static means this is a property of the Class as a whole, not a property of any given instance of that class
	 */
	final static String[] LICENSED_AGENCIES = {"NASA", "SPACE X", "DOD", "Lockheed Martin", "Boeing", "European Space Agency"};
	
	//things rockets can do
	//a.k.a methods, instance methods, functions
	
	/**
	 * Setter method for the 'thrust' property
	 * @param newThrust the new value to which to set the thrust
	 */
	public void setThrust(int newThrust) {
		//validate the new value before setting it as a property
		if (newThrust >=0 && !this.isExploded) {
			this.thrust = newThrust;
			//use up some fuel
			this.setFuel(this.getFuel() - 1); //a nice abstract way of changing the fuel level
			//this.fuel = this.fuel - 1; //not abiding by abstraction
		}
		else {
			// if this rocket has exploded...
			this.isExploded = true;
			System.out.println("The rocket exploded... sorry.");
		}
	}
	
	/**
	 * Getter method for the 'thrust' property
	 * @return The amount of thrust this rocket has
	 */
	public int getThrust() {
		return this.thrust;
	}
	
	/**
	 * Setter method for the 'fuel' property
	 * @param newFuel The amount of fuel to set
	 */
	public void setFuel(int newFuel) {
		if (newFuel > 0 && newFuel <= this.maximumFuelCapacity) {
			//good value... accept it
			this.fuel = newFuel;			
		}
		else if (newFuel < 0) {
			//trying to fill negative quantities of fuel
			System.out.println("Sorry, there is no such thing as negative fuel");
		}
		else {
			//overfilling.. fill to capacity and spill the rest
			int spillage = Math.abs(this.fuel - this.maximumFuelCapacity); //amount of extra fuel we have
			this.fuel = this.maximumFuelCapacity; //the max amount we can fill the tank
			System.out.println("Sorry,... spilling " + spillage + " cubic meters of extra fuel into the fragile ecosystem.");
		}
	}
	
	/**
	 * Getter method for the 'fuel' property
	 * @return The amount of fuel in this rocket
	 */
	public int getFuel() {
		return this.fuel;
	}
	
	/**
	 * Setter for the height property
	 * @param height The height to set this rocket to
	 */
	public void setHeight(int height) {
		// do validation on the height property
		if (height > 0) {
			// set the height if the value is valid
			this.height = height;			
		}
	}
	
	/**
	 * Send this rocket into space
	 */
	public void blastOff() {
		//only take off if the thrust is enough
		if (this.thrust >= Rocket.MINIMUM_THRUST_NECESSARY_FOR_TAKEOFF) {
			System.out.println("Blasting off... 10... 9... 8... etc");
		}
		else {
			//insufficient thrust!
			System.out.println("Sorry, not enough thrust to blast off.");
		}
	}
	
	/**
	 * Check whether any given agency is one of the licensed agencies that can own this rocket
	 * @param agency The agency to check
	 * @return True if the agency is licensed, false otherwise
	 */
	public boolean isLicensedAgency(String agency) {
		boolean foundIt = false;
		//loop through all licensed agencies and check whether this is one
		// linear search!!!
		for (String ag : Rocket.LICENSED_AGENCIES) {
			// if we find this agency in the list of approved agencies
			if (ag.equals(agency)) {
				foundIt = true;
				break; //no need to keep looping...we found it
			}
		}
		return foundIt;
	}
	
	/**
	 * Setter for the agency property
	 * @param agency The agency to which this rocket belongs
	 */
	public void setAgency(String agency) {
		//only set this agency as the property if it i sin our list of licensed agencies
		if (isLicensedAgency(agency)) {
			this.agency = agency;
		}
		else {
			//if it's not a licensed agency...
			System.out.println("Sorry... our contract doesn't allow us to sell this rocket to " + agency);
		}
	}
	
	/**
	 * Getter for the agency property
	 * @return The agency to which this rocket belongs
	 */
	public String getAgency() {
		return this.agency;
	}
	
	/**
	 * Setter for the maximumFuelCapacity field
	 * @param max The maximum fuel capacity to set
	 */
	public void setMaximumFuelCapacity(int max) {
		// validate the value
		if (max > 0) {
			this.maximumFuelCapacity = max;
			
		}
	}

}
