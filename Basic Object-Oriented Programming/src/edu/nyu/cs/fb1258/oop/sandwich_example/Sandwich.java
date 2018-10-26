package edu.nyu.cs.fb1258.oop.sandwich_example;

import edu.nyu.cs.fb1258.oop.sandwich_example.Topping.Temperature;

/**
 * A model of what Sandwiches are and how Sandwiches should behave
 * @author Foo Barstein
 * @version 1
 */
public class Sandwich {


	/**
	 * Constructor to set up every new Sandwich object with a name and temperature
	 */
	public Sandwich(String name, Temperature temperature) {
		// tell the user we've taken their order
		System.out.printf("The %s %s sandwich is coming right up!\n", temperature.toString().toLowerCase(), name);

		// set the name and temperature properties
		this.setName(name);
		this.setTemperature(temperature);
	}
	
	/**
	 * A set of related constants that indicate the temperature of the Sandwich
	 * An enum is a useful data structure for grouping constants together under a single name
	 */
	public static enum Temperature {
		HOT,
		MEDIUM,
		COLD
	}
	
	//properties of a sandwich

	/**
	 * The name of this sandwich
	 */
	private String name;
	
	/**
	 * The core 'stuff' in the sandwich... starts off empty
	 */
	private Base[] bases = new Base[0];
	
	/**
	 * The 'stuff' that goes on top of the base 'stuff'... starts off empty
	 */
	private Topping[] toppings = new Topping[0];
	
	/**
	 * The bread
	 */
	private Bread bread;
		
	/**
	 * The temperature of this sandwich
	 * If the base is hot, the entire sandwich and all toppings should become hot.
	 */
	private Temperature temperature;
	
	/**
	 * Whether the sandwich is open-faced or not.
	 */
	private boolean openFaced = false;
	
	/**
	 * A deterioriting number of points of life for the sandwich.  
	 * Once the points reach 0, the sandwich is considered 'eaten'.
	 */
	private int lifePoints = 100;
	
	
	//behaviors of a sandwich
	
	/**
	 * The sandwich emits an odor (a.k.a. a smell)
	 */
	private void emitOdor() {
		System.out.printf("The %s %s sandwich is emitting an odor...\n", this.getTemperature().toString().toLowerCase(), this.getName());
	}
	
	/**
	 * Take a bite of the sandwich
	 * @param biteSize The size of the bite to take, represented as an integer between 0 - 100.
	 */
	public void takeBite(int biteSize) {
		if (this.lifePoints <= 0) {
			// the sandwich has already been completely eaten
			System.out.printf("Sorry, this %s %s sandwich has already been eaten!\n", this.getTemperature().toString().toLowerCase(), this.getName());
		}
		else {
			// the sandwich is not yet completely eaten
			System.out.printf("Taking a %d%% bite!\n", biteSize);			
			if (biteSize > this.lifePoints) {
				// the bite we're trying to take is larger than the amount of sandwich left
				System.out.printf("Limiting the bite size to %d%%, which is how much sandwich is left\n", this.lifePoints);
				biteSize = this.lifePoints;
			}
			
			// remove some life points according to how big a bite this is
			this.lifePoints -= biteSize;
		}
	}
	
	/**
	 * Determine whether the sandwich has been completely eaten.
	 * @return True if eaten, false otherwise.
	 */
	public boolean isEaten() {
		boolean isEaten = false;
		// if there are no more life points left, the sandwich is completely eaten
		if (this.lifePoints <= 0) {
			System.out.println("Yum!");
			isEaten = true;
		}
		else {
			isEaten = false;
		}
		return isEaten;
	}
		
	/**
	 * Private 'setter' for the bread property
	 * @param bread The bread you would like to add to the sandwich
	 */
	private void setBread(Bread bread) {
		// set this object's base property
		this.bread = bread;
	}
	
	/**
	 * A public method for adding bread to this sandwich.
	 * Having several overloaded versions of the add() method allows users to intuitively add elements to the sandwich.
	 * @param bread The bread to add to the sandwich
	 */
	public void add(Bread bread) {
		// add bread to this sandwich
		System.out.printf("Putting this %s %s sandwich on %s bread...\n", this.getTemperature().toString().toLowerCase(), this.getName(), bread.getName());

		// call the private setBread method
		this.setBread(bread);
	}
		
