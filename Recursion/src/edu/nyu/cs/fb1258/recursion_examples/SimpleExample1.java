package edu.nyu.cs.fb1258.recursion_examples;

public class SimpleExample1 {
	
	public static void doSomething(int counter) {
		System.out.println("Starting the method for the " + counter + "th time");
		counter++;
		if (counter < 10) {
			//System.out.println(counter);
			SimpleExample1.doSomething(counter);
		}
		System.out.println("Ending the method for the " + counter + "th time");
	}

	public static void main(String[] args) {
		doSomething(0);
	}

}
