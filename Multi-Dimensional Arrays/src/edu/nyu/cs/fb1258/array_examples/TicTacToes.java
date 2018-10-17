package edu.nyu.cs.fb1258.array_examples;

import java.util.Random;
import java.util.Scanner;

/**
 * A virtual game of Tic Tac Toe, played by two humans sitting at the same computer.
 * @author Foo Barstein
 * @version 22
 * 
 */
public class TicTacToes {
	
	// class variables that represent each state a given position on the board could be in
	public final static char X = 'X';
	public final static char O = 'O';
	public final static char EMPTY = '-';
	
	public static void main(String[] args) {
		// get a new blank board
		char[][] board = getBoard();
		
		// a few flags to maintain state
		boolean isWon = false; // whether the game has been won or not
		boolean isFull = false; // whether the board is full or not

		// the game starts with player X's turn
		char currentPlayer = X;
		
		// iterate until game is over
		boolean gameOver = false;
		while (!gameOver) {
			
			// print out the board
			outputBoard(board);
			
			// ask the user where they want to go.. returns an int array with the desired row, column
			int[] move = getUsersMove(currentPlayer);
			int row = move[0]; // the row where the user desires to go
			int col = move[1]; // the column where the user desires to go

			// check whether the user's desired move is legal
			if (isLegalMove(row, col, board)) {
				// if so, make the move!
				makeMove(currentPlayer, board, row, col);
			}
			else {
				// the move is invalid... inform the user and try again
				System.out.println("Sorry, that position is already filled.  Please try again...");
				continue; // start the next iteration of the loop without switching players
			}
			
			// check whether there is a win or a draw
			isWon = isWin(board, currentPlayer);
			isFull = isBoardFull(board);
			gameOver = isWon || isFull;
			
			// output a nice message if someone wins or the board is full and it's a tie
			if (isWon) {
				System.out.printf("\n%s WINS!!!\n", currentPlayer);
			}
			else if (isFull) {
				System.out.println("\nTIE!!!");
			}
			
			// switch players before next iteration
            currentPlayer = (currentPlayer == X) ? O : X;
			
		}

		// the game is over once the loop exits
		System.out.println("Game over!");
		
	}
	/**
	 * Creates an empty board for a new game of Tic Tac Toe
	 * @return a two-dimensional char array representing an empty board
	 */
	public static char[][] getBoard() {

		// the board is represented as a char array of two-dimensions ... thought of as rows and columns
		char[][] board = {
				//col1,  col2,  col3
				{EMPTY, EMPTY, EMPTY}, // row1
				{EMPTY, EMPTY, EMPTY}, // row2
				{EMPTY, EMPTY, EMPTY} // row3
		};
		
		return board;
		
	}

	/**
	 * Outputs the state of the board
	 * @param board The current board two-dimensional array
	 */
	public static void outputBoard(char[][] board) {
		
		/// print a line break above the board
		System.out.print("\n");

		// print out the board (the hard way)
		System.out.println("The current state of the board: ");
		for (int rowNum=0; rowNum<board.length; rowNum++) {
			// get a single row 
			char[] thisRow = board[rowNum];
			
			// loop through the columns within this row
			for (int colNum=0; colNum<thisRow.length; colNum++) {
				// print out what's at ths position within 4 spaces
				System.out.printf("%4s", thisRow[colNum]);
				
			}
			
			//  print a line break between rows
			System.out.print("\n");
			
		}
		
		/// print a line break after all rows have been printed
		System.out.print("\n");
		
		// there is a far simpler syntactical way to do the same kind of nested loop (a.k.a some syntactic sugar)
		// print out the board with foreach style loop
//		for (char[] row : board) {
//			for (char col : row) {
//				System.out.println(col);
//			}
//		}
		
	}

	/**
	 * Get the current player's move
	 * @param player The player whose turn it is
	 * @return int array with the player's desired row and column for their move
	 */
	public static int[] getUsersMove(char player) {
		// generate a random example move
		Random randy = new Random();
		int exampleRow = randy.nextInt(3) + 1; // a random int between 1-3
		int exampleCol = randy.nextInt(3) + 1; // a random int between 1-3
		
		// ask the user where they would like to go
		System.out.printf("Player %s ... where would you like to go? (e.g. '%d,%d' for row %d column %d)\n", player, exampleRow, exampleCol, exampleRow, exampleCol);
		Scanner scanly = new Scanner(System.in);
		String response = scanly.nextLine(); // get user's response

		// split the user's response to get the row and column separated
		String[] move = response.split(",");

		//clean up the array data to remove any extra whitespace the user may have entered
		for (int i=0; i<move.length; i++) {
			move[i] = move[i].trim(); //get rid of any whitespace
		}		

		// extract the row and column data as integers from this string
		int row = Integer.parseInt(move[0]) - 1; // subtract 1 from what the user entered, since they entered it starting from 1, whereas array indices start from 0
		int col = Integer.parseInt(move[1]) - 1;
		
		// return int array with the row and column where the user wants to move
		int[] moveAsInts = {row, col};
		return moveAsInts;
	}


	/**
	 * Checks whether a given move is legal or not.  A legal move is any move within bounds into an empty space.
	 * @param row The row index of the desired move
	 * @param col The column index of the desired move.
	 * @param board the board upon which this move will be played
	 * @return True if the move is legal, false otherwise.
	 */
	private static boolean isLegalMove(int row, int col, char[][] board) {
		// a legal move is a move into any empty spot on the board
		boolean isLegalMove = board[row][col] == EMPTY; // true if the position on the board is empty, false otherwise
		return isLegalMove;
	}

	/**
	 * Checks whether the game board is full, meaning there are no empty spots left.
	 * @param board the board to check
	 * @return true if the board is full, false otherwise
	 */
	public static boolean isBoardFull(char[][] board) {
		// let's start by assuming the board is full
		boolean isBoardFull = true;
		
		//iterate through each row... check out how we exit a nested loop with the 'break to label' technique
	row_loop: // a label!
		for (char[] row : board) {
			// iterate through each column in this row
			for (char col : row) {
				// check whether it's empty
				if (col == EMPTY) {
					isBoardFull = false; // we now know the board is not totally full, so no point continuing to iterate
					break row_loop; // break out of the row loop!
				}
			}				
		}
		
		return isBoardFull;
	}

	/**
	 * Make the move on the board for the selected player
	 * @param player The player whose move it is
	 * @param board The board upon which to make the move
	 * @param row The row where they want to put their character
	 * @param col The column where they want to put their character
	 */
	public static void makeMove(char player, char[][] board, int row, int col) {
		// update the board at this row and column
		board[row][col] = player;		
	}
	

	/**
	 * Checks for a win by one of the players.
	 * @param board The board upon which the players are playing
	 * @param player The player for whom to check for a win
	 * @return True if this player won.  False otherwise
	 */
	public static boolean isWin(char[][] board, char player) {
		boolean isWin = false;
		
		// Try it yourself!... these tasks need to be implemented:
		// check for a win on each row
		// check for a win on each column
		// check for both diagonal wins
		
		return isWin;
	}

}
