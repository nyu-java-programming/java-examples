package edu.nyu.cs.fb1258.string_examples.custom_equals_and_to_string_examples;

/**
 * A mechanism for playing with two Monday objects.
 * @author Foo Barstein
 * @version 1
 *
 */
public class PlayWithMondays {

	public static void main(String[] args) {
		
		// create two Monday objects with the same properties
		Monday october29 = new Monday(2, 4);
		Monday november5 = new Monday(2, 4);
		
		// compare Mondays
		if (october29 == november5) {
			// the two Monday objects are in fact one object
			System.out.printf("The monday, '%s', is the same as the Monday, '%s'!", october29, november5);
		}
		else if (october29.equals(november5)) {
			// the two Monday objects have the same dread and speed properties
			// this relies upon the code in the equals() method implemented in the Monday class
			System.out.printf("The Monday, '%s', equals the monday, '%s'!", october29, november5);
		}
		else {
			// the two Monday objects are neither the same object, nor have the same dread and speed property values
			System.out.printf("The Monday, '%s', is different from the Monday, '%s'!", october29, november5);
		}

	}

}
