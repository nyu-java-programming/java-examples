package edu.nyu.cs.fb1258.array_examples;

/**
 * Example of two different ways of creating arrays in Java

 * @author Foo Barstein
 * @version 1.9
 */

public class BasicCreation {

	public static void main(String[] args) {

		//example how to create an array
		int[] x; //declaration of variable
		x = new int[5]; //allocation of memory
		
		//populating the array... defining the array elements
		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		x[3] = 100;
		x[4] = 200;
		
		//the same thing in shorthand syntax
		int[] z = {
				100,
				200,
				300,
				100,
				200
		};
		

	}

}