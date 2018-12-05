package edu.nyu.cs.fb1258.recursion_examples;

public class SimpleRecursion2 {
	
	public void doSomething(int invocationCounter) {
		invocationCounter++;
		
		System.out.printf("Doing something for the %dth time...\n", invocationCounter);
		
		if (invocationCounter < 10) {
			this.doSomething(invocationCounter); //recursion!!!
			this.doSomething(invocationCounter);
		}
	}
	
	public static void main(String[] args) {
		SimpleRecursion2 sr = new SimpleRecursion2();
		sr.doSomething(0);
	}

}
