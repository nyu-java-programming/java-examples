package edu.nyu.cs.fb1258.array_examples;

import java.util.Scanner;

/**

 * Program to ask a user to keep entering words until they  enter the word, "stop".  
 * Each words is stored as an element in an array.  
 * At the end, the program loops through the array of words and  outputs each one.
 * @author Foo Barsten
 * @version 1.0
 */

public class AccumulateElements {

	public static void main(String[] args) {
		
		//create a scanner to get input from the keyboard
		Scanner input = new Scanner(System.in);

		//create a flag to indicate whether we should keep  asking the question or not
		boolean keepAsking = true;

		//create an array that, at all times, will hold the  words we have already gotten from the user. 
		//this will be overwritten with a new array every time  we get a new word from the user
		String[] originalWords = new String[0];
		
		//as long as we should keep asking, ask the user to  enter a new word
		while (keepAsking) {
			//get input from user
			System.out.println("Please enter a tic.:");
			String response = input.nextLine();			
			
			//check whether they entered the word, "stop".
			if (response.equals("stop")) {				
				keepAsking = false; //set the flag so that  there will be no more iterations of this while  loop
				break; //quit this iteration of the loop so  none of the stuff below happens
			}
			
			//create a new array that is one word bigger than  our last array
			String[] newWords = new String[originalWords. length+1];

			//take the previous words from the old array and  store them in the new array.. basically copying the  array
			for (int i=0; i<originalWords.length; i++) {
				newWords[i] = originalWords[i];
			}
			
			//our new array has one more element than the last  array...
			//add the most recent response from the user into  the last element of the new array
			newWords[originalWords.length] = response;
			
			//update the originalWords array so that it now is  overwritten with new array...so that next  iteration, we refer to that one.
			originalWords = newWords;
			
			//for debugging... loop through the new array and  print out the values in it so we can make sure  they're correct
			for (int i=0; i<newWords.length; i++) {
				System.out.println(newWords[i]);
			}
						
		} //while

		
	} //main

} //class