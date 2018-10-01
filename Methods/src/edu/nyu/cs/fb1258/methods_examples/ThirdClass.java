package edu.nyu.cs.fb1258.methods_examples;

public class ThirdClass {

	// this is not a global variable! this variable belongs to the class, ThirdClass, because it is static
	private static int x = 2;
	
	/**
	 * A method which accepts no arguments.  Adds two plus two and return the result.  Shows how to refer to static variables that belong to a class and local variables that belong only to a single method invocation.
	 * Because this method is private, it can only be invoked (i.e. 'called') from code within the same class file.
	 * @return int value of 2 plus two (i.e. 4)
	 */
	private static int getTwoPlusTwo() {
		// a local variable x that exists only within this method invokation
		int x = 2;
		
		// this adds the static variable that belongs to the class to the local x variable that exists only within this method invocation (a.k.a. call)
		int z = ThirdClass.x + x;
		return z;
	}
	
	/**
	 * An 'overloaded' method (i.e. a method with the same name as another method) which accepts one argument.  Adds two to whatever the argument is and return the result.  Shows how to refer to static variables that belong to a class and local parameter variables that belong only to a single method invocation.
	 * Because this method is private, it can only be invoked (i.e. 'called') from code within the same class file.
	 * @param x an int value that gets added to 2 and returned
	 * @return int value of 2 plus the argument (i.e. 4 if the argument is 2)
	 */
	private static int getTwoPlusTwo(int x) {
		// add the static variable x to the method parameter x.
		int z = ThirdClass.x + x;
		return z;
	}
	
	/**
	 * A method that accepts two arguments - the value of an int and the name of a class - and outputs those things.
	 * Because this method is private, it can only be invoked (i.e. 'called') from code within the same class file.
	 * @param theNumber an integer to output
	 * @param className a class name to output
	 */
	private static void displayNumber(int theNumber, String className) {
		System.out.println("The value of two plus two according to " + className + " is " + theNumber);
	}
	
	
	/**
 	 * This public method calls a few private methods within the ThirdClass class which would otherwise be inaccessible to code outside of this class
	 */
	public static void delegator() {
		
		// call ThirdClass's private getTwoPlusTwo method
		int f1 = ThirdClass.getTwoPlusTwo();
		ThirdClass.displayNumber(f1, "ThirdClass");

		// call ThirdClass's private getTwoPlusTwo method
		int f2 = ThirdClass.getTwoPlusTwo(2);
		ThirdClass.displayNumber(f2, "ThirdClass");

	}
	
	
}
