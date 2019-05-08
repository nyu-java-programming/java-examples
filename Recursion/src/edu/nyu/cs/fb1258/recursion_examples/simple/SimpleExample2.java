package edu.nyu.cs.fb1258.recursion_examples.simple;

/**
 * A method calls itself recursively a finite number of times.
 * Note that this example is different from SimpleExample1 in that each invocation of the doSomething() method triggers 2 more recursive invocations of that method.
 * @author Foo Barstein
 * @version 2
 *
 */
public class SimpleExample2 {
	
	/**
	 * A recursive method that recurses a finite number of times.
	 * @param counter The previous number of invocations of this method
	 */
	public static void doSomething(int counter) {
		// increment the counter with every method invocation
		counter++;

		// show the value of counter
		System.out.printf("Starting the method with counter=%d.\n", counter);
		
		// check whether we have reach the counter value 10
		if (counter < 3) {
			// this method calls itself twice recursively with every one invocation
			SimpleExample2.doSomething(counter);
			SimpleExample2.doSomething(counter);
		}

		// the method invocation is about to complete... output the end message
		System.out.printf("Ending the method with counter=%d.\n", counter);

	}

	public static void main(String[] args) {
		// call the method for the first time
		SimpleExample2.doSomething(0);
	}

}
