// FirstClass, Second Class, and Third Class all exist within the same package
package edu.nyu.cs.fb1258.methods_examples;

// FourthClass lives in a different package and so must be explicitly imported.
import edu.nyu.cs.fb1258.different_set_of_method_examples.FourthClass;

/**
 * A class with all public static methods, including the main method. The main method invokes the various static methods in FirstClass, SecondClass, ThirdClass, and FourthClass
 * @author Foo Barstein
 * @version 0.5
 */
public class FirstClass {

	// this is not a global variable! this variable belongs to the class, FirstClass, because it is static
	static int x = 2;
	
	/**
	 * A method which accepts no arguments.  Adds two plus two and return the result.  Shows how to refer to static variables that belong to a class and local variables that belong only to a single method invocation.
	 * @return int value of 2 plus two (i.e. 4)
	 */
	public static int getTwoPlusTwo() {
		// a local variable x that exists only within this method invokation
		int x = 2;
		
		// this adds the static variable that belongs to the class to the local x variable that exists only within this method invocation (a.k.a. call)
		int z = FirstClass.x + x;
		return z;
	}
	
	/**
	 * An 'overloaded' method (i.e. a method with the same name as another method) which accepts one argument.  Adds two to whatever the argument is and return the result.  Shows how to refer to static variables that belong to a class and local parameter variables that belong only to a single method invocation.
	 * @param x an int value that gets added to 2 and returned
	 * @return int value of 2 plus the argument (i.e. 4 if the argument is 2)
	 */
	public static int getTwoPlusTwo(int x) {
		// add the static variable x to the method parameter x.
		int z = FirstClass.x + x;
		return z;
	}
	
	/**
	 * A method that accepts two arguments - the value of an int and the name of a class - and outputs those things.
	 * @param theNumber an integer to output
	 * @param className a class name to output
	 */
	public static void displayNumber(int theNumber, String className) {
		System.out.println("The value of two plus two according to " + className + " is " + theNumber);
	}
	
	/**
	 * This method is called automatically by the JVM...  it, in turn, calls static methods encapsulated within FirstClass, Second Class, ThirdClass, and FourthClass.
	 * @param args any command line arguments
	 */
	public static void main(String[] args) {

		//call FirstClass's getTwoPlusTwo method
		int f1 = FirstClass.getTwoPlusTwo();
		FirstClass.displayNumber(f1, "FirstClass");

		//call FirstClass's getTwoPlusTwo overloaded method
		int f2 = FirstClass.getTwoPlusTwo(2);
		FirstClass.displayNumber(f2, "FirstClass");

		// call SecondClass's getTwoPlusTwo method
		int f3 = SecondClass.getTwoPlusTwo();
		SecondClass.displayNumber(f3, "SecondClass");

		// call SecondClass's getTwoPlusTwo overloaded method
		int f4 = SecondClass.getTwoPlusTwo(2);
		SecondClass.displayNumber(f4, "SecondClass");
		
		// the methods within ThirdClass are mostly private and they exist within a different class than this class, so we can't call its private methods directly here
		// call ThirdClass's public delegator method... this in turn calls the private methods within ThirdClass on our behalf.
		ThirdClass.delegator();
		
		// the methods within FourthClass are mostly protected and it exists within a different package than this class, so we can't call its protected methods directly here
		// call ThirdClass's public delegator method... this in turn calls the protected methods within FourthClass on our behalf
		FourthClass.delegator();

	}

}
