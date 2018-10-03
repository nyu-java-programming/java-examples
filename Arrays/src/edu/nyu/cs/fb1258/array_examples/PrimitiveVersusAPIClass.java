package edu.nyu.cs.fb1258.array_examples;

public class PrimitiveVersusAPIClass {
	
	public static int getInteger(int x) {
		Integer y = new Integer(x);
		return y;
	}
	
	public static void main(String[] args) {
		
		// declare and populate an int
		int x = 10; // primitives have very limited functionality, if any
		
		// declare and populate an Integer "object"
		Integer y = new Integer(10); // API classes are much more full of functionality
		String z = y.toString(); // an example of a useful method that Integer gives you

		
		boolean a = true;
		Boolean b = new Boolean(true);
		int hashCode = b.hashCode();
		
		
	}

}
