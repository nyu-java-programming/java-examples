package edu.nyu.cs.fb1258.exception_examples.basics;

import java.io.*;
import java.util.Scanner;

/**
 * Program shows the typical FileNotFoundException that occurs when you try to open a file that doesn't exist.
 * @author Foo Barstein
 * @version 2
 *
 */
public class FileNotFoundExample {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(new File("src/data.txt"));
			System.out.println("Successfully opened the file...");
			//if there was no exception...
			//do something interesting with the file and then close it
			input.close();
		} 
		catch (FileNotFoundException e) {
			//catch an exception indicating the file was not found
			System.out.println("Sorry, file not found..");
			System.out.println(e.toString());
		} 
		catch (Exception e) {
			//catch any other exception that may have occurred
			System.out.println("Sorry... some exception occurred.");
		} 
		finally {
			//regardless of whether there was an exception, do the following...
			System.out.println("Done!");
		}		
	}

}
