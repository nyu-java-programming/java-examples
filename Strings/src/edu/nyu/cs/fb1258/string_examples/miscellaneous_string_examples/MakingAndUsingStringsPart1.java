package edu.nyu.cs.fb1258.string_examples.miscellaneous_string_examples;

/**
 * Lots of ways to instantiate and play with String objects
 * @author Foo Barstein
 * @version 2
 *
 */
public class MakingAndUsingStringsPart1 {

	/**
	 * Show how to make some strings and do some common operations on them.
	 * @param args Command line arguments, if any
	 */
	public static void main(String[] args) {
		
		// follow this code to see how to instantiate a string in various ways
		instantiateAStringInVariousWays();
		
		// follow this code to see some common string operations
		doSomeOperationsOnAString();
	}
	
	public static void instantiateAStringInVariousWays() {

		//creating a new string using syntactic sugar
		String x = "This is a string object!";
		System.out.println(x);

		//creating a new string the old-fashioned way
		x = new String("This is a string object!");
		System.out.println(x);
		
		//create a new string by concatenating two other strings the syntactic sugary way
		x = "This is a " + "string object!";
		System.out.println(x);

		//create a new string by concatenating two other strings the old-fashioned way
		x = "This is a ";
		x = x.concat("string object!");
		System.out.println(x);
		
		//creating a new string by sending a char array to the String constructor
		char[] y = {'T','h','i','s',' ','i','s',' ','a',' ','s','t','r','i','n','g',' ','o','b','j','e','c','t','!'};
		x = new String(y);
		System.out.println(x);
		
		//create a new string by getting a substring
		x = "Hello!  This is a string object! Ain't it grand?!";
		x = x.substring(8, 31);
		System.out.println(x);
		
		//create new string by copying an existing string to uppercase
		x = "this is a string object!";
		x = x.toUpperCase();
		System.out.println(x);
		
		//create a new string by copying an existing string to lowercase
		x = x.toLowerCase();
		System.out.println(x);
		
		//create a new string by trimming an existing string
		x = "  \t\t\tThis is a string object!   \n\n\n".trim();
		System.out.println(x);
		
		//create a new string by searching and replacing part of an existing string
		x = "This is a string class!";
		x = x.replace("class", "object");
		System.out.println(x);
		
	}
	
	public static void doSomeOperationsOnAString() {
		// let's say we had a string...
		String x = "This is a string object!";

		//searching for the position of a substring within a greater string
		int pos = x.indexOf("object", 0);
		System.out.println("The word 'object' occurs at position " + pos);
		
		//determine whether a given string contains a substring
		boolean hasIt = x.contains("object");
		System.out.println("The string has the word 'object' in it: " + hasIt);

		//determine the length of a String ojbect
		int l = x.length();
		System.out.println("The string is " + l + " chars long");
		
		//get access to a char at a certain position within a String object
		char c = x.charAt(6);
		System.out.println("The char at position 6 in the String is '" + c + "'");
		
		//compare the memory address locations of two string objects
		String a = x; //making an alias!
		boolean theSameAddress = (x == a);
		System.out.println("These two strings are stored at the same memory address: " + theSameAddress);
		
		//compare the values of two strings
		boolean theSameValue = x.equals(a);
		System.out.println("These two strings contain the same chars: " + theSameValue);
		
		//determine whether a given string starts with a particular substring
		boolean startsWithThis = x.startsWith("This");
		System.out.println("The string starts with the word 'This': " + startsWithThis);
		
		//determine whether a given string ends with a particular substring
		boolean endsWithExclamation = x.endsWith("!");
		System.out.println("The string ends with an exclamation: " + endsWithExclamation);
		
		//get the char array inside the string
		char[] y = x.toCharArray();
		System.out.println("The char at position 6 in the string is '" + y[6] + "'");
		
		//convert from a char array to a String object
		x = String.valueOf(y); //this is obviously a static method
		System.out.println(x);
		
		//formatting of strings
		x = String.format("%s", x); //this is obviously a static method!
		System.out.println(x);
	}

}
