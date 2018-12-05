package edu.nyu.cs.fb1258.recursion_examples.power_calculator;

import java.util.Scanner;

public class TestPower {
	
	public static void main(String[] args) {
		int base, exp;
		int answer;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to the power program!");
		System.out.println("Please use integers only.");
		
		//get base
		System.out.print("Enter the base you would like to raise to: ");
		base = scn.nextInt(); //assume valid int
		
		//get exponent
		System.out.print("Enter the power you would like to raise to: ");
		exp = scn.nextInt();
		
		//get answer
		answer = Power.power(base, exp);
		System.out.println(base + " raised to the " + exp + " is " + answer);
	}
}
