package simplest_stuff;

import java.util.Scanner;

/**
 * Did you think you wouldn't see functions with return values in this class?
 * @author Foo Barstein
 * @version 0.1
 */
public class HelloWorldWithFunctions {
	
	/**
	 * This method adds one to any integer
	 * @param y any integer
	 * @return returns y + 1
	 */
	public static String getResponse(String instructions) {
        //print the instructions
		System.out.println(instructions);

        //get user input
		Scanner scn = new Scanner(System.in);
		String response = scn.nextLine();
        scn.close(); // close the scanner now that we're done with it

        // return the user's response
        return response;
    }
	
	public static void main(String[] args) {
        //print a welcome message
		System.out.println("Hello world!");

        //call the foo() function and store the number it  returns
		String data = getResponse("Please enter your favorite  number:");
		
		//output the number
		System.out.println("Thanks for entering that " +  data);
		
	}
		
}