package edu.nyu.cs.fb1258.exception_examples.alarm;

/**
 * An alarm clock that rings and tries to wake a Person up after a given number of seconds.
 * @author Foo Barstein
 * @version 1
 *
 */
public class Alarm {
	
	/**
	 *  how many times the snooze button has been pressed
	 */
	private int numSnoozes = 0;
	
	/**
	 * The maximum number of snoozes allowed before alternate measures are taken to wake the pesron up.
	 */
	public final int MAX_SNOOZES = 10;
	
	/**
	 * Set the alarm so it wakes up the person.
	 * @param secondsTillRing How many seconds until the alarm rings
	 * @param p The person to wake up upon ringing the alarm.
	 * @throws InterruptedException The sleep process might become interrupted.
	 * @throws SnoozedTooManyTimesException The person might have snoozed too many times
	 */
	public Alarm(int secondsTillRing, Person p) throws InterruptedException, SnoozedTooManyTimesException {
		// set the alarm
		this.setAlarm(secondsTillRing, p);
	}
	
	/**
	 * 
	 * @param secondsTillRing How many seconds until the alarm rings
	 * @param person The person to wake up upon ringing the alarm.
	 * @throws InterruptedException The Thread.sleep() process might become interrupted.
	 * @throws SnoozedTooManyTimesException The Person might have snoozed too many times
	 */
	public void setAlarm(int secondsTillRing, Person person) throws InterruptedException, SnoozedTooManyTimesException {
			// set the alarm... the Thread.sleep() method potentially throws the InterruptedException
			Thread.sleep(secondsTillRing * 1000); // pause for the number of seconds indicated

			// ring the alarm
			this.ring();
			
			// try to wake the person up... this might not work if they are very exhausted.
			try {
				person.wakeUp(); // the wakeUp() method potentially throws a PersonDidntWakeUpException
				System.out.printf("%s snoozed %d times but is now awake.", person.getName(), this.numSnoozes);
			}
			catch (PersonDidntWakeUpException e) {
				// the Person didn't wake up!
				this.numSnoozes++; // increment the snooze counter
				
				// if the Person didn't wake up, but hasn't snoozed too many times.  So set the alarm automatically again
				if (this.numSnoozes < this.MAX_SNOOZES) {
					System.out.println(e);
					setAlarm(secondsTillRing, person);
				}
				else {
					// the Person has snooozed too many times!  Throw a SnoozedTooManyTimesException!
					SnoozedTooManyTimesException stmte = new SnoozedTooManyTimesException(person, this.numSnoozes);
					throw stmte; // throw the exception!
				}
			}
			
	}
	
	/**
	 * Ring the alarm
	 */
	public void ring() {
		System.out.println("[alarm] Ring ring ring...");
	}
	
}
