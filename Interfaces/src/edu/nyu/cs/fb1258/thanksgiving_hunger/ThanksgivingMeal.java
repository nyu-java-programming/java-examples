package edu.nyu.cs.fb1258.thanksgiving_hunger;

import java.util.ArrayList;

/**
 * A traditional Thanksgiving meal.  Thanksgiving meals must have turkey and cranberry in them in order to be ready to serve.
 * @author Foo Barstein.
 * @version 1
 *
 */
public class ThanksgivingMeal extends Meal {
	
	/**
	 * Constructor that sets the dishes in this meal
	 * @param dishes The dishes to include in this meal
	 */
	public ThanksgivingMeal(ArrayList<Dish> dishes) {
		// by default, the Meal class's no-args construct is called, i.e. super();

		System.out.println("Constructing a Thanksgiving meal...");

		// setting up a ThanksgivingMeal has different logic than setting up a regular Meal
		// start off with a blank ArrayList of Dishes
		this.setDishes(new ArrayList<Dish>()); 
		
		// loop through each dish and add it to the ThanksgivingMeal
		for (Dish dish : dishes) {
			// add this dish to the ThanksgivingMeal.. this adds it to the Arraylist of Dishes, but also checks whether this dish has turkey or cranberry
			this.addDish(dish);
		}
		
	}
	
	/**
	 * Override of the Meal class's isReadToServe property.
	 * For generic Meals, this is true by default.  But for Thanksgiving, this is false, by default
	 */
	private boolean isReadyToServe = false;
	
	/**
	 * Whether this meal has turkey in it.  Default to false.
	 */
	private boolean isHasTurkey = false;
	
	/**
	 * Whether this meal has cranberry in it.  Default to false.
	 */
	private boolean isHasCranberry = false;
	

	/**
	 * Serve this meal - it must have turkey and cranberry in order to be properly served.
	 */
	public void serve() {
		// only serve if it's ready...
		if (this.isReadyToServe()) {
			// the meal is ready!
			System.out.println("Serving the meal... Happy Thanksgiving!");
		}
		else {
			// the meal is not ready - it must not have turkey or cranberry
			System.out.println("This meal cannot be served.  Please make sure you have turkey and cranberry sauce!");
		}
	}
	
	/**
	 * Add a new Dish to this ThanksgivingMeal.  This is an override of the Meal class's method of the same name.
	 * In a ThanksgivingMeal, we check for cranberry and turkey every time a new dish is added to determine whether the meal is ready to be served.
	 * @param dish The Dish to add to the ThanksgivingMeal
	 */
	public void addDish(Dish dish) {
		System.out.printf("Adding %s...\n", dish.getName().toLowerCase());
		
		// add the new dish to the ArrayList of Dishes
		this.getDishes().add(dish);
		
		// but also... check for turkey or cranberry in this dish

		// get the name of each dish, in lower case
		String name = dish.getName().toLowerCase();
		
		// look for the word 'turkey' in the name of the dish
		if (name.contains("turkey")) {
			// it has turkey!
			this.setIsHasTurkey(true);
		}
		
		// look for the word 'cranberry' in the name of the dish
		if (name.contains("cranberry")) {
			// it has cranberry!
			this.setIsHasCranberry(true);
		}

		// determine whether this meal is ready to serve - it must have turkey and cranberry
		if (this.isHasCranberry() && this.isHasTurkey()) {
			// it's ready to serve!
			this.setIsReadyToServe(true);
		}

	}

	
	// getters and setters

	/**
	 * Determine whether this ThanksgivingMeal is ready to be served.  
	 * This method must be overriden from the Meal class, since it must be able to access the overriden isReadToServe property that is private to this class, rather than the parent class's isReadyToServe property.
	 * @return true if the ThanksgivingMeal is ready to be served, false otherwise
	 */
	public boolean isReadyToServe() {
		return this.isReadyToServe;
	}

	/**
	 * This method must be overriden from the Meal class, since it must be able to access the overriden isReadToServe property that is private to this class, rather than the parent class's isReadyToServe property.
	 * @param isMealReadyToServe Whether this meal is ready to serve, meaning it has turkey and cranberry sauce in it!
	 */
	public void setIsReadyToServe(boolean isReadyToServe) {
		this.isReadyToServe = isReadyToServe;
	}


	/**
	 * @return the hasTurkey
	 */
	public boolean isHasTurkey() {
		return isHasTurkey;
	}

	/**
	 * @param hasTurkey the hasTurkey to set
	 */
	public void setIsHasTurkey(boolean isHasTurkey) {
		this.isHasTurkey = isHasTurkey;
	}
	
	/**
	 * @return the isHasCranberry
	 */
	public boolean isHasCranberry() {
		return isHasCranberry;
	}

	/**
	 * @param isHasCranberry the isHasCranberry to set
	 */
	public void setIsHasCranberry(boolean isHasCranberry) {
		this.isHasCranberry = isHasCranberry;
	}
	
}
