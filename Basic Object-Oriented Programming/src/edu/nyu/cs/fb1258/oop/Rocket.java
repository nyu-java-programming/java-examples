package edu.nyu.cs.fb1258.oop;

/**
 * A model of a rocket
 * @author Foo Barstein
 * @version 2
 *
 */
public class Rocket {

	//properties of rockets
	//a.k.a data fields, properties, attributes, instance variables
	private int height; //in meters
	private int thrust = 0; //in Newtons
	private int fuel = 0; //in meters ^3
	private String agency; //e.g. "NASA"
	private boolean isExploded = false;
	private int maximumFuelCapacity;
		
	//static means this is a property of the Class as a whole, not a property of any given instance of that class
	final static int MINIMUM_THRUST_NECESSARY_FOR_TAKEOFF = 10;
	final static String[] LICENSED_AGENCIES = {"NASA", "SPACE X", "DOD", "Lockheed Martin", "Boeing", "European Space Agency"};
	
	//things rockets can do
	//a.k.a methods, instance methods, functions
	
	//setter method for the thrust property
	public void setThrust(int newValue) {
		//validate the new value before setting it as a property
		if (newValue >=0 && !this.isExploded) {
			this.thrust = newValue;
			//use up some fuel
			this.setFuel(this.getFuel() - 1); //a nice abstract way of changing the fuel level
			//this.fuel = this.fuel - 1; //not abiding by abstraction
		}
		else {
			this.isExploded = true;
			System.out.println("The rocket exploded... sorry.");
		}
	}
	
	//getter method for the thrust property
	public int getThrust() {
		return this.thrust;
	}
	
	//setter method for the fuel property
	public void setFuel(int newValue) {
		if (newValue > 0 && newValue <= this.maximumFuelCapacity) {
			//good value... accept it
			this.fuel = newValue;			
		}
		else if (newValue < 0) {
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
	
	//getter method for the fuel property
	public int getFuel() {
		return this.fuel;
	}
	
	//send this rocket into space
	public void blastOff() {
		//only take off if the thrust is enough
		if (this.thrust >= Rocket.MINIMUM_THRUST_NECESSARY_FOR_TAKEOFF) {
			System.out.println("Blasting off... 10.. 9... 8.etc");
		}
		else {
			//insufficient thrust!
			System.out.println("Sorry, not enough thrust to blast off.");
		}
	}
	
	//setter for the height property
	public void setHeight(int height) {
		if (height > 0) {
			this.height = height;			
		}
	}
	
	//check whether any given agency is one of the licensed agencies that can own this rocket
	public boolean isLicensedAgency(String agency) {
		boolean foundIt = false;
		//loop through all licensed agencies and check whether this is one
		// linear search!!!
		for (String ag : Rocket.LICENSED_AGENCIES) {
			if (ag.equals(agency)) {
				foundIt = true;
				break; //no need to keep looping...we found it
			}
		}
		return foundIt;
	}
	
	//setter for the agency property
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
	
	//getter for the agency property
	public String getAgency() {
		return this.agency;
	}
	
	//setter for the maximumFuelCapacity field
	public void setMaximumFuelCapacity(int max) {
		this.maximumFuelCapacity = max;
	}

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
	
}
