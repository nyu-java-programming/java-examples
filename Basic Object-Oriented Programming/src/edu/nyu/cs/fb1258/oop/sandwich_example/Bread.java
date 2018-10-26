package edu.nyu.cs.fb1258.oop.sandwich_example;

/**
 * A class that models Bread for use in sandwiches
 * @author Foo Barstein
 * @version 1
 *
 */
public class Bread {

	/**
	 * Constructor for Bread objects
	 * @param name
	 * @param toasted
	 * @param seedType
	 * @param buttered
	 */
	public Bread(String name, boolean toasted, String seedType, boolean buttered) {
		this.setName(name);
		this.setSeedType(seedType);
		this.setButtered(buttered);
	}


	/**
	 * The name of this type of bread
	 */
	private String name;
	
	/**
	 * Whether the bread is toasted
	 */
	private boolean toasted = false; // by default, bread objects are not toasted

	/**
	 * The type of seeds on the bread, if any.  Null if not.
	 */
	private String seedType;
	
	/**
	 * Whether the bread is buttered
	 */
	private boolean buttered = false;
	
	// getters and setters
	
	/**
	 * Getter method for the 'name' property
	 * @return The name of this bread
	 */
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean isToasted() {
		return toasted;
	}

	public void setToasted(boolean toasted) {
		this.toasted = toasted;
	}

	public String getSeedType() {
		return seedType;
	}

	public void setSeedType(String seedType) {
		this.seedType = seedType;
	}

	public boolean isButtered() {
		return buttered;
	}

	public void setButtered(boolean buttered) {
		this.buttered = buttered;
	}

	
}
