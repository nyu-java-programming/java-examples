package edu.nyu.cs.fb1258.array_examples;

/**
 * Example of creating and sorting an array the hard way... adapted from an example in Introduction to Java by Y. Daniel Liang
 * @author Foo Barstein
 * @version 99.1
 *
 */

public class SortHardWay {

	public static void main(String[] args) {
		
		//CREATE AN ARRAY THE HARD WAY
		int[] foo; //declare
		foo = new int[6]; //initialize
		//assign values
		foo[0] = 9; 
		foo[1] = 2;
		foo[2] = 1;
		foo[3] = 20;
		foo[4] = 3;
		foo[5] = 199;

		//SORT AN ARRAY THE HARD WAY
		for (int i=0; i<foo.length; i++) { //loop through the array
			int currentMin = foo[i]; //assume the current element is the smallest value in the array
			int currentMinIndex = i; //keep track of the index of the smallest value
			
			//look at all the remaining elements in the list and compare them to the current one
			for (int j=i+1; j<foo.length; j++) {
				//if smaller than our previous smallest, swap their positions
				if (foo[j] < currentMin) {
					currentMin = foo[j]; //update to hold the new smallest value
					currentMinIndex = j; //update to hold the index of the new smallest value
				}
			}
			
			//if a new smaller number has been found, swap the position of the old smallest with the new smallest
			if (currentMinIndex != i) {
				foo[currentMinIndex] = foo[i];
				foo[i] = currentMin;
			}
			
		}
		
		//LOOP THROUGH AN ARRAY THE HARD WAY
		System.out.println("Foo contains:");
		for (int i=0; i<foo.length; i++) {
			System.out.println(foo[i]);
		}

	}

}