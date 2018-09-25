package edu.nyu.cs.fb1258.loops;

/**
 * A while loop that exhibits a common use of flags to control loops.
 * @author Foo Barstein
 * @version 0.9
 */

public class BasicWhileLoopSlightlyNicer {

	public static void main(String[] args) {
		
		// a string!
		String name = "mary";
		
		// a counter (a.k.a. an accumulator)
		int i = 0;
		
		// flag  (a.k.a. a sentinel)
		boolean keepGoing = true;
	
		// while loops depend upon boolean conditions
		
		// this is an infinite loop... it will never stop iterating... i think!
		while (keepGoing && ("mary".equals(name) || 5 != 6) && 5 == 5 && true != false && !"bob".equals(name) ) {
			System.out.println("This will iterate over and over...");

			// increment the counter/accumulator
			i++; // same as i = i + 1 (a.k.a i += 1)
			
			if (i % 2 == 0) {
				continue; // immediately go on to the next iteration of this loop				
			}
			
			// we don't need to write 'else', since this break will only ever execute if the 'if' condition is false
			// set the flag to false, such that the boolean condition that controls the loop will evaluate to overall false, thereby stopping the loop from iterating again
			keepGoing = false; // slightly nicer technique for exiting a loop immediately... don't use break unless you get permission from the instructor!
		}

	}

}
