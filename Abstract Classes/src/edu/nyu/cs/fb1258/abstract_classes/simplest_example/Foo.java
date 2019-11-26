package edu.nyu.cs.fb1258.abstract_classes.simplest_example;

public abstract class Foo implements Bar {
	
	// abstract classes allow public static final properties...
	public static final int X = 4;
	
	// but... abstract classes allow any properties to be created
	private int y = 10;
	
	public abstract void doSomething2();
	
	public void doSomething3() {
		System.out.println("doSomething3");
	}

}
