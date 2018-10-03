package edu.nyu.cs.fb1258.array_examples;

/**
 * This example shows how to split a String into an array using the String's split() method.
 * @author Foo Barstein
 * @version 9.1
 */

public class SplitString {

	public static void main(String[] args) {
		
		//define  astring
		String foo = "Lorem ipsum dolor sit amet, consectetur  adipiscing elit. Donec a diam lectus. Sed sit amet  ipsum mauris. Maecenas congue ligula ac quam viverra  nec consectetur ante hendrerit. Donec et mollis dolor.  ";

		//create an array based on the string
		//String[] words = foo.split("[ ,.?\\s+]"); //includes punctuation
		String[] words = foo.split(" ");
		
		//loop through the array and print out each element
		for (int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		
		
	}

}