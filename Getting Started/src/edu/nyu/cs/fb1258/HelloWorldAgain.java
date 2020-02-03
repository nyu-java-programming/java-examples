package edu.nyu.cs.fb1258;

import java.util.Scanner;

/**
 * Simple program that asks for user input and then prints out a  meaningless message.
 * @author Foo Barstein
 * @version 0.1
 */ 

public class HelloWorldAgain {

	public static void main(String[] args) {

		//print a welcome message and instructions
		System.out.println("Hello world!");
		System.out.println("Please enter your favorite  number:");

		//get user input
		Scanner scn = new Scanner(System.in);
		String response = scn.nextLine();
				
		//print output
		System.out.println("Thanks for entering that " +  response);
		
		//close the scanner to free up memory resources on the computer
		scn.close(); 
		
	}

}