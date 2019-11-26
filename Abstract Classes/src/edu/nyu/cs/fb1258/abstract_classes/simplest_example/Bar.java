package edu.nyu.cs.fb1258.abstract_classes.simplest_example;

public interface Bar {
	
	// interfaces are restricted to only public final static properties
	public final static int X = 4;

	// interfaces allow abstract methods
	public abstract void doSomething1();
	
	// interfaces allow default methods for a very particular use-case
	public default void doSomething4() {
		System.out.println("doSomething4");
	}
	
}
