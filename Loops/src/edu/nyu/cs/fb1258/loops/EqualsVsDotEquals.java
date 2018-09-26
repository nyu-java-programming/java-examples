package edu.nyu.cs.fb1258.loops;

/**
 * An exhibition of the difference between the == operator and the String's .equals() method
 * @author Foo Barstein
 * @version 99.999
 *
 */
public class EqualsVsDotEquals {

	public static void main(String[] args) {

		// a string!
		String x = "potato"; // java allows you to construct strings as if they are primitives, although they are not
		
		// strings are really internally stored as an array of chars... you can create one from a char array
		char[] d = {'p', 'o', 't', 'a', 't', 'o'};
		String y = new String(d); // behind the scenes, this is really how all strings are created
		
		// prove to the doubters that both these strings store the same characters
		System.out.println("The two strings are: " + x + " and " + y);
		
		// compare the memory address of these two string objects
		if (x == y) {
			// output both the American and pseudo-English pronunciations of the word, 'potato'
			System.out.println("You say potato, I say potato");
		}
		
		// compare the value of the characters within the two strings
		if (x.equals(y)) {
			// output both the American and English pronunciations of the word, 'tomato'
			System.out.println("You say tomato, I say tomato");
		}
		
		
		

	}

}
