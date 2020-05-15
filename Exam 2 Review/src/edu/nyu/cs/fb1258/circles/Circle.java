
package edu.nyu.cs.fb1258.circles;

/**
 * A virtual circle
 * @author Foo Barstein
 * @version 0.9
 */
public class Circle {
	
	/**
	 * Creates a circle with a given diameter
	 * @param d The diameter of the circle
	 */
	public Circle(int d) {
		this.setDiameter(d); // good!
		Circle.circleCounter++;
	}
	
	/**
	 * @return the diameter
	 */
	public int getDiameter() {
		return this.diameter;
	}

	/**
	 * @param diameter the diameter to set
	 */
	public void setDiameter(int diameter) {
		if (diameter >= 0) {
			this.diameter = diameter;
		}
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Get the area of the circle
	 * @return The area of the circle
	 */
	public int getArea() {
		double radius = this.diameter / 2;
		double r2 = Math.pow(radius, 2);
		double area = r2 * Circle.PI;
		return (int) area;
	}
	
	public static int getNumCirclesInWorld() {
		return Circle.circleCounter;
	}
	
	private static int circleCounter = 0;
	private int diameter;
	private String title;
	public static final double PI = Math.PI;

}
