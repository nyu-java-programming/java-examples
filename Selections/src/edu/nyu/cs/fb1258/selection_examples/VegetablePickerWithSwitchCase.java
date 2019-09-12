// import the Scanner from the Java API (Application Programming Interface)
import java.util.Scanner;

public class VegetablePickerWithSwitchCase {

    public static void main(String[] args) {

	// ask the user for their favorite vegetable
	System.out.println("Please enter your favorite vegetable: ");

	// get the user's response
	Scanner scn = new Scanner(System.in);
	String response = scn.nextLine();

	//decision-making... what to do next?
	response = response.toLowerCase(); // get a lowercase version of the string

	// switch/case
	switch(response) {

	case "beets":
	case "beet":
	case "I love beets":
	    System.out.println("Beets go well with goat cheese... unless you're vegan!");
	    break;

	case "carrot":
	case "carrots":
	case "I love carrots":
	    System.out.println("Carrots are wonderful with hummus!");
	    break;

	default:
	    System.out.println(response + " are tasty!");
	}

	// end messsage
	System.out.println("Thank you.  Have a nice day!");


    }

}