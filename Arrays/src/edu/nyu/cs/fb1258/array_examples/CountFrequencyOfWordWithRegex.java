package edu.nyu.cs.fb1258.array_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This program counts the number of occurrences of a given word within a file.
 * @author Foo Barstein
 * @version 1.1
 */
public class CountFrequencyOfWordWithRegex {

	public static void findWord(String searchTerm) throws  FileNotFoundException {
		
		//open a text file
		Scanner in = new Scanner(new File("src/speech.txt"));
		
		//loop through every line of the file and create an  array of all the words
		String s = "";  //start with a blank slate
		while (in.hasNext()) {
			s += in.nextLine(); //add each line of text to the  string
		}
		
		//get an array of all the words in this line
		//split based on punctuation marks and spaces to create  an array
		String[] words = s.split("[ ,.?\\s+]"); 		//using  a regular expression here... matches either a space,  comma, period, or a question mark.
		//the length of the array is how many words there are.
		System.out.printf("\nThere were %d words in the file.\n",  words.length);		
	
		//loop through all words
		int counter = 0;
		for (String word : words) { //fancy syntax for looping  through each array element and storing it in a variable
			//if we find the word we're looking for, increment  the counter
			if (word.toLowerCase().equals(searchTerm)) {
				counter++;
			}
		}
		
		//output result
		System.out.printf("Found %d occurences of the word '%s'.\n",  counter, searchTerm);
	}
	
	public static void main(String[] args) {
		try {
			//look for some words in the text
			findWord("clinton");
			findWord("obama");
		}
		catch (Exception e) {
			System.out.println("Sorry... couldn't open the  file.");
		}

	}

}