	/**
	 * A public method for adding toppings to this sandwich.
	 * Having several overloaded versions of the add() method allows users to intuitively add elements to the sandwich.
	 * @param toppings The toppings to add to the sandwich
	 */
	public void add(Topping newTopping) {
		// tell the user we're putting this topping onto this sandwich
		System.out.printf("Adding %s %s onto this %s %s sandwich...\n", newTopping.getTemperature().toString().toLowerCase(), newTopping.getName(), this.getTemperature().toString().toLowerCase(), this.getName());
		
		// make a new array one bigger than the previous array of toppings
		Topping[] newToppings = new Topping[this.toppings.length+1];
		
		//copy the data from the old array to the new one
		for (int i=0; i<this.toppings.length; i++) {
			// copy the element from the old array to the new array
			newToppings[i] = this.toppings[i];
		}
		
		// 'append' the new topping to the last spot in the new array
		newToppings[newToppings.length - 1] = newTopping;
		
		// make this new list of toppings the official list of toppings for this sandwich
		this.toppings = newToppings;
	}
	
	public void add(Base newBase) {
		// output a different message depending on whether this is the first base we're applying to this sandwich
		switch (this.bases.length) {
		// if this is the first base we're putting into the sandwich
		case 0:
			// tell the user we're putting this base on top of the bread
			System.out.printf("Adding %s %s %s onto the %s bread in this %s %s sandwich...\n", newBase.getTemperature().toString().toLowerCase(), newBase.getPreparation().toString().toLowerCase(), newBase.getName(), this.bread.getName(), this.getTemperature().toString().toLowerCase(), this.getName());
			break;
		default:
			// tell the user we're putting this base on top of the previous base
			System.out.printf("Putting %s %s %s on top of the %s %s %s in this %s %s sandwich...\n", newBase.getTemperature().toString().toLowerCase(), newBase.getPreparation().toString().toLowerCase(), newBase.getName(), this.bases[this.bases.length-1].getTemperature().toString().toLowerCase(), this.bases[this.bases.length-1].getPreparation().toString().toLowerCase(), this.bases[this.bases.length-1].getName(), this.getTemperature().toString().toLowerCase(), this.getName());
		}

		// if this new base is hot, then the entire sandwich becomes hot
		switch(newBase.getTemperature()) {
		case HOT:
			// this entire sandwich is getting hot!
			this.setTemperature(Sandwich.Temperature.HOT);
			
			// all the other bases become hot too through energy adsorption
			for (Base base : this.bases) {
				// make each base hot
				System.out.printf("The %s %s %s is now also warming up due to the %s %s %s in this %s %s sandwich...\n", base.getPreparation().toString().toLowerCase(), base.getName(), newBase.getTemperature().toString().toLowerCase(), newBase.getPreparation().toString().toLowerCase(), newBase.getName(), this.getTemperature().toString().toLowerCase(), this.getName());
				base.setTemperature(Base.Temperature.HOT);
			}
			break;
		}
		
		// make a new array one bigger than the previous array of bases
		Base[] newBases = new Base[this.bases.length+1];
		
		//copy the data from the old array to the new one
		for (int i=0; i<this.bases.length; i++) {
			// copy the element from the old array to the new array
			newBases[i] = this.bases[i];
		}
		
		// 'append' the new base to the last spot in the new array
		newBases[newBases.length - 1] = newBase;
		
		// make this new list of bases the official list of bases for this sandwich
		this.bases = newBases;
		
	}
	
	// setters and getters

	/**
	 * Setter method for the 'name' property
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter method for the 'name' property
	 * @return The name for this sandwich
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Setter method for the 'temperature' property
	 */
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
		
		// if the temperature is hot, the sandwich will emit an odor
		switch (temperature) {
		case HOT:
			this.emitOdor();
			break;
		}
	}
	
	/**
	 * Getter method for the 'temperature' property
	 * @return The temperature of this topping
	 */
	public Temperature getTemperature() {
		return this.temperature;
	}

}
