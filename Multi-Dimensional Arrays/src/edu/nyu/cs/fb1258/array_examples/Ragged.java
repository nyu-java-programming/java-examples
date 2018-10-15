package edu.nyu.cs.fb1258.array_examples;

/**
 * Example of creating a ragged array: a multidimensional array with rows of varying lengths
 * @author Foo Barstein
 * @version 0.6
 *
 */

public class Ragged {

	public static void main(String[] args) {
		
		//create ragged array the easy way... using shorthand notation to allocate and assign all sub-arrays at once... 
		int[][] foo = {
				{0,1,2,3},
				{4,5,6,7},
				{8,9}
		};
		
		// create a ragged array the hard way... allocate and assign each sub-array separately
		int[][] bar = new int[3][];
		bar[0] = new int[4];
		bar[0][0] = 0;
		bar[0][1] = 1;
		bar[0][2] = 2;
		bar[0][3] = 3;
		bar[1] = new int[4];
		bar[1][0] = 4;
		bar[1][1] = 5;
		bar[1][2] = 6;
		bar[1][3] = 7;
		bar[2] = new int[2];
		bar[2][0] = 8;
		bar[2][1] = 9;

		
		
        //loop through each sub-array the hard way and output every element
        for (int i=0; i<foo.length; i++) {
            for (int j=0; j<foo[i].length; j++) {
                int val = foo[i][j];
                System.out.println(val);
            }
        }

        //loop through each sub-array the easy way and output every element
        for (int[] subArray : bar) {
            for (int val : subArray) {
                System.out.println(val);
            }
        }

	}

}