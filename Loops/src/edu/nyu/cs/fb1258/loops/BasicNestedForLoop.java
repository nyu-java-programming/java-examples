package edu.nyu.cs.fb1258.loops;

/**
 * An example of a nested for loop, where the values in the two accumulators are multiplied and displayed.
 * @author Foo Barstein
 * @version 0.9
 */

public class BasicNestedForLoop {

	public static void main(String[] args) {
		
		// iterate through the values 0-9 inclusive
		for (int i=0; i<10; i++) {
			
			// nested for loop!
			// iterate through the values 0-? where ? is the current value of i-1
			// notice that when i=0 and j=0, the loop condition is false and it does not iterate
			for (int j=0; j<i; j++) {
				
				// calculate the product of the two values
				int product = i * j;
				
				// print out the product of i and j
				System.out.println(i + " * " + j + " = " + product);
			} // inner for
			
		} // outer for

	} // main method

} // class
