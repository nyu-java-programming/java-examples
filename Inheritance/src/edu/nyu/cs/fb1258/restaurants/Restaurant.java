package edu.nyu.cs.fb1258.restaurants;

/**
 * A restaurant
 * @author Foo Barstein
 * @version 0.5
 *
 */
public class Restaurant {
	
	/**
	 * Constructor with all basic properties of the restaurant
	 * @param name The trendy name of the restaurant
	 * @param address The physical address of the restaurant
	 * @param occupancy The number of people the restaurant can seat
	 * @param cuisine The type of cuisine the restaurant offers
	 */
	public Restaurant(String name, Address address, int occupancy, String cuisine) {
		this.setName(name);
		this.setAddress(address);
		this.setOccupancy(occupancy);
		this.setCuisine(cuisine);
	}
	
	/**
	 * A no-args constructor for a restaurant. Relatively useless in this case.
	 */
	public Restaurant() {
		System.out.println("Restaurant class's no-args constructor called");
	}
	
	// properties
	private String name;
	private Address address;
	private int occupancy;
	private String cuisine;
	
	/**
	 * Check whether the first letter in a given bit of text is a vowel or not.
	 * @param text The text to analyze
	 * @return True if the first letter is a vowel, false otherwise
	 */
	public static boolean firstLetterIsVowel(String text) {
		char first = text.charAt(0);
		first = Character.toLowerCase(first);
		boolean isVowel = (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') ? true : false;
		return isVowel;
	}
	
	/**
	 * Determine which indefinite article is grammatically appropriate to put before a given word, based on whether it starts with a vowel or not.
	 * @param text The word to analyze
	 * @return The article to place before the word, either "a" or "an"
	 */
	public static String getAppropriateIndefiniteArticle(String text) {
		return Restaurant.firstLetterIsVowel(text) ? "an" : "a";
	}

	/**
	 * Get the String representation of this object.
	 * @param placeType What kind of restaurant this is, e.g. a "restaurant" for a proper restaurant, or a "place" for a fast food restaurant.
	 * @return The string representation of the object, with good grammar!
	 */
	public String toString(String placeType)  {
		String article = Restaurant.getAppropriateIndefiniteArticle(this.getCuisine());
		String x = this.getName() + " - " + article + " " + this.getCuisine() + " " + placeType + " at " + this.getAddress().toString().replace("\n", ", ");
		return x;
	}
	
	/**
	 * Get the String representation of this object.  The type of place is assumed to be a proper restaurant (not a fast food place or other).
	 */
	public String toString() {
		String text = this.toString("restaurant");
		return text;
	}
	
	// setters and getters for all private properties... 
	// setters would/should normally have some validation
	// note that we have not done any validation in the setters in order to focus on other topics

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the addresss
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param addresss the addresss to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the occupancy
	 */
	public int getOccupancy() {
		return occupancy;
	}
	/**
	 * @param occupancy the occupancy to set
	 */
	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}
	/**
	 * @return the cuisine
	 */
	public String getCuisine() {
		return cuisine;
	}
	/**
	 * @param cuisine the cuisine to set
	 */
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	
	
	// behaviors
	
	
	// setters and getters

}
