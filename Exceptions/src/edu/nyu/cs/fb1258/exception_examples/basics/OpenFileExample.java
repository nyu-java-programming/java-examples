package edu.nyu.cs.fb1258.exception_examples.basics;

import java.io.*;
import java.util.Scanner;

/**
 * Program that asks the user to enter a filename to open, and repeats that to the user until they enter the name of a file that actually exists.
 * @author Foo Barstein
 * @version 2
 *
 */
public class OpenFileExample {

	public static void openFile() {
		String filename = "nonexisting.txt";
		boolean opened = false;
		while (!opened) {
			try {
				//try to open the file... this may trigger an exception to be thrown
				Scanner s = new Scanner(new File("src/" + filename));
			}
			catch (FileNotFoundException e) {
				//the exception happened... so deal with it
				System.out.println("oops... didn't work!");
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter a new file name to open: ");
				filename = sc.nextLine();
			}
		}
	}
	
	public static void main(String[] args) {
		//call the method.  no need to place this within try/catch since openFile() never throws the exceptions it sometimes encounters
		openFile();
	}

}
