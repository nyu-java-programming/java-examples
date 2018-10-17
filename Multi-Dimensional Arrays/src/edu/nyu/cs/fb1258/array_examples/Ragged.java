package edu.nyu.cs.fb1258.array_examples;

/**
 * Example of creating a ragged array: a multidimensional array with rows of varying lengths.  The arrays in this example are nonsense data so the focus is simply on syntax.
 * @author Foo Barstein
 * @version 0.6
 *
 */

public class Ragged {

	public static void main(String[] args) {
		
		//create ragged array the easy way... using shorthand notation to allocate and assign all sub-arrays at once... 
		int[][] foo = {
				{0, 1, 2, 3}, 	// first sub-array
				{4, 5, 6, 7}, 	// second sub-array
				{8, 9}			// third sub-array
		};
		
		// create a ragged array the hard way... allocate and assign each sub-array separately
		
		// declare and allocate memory for the two-dimensional array
		int[][] bar = new int[3][];
		
		// declare, allocate, and populate the first sub-array
		bar[0] = new int[4];
		bar[0][0] = 0;
		bar[0][1] = 1;
		bar[0][2] = 2;
		bar[0][3] = 3;
		
		// declare, allocate, and populate the second sub-array
		bar[1] = new int[4];
		bar[1][0] = 4;
		bar[1][1] = 5;
		bar[1][2] = 6;
		bar[1][3] = 7;
		
		// declare, allocate, and populate the third sub-array
		bar[2] = new int[2];
		bar[2][0] = 8;
		bar[2][1] = 9;

		
        //loop through each sub-array the hard way and output every element
        System.out.println("Looping through the array in 'for loop' style:");
        for (int i=0; i<foo.length; i++) {
            for (int j=0; j<foo[i].length; j++) {
                int val = foo[i][j];
                System.out.printf("%5sThe value at array index [%d][%d] is $d\n", "", i, j, val);
            }
        }

        //loop through each sub-array the easy 'syntactic sugar' way and output every element
        System.out.println("\nLooping through the array in 'foreach loop' style:");
        for (int[] subArray : bar) {
            for (int val : subArray) {
                System.out.printf("%5sThe current value in the array is %d\n", "", val);
            }
        }

	}

}