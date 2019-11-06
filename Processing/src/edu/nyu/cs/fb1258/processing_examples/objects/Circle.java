package edu.nyu.cs.fb1258.processing_examples.objects;

/**
 * A circle and everything related to a circle
 * @author Foo Barstein
 * @version 1
 *
 */
public class Circle {

	// propertiess
	private int x = 10;
	private int y = 10;
	private int width = 50;
	private int height = 50;
	private int speedX = 5;
	private int speedY = 8;
	int r;
	int g;
	int b;
	
	public static final int MAX_X = 1000;
	public static final int MAX_Y = 600;
	public static final int MAX_DIAMETER = 100;
	public static final int MAX_SPEED = 5;
	
	// constructors
	
	/**
	 * Create a circle with particular x,y coordinates and speeds in the x and y directions.
	 * @param x The x coordinate
	 * @param y The y coordinate
	 * @param speedX The speed in the x direction
	 * @param speedY The speed in the y direction
	 */
	public Circle(int x, int y, int speedX, int speedY) {
		this.setX(x);
		this.setY(y);
		this.setSpeedX(speedX);
		this.setSpeedY(speedY);
	}
	
	/**
	 * No-args constructor.
	 * Creates a circle with random x,y coordinates, random speed, random diameter, and random color
	 */
	public Circle() {
		// set up pseudo-random x, y coordinates
		int x = (int) (Math.random() * Circle.MAX_X);
		int y = (int) (Math.random() * Circle.MAX_Y);
		this.setX(x);
		this.setY(y);

		// set up pseudo-random speed in the x and y directions
		this.setSpeedX((int) (Math.random() * Circle.MAX_SPEED) * 2 - Circle.MAX_SPEED );
		this.setSpeedY((int) (Math.random() * Circle.MAX_SPEED) * 2 - Circle.MAX_SPEED );

		// set up pseudo-random diameter
		int d = (int) (Math.random() * Circle.MAX_DIAMETER) + 1; 
		this.setWidth(d);
		this.setHeight(d);		

		// set up pseudo-random color
		this.setR((int) (Math.random() * 256));
		this.setG((int) (Math.random() * 256));
		this.setB((int) (Math.random() * 256));
		
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the speedX
	 */
	public int getSpeedX() {
		return speedX;
	}

	/**
	 * @param speedX the speedX to set
	 */
	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	/**
	 * @return the speedY
	 */
	public int getSpeedY() {
		return speedY;
	}

	/**
	 * @param speedY the speedY to set
	 */
	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the r
	 */
	public int getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(int r) {
		this.r = r;
	}

	/**
	 * @return the g
	 */
	public int getG() {
		return g;
	}

	/**
	 * @param g the g to set
	 */
	public void setG(int g) {
		this.g = g;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	
}
