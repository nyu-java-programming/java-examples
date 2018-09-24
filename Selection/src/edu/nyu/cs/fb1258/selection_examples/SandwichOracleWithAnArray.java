package edu.nyu.cs.fb1258.selection_examples;

// import the Random class from the Java API
import java.util.Random;

/**
 * Should I make another sandwich or not?!  Now with arrays!
 * @author Foo Barstein
 * @version 0.1
*/

public class SandwichOracleWithAnArray {

	public static void main(String[] args) {

		// an array of the possible messages we would like to output
		// this makes managing the sandwich options easier
		String[] foodMessages = {
			"Grilled cheese!",
			"Indulge in a meatball sub!",
			"Call it a cheese steak!",
			"Smoosh peanut butter and jelly on two slices of Wonder bread!"
		};

		//create an instance of the Random type
		Random r = new Random();

		// generate a pseudorandom int between 0-1, inclusive
		int decision = r.nextInt(2);
		
		// output a welcome message
		System.out.println("*** The SANDWICH ORACLE welcomes you! ***");
		System.out.println("Unsure whether to eat another sandwich? \n");
		System.out.println("Heed these words I say:\n");

		// print out the number
		//System.out.println("And... the number is: " + decision);

		if (decision == 0) {
			// if the value of decision is 0..
			System.out.println("Sorry, no more sandwiches for you!");
		}
		else {
			// otherwise, if the value of decision is not 0..
			System.out.println("Have another sandwich.");

			// generate another random int between 0 and 3
			int sandwichType = new Random().nextInt(4);

			// output the appropriate message
			// notice that because we're using an array with built-in indices, we don't need a nested if/els if/else statement here
			System.out.println(foodMessages[sandwichType]);


		}

	}

}



