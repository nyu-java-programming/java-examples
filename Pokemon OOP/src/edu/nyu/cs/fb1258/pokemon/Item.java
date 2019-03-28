package edu.nyu.cs.fb1258.pokemon;

/**
 * A representation of an item that can be given to a Pokemon character
 * @author Foo Barstein
 * @version 0.1
 *
 */

public class Item {
	
	//  constructors
	
	/**
	 * Constructor that sets all the basic properties of a pokemon Item
	 * @param name The name of the item
	 * @param healthValue The number of health points conferred to those who receive this item
	 * @param levelValue The number of levels a recipient of this item will progress
	 */
	public Item(String name, int healthValue, int levelValue) {
		this.setName(name);
		this.setHealthValue(healthValue);
		this.setLevelValue(levelValue);
	}
	
	// properties of an Item
	private String name;
	
	private int healthValue;
	
	private int levelValue;
	
	// capabilities of an Item
	
	/**
	 * Give this item to a particular Pokemon character
	 * @param recipient The Pokemon object to whom this Item is given
	 */
	public void giveTo(Pokemon recipient) {
		System.out.println("Giving " + this.getName() + " to " + recipient.getName() + ".");

		// add this Item to this Pokemon character's list of Items
		recipient.receiveItem(this);
	}
	
	// tbd.... define capabilities of an Item further

	
	// getters and setters
	
	/**
	 * Classic 'getter method' for the name property
	 * @return The name of this Item
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Classic 'setter method' for the name property
	 * @param name The name of this Item
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Classic 'getter method' for the health value property
	 * @return The health value of this Item, as an integer
	 */
	public int getHealthValue() {
		return healthValue;
	}

	/**
	 * Classic 'setter method' for the health value property
	 * @return The health value of this Item, as an integer
	 */
	public void setHealthValue(int healthValue) {
		this.healthValue = healthValue;
	}

	/**
	 * Classic 'getter method' for the levelValue property
	 * @return The level value that this Item confers upon its recipient
	 */
	public int getLevelValue() {
		return levelValue;
	}

	/**
	 * Classic 'setter method' for the levelValue property
	 * @param name The level value that this Item confers upon its recipient
	 */
	public void setLevelValue(int levelValue) {
		this.levelValue = levelValue;
	}

}
