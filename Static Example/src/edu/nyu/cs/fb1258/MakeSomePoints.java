package edu.nyu.cs.fb1258;

/**
 * Instantiates two Point objects and outputs their coordinates.
 * 
 * @author Foo Barstein
 * @version 0.5
 */
public class MakeSomePoints {

	public static void main(String[] args) {
		
		//instantiate a point object
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 10;
		p1.z = 10; //since z is static, all Point objects have z = 10 as a result of this change

		//instantiate another point object
		Point p2 = new Point();
		
		//print out the values in both Point objects... note that p2 has z = 10
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		
	}

}
