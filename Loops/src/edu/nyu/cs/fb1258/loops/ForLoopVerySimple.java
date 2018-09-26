package edu.nyu.cs.fb1258.loops;

/**
 * An analysis of the mechanics of the construct known to most as 'for loops'.
 * 
 * @author Foo Barstein
 * @version 9.9
 */
public class ForLoopVerySimple {

	public static void main(String[] args) {

		// a loop that iterates 10 times
		// note that a for loop in java is exactly equivalent to a classic while loop controlled by a counter
		for (int i = 0; i < 10; i++) {
			// display the iteration to the user
			System.out.println("Iterating for the " + i + "th time");
		}
		

	}

}
