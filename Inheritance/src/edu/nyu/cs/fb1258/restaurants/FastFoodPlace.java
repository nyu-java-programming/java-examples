package edu.nyu.cs.fb1258.restaurants;

/**
 * A template for Fast Food places... these are really just restaurants that may have a drive-thru
 * @author Foo Barstein
 * @version 0.5
 *
 */
public class FastFoodPlace extends Restaurant {
	
	/**
	 * No-args constructor that sets a generic name.
	 */
	public FastFoodPlace() {
		// call the no-args constructor as defined in the parent class
		super();
		
		//call a regular method inherited from the parent class 
		this.setName("Fast Food Place");
	}
	
	/**
	 * A constructor for a complete Fast Food Place
	 * @param name The name of the fast food place
	 * @param address The address of the fast food place
	 * @param occupancy The number of people the fast food place can seat
	 * @param cuisine The type of cuisine the fast food place offers
	 * @param drivethru Whether the fast food place has a drive-thru window
	 */
	public FastFoodPlace(String name, Address address, int occupancy, String cuisine, boolean drivethru) {
		// call the constructor as defined in the parent class, and pass it the relevant arguments
		super(name, address, occupancy, cuisine);
		
		// call methods defined in this class to handle any unique behaviors or properties to this class
		this.setDrivethru(drivethru);
	}
	
	// properties of fast-food places
	private boolean drivethru = true;


	// override the toString method of the Restaurant class
	public String toString() {
		String result = this.toString("place");
		return result;
	}
	
	// setters and getters for all private properties... 
	// setters would/should normally have some validation
	// note that we have not done any validation in the setters in order to focus on other topics

	/**
	 * @return the drivethru
	 */
	public boolean isDrivethru() {
		return drivethru;
	}

	/**
	 * @param drivethru the drivethru to set
	 */
	public void setDrivethru(boolean drivethru) {
		this.drivethru = drivethru;
	}
	

}
