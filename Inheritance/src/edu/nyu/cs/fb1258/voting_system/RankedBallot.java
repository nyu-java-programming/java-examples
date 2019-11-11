package edu.nyu.cs.fb1258.voting_system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RankedBallot extends Ballot {

	/**
	 * Constructor to set up a "ranked" ballot with a question and answer options.  
	 * Multiple answer options can be voted for, and the order of preference indicated.
	 * @param proposition The proposition to be voted upon
	 * @param choices The [limited] choices that citizens are presented
	 * @param limit The maximum number of choices that can be voted for
	 */
	public RankedBallot(String proposition, String[] choices, int limit) {
		// do the Ballot constructor stuff
		super(proposition, choices);
		
		// do anything specific to this class's setup...
		
		// set the max number of choices that can be voted for
		this.setLimit(limit);
	}
	
	// properties
	
	private int limit; // how many choices can be selected
	private int[] selections; // the index numbers of the choices the user selected

	// behaviors
	
	/**
	 * Ask the user for their votes.
	 * This is not an overridden method... there is a method called solicitVote in the Ballot class, but that is a different name.
	 * @return The index numbers of the answer choices the user voted for, starting from 0, in order of preference.
	 */
	public int[] solicitVotes() {
		// ask the user for their votes
		System.out.println("\nEnter the number of your selections (up to " + this.getLimit() + "), in order of preference, separated by comma:");
		
		// get the user's response by calling an inherited method
		String response = this.getResponse();
		
		// split the users response into a string array
		String[] responses = response.split(",");

		// create an array list to hold their responses
		ArrayList<Integer> selections = new ArrayList<Integer>();
		
		// loop through the string array and place each value into an integer array list
		for (int i=0; i<responses.length; i++) {
			// iterate through each value
			String r = responses[i];
			
			// only add the value to selections if it is indeed a digit
			if (r.length() !=0 && Character.isDigit(r.charAt(0))) {
				// add each value as an Integer to the Array List
				selections.add( Integer.parseInt(r) - 1 ); // subtract one to get array index values
			}
		}
		
		// convert Integer array list to int array
		int[] intSelections = new int[selections.size()]; // an int array as big as the array list
		for (int i=0; i<selections.size(); i++) {
			intSelections[i] = selections.get(i); // copy each element from array list to array
		}

		// make sure the user only voted on as many answer choices as they are allowed
		if (intSelections.length > this.getLimit()) {
			// they voted on too many items!
			System.out.println("You have voted on too many items... ignoring extra votes!");
			
			// clip their votes to an array of the allowed length
			intSelections = Arrays.copyOf(intSelections, this.getLimit());
		}
		

		// return the int array
		return intSelections;
		
	}
	
	// overridden cast method
	/**
	 * Cast votes for the selected answer choices.
	 * @param selections  The selected answer choices, as integers starting from 1.
	 */
	public void cast(int[] selections) {
		// only cast the vote if it has not been done already
		if (!this.isCast()) {
			// save this set of selections internally to this object
			this.setSelections(selections);
		}
		else {
			// the vote has already been cast
			System.out.println("You have already voted... notifying the authorities.");
		}		
	}
	
	// overloaded the cast method
	/**
	 * Cast votes for the selected answer choices.
	 * @param votes
	 */
	public void cast(ArrayList<Integer> selections) {
		//create an int array from the Integer ArrayList
		int[] intSelections = new int[selections.size()];
		int i = 0;
		for (Integer selection : intSelections) {
			intSelections[i] = selection;
			i++;
		}
		
		// pass this int array to the other overloaded cast method to store it
		this.cast( selections );
	}
	
	
	// setters and getters
	// normally, setters would include some type of validation
	// these setters do not do any validation to keep this example simple
	
	// overloaded method
	/**
	 * Get the user's choices as a human-readable string
	 * @return The user's selections as a string
	 */
	public String getSelectionString() {
		// the index number of the user's selections
		int[] indices = this.getSelections();

		// make a string array the same length;
		String[] selections = new String[indices.length];
		
		// get the text of all the choice options;
		String[] choices = this.getChoices(); // the choices property is declared as private in the parent class, so need to use the getter

		// add the text of each of the user's selections to the array
		for (int i=0; i<indices.length; i++) {
			String choice = choices[indices[i]]; // the text of the choice at this index
			// get the selected choice's text from its index number
			selections[i] = "'" + choice + "'"; // put single quotes around each chosen option
		}
		
		// flatten the string array to a string
		String text = String.join(", ", selections);
		
		// return it
		return text;
	}

	/**
	 * @return the limit
	 */
	public int getLimit() {
		return this.limit;
	}

	/**
	 * @param limit the limit to set
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}

	/**
	 * @return the selections
	 */
	public int[] getSelections() {
		return this.selections;
	}

	/**
	 * @param selections the selections to set
	 */
	public void setSelections(int[] selections) {
		this.selections = selections;
	}

}
