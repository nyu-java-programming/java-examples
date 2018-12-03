package edu.nyu.cs.fb1258.exception_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A simple example showing two the two strategies of exception handling: try/catch and throws.
 * @author Foo Barstein
 * @version 2
 *
 */
public class Example1 {
	
	/**
	 * Calls two methods, one of which throws an exception and the other of which doesn't.
	 */
	public static void main(String[] args) {
		try {
			//foo3 could potentially throw one of two different types of exception, so we place its call within a try block
			foo3();
		}
		catch (FileNotFoundException e) {
			//in case a FileNotFoundException was thrown
			System.out.println(e);
			System.out.println("Sorry... couldn't find the file");
		}
		catch (NullPointerException e) {
			//in case a NullPointerException was thrown
			System.out.println(e);
			System.out.println("Sorry, got a null pointer exception.");
		}
		catch (Exception e) {
			//in case any other type of Exception-derived object was thrown...
			System.out.println(e);
			System.out.println("Sorry, got some kind of exception.");
		}

	}
	
	/**
	 * Method that calls two other methods, one of which sometimes throws exceptions.  This method passes those exceptions down the method call stack.
	 * @throws FileNotFoundException Passes the buck on the exception that foo2() may encounter if the file is not found.
	 * @throws NullPointerException Passes the buck on the exception that foo2() may encounter if the pointer is null.
	 */
	public static void foo3() throws FileNotFoundException, NullPointerException {
		foo1(); //foo1() does not throw any exceptions
		
		foo2(); //foo2() could throw either a FileNotFoundException or a NullPointer exception
		
		//since this method declares that it may throw exceptions, we do not have to encapsulate foo2()'s method call within a try/catch block
	}
	
	/**
	 * A method that may throw one of two different types of exceptions.
	 * @throws FileNotFoundException Passes the buck on the exception that this method may encounter if the file is not found.
	 * @throws NullPointerException Passes the buck on the exception that this method may encounter if the pointer is null.
	 */
	public static void foo2() throws FileNotFoundException, NullPointerException {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a filename to open:");
		String filename = scn.nextLine();
	
		//this file opening may trigger an exception
		Scanner fscn = new Scanner(new File(filename));	
	}

	/**
	 * Method that doesn't throw any kinds of exceptions... All code that may generate exceptions are handled directly within try/catch blocks, so this method doesn't have to throw anything down the method call stack.
	 */
	public static void foo1() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a filename to open:");
		String filename = scn.nextLine();
		
		//try to open the file, but handle the exceptions here if they occur
		try {
			Scanner fscn = new Scanner(new File(filename));
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("Sorry... couldn't find the file");
		}
		catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("Sorry, got a null pointer exception.");
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("Sorry, got some kind of exception.");
		}

	}

}
