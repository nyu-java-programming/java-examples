package edu.nyu.cs.fb1258.moving_things;

import processing.core.*;

/**
 * An abstract representation of a Moving Thing.  This class can never be instantiated
 * @author Foo Barstein
 * @version 2
 *
 */
public abstract class MovingThing {
	
	/**
	 * Constructor that accepts a reference to an App object and a path to an image to show for this thing.
	 * @param app The app object that PApplet automatically instantiates from the App class.
	 * @param imgPath The path to the image file to use to display this thing to the screen.
	 */
	public MovingThing(App app, String imgPath) {
		this.setApp(app);
		this.img = app.loadImage(imgPath);
	}
	

	// the x and y coordinate of this thing
	private int x = 0;
	private int y = 0;
	
	// speed in the x and y coordinates
	private int speedX = 5;
	private int speedY = 5;
	
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
	 * The App object, which inherits from PApplet and has lots of useful methods for animation
	 */
	private App app;
	
	/**
	 * The image that we will draw to the screen to represent this object visually
	 */
	private PImage img;


	/**
	 * Getter for the x position
	 * @return The current x position of this object
	 */
	public int getX() {
		return this.x;
	}
 
	/**
	 * Getter for the y position
	 * @return The current y position of this object
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * Setter for the x position
	 * @param x The new x position to set for this object.
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Setter for the y position
	 * @param y The new y position to set for this object.
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Getter for the App object
	 * @return The App object
	 */
	public PApplet getApp() {
		return this.app;
	}

	/**
	 * Setter for the App object
	 * @param app The App object to set
	 */
	public void setApp(App app) {
		this.app = app;
	}

	/**
	 * Draw this thing to the screen, using the App object's image method
	 */
	public void draw() {
		// draw the image to the screen using the image() method of the App object
		app.image(this.img, this.x, this.y);
	}
	
	/**
	 * An unimplemented move method.  Each sub-class will have to implement their own version of this method.
	 */
	public abstract void move();
	
}
