package edu.nyu.cs.fb1258.pokemon;

import java.util.ArrayList;

/**
 * A representation of a Pokemon character
 * @author Foo Barstein
 * @version 0.1
 *
 */
public class Pokemon {
	// constructors
	
	// no args constructor
	/**
	 * No args constructor that creates a new Pokemon character
	 */
	public Pokemon() {
		System.out.println("A new anonymous Pokemon is born at level " + this.getLevel() + ".");
	}
	
	/**
	 * Constructor that creates a new Pokemon character with a given name
	 * @param name The name of this Pokemon
	 */
	public Pokemon(String name) {
		System.out.println("A new Pokemon named " + name + " is born.");
		this.setName(name);
	}
	
	/**
	 * Constructor that creates a new Pokemon character with a given name, color, and health value
	 * @param name The name of this Pokemon
	 * @param color The color of this Pokemon
	 * @param health The health value of this Pokemon, from 0 to 100
	 */
	public Pokemon(String name, String color, int health) {
		System.out.println("A new " + color + " Pokemon named " + name + " is born at level " + this.getLevel() + " with " + health + " health points.");
		this.setName(name);
		this.setColor(color);
		this.setHealth(health);
	}
	
	/**
	 * Constructor that creates a new Pokemon character with a given name, color, health value, and type
	 * @param name The name of this Pokemon
	 * @param color The color of this Pokemon
	 * @param health The health value of this Pokemon, from 0 to 100
	 * @param type The type of this Pokemon, as a Type object
	 */
	public Pokemon(String name, String color, int health, Type type) {
		System.out.println("A new " + color + " " + type.getName() + " Pokemon named " + name + " is born at level " + this.getLevel() + " with " + health + " health points.");
		this.setName(name);
		this.setColor(color);
		this.setHealth(health);
		this.setType(type);
	}
	
	// what are properties?
	private String name;
	
	private String color;
	
	private Move[] moveset = new Move[4]; // max number of moves is 4, so set the array length to 4
	private int numMoves = 0; // keep track of how many moves this Pokemon already has so we don't go over 4
		
	private ArrayList<Item> items = new ArrayList<Item>(); // a Pokemon can hold unlimited items, so ArrayLists make it easy
	
	private Type type;
	
	private int health;

	private Stage stage;
	
	private int level = 0; // default to level 0

	// what are the capabilities?
	
	/**
	 * Add a move to this Pokemon's list of moves
	 * @param move The move to add, represented as a Move object
	 */
	public void addMove(Move move) {
		System.out.println("Adding " + move.getName() + " to " + this.getName() + "'s moveset.");

		// make sure we haven't added more moves than this Pokemon can accept
		if (this.numMoves < this.moveset.length) {
			// add this move to the first open spot in the moveset array
			this.moveset[numMoves] = move;
			this.numMoves++;
		}
	}
	
	/**
	 * Add an item to this Pokemon's list of items
	 * @param item The item to add, represented as an Item object
	 */
	public void receiveItem(Item item) {
		System.out.println("Adding " + item.getName() + " to " + this.getName() + "'s item list.");

		// confer the health benefit of this Item onto this Pokemon character
		this.setHealth(this.getHealth() + item.getHealthValue());
		
		// confer the level benefit of this Item onto this Pokemon character
		this.setLevel(this.getLevel() + item.getLevelValue());
		
		// add this Item to the ArrayList of Item objects
		this.items.add(item);
		
	}
	
	/**
	 * Make a particular move against another Pokemon
	 * @param move The move to make, represented as a Move object
	 * @param opponent The other Pokemon to make the move against, as a Pokemon object
	 */
	public void makeMove(Move move, Pokemon opponent) {
		
		System.out.println(this.getName() + " is making a " + move.getName() + " on " + opponent.getName() + "!");
		
		//subtract health points from the opponent appropriate to this move
		opponent.setHealth(opponent.getHealth() - move.getHealthImpact());
		
	}
	
	// getters
	
	/**
	 * Classic 'getter method' for the name property
	 * @return The name of this Pokemon
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Classic 'getter method' for the health property
	 * @return The health value of this Pokemon
	 */
	public int getHealth() {
		return this.health;
	}
	
	/**
	 * Classic 'getter method' for the level property
	 * @return The level value of this Pokemon
	 */
	public int getLevel() {
		return level;
	}


	
	// setters
	/**
	 * Classic 'setter method' for the name property
	 * @param name The name of this Pokemon
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Classic 'setter method' for the color property
	 * @param color The color of this Pokemon
	 */
	public void setColor(String color) {
		this.color = color;
		System.out.println(this.getName() + " is now " + color + " color.");
	}
	
	/**
	 * Classic 'setter method' for the health property
	 * @param health The health value of this Pokemon
	 */
	public void setHealth(int health) {
		this.health = health;
		System.out.println(this.getName() + " now has " + health + " health points.");
	}
	
	/**
	 * Classic 'setter method' for the type property
	 * @param health The type of this Pokemon, represented as a Type object
	 */
	public void setType(Type type) {
		this.type = type;
		System.out.println(this.getName() + " is now " + type.getName() + " type.");
	}

	/**
	 * Classic 'setter method' for the level property
	 * @param level The level of this Pokemon, represented as an int
	 */
	public void setLevel(int level) {
		this.level = level;
		System.out.println(this.getName() + " is now at level " + this.getLevel() + ".");
	}
	
	
	
}
