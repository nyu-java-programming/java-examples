package edu.nyu.cs.fb1258.selection_examples;

import java.util.Scanner;

/**
 * Asks the user to enter an integer between a and 10, and then outputs an appropriate message about the validity of that number.
 * @author Foo Barstein
 * @version 9.9999
 */ 

public class IntegerAskerWithSwitchCase {

    public static void main(String[] args) {

        // define boundaries of the valid input
    	// notice that this makes maintenance of the code easier, and removes redundancy when talking about these numbers later on
        int lowerLimit = 1;
        int upperLimit = 10;
        int threshold = (lowerLimit + upperLimit) / 2; // calculate the nearest integer to the mid-point between these two numbers

        // set up a scanner to watch the computer keyboard for input
        Scanner input = new Scanner(System.in);

        // notify the user that they should supply valid input
        System.out.print("Please enter an integer between 1 and 10 inclusive: ");

        // get the user's response
        int response = input.nextInt();

        //is the response a valid response
        if (response >= lowerLimit &&  response <= upperLimit) {
	    //the number is valid
            System.out.println("The number is valid!");

            //determine whether the valid number is less than 5 or 5 or greater
            if (response < threshold ) {
                // the number is less than 5
                System.out.println("The number is less than 5");
            }
            else if (response == threshold) {
                // the response is the same value as the threshold
                System.out.println("You picked the threshold valud!!!!");
            }
            else {
                // the number is greater than 5 (but less than 10, of course)
                System.out.println("The number is greater than 5, but less than 10 (of course)");
            }
        }
        else {
            //the number is not valid
            System.out.println("The number is not valid!");
            if (response < lowerLimit) {
                // the number is too low!
                System.out.println("The number is too low!");
            }
            else {
                // the number is too high!
                System.out.println("The number is too high!");
            }
        } // else
        
        // close the scanner now that we no longer need user input in order to free up resources
        input.close();
        
    } // main function

} // class
