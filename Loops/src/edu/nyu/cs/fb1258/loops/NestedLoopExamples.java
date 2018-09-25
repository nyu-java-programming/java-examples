package edu.nyu.cs.fb1258.loops;

/**
 * This program shows various permutations of nested loops, all using accumulators for simplicity.
 * @author Foo Barstein
 * @version 0.00012
 *
 */

public class NestedLoopExamples {

	/**
	 * A for loop nested within another for loop.
	 */
	public static void nestedForLoops() {
		
		// print a nice welcome message
		System.out.println("\nNested for loops:\n");
		
		// loop 5 times for the i values 1 thru 5
		for (int i=1; i<=5; i++) {
			
			// output the value of i
			System.out.println("i is " + i);
			
			// loop 5 times for the j values 1 thru 5
			for (int j=1; j<=5; j++) {
				
				//output the value of j
				System.out.println("\tj is " + j); 
				
			}
		}
	}
	
	/**
	 * A while loop nested within another while loop.
	 */
	public static void nestedWhileLoops() {
		System.out.println("\nNested while loops:\n");
		int i = 1;
		while (i<=5) {
			System.out.println("i is " + i); //output the value of i
			int j = 1;
			while (j<=5) {
				System.out.println("\tj is " + j); //output the value of j
				j++; //increment j
			}
			i++; //increment i
		}
	}

	/**
	 * A while loop nested within a for loop
	 */
	public static void aWhileLoopNestedWithinAForLoop() {
		System.out.println("\nWhile loop nested within a for loop:\n");
		for (int i=1; i<=5; i++) {
			System.out.println("i is " + i); //output the value of i
			int j = 1;
			while (j<=5) {
				System.out.println("\tj is " + j); //output the value of j
				j++; //increment j
			}
		}
	}

	/**
	 * A for loop nested within a while loop
	 */
	public static void aForLoopNestedWithinAWhileLoop() {
		System.out.println("\nFor loop nested within a while loop:\n");
		int i = 1;
		while (i<=5) {
			System.out.println("i is " + i); //output the value of i
			for (int j=1; j<=5; j++) {
				System.out.println("\tj is " + j); //output the value of j
			}
			i++; //increment i
		}
	}
	public static void main(String[] args) {
		//output what this is all about
		System.out.println("This program shows the output of nested loops of various kinds.");
		
		//call each method ...
		nestedForLoops();
		nestedWhileLoops();
		aWhileLoopNestedWithinAForLoop();
		aForLoopNestedWithinAWhileLoop();
	}

}
