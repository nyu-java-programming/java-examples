package edu.nyu.cs.fb1258.exception_examples.alarm;

/**
 * Create a Person, create an Alarm, and have the Alarm try to wake up the Person.
 * @author Foo Barstein
 * @version 1
 */
public class TestAlarm {

	public static void main(String[] args) {
		
		// create a new Person named Jeff, is asleep, and 95% exhausted from too much homework
		Person person = new Person("Jeff", false, 95);
		
		// try to set the alarm
		try {
			// set the alarm... which might throw an InterruptedException
			Alarm a = new Alarm(1, person); // set alarm for 1 second in the future
		}
		catch (InterruptedException e) {
			// the processor was interrupted while trying to call Thread.sleep()
			System.out.println("Sorry, the alarm is broken!");	
		}
		catch (SnoozedTooManyTimesException e) {
			// the Person hit the snooze button too many times
			System.out.println(e);	
		}
	}

}
