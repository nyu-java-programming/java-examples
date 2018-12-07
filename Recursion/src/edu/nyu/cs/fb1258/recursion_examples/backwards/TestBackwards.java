package edu.nyu.cs.fb1258.recursion_examples.backwards;

import java.util.Scanner;

/**
 * Trying out the recursive backwards algorithm in the Backwards class
 * Asks the user to enter a string, and then outputs the backwards version of that string.
 * @author Foo Barstein
 * @version 2
 *
 */
public class TestBackwards {

	public static void main(String[] args) {
		String original, backwards;
		
		// ask the user for a string to flip backwards
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to the string backwards converter!");
		
		// get user input
		System.out.print("Enter the string you would like to flip backwards: ");
		original = scn.nextLine();
		
		// get the backwards version
		backwards = Backwards.backwards(original);
		
		// print out the backwards version
		System.out.println("The string '" + original + "' backwards is '" + backwards + "'.");

		// close the scanner
		scn.close();
		
	}
	

}
