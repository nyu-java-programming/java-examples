package edu.nyu.cs.fb1258.inheritance_examples.phones;

import java.util.ArrayList;

/**
 * A virtual version of a network operator which is used to connect two phones together
 * @author Foo Barstein
 * @version 1
 *
 */
public class NetworkOperator {
	
	// constructors.... 
	public NetworkOperator(String name) {
		this.setName(name); // if you have setters, use them!
	}
	
	// properties of a network operator
	
	/**
	 * The name of the operator
	 */
	private String name;
	
	/**
	 * Network operators maintain a list of all the phones on the network
	 */
	private ArrayList<Phone> phones = new ArrayList<Phone>();
	
	// behaviors of a network operator
	
	/**
	 * One of the services a network operator provides is the ability to locate a phone by its phone number
	 * @return The Phone object which has the number we're looking for
	 */
	public Phone findPhoneByNumber(String number) {
		Phone phone = null; // start off assuming we will not locate it
		
		// iterate through all the phones on this network ... linear search!
		for (Phone phoney : this.phones) {
			// check whether the number of this phone matches the number we're looking for
			if (phoney.toString().equals(number)) {
				// if so, let's return the phone object
				phone = phoney;
			}
		}
		
		return phone;
	}
	
	/**
	 * A network operator can add a new phone to its network
	 * @param phone A new Phone Object to add to the network
	 */
	public void addPhone(Phone phone) {
		// add this phone to the array list of phones
		this.phones.add(phone);
		
		// debug with a nice message
//		System.out.printf("Welcome to %s, %s!\n", this, phone.getNumber());

	}
	
	/**
	 * A network operator can also kick a phone off the network, of course... for example when the customer hasn't paid their bills
	 * @param phone The Phone object to kick off the network
	 */
	public void dropPhone(Phone phone) {
		// kick this phone off the network
		this.phones.remove(phone); // kicked off!
	}
	
	/**
	 * Find the phone with the given number
	 * @param number A string with the phone number of the phone to find on the network
	 * @return the recipient phone, if found; null otherwise
	 */
	public Phone findPhone(String number) {
		Phone recipient = null; // assume we have not found the recipient phone yet
		
		// output debugging message
		System.out.printf("Searching for %s on %s network...\n", number, this);

		// loop through all the phones on the network
		for (Phone phone : this.getPhones()) {
			// see if any have the number we're looking for
			if (phone.getNumber().toString().equals(number)) {
				// we found it!
				System.out.println("Found it!");
				recipient = phone;
			}
		}
		
		// return the recipient, if any
		return recipient;
	}
	
	/**
	 * Output a list of all the phones that the user might be able to call on this network
	 */
	public void showAvailablePhones() {
		// show the user all the other phones connected to the network
		System.out.printf("Here are all the phone numbers on the %s network:\n", this);
		for (Phone phoney : this.getPhones()) {
			System.out.printf("* %s\n", phoney.getNumber().toString());
		}
	}
	
	/**
	 * How this Network Operator is represented as a String
	 * @return the name of the network
	 */
	public String toString() {
		return this.name;
	}

	// generic getters and setters

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phones
	 */
	public ArrayList<Phone> getPhones() {
		return phones;
	}

	/**
	 * @param phones the phones to set
	 */
	public void setPhones(ArrayList<Phone> phones) {
		this.phones = phones;
	}

}
