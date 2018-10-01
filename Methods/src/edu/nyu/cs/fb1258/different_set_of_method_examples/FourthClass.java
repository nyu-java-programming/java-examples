// note that this class lives within a different package from the other classes.
package edu.nyu.cs.fb1258.different_set_of_method_examples;

/**
 * A class with mostly protected variables and methods.  The only public method herein is called delegator.
 * @author Foo Barstein
 * @version 0.5
 *
 */
public class FourthClass {

	// this is not a global variable! this variable belongs to the class, FourthClass, because it is static
	protected static int x = 2;

	/**
	 * Add two plus two and return the result.  Shows how to refer to static variables that belong to a class and local variables that belong only to a single method invocation.
	 * @return
	 */
	protected static int getTwoPlusTwo() {
		// a local variable x that exists only within this method invokation
		int x = 2;
		
		// this adds the static variable that belongs to the class to the local x variable that exists only within this method invocation (a.k.a. call)
		int z = FourthClass.x + x;
		return z;
	}

	/**
	 * Add two plus two and return the result.  Shows how to refer to static variables that belong to a class and local parameter variables that belong only to a single method invocation.
	 * @param x an int value that gets added to 2 and returned
	 * @return int value of 2 plus the parameter (i.e. 4 if the argument is 2)
	 */
	protected static int getTwoPlusTwo(int x) {
		int z = FourthClass.x + x;
		return z;
	}
	
	/**
	 * Output the value of an int and the name of a class.
	 * @param theNumber an integer to output
	 * @param className a class name to output
	 */
	protected static void displayNumber(int theNumber, String className) {
		System.out.println("The value of two plus two according to " + className + " is " + theNumber);
	}
	
	/**
 	 * This public method calls a few protected methods within the FourthClass class which would otherwise be inaccessible to code outside of this package
	 */
	public static void delegator() {
		
		// call FourthClass's protected getTwoPlusTwo method
		int f1 = FourthClass.getTwoPlusTwo();
		FourthClass.displayNumber(f1, "FourthClass");

		// call FourthClass's protected getTwoPlusTwo method
		int f2 = FourthClass.getTwoPlusTwo(2);
		FourthClass.displayNumber(f2, "FourthClass");
	}
	
}
