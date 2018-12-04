package edu.nyu.cs.fb1258.exception_examples.alarm;

/**
 * An Exception indicating that a Person has hit the snooze button on the alarm too many times.
 * @author Foo Barstein
 * @version 1
 *
 */
public class SnoozedTooManyTimesException extends Exception {

	/**
	 * The person guilty of over-snoozing.
	 */
	private Person person;
	
	/**
	 * How many times the person hit the snooze button on the alarm.
	 */
	private int numSnoozes;
	
	/**
	 * Store the number of times the Person has snoozed before this Exception was thrown
	 * @param numSnoozes
	 */
	public SnoozedTooManyTimesException(Person p, int numSnoozes) {
		this.person = p;
		this.numSnoozes = numSnoozes;
	}
	
	/**
	 * The String representation of this object.
	 */
	public String toString() {
		return String.format("Sorry, %s has already snoozed %d times - too exhausted!  Giving up.", this.person.getName(), this.numSnoozes);
	}
}
