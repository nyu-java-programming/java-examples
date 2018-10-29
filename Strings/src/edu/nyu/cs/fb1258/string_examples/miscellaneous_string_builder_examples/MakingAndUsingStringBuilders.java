package edu.nyu.cs.fb1258.string_examples.miscellaneous_string_builder_examples;

/**
 * Miscellaneous examples of using the StringBuilder class
 * @author Foo Barstein
 * @version 2
 *
 */
public class MakingAndUsingStringBuilders {

	public static void main(String[] args) {
		//make a string object
		String x = "This is a string object!";

		//make a StringBuilder wrapper around that object
		StringBuilder b = new StringBuilder(x);
		
		//determine the length of the String and/or the StringBuilder
		System.out.println("The length of the String object is " + x.length());
		System.out.println("The length of the StringBuilder object is " + b.length());
		
		//append to the StringBuilder object, which is mutable
		b.append(" Huzzah!");
		System.out.println(b.toString());
		
		//delete parts of the String in the StringBuilder
		b.delete(b.toString().indexOf(" Huzzah!"), b.toString().length());
		System.out.println(b.toString());
		
		//insert a substring into the greater string
		b.insert(b.toString().indexOf("string"), "wonderful ");
		System.out.println(b.toString());
		
		//search and replace
		b.replace(b.toString().indexOf("wonderful "), b.toString().indexOf("wonderful ") + "wonderful ".length(), "magnanimous ");
		System.out.println(b.toString());
		
		//reverse!
		b.reverse();
		System.out.println(b.toString());

	}

}
