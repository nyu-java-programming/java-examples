package edu.nyu.cs.fb1258.exception_examples;

/**
 * A special type of exception that is thrown whenever a Bird tries to set its wing length to an invalid length.
 * @author Foo Barstein
 * @version 2
 * 
 */
public class NonsensicalBirdWingLengthException extends Exception {
	
	/**
	 * Defines the String representation of this object.
	 */
	public String toString() {
		return "Invalid wing length exception!";
	}
}
