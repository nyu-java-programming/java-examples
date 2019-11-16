package edu.nyu.cs.fb1258.pokemon;

/**
 * A representation of a Type that can be assigned to one or more Pokemon characters
 * @author Foo Barstein
 * @version 0.1
 *
 */

public class Type {

	// constructors
	
	/**
	 * Constructor for a Type object 
	 * @param name The name of this type
	 */
	public Type(String name) {
		this.setName(name);
	}

	// properties of a Type
	
	/**
	 * The name of this Type
	 */
	private String name;
	
	/**
	 * A map of all the various opponent Types... this will be used to map out how many points will be gained or lost when this Type fights the other Types
	 * Tbd ... not yet complete or used... an array is probably not the right data structure for this... a Map would be better
	 */
	private Type[] opponentTypes;
	
	// capabilities of a Type
	// tbd ... define capabilities further
	
	
	// getters and setters
	
	/**
	 * Classic 'getter method' for the name property
	 * @return The name of this Type
	 */
	public String getName() {
		return name;
	}

	/**
	 * Classic 'setter method' for the name property
	 * @param name The name of this Type
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Classic 'getter method' for the opponentTypes property
	 * @return The opponentTypes of this Type
	 */
	public Type[] getOpponentTypes() {
		return opponentTypes;
	}

	/**
	 * Classic 'setter method' for the opponentTypes property
	 * @param name The opponentTypes of this Type
	 */
	public void setOpponentTypes(Type[] opponentTypes) {
		this.opponentTypes = opponentTypes;
	}
	
	
}
