package edu.nyu.cs.fb1258.inheritance;

public class TestAB {

	public static void main(String[] args) {
		
		A myA1 = new A();
		A myA2 = new A("Hello world!");
		B myB = new B("Goodbye, world!");

		myA1.doSomething();
		myA2.doSomething(true);
		myB.doSomething(true);
		myB.doSomething();
		
	}

}
