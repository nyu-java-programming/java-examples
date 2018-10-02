package edu.nyu.cs.fb1258.array_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Program detects how many times a given word is found within  a given text.
 * @author Foo Barstein
 * @version 1.2
 */

public class CountFrequencyOfWord {

	public static int countFrequency(String needle, String  haystack) {
		int counter = 0; //keeps track of how many needles we  find within the haystack
		
		//find the position of the first occurrence, if any, of  the needle within the haystack
		int pos = haystack.indexOf(needle, 0);

		//as long as we found at least one occurrence, look for  another...
		while(pos >= 0) {
			counter++; //increment the counter, since we found  another occurrence
			pos = haystack.indexOf(needle, pos+1); //look for  another occurrence and overwrite pos with the new  position, if any
		}
	
		return counter; // return the number of occurrences we  found

	} //countFrequency

	public static void main(String[] args) throws  FileNotFoundException {
		//text to analyze...
		Scanner textFile = new Scanner(new File("src/foo.txt"));
		String text = ""; //this will hold the entire text file  as a string
		while (textFile.hasNextLine()) {
			//add each line of the text file to the string.
			text += textFile.nextLine(); // get the whole text  in file as a string.
		}
				
		//word to look for...
		System.out.println("What word would you like to count  the frequency of?");
		Scanner input = new Scanner(System.in);
		String searchTerm = input.nextLine();

		//get frequency of the searchTerm within the selected  text
		int freq1 = countFrequency(searchTerm, text);
		
		//output to the user
		System.out.println("There are " + freq1 + " occurrences  of the word '" + searchTerm + "' in the given text.");
	} //main

} //class