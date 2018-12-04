package edu.nyu.cs.fb1258.exception_examples.basics;

/**
 * Intentionally triggers a Stack Overflow error.  Errors are different from Exceptions in that they are a result of circumstances out of the control of the program.
 * @author Foo Barstein
 * @version 2
 *
 */
public class StackOverflowExample {
	
	// how many times we have called methods
	private int methodInvocationCounter = 0;
	
	/**
	 * Calling this method (and any other method) places a new memory frame for this method invocation on the method call stack.
	 * This method calls the pong() method, which calls the ping() method, which calls the pong() method, which calls the ping() method, and so on until there are too many frames on the stack...
	 */
	public void ping() {
		this.methodInvocationCounter++; // increment the counter
		System.out.println("Ping! Method invocation #" + this.methodInvocationCounter);
		this.pong();
		System.out.println("Ending ping...");
	}
	
	/**
	 * Calling this method (and any other method) places a new memory frame for this method invocation on the method call stack.
	 * This method calls the ping() method, which calls the pong() method, which calls the ping() method, which calls the pong() method, and so on until there are too many frames on the stack...
	 */
	public void pong() {
		this.methodInvocationCounter++; // increment the counter
		System.out.println("Pong! Method invocation #" + this.methodInvocationCounter);
		this.ping();
		System.out.println("Ending pong...");
	}

	public static void main(String[] args) {
		StackOverflowExample so = new StackOverflowExample();
		so.ping(); // start the ping pong game until a Stack Overflow error occurs
	}

}
