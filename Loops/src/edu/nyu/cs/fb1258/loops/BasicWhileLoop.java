package edu.nyu.cs.fb1258.loops;

/**
 * A while loop that displays some of the properties of 'break' and 'continue'.
 * @author Foo Barstein
 * @version 0.9
 */

public class BasicWhileLoop {

	public static void main(String[] args) {
		
		// a string!
		String name = "mary";
		
		// a counter (a.k.a. an accumulator)
		int i = 0;
	
		// while loops depend upon boolean conditions
		
		// this is an infinite loop... it will never stop iterating... maybe...
		while ( ("mary".equals(name) || 5 != 6) && 5 == 5 && true != false && !"bob".equals(name) ) {
			System.out.println("This will iterate over and over...");

			// increment the counter/accumulator
			i++; // same as i = i + 1 (a.k.a i += 1 in Python)
			
			// if the value of i divides evenly by 2, then we skip immediately to the next iteration
			if (i % 2 == 0) {
				continue; // immediately go on to the next iteration of this loop				
			}
			
			// we don't need to write 'else', since this break will only ever execute if the 'if' condition is false
			break; // brute force technique for exiting a loop immediately... don't use break unless you get permission from the instructor!
		}

	}

}
