package edu.nyu.cs.fb1258.recursion_examples.power;

import java.util.Scanner;

/**
 * An example of solving power equations using recursion.  Only works with integers below 2^32.
 * @author Foo Barstein
 * @version 1
 */
public class Power {

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
  
  /**
   * Calculates powers using recursion.
   * @param base The base number
   * @param exp The exponent to raise the base to
   * @return The result of the power calculation.
   */
  public static int power(int base, int exp) {
    int pow; //the value that will be returned

    //if the exponent is 0, set pow to 1
    if (exp == 0) {
      //any number raised to the 0th power is = 1
      pow = 1;
    }
    //otherwise set pow to base * base^(exp-1)... recursion!
    else {
      //use recursion to calculate the result
      pow = base * power(base, exp-1);
    }

    //System.out.println(pow); //debugging
    
    //return pow
    return pow;
  }
  
}