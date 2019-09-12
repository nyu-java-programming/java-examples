package edu.nyu.cs.fb1258.selection_examples;

// import the Scanner from the Java API (Application Programming Interface)
import java.util.Scanner;

public class VegetablePicker {

    public static void main(String[] args) {

	// ask the user for their favorite vegetable
	System.out.println("Please enter your favorite vegetable: ");

	// get the user's response
	Scanner scn = new Scanner(System.in);
	String response = scn.nextLine();

	//decision-making... what to do next?
	response = response.toLowerCase(); // get a lowercase version of the string

	// check whether the response is the word 'beet'
	if ( response.equals("beet") || response.equals("beets") || response.equals("I love beets") ) {
	    System.out.println("Beets go well with goat cheese... unless you're vegan!");
	}

	// check wether thr response is carrot
	else if ( response.equals("carrot") || response.equals("carrots") || response.equals("I love carrots") ) {
	    System.out.println("Carrots are wonderful with hummus!");
	}
	
	// default pathway if the response is not carrot or beet
	else {
	    System.out.println(response + " are tasty!");
	}

	// end messsage
	System.out.println("Thank you.  Have a nice day!");


    }

}