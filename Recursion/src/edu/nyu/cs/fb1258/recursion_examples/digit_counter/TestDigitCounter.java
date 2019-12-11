package edu.nyu.cs.fb1258.recursion_examples.digit_counter;

import java.util.Scanner;

public class TestDigitCounter {
	
	public static void main(String[] args) {
		int num, digits;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to the digit counter program!");
		System.out.println("Please use integers only.");
		
		// get base
		System.out.print("Enter the number you would like to count the digits of: ");
		num = scn.nextInt(); //assume valid int
		
		// calculate digits
		digits = DigitCounter.numDigits(num);
		System.out.println("The number " + num + " has " + digits + " digits");
		
		// close the scanner
		scn.close();
	}

}
