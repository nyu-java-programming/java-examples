package edu.nyu.cs.fb1258.array_examples;

/**
 * This program creates an array and loops through the elements  in that array
 * @author Foo Barstein
 * @version 1.1
 */

public class LoopThroughArray {

	public static void main(String[] args) {

		//declare and populate an array
		String[] x = {
				"hello",
				"goodbye",
				"cheers",
				"howdy",
				"see ya"
		};
		
		//loop through all elements of the array with classic  for loop
		System.out.println("\nLooping through array with  classic for loop");
		for (int i=0; i< x.length; i++) {
			System.out.println(x[i]);
		}
		
		//the same thing in shorthand for loop syntax
		System.out.println("\nLooping through array with  shorthand for loop");
		for (String el : x) {
			System.out.println(el);
		}
		
		//loop through all elements of the array with while loop
		System.out.println("\nLooping through array with  classic while loop");
		int j = 0;
		while (j < x.length) {
			System.out.println(x[j]);
			j++;
		}
		

	}

}