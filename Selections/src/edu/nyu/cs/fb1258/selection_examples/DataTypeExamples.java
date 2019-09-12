package edu.nyu.cs.fb1258.selection_examples;

public class DataTypeExamples {

    public static void main(String[] args) {
	
		System.out.println(5); // integer literals are considered ints by default
		System.out.println(3.14); // floating point literals are considered doubles by default
	
		// ints are primitives
		int int1 = 5;
		int int2 = 5;
		boolean bool1 = (int1 == int2); // you can use the == operator to compare two primitive values
	
		if ( bool1) {
		    System.out.println(int1 + " and " + int2 + " are the same value!");
		}
		else {
		    System.out.println(int1 + " and " + int2 + " are different values!");
		}
	
		// doubles are primitives
		double double1 = 3.14;
		double double2 = 1.35;
		boolean bool2 = (double1 == double2); // you can use the == operator to compare two primitive values
	
		if ( bool2 ) {
		    System.out.println(double1 + " and " + double2 + " are the same value!");
		}
		else {
		    System.out.println(double1 + " and " + double2 + " are different values!");
		}
	
		// strings are not primitives
		String string1 = "hello"; // syntactic sugar
		String string2 = new String("hello"); // the 'normal' way to create a string
		boolean bool3 = ( string1 == string2); // unreliable for non-primitives
		boolean bool4 = ( string1.equals(string2) );
	
		if ( bool3 ) {
		    System.out.println(string1 + " and " + string2 + " are the same value!");
		}
		else {
		    System.out.println(string1 + " and " + string2 + " are different values!");
		}

		if ( bool4 ) {
		    System.out.println(string1 + " and " + string2 + " are the same value!");
		}
		else {
		    System.out.println(string1 + " and " + string2 + " are different values!");
		}

    }
}