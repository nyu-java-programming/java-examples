package edu.nyu.cs.fb1258.array_examples;

import java.util.Arrays;

/**
 * Example of creating and sorting an array the easy way
 * @author Foo Barstein
 * @version 99.1
 *
 */

public class SortLazyWay {

	public static void main(String[] args) {

		//CREATE AN ARRAY THE EASY WAY
		int[] bar = {9,2,1,20,3,199}; //declare, initialize and assign array using shorthand

		//SORT ARRAY THE EASY WAY
		Arrays.sort(bar); //use the Java API.
		
		//LOOP THROUGH AN ARRAY THE EASY WAY
		System.out.println("\nBar contains:");
		for (int val : bar) {
			System.out.println(val);
		}
		
	}

}