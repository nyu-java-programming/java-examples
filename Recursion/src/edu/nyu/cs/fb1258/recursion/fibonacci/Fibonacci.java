package edu.nyu.cs.fb1258.recursion.fibonacci;

/**
 * An implementation of the classic Fibonacci Sequence algorithm
 * @author Foo Barstein
 * @version 1.0
 *
 */
public class Fibonacci {
	
	/**
	 * Return the number at a given position in the Fibonacci Sequence
	 * @param n The position in the sequence.
	 * @return The number at the given position.
	 */
	public static int fibonacci(int n) {
		// the base cases... no need for recursion
		if (n == 1) return 0;
		if (n == 2) return 1;
		
		// the recursive case
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
}
