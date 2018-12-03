package edu.nyu.cs.fb1258.exception_examples;

/**
 * An example of throwing a custom exception type.
 * @author Foo Barstein
 * @version 2
 *
 */
public class Example2 {

	/**
	 * This method tries to call the doSomething method, but handles any exceptions that may be thrown by that method.
	 * @param args Command-line parameters... we aren't using this.
	 */
	public static void main(String[] args) {
		try {
			//try to call the method that potentially throws exceptions
			doSomething();
		}
		catch (LateToClassException e) {
			//handle any exceptions that occurred.
			System.out.println(e);
		}
	}

	/**
	 * Method that randomly throws LateToClassException objects just for fun
	 * @throws LateToClassException
	 */
	public static void doSomething() throws LateToClassException {
		//randomly generate a number between 1 - 1.9999...
		double doIt = Math.random() + 1;

		//throw an exception about half the time
		if (doIt > 1.5) {
			//generate a new exception object (LateToClassException inherits from Exception)
			LateToClassException x = new LateToClassException();
			throw x; //throw it!
		}
	}
	
}

/**
 * Custom Exception type for example purposes.  An exception object is simply an object of any class that inherits from Exception.
 * @author Foo Barstein
 * @version 2
 *
 */
class LateToClassException extends Exception {
	private String message;

	/**
	 * Constructor that simply sets the message property.
	 */
	public LateToClassException() {
		this.message = "Sorry, running late to class!";
	}
	
	/**
	 * What this object will look like as a String
	 * @return String representation of this object.
	 */
	public String toString() {
		return this.message;
	}
}
