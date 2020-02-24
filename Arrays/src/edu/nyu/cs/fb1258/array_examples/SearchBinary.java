package edu.nyu.cs.fb1258.array_examples;

import java.util.Arrays;

/**
 * An example of linear search through an array
 * @author Foo Barstein
 * @version 1
 *
 */
public class SearchBinary {
	/**
	 * Binary search algorithm... looks for a needle in a sorted haystack.
	 * @param needle The value we will search for
	 * @param haystack The array within which to search
	 * @return The position at which the needle occurs in the haystack; -1 if not present.
	 */
	public static int binarySearch(int needle, int[] haystack) {
		// binary search only works on sorted arrays	- sort low-to-high	
		Arrays.sort(haystack); 
		
		int pos = -1; // return -1 if we don't find it
		
		int low = 0; // the first index number in the array to start looking from
		int high = haystack.length - 1; // the last index number in the array to look up until
		
		// keep going until we have exhausted our options
		int i = 0; // we'll count iterations
		while (high >= low) {
			// calculate the index of the mid-point of the array
			int mid = (low + high) / 2;
			System.out.println(mid + ": " + Arrays.toString(haystack));
			
			if (needle < haystack[mid]) {
				// the value we are looking for is smaller than the value at the mid-point
				// next time we search, look only within the lower half
				high = mid - 1;
			}
			else if (needle == haystack[mid]) {
				// the value we are looking for is exactly the value at the mid-point
				pos = mid; //  the middle value is the needle! 
				break; // we're done!
			}
			else {
				// the value we are looking for is larger than the value at the mid-point
				// next time we search, look only within the upper half
				low = mid + 1;
			}
			i++; // just for illustrative purposes
		} // while
		
		System.out.println("Iterated " + (i+1) + " times...");
		
		return pos;
	}

	public static void main(String[] args) {
		// imagine you had an array of values...
		int[] myNums = {2, 20, 31, 1, 4, 88, 40914, 5};
		// find where the number 88 occurs in the array, if at all
		int pos = binarySearch(88, myNums);
		System.out.println("The value 88 occurs at index position " + pos);

	}

}
