package edu.nyu.cs.fb1258.interface_basics;

/**
 * A simple interface with a bit of everything: a static constant and a static method, two abstract methods, and one default method.
 * @author Foo Barstein
 * @version 1
 */
public interface Interface1 {
	
	/*
	 * Interfaces can have static constants
	 */
	public static final double pi = 3.141596265;
	
	/**
	 * An abstract method... the implementation of this method is left up to the class that implements it.
	 */
	public abstract void firstMethod();
	
	/**
	 * An abstract method... the implementation of this method is left up to the class that implements it.
	 */
	public abstract void secondMethod();
	
	/**
	 * Interfaces can have static methods
	 */
	public static void doSomething() {
		System.out.println("Interface1 doSomething");
	}
	
	/**
	 * A default method... meaning a method in an interface that does contain an implementation.
	 */
	public default void doSomethingElse() {
		System.out.println("Interface1 doSomethingElse");
	}
	
}
