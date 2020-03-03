package edu.nyu.cs.fb1258.array_examples;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Two-player Tic Tac Toe on the command line.
 * @author Foo Barstein
 * @version 2
 */
public class TicTacToe {
	
	/**
	 * Print out the game board
	 * @param board The game board data
	 */
	public static void printBoard(String[][] board) {
		// print the first line across the top
		System.out.println("-------------");

		for (String[] row : board) {
			// print the first pipe for each line
			System.out.print("| ");
			
//			System.out.println( Arrays.toString(row) );
			
			for (String col : row) {
				
				// if this spot is blank, print a space
				col = (col.trim().equals("")) ? " " : col;
				
				// print the value in this column, plus a pipe
				System.out.print(col + " | ");
			}
			
			// print a line break at the end of each row
			System.out.println("");
			
			// print a row separator after each row
			System.out.println("-------------");
			
		}
	}
	
	/**
	 * Check whether a particular board spot is empty
	 * @param board The board
	 * @param row The row of interest
	 * @param col The column of interest
	 * @return True if the board spot is empty, false otherwise.
	 */
	public static boolean moveIsValid(String[][] board, int row, int col) {
		// return whether empty or not
		return board[row][col].trim().equals("");
	}
	
	/**
	 * Ask the player where they want to move on the board.
	 * @param scn A Scanner object to use to solicit user input
	 * @param player The player to ask to move.
	 * @return The response from the user.
	 */
	public static String solicitMoveFromPlayer(Scanner scn, String player) {
		// ask the user where they want to go
		System.out.println(player + "'s turn!!!");
		System.out.println("Where do you want to move? (e.g. 1,2) ");
		// assume the user is typing something like, "1,2"
		String response = scn.nextLine();
		return response;		
	}
	
	/**
	 * Convert a string in the format, "1,2" to an integer array of row, column coordinates for a position on the game board.
	 * @param response The string we need to parse
	 * @return An int array in the format {row, col}
	 */
	public static int[] getCoordsFromResponse(String response) {
		// assuming the response is something like "1,2", we split by comma
		String[] strCoords = response.split(",");			
		
		// remove any whitespace from each part
		strCoords[0] = strCoords[0].trim();
		strCoords[1] = strCoords[1].trim();
		
		// convert each part to integer and subtract one to get the corresponding array index
		int row = Integer.parseInt( strCoords[0] ) - 1;
		int col = Integer.parseInt( strCoords[1] ) - 1;
//		System.out.println(row + ":" + col);
		
		// convert into arraay
		int[] intCoords = { row, col };
		
		return intCoords;
		
	}
	
	/**
	 * Place a player's mark on the board
	 * @param board The board data
	 * @param player The player - X or O
	 * @param row - the index of the row in which to place the player's mark
	 * @param col - the index of the column in which to place the player's mark
	 */
	public static void makeMove(String[][] board, String player, int row, int col) {
		// place this player's character on the board at the correct position
		board[row][col] = player;
	}
	
	/**
	 * Check whether the game board is full
	 * @param board The game board data
	 * @return True if full, false otherwise.
	 */
	public static boolean isBoardFull(String[][] board) {
		// loop through each row
		for (String[] row : board) {
			// loop through each column
			for (String col : row) {
				// if any column is empty, the board is not full
				if (col.trim().equals("")) {
					// not full!
					return false;
				}
			}
		}
		// full!
		return true;
	}
	
	/**
	 * Check whether a given player has won the game.
	 * @param board The game board data
	 * @param player The player to check for a win
	 * @return True if won, false otherwise
	 */
	public static boolean isWin(String[][] board, String player) {
		boolean isWin = false;
		
		// Try it yourself!... these tasks need to be implemented:
		// check for a win on each row
		// check for a win on each column
		// check for both diagonal wins
		
		return isWin;
		
	}

	public static void main(String[] args) {
		
		// our game board with blank strings to start
		String[][] board = {
				{"", "", ""},
				{"", "", ""},
				{"", "", ""}
		};
		
		// X goes first
		String player = "X";

		// we will need user input
		Scanner scn = new Scanner(System.in);

		// infinite loop... for now
		boolean keepPlaying = true;
		while (keepPlaying) {

			// print out the board
			printBoard(board);
			
			// get the current user's move
			String response = solicitMoveFromPlayer(scn, player);
			
			// get the integer coordinates from the user's response
			int[] coords = getCoordsFromResponse(response);
			
			// get the row and column indices from the response
			int row = coords[0];
			int col = coords[1];
			
			// check whether the move is valid
			if (moveIsValid(board, row, col)) {
				// make the move if so!
				makeMove(board, player, row, col);
			}
			else {
				// the move is invalid
				System.out.println("Sorry buster, not a valid move!");
				continue; // do another iteration of this loop
			}
			
			// check whether the game is over
			if (isBoardFull(board) || isWin(board, player) ) {
				System.out.println("Game over!");
				keepPlaying = false;
			}
			else {
				// switch players
				player = (player.equals("X")) ? "O" : "X";
			}
			
			
			
		} // while
		
		// close the scanner
		scn.close();
		
	} // main

}
