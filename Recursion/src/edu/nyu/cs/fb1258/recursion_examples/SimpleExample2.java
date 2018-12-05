package edu.nyu.cs.fb1258.recursion_examples;

public class SimpleExample2 {
	
	public static int counter = 0;
	
	public static void doSomething() {
		System.out.println("Starting the method for the " + counter + "th time");
		counter++;
		if (counter < 10) {
			//System.out.println(counter);
			SimpleExample2.doSomething();
		}
		System.out.println("Ending the method for the " + counter + "th time");
	}

	public static void main(String[] args) {
		SimpleExample2.doSomething();
	}

}
