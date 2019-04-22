package edu.nyu.cs.fb1258.interface_basics;

/**
 * A class that implements two interfaces, and contains implementations of all abstract methods declared within those interfaces.
 * This class also inherits any default methods in either interface.
 * @author Foo Barstein
 * @version 1
 */
public class Class1 implements Interface2, Interface3 {
	
	/**
	 * Implementation of an abstract method declared in Interface1, which is inherited by Interface2
	 */
	public void firstMethod() {
		System.out.println("Class1 firstMethod");
	}
	
	/**
	 * Implementation of an abstract method declared in Interface1, which is inherited by Interface2
	 */
	public void secondMethod() {
		System.out.println("Class1 secondMethod");
	}
	
	/**
	 * Implementation of an abstract method declared in Interface2
	 */
	public void thirdMethod() {
		System.out.println("Class1 thirdMethod");
	}
	
	/**
	 * Implementation of an abstract method declared in Interface3
	 */
	public void fourthMethod() {
		System.out.println("Class1 fourthMethod");
	}
	
	/**
	 * Overriden version of default method inherited from Interface1 via Interface2
	 */
	public void doSomethingElse() {
		System.out.println("Class1's overriden doSomethingElse");
	}

}
