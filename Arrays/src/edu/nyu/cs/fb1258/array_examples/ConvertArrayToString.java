package edu.nyu.cs.fb1258.array_examples;

import java.util.Arrays;

public class ConvertArrayToString {

	public static void main(String[] args) {
		
		String[] words = {"nonsuch", "neveretheless", "whichever"};
		System.out.println("The contents of the array are " + words);
		
		// loop throught the array and get a string version of its contents
		String contents = "";
		for (int i=0; i<words.length; i++) {
			contents += words[i] + " ";
		}
		
		// print out the string version fo teh array
		System.out.println("The contents of the array are " + contents);

		// use the wrapper class to do the same thing.
		String wordsAsString = Arrays.toString(words);
		System.out.println("The contents of the array are " + wordsAsString);
	}

}
