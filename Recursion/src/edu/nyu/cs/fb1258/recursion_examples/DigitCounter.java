package edu.nyu.cs.fb1258.recursion_examples;

import java.util.Scanner;

/**
 * Counts the number of digits in an integer using a recursive technique.
 * 
 * @author Foo Barstein
 * @version 1.0
 *
 */
public class DigitCounter {

	/**
	 * Calculates the number of digits in an integer, using a recursive technique.
	 * @param num the integer to count the digits of.
	 * @return the number of digits in the supplied integer.
	 */
	public static int numDigits(int num) {
		System.out.println("n: " + num); 
		
		int result; //will hold the number of digits in the num
		
		//handle the base case: numbers less than ten contain only 1 digit
		if (num < 10) {
			result = 1;
		}
		//if num is 10 or greater, we know it contains one digit plus however many digits are left after removing the first
		else {
			result = 1 + DigitCounter.numDigits(num / 10);
		}
		
		System.out.println("r: " + result); 
		
		//return result
		return result;
	}
	
	public static void main(String[] args) {
		int num, digits;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to the digit counter program!");
		System.out.println("Please use integers only.");
		
		//get base
		System.out.print("Enter the number you would like to count the digits of: ");
		num = scn.nextInt(); //assume valid int
		
		//calculate digits
		digits = DigitCounter.numDigits(num);
		System.out.println("The number " + num + " has " + digits + " digits");

	}

}
