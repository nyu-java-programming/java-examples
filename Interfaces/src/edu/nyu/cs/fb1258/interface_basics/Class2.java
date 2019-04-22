package edu.nyu.cs.fb1258.interface_basics;

/**
 * A class that implements one interfaces, and contains implementations of any abstract methods declared within that interface.
 * This class also inherits any default methods in the interface.
 * @author Foo Barstein
 * @version 1
 */
public class Class2 implements Interface2 {

	/**
	 * Implementation of an abstract method declared in Interface1, which is inherited by Interface2
	 */
	public void firstMethod() {
		System.out.println("Class2 firstMethod");
	}
	
	/**
	 * Implementation of an abstract method declared in Interface1, which is inherited by Interface2
	 */
	public void secondMethod() {
		System.out.println("Class2 secondMethod");
	}
	
	/**
	 * Implementation of an abstract method declared in Interface2
	 */
	public void thirdMethod() {
		System.out.println("Class2 thirdMethod");
	}

}
