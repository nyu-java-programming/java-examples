package edu.nyu.cs.fb1258.inheritance.voting_system;

import java.util.ArrayList;
import java.util.Scanner;

public class TinkerWithElection {

	public static void main(String[] args) {
		
		// A FIRST PAST THE POST BALLOT
		String proposition2 = "The subway should be free.";
		String[] choices2 = { "yes", "no" };
		Ballot fptpb = new Ballot(proposition2, choices2);
		
		// show the options to the citizen
		fptpb.display();
		
		// solicit their vote
		int vote = fptpb.solicitVote();

		// cast this vote
		fptpb.cast(vote);
		
		// output confirmation
		System.out.println("\nYou have voted '" + fptpb.getSelectionString() + "' on the ballot");
		

		// A RANKED BALLOT
		String proposition1 = "Which foods should be added to NYU Eats?"; // proposition
		String[] choices1 = {"ratatouille", "never-frozen sushi", "ramen", "porter house steak", "tofu salad with sesame" }; // choices
		RankedBallot rb = new RankedBallot(proposition1, choices1, 3);
		
		// show the options to the citizen
		rb.display();
		
		// solicit their votes
		int[] votes = rb.solicitVotes();
	
		// cast these votes
		rb.cast(votes);
		
		// output confirmation
		System.out.println("\nYou have voted for " + rb.getSelectionString() + " on the ballot");
		
		// thanks!
		System.out.println("\nThank you!");
	}

}
