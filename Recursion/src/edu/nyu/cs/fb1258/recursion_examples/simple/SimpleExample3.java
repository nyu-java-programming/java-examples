package edu.nyu.cs.fb1258.recursion_examples.simple;

/**
 * A method calls itself recursively a finite number of times.
 * Note that the counter is a static property that is "global"-ish.
 * @author Foo Barstein
 * @version 2
 *
 */
public class SimpleExample3 {
	
	/**
	 * Note that this example differs from SimpleExampl1 in that this counter is a static property, rather than a local variable within the method.
	 */
	public static int counter = 0;
	
	/**
	 * A recursive method that recurses a finite number of times.
	 */
	public static void doSomething() {
		// increment the counter with every method invocation
		counter++;
		
		// show the value of the counter
		System.out.printf("Starting the method with counter=%d.\n", counter);

		// check whether we have reach the counter value 10
		if (counter < 10) {
			//System.out.println(counter);
			SimpleExample3.doSomething();
		}

		// the method invocation is about to complete... output the end message
		System.out.printf("Ending the method with counter=%d.\n", counter);
	}

	public static void main(String[] args) {
		// call the method for the first time
		SimpleExample3.doSomething();
	}

}
