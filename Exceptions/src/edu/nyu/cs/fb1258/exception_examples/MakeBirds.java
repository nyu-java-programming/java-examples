package edu.nyu.cs.fb1258.exception_examples;

/**
 * A test class where we make a few birds with different wing lengths, one of which triggers an exception to be thrown.
 * @author Foo Barstein
 * @version 2
 * 
 */
public class MakeBirds {
	
	public static void main(String[] args) {
		//make a Bird object with a good wing length setting
		System.out.println("Making Roy!");
		try {
			//this will not trigger an exception since 3 is a valid wing length
			Bird roy = new Bird(3);
		}
		catch (NonsensicalBirdWingLengthException e) {
			//this will not excecute since there is no exception in this case
			System.out.println(e);
		}
		
		//make a Bird object with an invalid wing length setting
		System.out.println("Making Tweetie!");
		try {
			//this will trigger an exception since 0 is not a valid wing length
			Bird tweetie = new Bird(0);
		}
		catch (NonsensicalBirdWingLengthException e) {
			//this will print out the string representation of the exception object
			System.out.println(e);
		}

	}
}
