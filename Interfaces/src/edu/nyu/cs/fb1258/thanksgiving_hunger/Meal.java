package edu.nyu.cs.fb1258.thanksgiving_hunger;

import java.util.ArrayList;

/**
 * An edible meal.  This class implements the Servable interface, meaning it must include implementations of the serve and isReadToServe methods.
 * @author Foo Barstein
 * @version 1
 *
 */
public class Meal implements Servable {

	/**
	 * Constructor that sets the dishes in this meal
	 * @param dishes The dishes to include in this meal
	 */
	public Meal(ArrayList<Dish> dishes) {
		System.out.println("Constructing a meal...");
		
		// set this Meal's dishes
		this.setDishes(dishes); 
	}
	
	/**
	 * No-args constructor that does no setup
	 */
	public Meal() {
	}
	
	//properties
	
	/**
	 * The dishes that are served in this meal
	 */
	private ArrayList<Dish> dishes;
	
	/**
	 * Whether the meal is ready to serve.  Default to true.
	 */
	private boolean isReadyToServe = true;
	

	//behaviors
	
	/**
	 * Serve the meal!  This method implementation must be in this class because the class implements the Servable interface.
	 */
	public void serve() {
		System.out.println("Serving the meal...");
	}
	
	/**
	 * Add up the calorie count of all dishes in this meal.
	 * @return The total calorie count of the meal.
	 */
	public int getCalorieCount() {
		int total = 0;
		for (Dish dish : dishes) {
			total += dish.getKilocalories();
		}
		
		return total;
	}

	/**
	 * Add a new Dish to this Meal.
	 * @param dish The Dish to add to the Meal
	 */
	public void addDish(Dish dish) {
		this.getDishes().add(dish);
	}
	
	// getters and setters
	
	/**
	 * Determine whether this meal is ready to be served.  This method implementation must be in this class because the class implements the Servable interface.
	 * @return true if the Meal is ready to be served, false otherwise.
	 */
	public boolean isReadyToServe() {
		return this.isReadyToServe;
	}

	/**
	 * @param isMealReadyToServe the isMealReadyToServe to set
	 */
	public void setIsReadyToServe(boolean isReadyToServe) {
		this.isReadyToServe = isReadyToServe;
	}
	
	/**
	 * @return the dishes
	 */
	public ArrayList<Dish> getDishes() {
		return this.dishes;
	}

	/**
	 * @param dishes the dishes to set
	 */
	public void setDishes(ArrayList<Dish> dishes) {
		this.dishes = dishes;
	}


}
