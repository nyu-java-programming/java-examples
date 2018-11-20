package edu.nyu.cs.fb1258.inheritance_examples.phones;

public class MobilePhone extends Phone {
	// constructors

	/**
	 * A no-args constructor... not used in this example
	 */
	public MobilePhone() {
		// call the parent class's no-args constructor
		super();
	}
	
	/**
	 * A Constructor that sets up the phone on the specified network by offloading that task to the parent class's constuctor
	 * @param number A string of the phone number to set up
	 * @param network The network on which we want this phone to operate
	 */
	public MobilePhone(String number, NetworkOperator network) {
		// call the parent class's constructor, so it can set up the phone number properly on the specified network
		super(number, network);
		
		// if there are specific things about mobile phones that make them different.. put them here
		
	}


	// properties that Mobile Phones have that other generic Phones do not
	private boolean isOn = false;
	
	// behaviors that Mobile Phones have that other generic Phones do not
	
	/**
	 * Toggle the power on the phone
	 */
	public void toggleOnOff() {
		// if the user selected to turn the phone on or off, do it!
		if (this.isOn())
			// if it was previously on, turn it off
			this.turnOff();
		else
			// if it was previously off, turn it on
			this.turnOn();
	}
	
	/**
	 * Turn the phone on
	 */
	public void turnOn() {
		this.isOn = true;
		System.out.printf("%s is now ON!\n", this.getNumber().toString());
	}
	
	/**
	 * Turn the phone off
	 */
	public void turnOff() {
		this.isOn = false;
		System.out.printf("%s is now OFF!\n", this.getNumber().toString());
	}

	/**
	 * Produce a ringing noise!  Override the Phone class's implementation of this method, since MobilePhones must be on in order to ring
	 */
	public void ring() {
		if (this.isOn()) {
			// do the regular Phone ring
			super.ring();
		}
		else {
			System.out.printf("Sorry, the phone with the number %s is OFF!\n", this.getNumber().toString());
		}
	}

	
	// generic getters and setters
	
	/**
	 * Get the current on/off status of the phone
	 * @return Whether the phone is on or not
	 */
	public boolean isOn() {
		return this.isOn;
	}
	
	
}
