package edu.nyu.cs.fb1258.string_examples.string_imitator_example;

/**
 * A test script for trying out the MyOwnString class.
 * @author Foo Barstein
 * @version 1
 *
 */
public class TestMyOwnString {

	public static void main(String[] args) {
		
		// a char array
		char[] cs = {'t','h','i','s',' ','i','s',' ','a',' ','c','h','a','r',' ','a','r','r','a','y'};
		System.out.printf("The car array has %d chars in it\n",  cs.length);
		
		// instantiate two identical custom string objects
		MyOwnString x = new MyOwnString(cs);
		MyOwnString y = new MyOwnString(cs);
		
		// compare the two in various ways
		if (x == y) {
			System.out.println("The two MyOwnStrings are located at the same position in memory");
		}
		else if (x.equals(y)) {
			System.out.println("The two MyOwnStrings are equals");
		}
		else {
			System.out.println("The two MyOwnStrings are neither at the same position in memory, nor equals, whatever that means.");
		}
		
		
		
		System.out.println(x);

	}

}
