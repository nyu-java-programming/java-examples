package edu.nyu.cs.fb1258.string_examples.miscellaneous_string_examples;

/**
 * A miscellaneous assortment of manipulating String objects
 * @author Foo Barstein
 * @version 2
 *
 */
public class MakingAndUsingStringsPart2 {

	public static void main(String[] args) {
		
		//through syntactic sugar to make a new string object
		String x = "Hello world!"; //syntactic sugar... a.k.a java allowing you to take shortcuts in your syntax

		//by using the 'regular' syntax for making a new object of the type String
		String y = new String("Hello world!");
		
		//through method return values
		String z = Integer.toString(5); //get a string object returned to you from a method call
		
		//through an operation
		String a = "Hello " + new String("world!");
		
		//through a constructor that accepts a char[] array
		char[] b1 = {'a', 'b', 'c'};
		String b = new String(b1);
		System.out.println(b);
		System.out.println("The length of the array is " + b1.length);
		
		String c = "This is a string!";
		String d = c.concat(" Isn't it amazing?!");
		System.out.println(d);
		
		//trim method example
		String g = "   \n\n\n \t\t This is a string with leading whitespace.  \n\n \t\t";
		g = g.trim();
		System.out.println(g);
		
		//get a substring in a really convoluted way
		String h = new String("Hello world").toLowerCase().toUpperCase().concat("foobar").substring(0,  4);
		System.out.println(h);
		
		//do a search/replace operation on the string object
		String i = "foolish bar food bar football bar";
		i = i.replace("foo", "bar"); //"barlish bar bard bar bartball bar"
		System.out.println(i);
		
		//find out some data about the string
		int j = i.indexOf("bartball", 0);
		System.out.println(j);
		
		//find out whether one string contains another
		boolean k = i.contains("bartball");
		System.out.println(k);
		
		//get the number of characters in a String object
		String l = "This is a new string object with some text in it";
		int leng = l.length();
		System.out.println(leng);
		
		//get the char at a certain position within the string
		char m = l.charAt(10);
		System.out.println("The char at position 10 in the string is " + m);
		
		//determine whether a string starts with a certain prefix
		String n = "Twas brillig and the slithy toves";
		boolean o = n.startsWith("Twas"); //ends works the same way
		System.out.println("The string starts with 'Twas': " + o);

		char[] p = n.toCharArray();
		System.out.println(p); //turns out this actually prints the string... don't memorize that please... that's the 'wrong knowledge'
		
		//get the string value of a char array
		String q = String.valueOf(p);
		System.out.println(q);
		
		//format a string
		String r = String.format("%100s", q);
		System.out.println(r);
		
		//format a string while printing
		System.out.printf("%100s", q);
				
	}

}
