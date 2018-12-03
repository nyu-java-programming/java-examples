package edu.nyu.cs.fb1258.exception_examples;

import java.io.FileNotFoundException;

public class ExceptionExample1 {

	public void doSomething() throws FileNotFoundException {
		System.out.println("Doing something...");
	}
	
	public void doSomethingElse() throws FileNotFoundException {
		System.out.println("Doing something else...");
		
		// instantiate a new FileNotFoundException object
		FileNotFoundException fnfe = new FileNotFoundException();
		throw fnfe;
	}
	
	public static void main(String[] args) {
		
		ExceptionExample1 ee1 = new ExceptionExample1();

		// try to call the doSomething method
		try {
			// call doSomething()
			ee1.doSomething();
		}
		catch (FileNotFoundException e) {
			System.out.println("Caught an exception when calling doSomething()!");
		}

		// try to call the doSomethingElse method
		try {
			// call doSomethingElse()
			ee1.doSomethingElse();
		}
		catch (FileNotFoundException e) {
			System.out.println("Caught an exception when calling doSomethingElse()!");
		}

		
	}

}
