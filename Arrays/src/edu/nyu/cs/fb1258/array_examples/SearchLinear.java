package edu.nyu.cs.fb1258.array_examples;

import java.util.Arrays;

/**
 * An example of linear search through an array
 * @author Foo Barstein
 * @version 1
 *
 */
public class SearchLinear {
	/**
	 * Linear search algorithm... looks for a needle in a haystack.
	 * @param needle The value we will search for
	 * @param haystack The array within which to search
	 * @return The position at which the needle occurs in the haystack; -1 if not present.
	 */
	public static int linearSearch(int needle, int[] haystack) {
		int pos = -1; // return -1 if we don't find it
		
		// go linearly through every element in the array
		int i = 0; // we'll count iterations...
		for (i=0; i<haystack.length; i++) {
			// if we find the needle, return its position
			if (haystack[i] == needle) {
				pos = i; // remember this position!
				break; // quit the loop... we're done
			}
		}
		System.out.println("Iterated " + (i+1) + " times...");
		return pos;
	}

	public static void main(String[] args) {
		// imagine you had an array of values...
		int[] myNums = {2, 20, 31, 1, 4, 88, 40914, 5};
		// find where the number 88 occurs in the array, if at all
		int pos = linearSearch(88, myNums);
		System.out.println("The value 88 occurs at index position " + pos);

	}

}
