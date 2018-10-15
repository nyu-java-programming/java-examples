package edu.nyu.cs.fb1258.array_examples;

/**
 * A review of what we know about arrays so far.
 * 
 * @author Foo Barstein
 * @version 1.0
 *
 */

public class ArraysRecap {
	
	public static void referenceTypeVersusValueType() {
		int x = 5; //value type... variable stores the actual value
		int[] y = {1,2,3}; //reference type... variable stores the memory address where the array is actually stored
	}
	
	public static void arraysRecap() {
		int[] x;
		x = new int[2];
		x[0] = 1;
		x[1] = 2462;
		//...
		
		int[] z = new int[2];
		z[0] = 1;
		z[1] = 2462;
		
		int[] y = {1, 2462}; //...
		
	}
	public static void triangleArrayExample() {
		
		int[][] x = {
				{31, 	252, 	6},
				{41245, 5},
				{525}
		};
	}
	
	
	public static void twoDimArrayExample() {
		int[][] x;
		
		x = new int[3][2];
		x[0][1] = 5;
		x[2][0] = 34243;
		
		int[][] y = { 
				{5, 		1, 		425}, 
				{52, 	2525, 	2525}, 
				{6, 		42, 		9852389}
		};
		
		y[1][1] = 6;
		
	}
	
	public static void giveMeATwoDimensionalArray(int[][] x) {
		//change one of the values in the array
		x[0][2] = 6;
	}
	
	public static void giveMeAOneDimensionalArray(int[] x) {
		//change one of the values in the array
		x[0] = 6;
	}

	public static void main(String[] args) {
		
		//call method and pass a one-dim array
		int[] y = {1,2,3};
		giveMeAOneDimensionalArray(y);
		System.out.println(y[0]);
		
		//call method and pass a two-dim array
		int[][] x = { {1,2,3}, {3,4,5} };
		giveMeATwoDimensionalArray(x);
		System.out.println(x[0][2]);

	}

}
