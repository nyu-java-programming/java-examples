package edu.nyu.cs.fb1258.recursion.fibonacci;

public class TestFibonacci {

	public static void main(String[] args) {
		
		// get a few numbers from the Fibonacci Sequence
		for (int i=1; i<12; i++) {
			int num = Fibonacci.fibonacci(i); // get the number
			System.out.println( num ); // print it out
		}

	}

}
