package edu.nyu.cs.fb1258.recursion_examples.backwards;

import java.util.Scanner;

/**
 * Flips a string backwards using recursion.
 * @author Foo Barstein
 * @version 1.0
 *
 */
public class Backwards {

	/**
	 * Returns the backwards version of a string using a recursive technique.
	 * @param original the string to be flipped backwards
	 * @return the original string, if it is only 1 or no characters long;  the original string in reverse, otherwise.
	 */
	public static String backwards(String original) {
		//output the argument value
		System.out.println("o: " + original); 
		
		String backwards = ""; //start off with a blank slate
		
		//System.out.println(original); //debugging
		
		//a zero or one-character string backwards is the same as forwards
		if (original.length() <= 1) {
			// the backwards is the same as the original
			backwards = original;
		}
		else {
			//add the last character from the original to the backwards version
			char lastChar = original.charAt(original.length() - 1);
			backwards += lastChar; //the last character
			//System.out.println("backwards: " + lastChar);

			//flip the remaining part of the original and add it to this backwards version
			String remainder = original.substring(0, original.length() -1); //everything up to the last character
			backwards += Backwards.backwards(remainder); //recursion!
		}
		
		//output the backwards value
		System.out.println("b: " + backwards); 

		//return the backwards value
		return backwards;
	}

}
