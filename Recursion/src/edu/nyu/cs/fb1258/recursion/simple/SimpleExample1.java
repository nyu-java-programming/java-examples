package edu.nyu.cs.fb1258.recursion.simple;

/**
 * A method calls itself recursively a finite number of times.
 * Notice that none of the method invocations complete until the very last method invocation is finished, after which all the previous invocations on the method call stack close in reverse order.
 * @author Foo Barstein
 * @version 2
 *
 */
public class SimpleExample1 {
	
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
			// if not yet at 10...
			// call the method itself recursively
			SimpleExample1.doSomething(counter);
		}
		
		// the method invocation is about to complete... output the end message
		System.out.printf("Ending the method with counter=%d.\n", counter);
	}

	public static void main(String[] args) {
		// call the method for the first time
		SimpleExample1.doSomething(0);
	}

}
