package edu.nyu.cs.fb1258.voting_system;

import java.io.Console;
import java.util.Scanner;

/**
 * A ballot used to vote.
 * @author Foo Barstein
 * @version 0.4
 */
public class Ballot {
	
	/**
	 * Constructor to set up simple "first past the post" ballot with a question and answer options.  
	 * Only one answer option can be voted for.
	 * @param proposition The proposition to be voted upon
	 * @param choices The [limited] choices that citizens are presented
	 */
	public Ballot(String proposition, String[] choices) {
		this.setProposition(proposition);
		this.setChoices(choices);
	}
	
	// properties
	private String proposition; // the question to be voted upon
	private String[] choices; // the [limited] answer choices
	private int selection; // which of the choices the person has voted for
	private boolean cast = false; // whether or not the ballot has already been voted upon
	
	// because of java's java-ness, if you intend to use Scanner in several method invocations, it should be declared and instantiated outside any one method
	private Scanner scn = new Scanner(System.in);

	// behaviors
	
	/**
	 * Ask the user for their vote.
	 * @return The index number of the answer choice the user voted for, starting from 0
	 */
	public int solicitVote() {
		
		System.out.println("\nEnter the number of your choice:");

		// get the response
		String response = this.getResponse();
		
		int vote = -1; // will hold their vote
		
		// check that the response is an int
		if (response.length() !=0 && Character.isDigit(response.charAt(0))) {
			// convert it to an int and store it
			vote = Integer.parseInt(response) - 1; // subtract one to get array index			
		}

		// return their vote
		return vote;
		
	}
	
	/**
	 * Cast a vote for one of the answer choices.
	 * @param selection The index number of the answer choice that is being voted for
	 */
	public void cast(int selection) {
		// only cast the vote if the vote has not previously been cast
		if (!this.isCast()) {
			// cast the vote
			this.setSelection(selection); // remember the choice that has been voted for
			this.setCast(true); // remember that we have already voted
		}
		else {
			// the vote has already been cast
			System.out.println("You have already voted... notifying the authorities.");
		}
	}
	
	/**
	 * Display the proposition and the answer options to the user.
	 */
	public void display() {
		System.out.println("\n!!!VOTE!!!");
		System.out.println(this.getProposition());
		int i = 1; // starting from 1 to be human-friendly
		for (String choice : this.getChoices()) {
			System.out.println(i + " - " + choice);
			i++;
		}	
	}
	
	/**
	 * Get the user's input.
	 * @return The user's input
	 */
	public String getResponse() {
		String response = "";
		// re-use the instance property scanner
		response = this.scn.nextLine();			
		
		return response;
	}
	
	// setters and getters
	// normally, setters would include some type of validation
	// these setters do not do any validation to keep this example simple
	
	/**
	 * Get the user's choice as a human-readable string
	 * @return The user's selections as a string
	 */
	public String getSelectionString() {
		// the index number of the user's selection
		int i = this.getSelection(); 
		
		// get the selected choice's text from its index number
		String text = this.choices[i];
		
		// return it
		return text;
	}

	/**
	 * @return the choice
	 */
	public int getSelection() {
		return this.selection;
	}
	
	/**
	 * @param choice the choice to set
	 */
	public void setSelection(int selection) {
		this.selection = selection;
	}


	/**
	 * @return the cast
	 */
	public boolean isCast() {
		return this.cast;
	}


	/**
	 * @param cast the cast to set
	 */
	public void setCast(boolean cast) {
		this.cast = cast;
	}


	/**
	 * @return the proposition
	 */
	public String getProposition() {
		return this.proposition;
	}
	/**
	 * @param proposition the proposition to set
	 */
	public void setProposition(String proposition) {
		this.proposition = proposition;
	}
	/**
	 * @return the options
	 */
	public String[] getChoices() {
		return this.choices;
	}
	/**
	 * @param options the options to set
	 */
	public void setChoices(String[] choices) {
		this.choices = choices;
	}	
	
}
