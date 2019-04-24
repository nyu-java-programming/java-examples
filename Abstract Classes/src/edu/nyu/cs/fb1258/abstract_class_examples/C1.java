package edu.nyu.cs.fb1258.abstract_class_examples;

/**
 * An abstract class.  Notice it can have any type of data fields, any type of methods, including abstract methods.
 * Abstract classes, however, cannot be instantiated.
 * @author Foo Barstein
 *
 */
public abstract class C1 {

	/**
	 * Unlike interfaces, abstract classes can contain non-static, non-final instance properties
	 */
	public int x = 56;
	
	/**
	 * In fact, abstract classes can contain whatever type of properties you desire.
	 */
	public static final int FOO = 3;
	
	/**
	 * Abstract classes, unlike 'regular' classes, can contain abstract methods.
	 * Any non-abstract class inheriting from this abstract class must include an implementation of this abstract method.
	 */
	public abstract void doSomething();

	/**
	 * In fact, abstract classes can have whatever type of methods you desire.
	 */
	public static void doSomethingElse() {
		System.out.println("C1 doSomethingElse");
	}
	
	public void foo() {
		System.out.println("C1 foo");
	}
	
}
