package edu.nyu.cs.fb1258.restaurants;

/**
 * A template for an address.
 * @author Foo Barstein
 * @version 0.5
 *
 */
public class Address {
	
	/**
	 * Constructor of a full address with two separate street fields.
	 * @param street1 The main street address
	 * @param street2 Any additional street address details
	 * @param city The city
	 * @param state The state
	 * @param postalCode The postal code (supports international codes)
	 * @param country The country
	 */
	public Address(String street1, String street2, String city, String state, String postalCode, String country) {
		this.setStreet1(street1);
		this.setStreet2(street2);
		this.setCity(city);
		this.setState(state);
		this.setPostalCode(postalCode);
		this.setCountry(country);
	}
	
	/**
	 * Constructor of an address with only one street field.
	 * @param street1 The main street address
	 * @param city The city
	 * @param state The state
	 * @param postalCode The postal code (supports international codes)
	 * @param country The country
	 */
	public Address(String street1, String city, String state, String postalCode, String country) {
		// call the other constructor and pass in an empty string for the street2 field
		this(street1, "", city, state, postalCode, country);
	}
	
	// properties
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
	// behaviors
	
	/**
	 * Convert this address to a nicely-formatted string
	 * @return The string representation of this address
	 */
	public String toString() {
		// if the street2 part of the address exists, include it.  otherwise don't.
		String street2 = (this.getStreet2() != null && this.getStreet2() != "") ? this.getStreet2() + "\n" : "";
		
		// assemble a string that represents this address in human-readable form.
		String x = this.getStreet1() + "\n" + street2 + this.getCity() + ", " + this.getState() + " " + this.getPostalCode() + "\n" + this.getCountry();
		return x;
	}
	
	// setters and getters for all private properties... 
	// setters would/should normally have some validation
	// note that we have not done any validation in the setters in order to focus on other topics

	/**
	 * @return the street2
	 */
	public String getStreet2() {
		return street2;
	}


	/**
	 * @param street2 the street2 to set
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}


	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}


	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}


	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}


	/**
	 * @return the street1
	 */
	public String getStreet1() {
		return street1;
	}


	public void setStreet1(String street1) {
		this.street1 = street1;
	}

}
