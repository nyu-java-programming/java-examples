package edu.nyu.cs.fb1258.string_examples.miscellaneous_string_examples;

/**
 * Two ways to compare two String objects
 * @author Foo Barstein
 * @version 1
 *
 */
public class MakingAndUsingStringsPart3 {

	public static void main(String[] args) {

		// make a few strings
		char[] characters = { 'f', 'o', 'o', 'b', 'a', 'r' };
		String x = new String(characters);
		
		String y = new String("foobar");
		
		// compare two strings
		if (x == y) {
			// the two String objects are, in fact, one String object!
			System.out.printf("The string '%s' is the same as the string '%s'!", x, y);
		}
		else if (x.equals(y)) {
			// the two String objects have the same char array inside of them
			System.out.printf("The string '%s' equals the same as the string '%s'!", x, y);			
		}
		else {
			// the two String objects are neither one String object, nor do they have the same char array inside of them!
			System.out.printf("The string '%s' is different from the string '%s'!", x, y);
		}

	}

}
