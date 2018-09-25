package edu.nyu.cs.fb1258.selection_examples;

import java.util.Scanner;

/**
 * Repeatedly asks the user to enter an integer between a and 10, and then outputs an appropriate message about the validity of that number.
 * Uses functions that perform single tasks, and a while loop to repeat the question until valid input is solicited.
 * @author Foo Barstein
 * @version 2
 */

public class IntegerAskerWithAWhileLoopAndFunctions {

    /**
     * Check whether a given int is valid and return a boolean value indicating if so.
     * @param x the int to evaluate
     * @return true if the int is valid, false otherwise
     */
    public static boolean isValidInput(int x) {

       //check whether the supplied value is within the valid range
       if (x < 1 || x > 10) {
           // the input is invalid!  return false.
           return false;
       }
       else {
           // the input is good!  return true
           return true;
       }
    }

    /**
     * Get an integer from the user input
     * @return int that the user entered
     */
    public static int getIntFromUser() {
      //ask the user for an int
      System.out.print("Please enter an integer between 1 and 10, inclusive:");

      // create a Scanner object
      Scanner input = new Scanner(System.in);

      // get the user input
      int response = input.nextInt();

      // close the Scanner now that we no longer need any further user input... this frees up the resources it would otherwise consume
      input.close();

      // return the integer the user entered
      return response;

    } //getIntFromUser()


    public static void main(String[] args) {

         //keep looping until the input is good!
         
         // set a flag that will allow us to control the loop
         boolean keepLooping = true;

         // set up a loop that keeps iterating as long as keep_looping is true
         while (keepLooping) {

             //get an integer from the user
             int response = getIntFromUser();

             //check whether the integer is valid
             if (isValidInput(response)) {
                 //if the int is valid, we don't need to iterate the loop anymore
                 keepLooping = false;
                 System.out.println("Thanks for that great input!");
             }
             else {
                 //if the int is not valid, we inform the user and let the loop iterate again
                 System.out.println("Sorry, that's not valid input... try again.");
             }
         } //while
        

    } //main method


} //class