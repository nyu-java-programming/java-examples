package edu.nyu.cs.fb1258.exception_examples;

import java.io.FileNotFoundException;

public class ExceptionExample2 {

	public void method1() throws FileNotFoundException {
		System.out.println("Starting method1...");
		
		// call the other method that might throw an exception
		this.method2();
	}
	
	public void method2() throws FileNotFoundException {
		System.out.println("Starting method2...");
		
		// instantiate a new FileNotFoundException object
		FileNotFoundException fnfe = new FileNotFoundException();
		throw fnfe;
	}
	
	public static void main(String[] args) {
		
		ExceptionExample2 ee2 = new ExceptionExample2();

		// try to call the doSomething method
		try {
			ee2.method1();
		}
		catch (FileNotFoundException e) {
			System.out.println("Got an exception.");
		}
			
	}	

}
