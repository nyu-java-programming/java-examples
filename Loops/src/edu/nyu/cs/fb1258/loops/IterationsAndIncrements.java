package edu.nyu.cs.fb1258.loops;

/**
 * Counting iterations and showing off the behavior of the var++ operator.
 * @author Foo Barstein
 * @version 0.00012
 *
 */
public class IterationsAndIncrements {
	
	public static void main(String[] args) {
		
		// declare two variables
		int i = 1;
		int j = 1;
		
		// how many times does this loop iterate?  
		while (i < 10) {
			System.out.println("Iteration #" + j);
			
			// increment the value of j
			j++;
			
			// how many times does it print out the value of i?
			if ((i++ % 2) == 0) {
				
				// print out the value of i
				System.out.println("The value of i is: " + i);
				
			}
		} // while

	} // main method
	
} // class
