package edu.nyu.cs.fb1258;

/**
 * A point in 3-dimensional space.  The z property is static, therefore shared by all points.
 * 
 * @author Foo Barstein
 * @version 0.5
 */
public class Point {
	
	//some properties 
	public int x = 0;
	public int y = 0;
	public static int z = 0; //note that z is static

	//a convenient method for getting the String representation of a Point object
	/**
	 * Override of Object's toString() method.
	 * 
	 * @return A string representation of the object
	 */
	public String toString() {
		return "A point object positioned at " + x + ", " + y + ", " + z;
	}

}
