package edu.nyu.cs.fb1258.string_examples.counting_occurrences;

/**
 * Counts occurrences of a String within another String
 * @author Foo Barstein
 * @version 2
 *
 */
public class OccurrenceCounter {
	
	/**
	 * Determines how many times a particular needle occurs within a given haystack.
	 * @param needle a String to search for
	 * @param haystack a String within which to search for the needle
	 * @return the number of occurrences of the needle within the haystack
	 */
	public static int numberOfOccurrences(String  needle, String haystack) {
		// start out having found no occurrences of the needle within the haystack
		int occurrences = 0;
		
		//start searching for the need starting from the character at position 0 in the haystack
		int position = haystack.indexOf(needle,  0);  // indexOf() returns -1 if the needle is not found within the haystack
		
		//keep looking for another occurrence as long as we have found one previously
		while (position >= 0) {
			occurrences++; // if indexOf() did not return -1, we have a new occurrence

			// output where we found it
			System.out.println("Found the word  at position " + position);
			
			// find the next occurrence of the needle by searching again within the haystack starting from one character later in the String from where we previously found it
			position = haystack.indexOf(needle, position + 1);
		}
		
		// return the counter of occurrences
		return occurrences;
	}
	
}