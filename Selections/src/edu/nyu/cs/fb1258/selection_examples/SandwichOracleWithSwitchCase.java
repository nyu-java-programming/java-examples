package edu.nyu.cs.fb1258.selection_examples;

// import the Random class from the Java API
import java.util.Random;

/**
 * Should I make another sandwich or not?!  Decision-making with switch/case.
 * @author Foo Barstein
 * @version 0.1
*/

public class SandwichOracleWithSwitchCase {

	public static void main(String[] args) {

		//create an instance of the Random type
		Random r = new Random();

		// generate a pseudorandom int between 0-1, inclusive
		int decision = r.nextInt(2);
		
		// output a welcome message
		System.out.println("*** The SANDWICH ORACLE welcomes you! ***");
		System.out.println("Unsure whether to eat another sandwich? \n");
		System.out.println("Heed these words I say:\n");

		// print out the number
		// System.out.println("And... the number is: " + decision);

		// use switch/case to handle the decision-making
		switch (decision) {
			case 0:
				// if the value of decision is 0..
				System.out.println("Sorry, no more sandwiches for you!");
				break;
			default:
				// otherwise, if the value of decision is not 0..
				//System.out.println("Have another sandwich.");

				// generate another random int between 1 and 4
				int sandwichType = r.nextInt(4) + 1;

				// output the appropriate message
				// why not use another switch/case?
				switch (sandwichType) {
					case 1:
						System.out.println("Grilled cheese!");
						break;
					case 2:
						//replace with 'hoagie', 'hero', etc... if you desire
						System.out.println("Indulge in a meatball sub!");
						break;
					case 3:
						System.out.println("Call it a cheese steak!");
						break;
					default:
						// it must be a 4!
						System.out.println("Smoosh peanut butter and jelly on two slices of Wonder bread!");
						break;
				} // nested switch
				
		} //switch

	} // main method

} // class



