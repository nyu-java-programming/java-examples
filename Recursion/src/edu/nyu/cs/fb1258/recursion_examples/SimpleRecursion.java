package edu.nyu.cs.fb1258.recursion_examples;

public class SimpleRecursion {

	private int invocationCounter = 0;
	
	public void doSomething() {
		this.invocationCounter++;
		
		System.out.printf("Doing something for the %dth time...\n", this.invocationCounter);
		
		if (this.invocationCounter < 10) {
			this.doSomething(); //recursion!!!
			this.doSomething();
		}
	}
	
	public static void main(String[] args) {
		SimpleRecursion sr = new SimpleRecursion();
		sr.doSomething();
	}

}
