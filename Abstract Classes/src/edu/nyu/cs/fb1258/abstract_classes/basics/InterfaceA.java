package edu.nyu.cs.fb1258.abstract_classes.basics;

public interface InterfaceA {
	public static final int d = 70;
	
	public abstract void doSomething2();
	public abstract void doSomething3();
	
	public static void doSomething4() {
		System.out.println("doSomething4");
	}
	
	public default void doSomething5() {
		System.out.println("doSomething5");
	}

}

