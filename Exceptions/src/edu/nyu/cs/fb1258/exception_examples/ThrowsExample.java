package edu.nyu.cs.fb1258.exception_examples;

import java.io.*;
import java.util.Scanner;

/**
 * Program that shows the dynamics of throwing and catching exceptions.  Much like other programs in this pacakge.
 * @author Foo Barstein
 * @version 2
 *
 */
public class ThrowsExample {

	/**
	 * Method that sometimes throws a FileNotFoundException object
	 * @throws FileNotFoundException The exception object
	 */
	public void readFile() throws FileNotFoundException {
		try {
			//try to open a file that doesn't exist... an exception will be thrown
			Scanner x = new Scanner(new File("src/foo.bar"));
		} catch (FileNotFoundException e) {
			//deal with the exception
			System.out.println("oops");
			throw e; //'pass the buck' just for fun.  now any method that calls this method must deal with this exception object
		}
	}

	public static void main(String[] args) {
		//create an object
		ThrowsExample x = new ThrowsExample();

		//call the readFile method on this object... that method may throw an exception so that has to be handled
		try {
			//call the method
	    		x.readFile(); 
	    } catch (Exception e) {
	    		//handle exception here
	    		//...
	    }
	}
		
}
