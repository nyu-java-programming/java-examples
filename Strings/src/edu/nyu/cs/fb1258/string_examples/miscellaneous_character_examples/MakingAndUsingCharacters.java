package edu.nyu.cs.fb1258.string_examples.miscellaneous_character_examples;


/**
 * A miscellaneous assortment examples of manipulating chars using the Character class.
 * @author Foo Barstein
 * @version 1
 *
 */
public class MakingAndUsingCharacters {


	public static void main(String[] args) {
		
		//make two Character objects
		Character c = new Character('c');
		Character d = new Character('c');
		
		//compare the value of two character objects
		boolean theSameChar = (c.equals(d));
		System.out.println("The two characters hold the same chars: " + theSameChar);
		
		//compare the memory addresses of the two Character objects
		boolean theSameAddress = (c == d);
		System.out.println("The two characters are stored at the same address: " + theSameAddress);
	
		//extract the char buried inside the Character
		char e = c.charValue(); //obviously a getter of some sort
		System.out.println("The char inside the Character wrapper is '" + e + "'");
		
		//check whether a Character is lowercasse
		boolean isLower = Character.isLowerCase(e); //obviously this is a static method
		System.out.println("The char is lowercase: " + isLower);
		
		//convert case from lower to upper
		e = Character.toUpperCase(e); //obviously this is a static method
		System.out.println("The uppercase version of that char is '" + e + "'");

		// check whether a given string is a valid NYU ID number:
		String number = "N123456789";
		if (isGoodNyuIdNumber(number)) {
			System.out.printf("'%s' is a good NYU ID number!\n", number);
		}
		else {
			System.out.printf("'%s' NOT a good NYU ID number!\n", number);
		}
		
	}

	/**
	 * Checks whether a given "N number" is a valid NYU ID number:
	 * @param number The number to validate
	 * @return True if the number is a valid NYU ID number.  False otherwise.
	 */
	public static boolean isGoodNyuIdNumber(String n) {

		//check whether a given string is a valid NYU N#

		// let's assume it's good unless we find otherwise
		boolean isValid = true;
		
		// is the first letter an N?
		char firstChar = n.charAt(0);
		if (firstChar != 'N') {
			// it does not start with an N!
			System.out.printf("The number, '%s', does not start with an 'N'!\n", n);
			isValid = false;
		}
		
		//get the char array from inside the string
		char[] nums = n.toCharArray();
		
		// loop as many times as there are characters in the char array
		for (int i=1; i<nums.length; i++) {
			
			// check whether this character is a digit
			if (!Character.isDigit(nums[i])) {
				
				// this character is not a digit!
				System.out.printf("'%s', is not a digit!\n", nums[i]);
				isValid = false;
			}
		}
		
		return isValid;
		
	}
	
}
