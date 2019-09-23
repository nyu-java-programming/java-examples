package edu.nyu.cs.fb1258.array_examples;

import java.util.Arrays;

/**
 * A survey of some useful array techniques.
 *
 * @author Foo Barstein
 */
public class ArraysExposition {

    public static void main(String[] args) {

	// the old-fashioned way of setting up an array
	int[] a = new int[5];
	a[0] = 55;
	a[1] = 22;
	a[2] = 44;
	a[3] = 66;
	a[4] = 23;

	// sort the order of the array values using the Arrays helper class
	Arrays.sort(a); // notice that it's not necessary to reassign the a variable

	// print out the values in the array using the Arrays helper class
	System.out.println("\nSorted array of ints");
	System.out.println( Arrays.toString(a) ); // [55, 22, 44, 66, 23]

	// print out the contents of the array with no commas or brackets...
	String arrayValues = Arrays.toString(a); // convert array to String using Arrays helper class
	arrayValues = arrayValues.substring(1, arrayValues.length() - 1); // remove first and last characters
	arrayValues = arrayValues.replace(", ", "-"); // remove commas
	System.out.println("\nA String created from an array");
	System.out.println(arrayValues);
	
	// split a string into an array!
	String[] values = arrayValues.split("-"); // split by -
	System.out.println("\nAn array created from a String");
	System.out.println(Arrays.toString(values)); // now back as an array... but of Strings

	// a syntactic-sugar way of creating an array
	int[] b = { 55, 22, 44, 66, 23 };

	// a String array
	String[] c = {
	    "hello",
	    "world",
	    "how",
	    "are",
	    "you?"
	};

	// sort the order of the values in the string array using the Arrays helper class
	Arrays.sort(c); // notice that it's not necessary to reassign the c variable

	// loop through an array with a counter... notice the use of the .length property of arrays
	System.out.println("\nIterating through an array the classic way");
	for (int i = 0; i < a.length; i++) {
	    System.out.println( a[i] );
	}

	// use syntactic sugar to do the same thing, but without a counter
	System.out.println("\nIterating through an array the sweet way");
	for (String word : c) {
	    System.out.println( word );
	}
	
	// convert a string into an array of chars
	String word = c[1]; //"hello"
	char[] characters = word.toCharArray(); // get char array
	System.out.println("\nAn array of chars retrieved from a String");
	for (char character : characters) {
		System.out.println(character);
	}

	// compare where two arrays sit in memory using the == operator
	System.out.println("\nCompare the location in memory of two arrays");
	if (a == b) {
	    System.out.println("The arrays are the same thing in memory!");
	}
	else {
	    System.out.println("The arrays are different things in memory!");
	}

	// compare the values of two arrays using the Arrays helper class
	System.out.println("\nCompare the values in two arrays using the Arrays helper class");
	if ( Arrays.equals(a, b) ) {
	    System.out.println("The arrays have the same values!");
	}
	else {
	    System.out.println("The arrays have different values!");
	}

	// compare the values of two arrays... THE HARD WAY!
	System.out.println("\nCompare the values in two arrays using custom code");
	boolean theSame = true; // a flag

	// if lengths are different the arrays are different
	if (a.length == b.length) {

	    // lengths are the same, so compare each value
	    for (int i = 0; i < a.length; i++) {	    
		if ( a[i] != b[i] ) {
		    theSame = false;
		}
	    } // for

	} // if
	else {
	    // different lengths!
	    theSame = false;
	}

	// at this point, the flag tells us whether the arrays have the same values
	if ( theSame) {
	    // the same values!
	    System.out.println("The arrays have the same values!");
	}
	else {
	    // different values
	    System.out.println("The arrays have different values!");
	}

    } // main

} // class