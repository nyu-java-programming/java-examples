package edu.nyu.cs.fb1258.processing_examples.alien_invasion;

import processing.core.*;

/**
 * The Alien class represents an Alien.
 * @author Foo Barstein
 * @version 0.1
 */
public class Alien {

	//will hold a reference to the App object, which inherits from PApplet and therefore handles all the  Processing-specific stuff
	private App app;
	
	//make sure the image file is in the src  folder
	private final static String ALIEN_IMAGE_PATH  = "alien.png"; //alien image file
	private PImage img; //will hold the image to  use for this alien
	
	private final static int MAX_SPEED = 4; // maximum speed the alien will move in any  direction
	
	private boolean isAlive = true; //flag to  hold living status of this alien

	public int x, y; //position
	private int speedX, speedY; //speed in both  directions

	/**
	 * Constructor for an Alien object.  
	 * @param x The x position at which to draw this alien.
	 * @param y The y position at which to draw this alien.
	 * @param app A reference to the object that controls the flow of the game.  This app object also inherits from PApplet, and so contains lots of useful methods that Processing codes into the PApplet class.
	 */
	public Alien(int x, int y, App app) {
		//set up initial properties for this  alien
		this.app = app; //keep a  reference to the PApplet class to handle  all Processing-specific functions and  variables

		//set position
		this.x = x; //x position
		this.y = y; //y position
		
		//set random speeds
		this.speedX = this.getRandomSpeed();
		this.speedY = this.getRandomSpeed();
		
		//load the alien image and store in  PImage variable
		this.img = app.loadImage(Alien.ALIEN_IMAGE_PATH);
		
	}

	/**
	 * Get the width of this alien, based on the  width of its image.
	 * @return int width of this image
	 */
	public int getWidth() {
		return this.img.width; //return the PImage object's width property
	}
	
	/**
	 * Get the height of this alien, based on  the width of its image.
	 * @return int height of this image
	 */
	public int getHeight() {
		return this.img.height; //return the PImage object's height property
	}
	
	/**
	 * Get a random speed.
	 * @return random int between min and max  speed settings
	 */
	public int getRandomSpeed() {
		//generate a random int between the  alien's -MAX_SPEED and +MAX_SPEED
		int speed = (int) ((Math.random() * Alien.MAX_SPEED * 2) - Alien.MAX_SPEED);
		return speed;
	}


	/**
	 * Moves this alien to a new position.
	 * Setter for x and y properties.
	 */
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Sets by how much this alien moves each  frame.
	 * Setter for speedX and speedY properties.
	 */
	public void setSpeed(int speedX, int speedY)  {
		this.speedX = speedX;
		this.speedY = speedY;
	}
	
	/**
	 * Kill this alien.
	 * Simply sets this alien's isAlive  attribute to false and removes it from the  PApplet's list of aliens;
	 */
	public void kill() {
		this.isAlive = false;
		this.app.getAliens().remove(this); //remove  this alien from the list of aliens
	}
	
	/**
	 * Draws this alien to the PApplet screen.   Each alien draws itself to the main app  screen in this way.
	 */
	public void draw() {
		//no point drawing a dead alien...
		if (this.isAlive) {
			//draw the image using PApplet's  image method
			this.app.image(this.img, this.x, this.y);
		}
	}

	/**
	 * Move this alien to a randomly-generated new position
	 */
	public void move() {
		int speedX = this.getRandomSpeed(); // new speed in x direction
		int speedY = this.getRandomSpeed(); // new speed in y direction

		this.setSpeed(speedX, speedY); //update  internal speed info
		
		int newX = this.x + this.speedX; // calculate new x position
		int newY = this.y + this.speedY; // calculate new y position

		//keep this alien within the borders!
		if (newX < 0) newX = this.app.width; //if  it went too far to the left, wrap it to  the right
		else if (newX > this.app.width) newX = 0; //if it went too far to the right, wrap  it to the left
		if (newY < 0) newY = this.y; //if it  went too far up, don't let it go any  further
		else if (newY + this.getHeight() > this.app.width) newY = this.y; //if it went too  far down, don't let it go any further
		
		//update to the new position
		this.setPosition(newX, newY);
	}
	
}