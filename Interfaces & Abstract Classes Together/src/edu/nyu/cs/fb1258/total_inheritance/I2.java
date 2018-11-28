package edu.nyu.cs.fb1258.total_inheritance;

/**
 * An interface that extends the interface I1.
 * @author Foo Barstein
 * @version 2
 *
 */
public interface I2 extends I1 {

	/*
	 * This interface inherits the following from I1:
	 *     pubic abstract void method1()
	 *     pubic abstract void method2()
	 *     pubic default void method3()
	 */
	
	/**
	 * An override of the method2() inherited from I1 for no good reason except to show that that we can do this.
	 */
	public abstract void method2();
		
	/**
	 * An additional abstract method not related to any methods in I1.
	 */
	public abstract void method4();
	
}
