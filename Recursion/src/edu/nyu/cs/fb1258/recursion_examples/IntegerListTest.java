package edu.nyu.cs.fb1258.recursion_examples;

import java.util.Scanner;

/**
 * Test of the IntegerList class.
 * @author Foo Barstein
 * @version 2
 *
 */
public class IntegerListTest {

	private static IntegerListS list = new IntegerListS(10);
	private static Scanner scn = new Scanner(System.in);
	
	/**
	 * Create a list, display the menu, and then repeatedly do what the user asks until they quit.
	 * @param args Command-line arguments, if any.  These are ignored.
	 */
	public static void main(String[] args) {
		printMenu();
		int choice = scn.nextInt();
		while (choice != 0) {
			dispatch(choice);
			printMenu();
			choice = scn.nextInt();			
		}
	}
	
	/**
	 * Does what the menu item calls for.
	 * @param choice
	 */
	public static void dispatch(int choice) {
		int loc;
		switch (choice) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			System.out.println("How big should the list be?");
			int size = scn.nextInt();
			list = new IntegerListS(size);
			list.randomize();
			break;
		case 2:
			list.selectionSort();
			break;
		case 3:
			System.out.print("Enter the value to look for: ");
			loc = list.linearSearch(scn.nextInt());
			if (loc != -1) {
				System.out.println("Found at location " + loc);
			}
			else {
				System.out.println("Not in list");
			}
			break;
		case 4:
			System.out.print("Enter the value to look for: ");
			loc = list.linearSearchRec(scn.nextInt());
			if (loc != -1) {
				System.out.println("Found at location " + loc);
			}
			else {
				System.out.println("Not in list");
			}
			break;
		case 5:
			list.print();
			break;
		default:
			System.out.println("Sorry, invalid choice");
			
		}
	}
	
	public static void printMenu() {
		System.out.println("\nMenu    ");
		System.out.println("====    ");
		System.out.println("0: Quit");
		System.out.println("1: Create new list elements (** do this first !! **)");
		System.out.println("2: Sort the list using selection sort");
		System.out.println("3: Find an element in the list using linear search without recursion");
		System.out.println("4: Find an element in the list using linear search with recursion");
		System.out.println("5: Print the list");
		System.out.println("\nEnter your choice: ");
	}

}
