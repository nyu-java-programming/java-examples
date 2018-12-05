package edu.nyu.cs.fb1258.recursion_examples;

public class SimpleExample3 {
	
	public static void doSomething(int counter) {
		System.out.println("Starting the method for the " + counter + "th time");
		counter++;
		if (counter < 10) {
			//System.out.println(counter);
			SimpleExample3.doSomething(counter);
			SimpleExample3.doSomething(counter);
		}
		System.out.println("Ending the method for the " + counter + "th time");
	}

	public static void main(String[] args) {
		SimpleExample3.doSomething(0);
	}

}
