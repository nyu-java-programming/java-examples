package edu.nyu.cs.fb1258.array_examples;

import java.util.Scanner;

/**

 * Program asks user to enter a list of words, separated by  commas.  
 * The program breaks this string up into an array using the  split() method, and outputs each item in the array.
 * @author Foo Barstein
 * @version 1.1
 */

public class SplitUserInput {

	public static void main(String[] args) {
		//ask the user to enter a string with the words  separated by commass
		System.out.println("Please enter tics, separated by  commas: ");
		Scanner in = new Scanner(System.in);
		
		//store that response in a string
		String response = in.nextLine();
		
		//split up the string into an array using the comma as  a delimiter
		String[] words = response.split(",");

		//loop through each element in the array and print it  out
		for (int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		
		//close scanner
		in.close();
	}

}