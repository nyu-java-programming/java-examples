package edu.nyu.cs.fb1258.exception_examples;

/**
 * A quick and dirty representation of a bird with only one property - wing length.  Trying to set an invalid wing length triggers an exception to be thrown.
 * @author Foo Barstein
 * @version 2
 *
 */
public class Bird {
	private int wingLength;
	public final static int MIN_WING_LENGTH = 1; //the minimum good value for wing length (in inches)
	
	/**
	 * Constructor that sets the Bird's wing length
	 * @param wingLength Desired wing length
	 * @throws NonsensicalBirdWingLengthException If the wing length is not valid, an object of this Exception type is thrown
	 */
	public Bird(int wingLength) throws NonsensicalBirdWingLengthException {
		//set the wing length... this may trigger an exception to be thrown.
		this.setWingLength(wingLength);
	}
	
	/**
	 * Setter for wing length property that does some validation and throws an exception if the wing length is invalid.
	 * @param length The desired wing length
	 * @throws NonsensicalBirdWingLengthException If the wing length is not valid, an object of this Exception type is thrown.
	 */
	public void setWingLength(int length) throws NonsensicalBirdWingLengthException {
		//check whether the new wing length is valid
		if (length > Bird.MIN_WING_LENGTH) {
			//great, accept this as the value
			this.wingLength = length;			
		}
		else {
			//throw an exception if the wing length is invalid!
			throw new NonsensicalBirdWingLengthException();
		}
	}
	
}
