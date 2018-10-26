package edu.nyu.cs.fb1258.oop.sandwich_example;

/**
 * Make a sandwich with some bread, base ingredients, and a few toppings.
 * Show how the properties and behaviors of the sandwich can be manipulated.
 * @author Foo Barstein
 * @version 1
 *
 */
public class TestSandwich {

	public static void main(String[] args) {
		// let's construct a Reuben sandwich!
		
		// instantiate a hot reuben sandwich object
		Sandwich reuben = new Sandwich("Reuben", Sandwich.Temperature.HOT);
		
		// instantiate a bread object with toasted rye, no seeds, no butter
		Bread rye = new Bread("rye", true, null, true);

		// instantiate bases for the corned beef and the swiss cheese
		Base cornedBeef = new Base("corned beef", Base.Temperature.HOT, Base.Preparation.SLICED);
		Base swiss = new Base("swiss cheese", Base.Temperature.COLD, Base.Preparation.SLICED);
		
		// instantiate the toppings for the sauerkraut and Russian dressing
		Topping sauerkraut = new Topping("sauerkraut", Topping.Temperature.HOT);
		Topping russianDressing = new Topping("Russian dressing", Topping.Temperature.COLD);
		
		// add the bread to the sandwich
		reuben.add(rye);
		
		// add the bases to the sandwich
		reuben.add(cornedBeef);
		reuben.add(swiss);

		// add the toppings to the sandwich
		reuben.add(sauerkraut);
		reuben.add(russianDressing);

		// we're ready to eat!

		// count how many bites we have to take to eat the whole thing
		int numBites = 0;
		
		// keep eating it until it's gone!
		while (!reuben.isEaten()) {
			
			// take a random bite size from 1 to 100
			int biteSize = (int) (Math.random() * 100) + 1;
			
			// take the bite
			reuben.takeBite(biteSize);
			
			numBites++;

		}
		
		// announce our successful eating of the reuben
		System.out.printf("Finished the delicious %s %s in %d bites!\n", reuben.getTemperature().toString().toLowerCase(), reuben.getName(), numBites);
		
	}

}
