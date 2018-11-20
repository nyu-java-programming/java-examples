package edu.nyu.cs.fb1258.inheritance_examples.phones;

import java.util.Scanner;

/**
 * A class which creates a few phones and has them call each other.
 * @author Foo Barstein
 * @version 1
 *
 */
public class TestPhones {
	
	public static void main(String[] args) {
		
		// make a network operator, which keeps track of all the phones on the network
		NetworkOperator barsteinMobile = new NetworkOperator("Barstein Mobile");
		
		// display a "welcome to the network" message
		System.out.printf("Welcome to the %s network!\n", barsteinMobile);
		System.out.println("Please enter all phone numbers in a format like, '+1 (212) 998-1212'.\n");
		
		// make a mobile phone that represents the Professor and connect it to the Barstein Mobile network
		MobilePhone profPhone = new MobilePhone("+1 (212) 998-6666", barsteinMobile);
		
		// make a regular phone for a mysterious international stranger named Julia, and connect it to the Barstein Mobile network
		Phone juliaPhone = new Phone("+44 0727 8741 4488", barsteinMobile);
		
		// make a phone for the user... we need ask for their phone number first
		System.out.print("Please enter your phone number:  ");
		String response = solicitPhoneNumberFromUser(); // calling a static method in this class
		
		// make a mobile phone for the user and connect it to the Barstein Mobile network
		MobilePhone userPhone = new MobilePhone(response, barsteinMobile);
		System.out.println("Thanks. You are now registered with the network!\n");
		
		// loop and wait for the user to decide what to do
		boolean keepLooping = true;
		while (keepLooping) {
			
			// output the options to the user
			outputUserOptions(userPhone); // calling a static method in this class

			// get the user's response
			int selection = getUserNumericResponse(); // calling a static method in this class
			
			// do an action for each response
			switch (selection) {
			case 1:
				// toggle the poiwer on the user's phone
				userPhone.toggleOnOff();
				break;
				
			case 2:
				
				// verify that the phone is on before trying to make a call
				if (!userPhone.isOn()) {
					// notify the user their phone is not ON
					System.out.println("Sorry, your phone is OFF!  Please turn it ON to make a call.\n");
					// start from the beginning of the loop
					continue;
				}
				
				// show the user all the other phones connected to the network
				barsteinMobile.showAvailablePhones();
				
				System.out.println(); // line break

				// get phone number to call from user
				System.out.println("Please enter a phone number you would like to call: ");
				response = solicitPhoneNumberFromUser(); // call a static method in this class
				
				// try calling this number!
				userPhone.call(response);
				
			}
			
		}
		
	}

	/**
	 * Output the options the user has
	 * @param phone The user's phone object
	 */
	public static void outputUserOptions(Phone phone) {
		
		// ask the user what they would like to do:
		System.out.println("What would you like to do?");
		
		// check whether we're dealing with a mobile phone
		if (phone instanceof MobilePhone) {
			
			// if so, check whether this mobile phone is turned on
			if ( ((MobilePhone) phone).isOn()) {
				
				// if the phone is on, ask the user if they'd like to turn it off
				System.out.println("* Press '1' to turn your phone OFF.");
				
			}
			else {
				// if this mobile phone is off, ask the user whether they'd like to turn it on
				System.out.println("* Press '1' to turn your phone ON.");				
			}
		}
		
		// more remaining
		System.out.println("* Press '2' to make a call.");
	}
	
	/**
	 * Get a response as an int from the user
	 * @return The user's response, as an int.
	 */
	public static int getUserNumericResponse() {
		Scanner scanty = new Scanner(System.in); // open the scanner
		
		// get the user's response
		int selection = scanty.nextInt();
				
		scanty.close(); // close the scanner
		
		// return this
		return selection;
				
	}
	
	/**
	 * Ask user to enter a phone number
	 * @return The phone number, as a String
	 */
	public static String solicitPhoneNumberFromUser() {
		Scanner scanty = new Scanner(System.in);
		String response = scanty.nextLine();
		scanty.close();
		return response;
		 
	}
	
}
