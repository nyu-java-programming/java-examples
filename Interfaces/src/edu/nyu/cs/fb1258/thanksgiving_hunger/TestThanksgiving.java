package edu.nyu.cs.fb1258.thanksgiving_hunger;

import java.util.ArrayList;

public class TestThanksgiving {

	public static void main(String[] args) {
		
		// make some dishes for our Thanksgiving meal
		Dish mashedPotatoes = new Dish("Mashed Potatoes", 650, 50);
		Dish turkey = new Dish("Heritage Turkey", 650, 45);
		Dish gravy = new Dish("Gravy", 100, 45);
		
		// put the dishes in an array list
		ArrayList<Dish> dishes = new ArrayList<Dish>();
		dishes.add(mashedPotatoes);
		dishes.add(turkey);
		dishes.add(gravy);
		
		// construct our meal from these dishes
		ThanksgivingMeal meal = new ThanksgivingMeal(dishes);
		meal.serve(); // won't serve, since there is no cranberry sauce
		
		// add cranberry sauce, and try again
		Dish cranberrySauce = new Dish("Cranberry Sauce", 100, 25);
		meal.addDish(cranberrySauce); // add cranberry sauce
		meal.serve(); // try serving again
		
		// construct some revenge, and serve it
		// "Revenge is a dish best served cold."
		Revenge revenge = new Revenge();
		revenge.serve(); // won't serve, since it's not cold
		revenge.chill(); // make it cold
		revenge.serve(); // try serving again

	}

}
