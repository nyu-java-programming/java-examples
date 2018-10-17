package edu.nyu.cs.fb1258.array_examples;

import java.util.Arrays;

/**
 * A simple example of the behavior of reference types when passed as arguments to methods.
 * 
 * @author Foo Barstein
 * @version 1.0
 *
 */

public class ReferenceTypeBehavior {
	
	/**
	 * Modify one of the values in a one-dimensional array
	 * @param x a reference to the address in memory of the one-dimensional array we'd like to modify
	 */
	public static void modifyOneDimensionalArray(int[] x) {
		// change one of the values in the array
		x[0] = 9999;
	}

	/**
	 * Modify one of the values in a two-dimensional array
	 * @param x a reference to the address in memory of the two-dimensional array we'd like to modify
	 */
	public static void modifyTwoDimensionalArray(int[][] x) {
		//change one of the values in the array
		x[0][2] = 9999;
	}
	
	public static void main(String[] args) {
		// here we show that passing an array as an argument to a method allows that method to change the array in this scope
		// this is because what we pass to the methods is a reference to the array in memory to modify

		// a one-dimensional array...
		int[] x = {1,2,3}; // a single-dimensional array

		//call method and pass a one-dim array... arrays are reference types
		System.out.printf("The original 1-dimensional array values: %s\n", Arrays.toString(x));
		// modify one of the values in this array
		modifyOneDimensionalArray(x); // the argument here is the reference (memory address) of the array, not the values of the array
		System.out.printf("The modified 1-dimensional array values: %s\n", Arrays.toString(x));
		
		// a two-dimensional array...
		int[][] y = { {1,2,3}, {4,5,6} }; // a two-dimensional array

		//call method and pass a two-dim array... arrays are reference types
		System.out.printf("\nThe original 2-dimensional array values: %s\n", Arrays.deepToString(y)); // note the use of deepToString() to get a string showing the multi-dimensional array values
		// modify one of the values in this array
		modifyTwoDimensionalArray(y); // the argument here is the reference (memory address) of the array, not the values of the array
		System.out.printf("The modified 2-dimensional array values: %s\n", Arrays.deepToString(y));

	}

}
