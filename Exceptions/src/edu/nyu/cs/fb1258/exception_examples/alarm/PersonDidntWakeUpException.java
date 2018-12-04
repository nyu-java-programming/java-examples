package edu.nyu.cs.fb1258.exception_examples.alarm;

/**
 * An Exception indicating that a Person didn't wake up when the Alarm rang.
 * @author Foo Barstein
 * @version 1
 *
 */
public class PersonDidntWakeUpException extends Exception {
	 
	/**
	 * The Person who didn't wake up
	 */
	 private Person person;

	 public PersonDidntWakeUpException(Person person) {
		 this.person = person;
	 }
	 
	/**
	 * The String representation of this object.
	 */
	public String toString() {
		return String.format("%s isn't waking up - obviously %d%% exhausted!", this.person.getName(), this.person.getExhaustion());
	}
}
