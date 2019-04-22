package edu.nyu.cs.fb1258.interface_basics;

/**
 * An interface that inherits from another interface and adds an additional abstract method.
 * @author Foo Barstein
 * @version 1
 */
public interface Interface2 extends Interface1 {

	/**
	 * An abstract method unique to this interface.  All classes that implement this interface must include an implementation of this method.
	 */
	public abstract void thirdMethod();

}
