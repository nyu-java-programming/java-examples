package edu.nyu.cs.fb1258.exception_examples;

/**
 * Example of a stack overflow error.  Errors are different from exceptions in that they are a result of circumstances out of the control of the program.
 * @author Foo Barstein.
 * @version 2
 *
 */
public class StackOverflow {
	
	static int counter = 0;
	
	//method that calls itself
	public static void method1() {
		StackOverflow.counter++;
		System.out.println("starting method 1 iteration " + counter);
		method1(); //recursion!
		System.out.println("ending method 1");
	}

	public static void main(String[] args) {
		System.out.println("starting main method");
		method1(); //call method1 for the first time
		System.out.println("ending main method");
	}
}
