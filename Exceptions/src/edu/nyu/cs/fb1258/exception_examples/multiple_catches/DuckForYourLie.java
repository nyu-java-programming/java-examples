package edu.nyu.cs.fb1258.exception_examples.multiple_catches;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DuckForYourLie {
	
	public static void doSomething() throws FileNotFoundException, IndexOutOfBoundsException {
		
		String[] x = new String[5];
		int counter = 0;
		
		// try to open up a file... it will fail
		Scanner scn = new Scanner(new File("src/data.txt"));
		System.out.println("Opened the file!");
		
		for (int i=0; i<10; i++) {
			x[counter] = "hello";
			counter++;
		}			
		
	}
	
	public static void foo() {
		try {
			doSomething();
		}
		catch (FileNotFoundException e) {
			System.out.println("Sorry, no file found.");
			System.out.println(e);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of bounds.");
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println("Some other type of exception occured");
			System.out.println(e);
		}	
	}

	public static void main(String[] args) {
		foo();
	}

}
