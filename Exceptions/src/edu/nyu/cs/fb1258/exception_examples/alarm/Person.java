package edu.nyu.cs.fb1258.exception_examples.alarm;

/**
 * A person who may or may not wake up when the Alarm goes off, depending on how exhausted they are.
 * @author Foo Barstein
 * @version 1
 *
 */
public class Person {

	/**
	 * The person's name
	 */
	private String name;
	
	/**
	 * Whether this Person is awake
	 */
	private boolean isAwake = false;

	/**
	 * Exhuastion as a percent
	 */
	private int exhaustion = 0; 

	/**
	 * Create a Person
	 * @param name The person's name
	 * @param isAwake Whether the person is awake
	 * @param exhaustion How exhausted the person is, as a percent
	 */
	public Person(String name, boolean isAwake, int exhaustion) {
		this.setName(name);
		this.setAwake(isAwake);
		this.setExhaustion(exhaustion);
	}
	
	/**
	 * Try to wake up the person
	 * @throws PersonDidntWakeUpException The person may not wake up, depending on how exhausted they are
	 */
	public void wakeUp() throws PersonDidntWakeUpException {
		// randomly decide whether to wake the person up, based on their exhaustion level
		double rand = Math.random() * 100; // get a number between 0 and 100
		if (rand > this.exhaustion) {
			// wake them up!
			System.out.printf("[%s] I'm awake!\n", this.getName());
			this.setAwake(true);
		}
		else {
			// instantiate a new exception indicating this Person didn't wake up
			PersonDidntWakeUpException pdwue = new PersonDidntWakeUpException(this);
			throw pdwue; // throw the exception
		} 
		
	}
	
	// generic getters and setters

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the isAwake
	 */
	public boolean isAwake() {
		return isAwake;
	}

	/**
	 * @param isAwake the isAwake to set
	 */
	public void setAwake(boolean isAwake) {
		this.isAwake = isAwake;
	}

	/**
	 * @return the exhaustion
	 */
	public int getExhaustion() {
		return exhaustion;
	}

	/**
	 * @param exhaustion the exhaustion to set
	 */
	public void setExhaustion(int exhaustion) {
		this.exhaustion = exhaustion;
	}
	
}
