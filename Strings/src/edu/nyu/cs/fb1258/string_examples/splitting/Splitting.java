package edu.nyu.cs.fb1258.string_examples.splitting;

import java.util.Arrays;

/**
 * An example of isolating words of text by splitting by anything that is not alphabetic character
 * @author Foo Barstein
 * @version 2
 *
 */
public class Splitting {

	public static void main(String[] args) {
		
		// let's say you have a string with punctuation and spaces
		String text = "This, that, and the other 2? Wonderful! It's great...";

		// and you want to isolate the words
		String[] words = text.split("[^\\w']+");
		
		// dump the contents of the array to the console
		System.out.println(Arrays.toString(words));
		
		// loop through and print out each word individually
		for (String word : words) {
			System.out.println(word);
		}
		
	}

}
