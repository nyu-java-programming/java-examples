package edu.nyu.cs.fb1258.recursion_examples.integer_list;

/**
 * A class representing a list of integers.  Performs a linear search using recursion.  
 * @author Foo Barstein
 * @version 2
 *
 */
public class IntegerList {
	private int[] list; //values in the list
	
	/**
	 * Constructs a list of the given size.
	 * @param size The length of the list to create
	 */
	public IntegerList(int size) {
		this.list = new int[size];
	}
	
	/**
	 * Fills the list with integers between 1 - 100, inclusive.
	 */
	public void randomize() {
		for (int i=0; i<list.length; i++) {
			this.list[i] = (int) (Math.random() * 100) + 1;
		}
	}
	
	public void print() {
		for (int i=0; i<list.length; i++) {
			System.out.println(i + ":\t" + this.list[i]);
		}
	}
	
	/**
	 * Returns the index of the first occurrence of the target within the list **without using recursion**.  Returns -1 if target does not appear in the list.
	 * @param target The value to search for
	 * @return The index of the first occurrence of the target within the list.
	 */
	public int linearSearch(int target) {
		//linear search the 'old fashioned way' without recursion
		int location = -1;
		//iterate through all values and compare to target value
		for (int i=0; i<list.length && location == -1; i++) {
			if (list[i] == target) {
				location = i;
			}
		}
		//return index, if any, where the value resides
		return location;
	}
	
	/**
	 * A more user-friendly and abstract method that simply calls linearSearchR with the second parameter hard-coded.
	 * @param target The value to search for
	 * @return The index of the first occurrence of the target within the list.
	 */
	public int linearSearchRec(int target) {
		//call the linearSearchR method with the starting index hard-coded as 0
		return linearSearchR(target, 0);
	}
	
	/**
	 * Recursive implementation of the linear search.  Begins the search at index lo.  The algorithm works recursively as follows if you are looking for an item starting from index i:
	 * - if i exceeds the last index of the list, the item is not found (return -1)
	 * - if the item is at list[i], return i
	 * - if the item is not at list[i], do a linear search starting from index i+1
	 * @param target The value to search for
	 * @param lo The index of the position at which to start the search
	 * @return The index of the first occurrence of the target within the list
	 */
	public int linearSearchR(int target, int lo) {
		//do a recursive linear search of list from the starting index, lo
		
		int location;

		// if the index exceeds the last index of the list, the item is not found (return -1)
		if (lo > this.list.length - 1) {
			location = -1;
		}
		
		// if the item is at list[lo], return i
		else if (target == list[lo]) {
			location = lo;
		}

		// if the item is not at list[i], do a linear search starting from index i+1
		else {
			location = linearSearchR(target, lo + 1);
		}
		
		return location;
	}
	
	/**
	 * Sort the list in ascending order using the selection sort algorithm.
	 */
	public void selectionSort() {
		int minIndex;
		for (int i=0; i<list.length; i++) {
			//find the smallest element in the list starting at location i
			minIndex = i;
			for (int j = i+1; j<list.length; j++) {
				if (list[j] < list[minIndex]) {
					minIndex = j;
				}
			}
			
			//swap list[i] with smallest element
			int temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;			
			
		}
	}



}
