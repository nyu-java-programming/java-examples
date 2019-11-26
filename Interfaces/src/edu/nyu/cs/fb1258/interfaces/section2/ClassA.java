package edu.nyu.cs.fb1258.interfaces.section2;

public class ClassA implements InterfaceA {
	
	// concrete implementation of one of the abstract methods
	public void foo() {
		System.out.println("foo");
	}

	public int bar(int x) {
		System.out.println(x);
		return x + 10;
	}

}
