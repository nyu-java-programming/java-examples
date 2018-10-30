package edu.nyu.cs.fb1258.string_examples.string_imitator_example;

/**
 * A cheap replica of the String class
 * This is done to show a simplified view of how String stores a char array, converts it to a String using a toString() method, and compares it to other Strings using an equals() method.
 *
 * @author Foo Barstein
 * @version 1
 *
 */
public class MyOwnString {

	// a private char array
	private char[] characters = {};

	/**
	 * Constructor that accepts a char array and stores it internally
	 * @param values The char array to store within the MyOwnString object
	 */
	public MyOwnString(char[] values) {
		this.characters = values;
	}
	
	/**
	 * 'Getter' method for the 'characters' char array.
	 * @return The char array held within this object
	 */
	public char[] toCharArray() {
		return this.characters;
	}
	
	/**
	 * Customize how objects of this type are converted to strings.
	 * @return a String representation of this object
	 */
	public String toString() {
		// return a string composed of all characters in this object's char array
		String x = "";
		for (char c : this.characters) {
			x += c;
		}
		return x;
	}
	
	/**
	 * Our own custom definition of what it means for two MyOwnStringObjects to be equal
	 * @param otherString The other object to compare to
	 * @return True if they are the same, false otherwise.
	 */
	public boolean equals(MyOwnString otherString) {
		boolean isTheSame = true; // by default, let's assume the two are the same
		
		// compare the length of the char arrays within these two objects
		if (this.characters.length != otherString.characters.length) {
			// make sure the two have the same number of characters
			isTheSame = false;
		}
		else {
			// iterate char by char through the two custom strings' char arrays and compare
			for (int i = 0; i< this.characters.length; i++) {
				if (this.characters[i] != otherString.characters[i]) {
					// if any two chars are different, we know the custom strings are different
					isTheSame = false;
					break; // no point keeping on looping
				}
			}
			
		}
		
		return isTheSame;
		
	}
}
