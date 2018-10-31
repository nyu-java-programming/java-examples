// notice that this package is different from that of FirstClassClass and SecondClassClas
package edu.nyu.cs.fb1258.different_package;

/**
 * This code goes along with the code in SuperBasicMethodIntroduction.java.  This class provides methods in a different package from the methods in that class.
 * That means that the protected method in this class cannot be called from any methds in that class.
 * Note that this class has no main method.  That is present in the FirstClassClass class.
 * @author Foo Barstein
 * @version 1
 *
 */

public class ThirdClassClass {

	/**
	 * A protected method can only be called from code within the same class.
	 */
	protected static void printSomethingUseless() {
		System.out.println("Useless!");
	}
}
