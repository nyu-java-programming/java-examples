// notice that this package is the same as that of FirstClassClass, but different from that of ThirdClassClass
package edu.nyu.cs.fb1258.method_examples;

/**
 * This code goes along with the code in SuperBasicMethodIntroduction.java.  This class provides methods in the same package as the methods in that class.
 * Note that this class has no main method.  That is present in the FirstClassClass class.
 * @author Foo Barstein
 * @version 1
 *
 */

public class SecondClassClass {
	
	/**
	 * Find the larger value between two values.
	 * @param arg1 The first value
	 * @param arg2 The second value
	 * @return larger the larger of the two
	 */
	public static int whichIsLarger(int arg1, int arg2) {
		// determine whether arg1 is bigger than arg2
		if (arg1 > arg2) {
			return arg1;
		}
		else {
			return arg2;
		}
	}
	
	/**
	 * A non-static method.. you'll see this method can't be called prefixed by the class name, since it does not belong to the class.
	 */
	public void doNothing() {
		//useless!
		printSomethingUseless();
	}
	
	/**
	 * A private method can only be called from within the same class.
	 * 
	 */
	private static void printSomethingUseless() {
		System.out.println("Useless!");
	}
	
	/**
	 * A protected method can be called from any code within the same package.
	 * 
	 */
	protected static void printAQuote() {
		String famousQuote = "\n'Nothing is written', said Lawrence of Arabia";
		System.out.println(famousQuote);
	}
	
	

}
