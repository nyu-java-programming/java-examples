package edu.nyu.cs.fb1258.oop.zoo_example;

/**
 * A simple representation of a street address
 * @author Foo Barstein
 * @version 1
 */
public class Address {
	
	//properties of each address... all are private to maintain abstraction
	
	/**
	 * The city in which the address is located.
	 */
	private String city;
	
	/**
	 * The first line of the street address of the address.
	 */	
	private String street1;

	/**
	 * The second line of the street address of the address.
	 */	
	private String street2;

	/**
	 * The state in which the address of the address.
	 */	
	private String state;
	
	/**
	 * The zip code of the address.
	 */	
	private int zip;
	
	//getters and setters for each private property...
	//note that the setState method towards the bottom is the only one we've bothered to do validation in... ideally we would do validation in most setters
	
	/**
	 * Getter method for the street1 property.
	 * @return The street1 in which this address is located
	 */
	public String getStreet1() {
		return street1;
	}
	
	/**
	 * Setter for the street1 property
	 * @param street1 The street1 of this address
	 */	
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	
	/**
	 * Getter method for the street2 property.
	 * @return The street2 in which this address is located
	 */
	public String getStreet2() {
		return street2;
	}
	
	/**
	 * Setter for the street2 property
	 * @param street2 The street2 of this address
	 */	
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	
	/**
	 * Getter method for the city property.
	 * @return The city in which this address is located
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Setter for the city property
	 * @param city The city of this address
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Getter method for the state property.
	 * @return The state in which this address is located
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Setter for the state property
	 * @param state The state of this address
	 */
	public void setState(String state) {
		// do some validation
		// make sure the state argument is a good state before setting it as the object's property
		boolean isGoodState = false;
		String[] states = {"Alabama ","Alaska ","Arizona ","Arkansas ","California ","Colorado ","Connecticut ","Delaware ","Florida ","Georgia ","Hawaii ","Idaho ","Illinois Indiana ","Iowa ","Kansas ","Kentucky ","Louisiana ","Maine ","Maryland ","Massachusetts ","Michigan ","Minnesota ","Mississippi ","Missouri ","Montana Nebraska ","Nevada ","New Hampshire ","New Jersey ","New Mexico ","New York ","North Carolina ","North Dakota ","Ohio ","Oklahoma ","Oregon ","Pennsylvania Rhode Island ","South Carolina ","South Dakota ","Tennessee ","Texas ","Utah ","Vermont ","Virginia ","Washington ","West Virginia ","Wisconsin ","Wyoming"};

		// linear search through the list of states to look for this state
		for (String s : states) {
			s = s.trim(); // remove whitespace from the state name before comparing
			if (state.equals(s)) {
				// we found the state we're looking for
				this.state = state; // assign it to the instance variable
				isGoodState = true;
			}
		}
		if (!isGoodState) {
			// we didn't find the state we were looking for
			System.out.printf("Sorry %s is not a valid state.", state);
		}
	}


	/**
	 * Getter for the zip property
	 * @return The zip code of this address
	 */
	public int getZip() {
		return zip;
	}
	
	/**
	 * Setter for the zip property
	 * @param zip The zip code of this address
	 */
	public void setZip(int zip) {
		// do some validation on this zip
		if (Integer.toString(zip).length() == 5) {
			this.zip = zip;			
		}
		else {
			// we didn't find the state we were looking for
			System.out.printf("Sorry %d is not a valid zip code.", zip);
		}

	}
	
	/**
	 * The string representation of the address object
	 * @return The address as a string
	 */
	public String toString() {
		String address = this.getStreet1() + ", " + this.getStreet2() + ", " + this.getCity() + ", " + this.getState() + " " + this.getZip();		
		return address;
	}
	
	
	
}
