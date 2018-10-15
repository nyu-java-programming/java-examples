package edu.nyu.cs.fb1258.array_examples;

import java.util.Scanner;

/**
 * The game of Tic Tac Toe using a two dimensional String array as the board.
 * 
 * @author Foo Barstein
 * @version 1.0
 *
 */

public class TicTacToeExample {
	
	public static void makeTheMove(String[][] board, int row, int col, String player) {
		board[row][col] = player;
	}
	
	public static int getRow(String[] coords) {
		//get the coordinates as int values
		int row = Integer.parseInt(coords[0]) - 1;
		
		return row;		
	}
	
	public static int getCol(String[] coords) {
		int col = Integer.parseInt(coords[1]) - 1;
		
		return col;
	}
	
	public static String[] getUsersMove(String player) {
		//get the user's move
		System.out.println("It's " + player + "'s turn");
		System.out.println("Where would you like to go? Enter your position as 'row #, col #': ");

		Scanner scn = new Scanner(System.in);
		String response = scn.nextLine(); // this string will look something like "1, 2"
		String[] coords = response.split(","); //this will be a String array that looks something like {"1", " 2"} 
		
		//clean up the array data
		for (int i=0; i<coords.length; i++) {
			coords[i] = coords[i].trim(); //get rid of any whitespace in any of the array elements
		}		
		
		scn.close(); //close the scanner... it's a leaking resource

		return coords;
	}
	
	public static String switchPlayer(String currentPlayer) {
		
		//switch players
		String player;
		if (currentPlayer.equals("X")) {
			player = "O";
		}
		else {
			player = "X";
		}

		return player;
	}
	
	public static void printBoard(String[][] board) {
		//print out the board
		
		//loop through each row
		for (int r=0; r<board.length; r++) {
			//loop through each column within this row
			for (int c = 0; c < board[r].length; c++) {
				String mark = board[r][c];
				System.out.printf("%4s", mark);
			}
			//print out a line break at the end of the row
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		//create the game board as a two-dom arrauy
		String[][] board = {
				{"_", "_", "_"},
				{"_", "_", "_"},
				{"_", "_", "_"}
		};
		
		//set the starting player
		String player = "X";
		
		//start a loop
		while (true) {
			
			String[] coords = getUsersMove(player);

			int row = getRow(coords);
			
			int col = getCol(coords);
			
			//place the mark on the board
			makeTheMove(board, row, col, player);
			
			player = switchPlayer(player);
			
			printBoard(board);
		}

	}

}
