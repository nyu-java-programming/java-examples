package edu.nyu.cs.fb1258.inheritance_examples.phones;

import java.util.Scanner;

public class Phone {

	// constructor
	
	/**
	 * A no-args constructor that does nothing
	 */
	public Phone() {
		// do nothing?
	}
	
	/**
	 * Create a phone with a specific phone number, and a particular network it is on
	 * @param number The phone number to assign to this phone
	 * @param network The network to add this phone to, e.g. Verizon, AT&T, BarsteinMobile, etc.
	 */
	public Phone(PhoneNumber number, NetworkOperator network) {
		
		// store this phone's phone number into the phone
		this.setNumber(number);
		
		// store this phone's network provider into the phone
		this.setNetwork(network);
		
		// output some debugging
//		System.out.printf("Created phone with number %s.\n", this);

	}

	/**
	 * Create a phone with a specific phone number, in the format e.g. "+1 (212) 998-8888", and add it to the specified network
	 * @param number The phone number to assign to this phone
	 * @param network The network to add this phone to, e.g. Verizon, AT&T, BarsteinMobile, etc.
	 */
	public Phone(String strNumber, NetworkOperator network) {
		
		// get a proper PhoneNumber object for this phone's number
		PhoneNumber number = new PhoneNumber(strNumber);
		
		// store this phone's phone number in the phone
		this.setNumber(number);
		
		// store this phone's network provider into the phone
		this.setNetwork(network);
		
		// output some debugging
//		System.out.printf("Created phone with number %s.\n", this);

	}

	
	// properties of a phone
	
	/**
	 * This phone's phone number
	 */
	private PhoneNumber number;
	
	/**
	 * This phone's network that it is connected to
	 */
	private NetworkOperator network;
	
	/**
	 * Whether this phone is currently on a call
	 */
	private boolean onCall = false;

	// behaviors
	
	/**
	 * Try to connect the call to the receiving phone
	 * @param number The number of the other phone to call
	 * @return true if the call succeeds, false otherwise
	 */
	public boolean call(PhoneNumber number) {
		boolean callSuccess = false;
		
		// request that the network find the phone with the given phone number
		Phone recipient = this.network.findPhone(number.toString());
		
		// if the recipient phone is found, ring it
		if (recipient != null) {
			// ring the recipient's phone
			System.out.printf("Ringing %s...\n", this.getNumber().toString());
			recipient.ring();
		}
		else {
			System.out.printf("Cound not find %s on %s.  Please try again later.\n", number, this.network);
		}
		
		return callSuccess;
	}
	
	/**
	 * Try to connect the call to the receiving phone
	 * @param strNumber The number of the other phone to call
	 * @return true if the call succeeds, false otherwise
	 */
	public boolean call(String strNumber) {
		boolean callSuccess = false;
		
		// request the network operator to connect us to the recipient phone
		PhoneNumber number = new PhoneNumber(strNumber);
		
		// call this number, using the method designed to do so
		callSuccess = this.call(number);
		
		// return true if the call succeeded, false otherwise
		return callSuccess;
	}
	
	public void answerCall(boolean yesno) {
		// somehow answer the call
		if (yesno) {
			// answer the call somehow
		}
		else {
			// don't answer the call somehow
		}
	}
	
	/**
	 * Produce a ringing noise!
	 */
	public void ring() {
		System.out.println("Ring ring rings ... incoming call... should we answer");
		Scanner scanly = new Scanner(System.in);
		String response = scanly.nextLine();
		// check user's response
		if (response.toLowerCase().contains("y")) {
			// if they entered a response with the letter 'y', answer the call
			System.out.println("Answering the call!");
		}
		scanly.close();
	}
	
	
	// generic getters and setters
	
	/**
	 * @return the number
	 */
	public PhoneNumber getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(PhoneNumber number) {
		this.number = number;
	}

	/**
	 * @return the network
	 */
	public NetworkOperator getNetwork() {
		return network;
	}

	/**
	 * @param network the network to set
	 */
	public void setNetwork(NetworkOperator network) {
		// add this phone to the selected network
		network.addPhone(this);
		
		// store this network inside the phone
		this.network = network;
	}

	/**
	 * @return the onCall
	 */
	public boolean isOnCall() {
		return onCall;
	}

	/**
	 * @param onCall the onCall to set
	 */
	public void setOnCall(boolean onCall) {
		this.onCall = onCall;
	}

	/**
	 * How this phone is converted to a String
	 * @return The phone number and newtork operator, as a string
	 */
	public String toString() {
		// return the phone number and network
		return String.format("%s on %s network", this.getNumber(), this.getNetwork());
	}
	

}
