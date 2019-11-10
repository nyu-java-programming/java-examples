package edu.nyu.cs.fb1258.processing_examples.alien_invasion;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * 
 * This class represents a spaceship.
 * @author Foo Barstein
 * @version 0.1
 *
 */
public class Spaceship {

	//will hold a reference to the App object, which inherits from PApplet and therefore handles all the  Processing-specific stuff
	App app;
	
	//make sure the image file is in the src  folder
	private final static String SPACESHIP_IMAGE_PATH = "spaceship.png"; // image file
	private PImage img; //will hold the image to  use for this spaceship
	
	private int x, y; //position
	private int speedX = 1; //speed in x  direction... start out going to the right
	private int speedY = 1; //speed in Y direction... the y position is changed by this amount every time the ship goes up or down
	
	/**
	 * Constructor for a spaceship. 
	 * @param app A reference to the object that controls the flow of the game.  This object also inherits from PApplet, and so contains lots of useful methods that Processing codes into the PApplet class.
	 */
	public Spaceship(App app) {
		//set up initial properties for this  alien
		this.app = app; //keep a reference to the PApplet class to handle all Processing-specific functions and variables

		//position it on screen
		this.x = (int) (this.app.width / 2); //x  position centered on screen
		this.y = this.app.height - App.APP_MARGIN; // y position close to bottom of screen
		
		//load the image and store in PImage  variable
		this.img = this.app.loadImage(Spaceship.SPACESHIP_IMAGE_PATH);
	}

	/**
	 * Get the width of this spaceship, based on  the width of its image.
	 */
	public int getWidth() {
		// the PImage object has a width property
		return this.img.width;
	}
	
	/**
	 * Get the height of this spaceship, based  on the width of its image.
	 */
	public int getHeight() {
		// the PImage object has a height property
		return this.img.height;
	}
	
	/**
	 * Slide the spaceship further to the right  or left, depending upon the current  direction it's moving.
	 */
	public void move() {
		// calculate move by whichever amount is  specified in speedX variable.
		int newX = this.x + this.speedX; 
		
		//check bounds
		boolean outOfBoundsToTheLeft = newX < 0  + App.APP_MARGIN; //too far to the left?
		boolean outOfBoundsToTheRight = newX >  this.app.width - this.getWidth() - App. APP_MARGIN; //too far to the right?

		//if out of bounds...
		if (outOfBoundsToTheRight || outOfBoundsToTheLeft) {
			 //reverse direction
			this.toggleDirection(); //inverts  the sign of speed
			newX = this.x + this.speedX; // calculate move in new direction
		}
		
		//make update to position
		this.x = newX;
		
	}
	
	/**
	 * Sets by how much this spaceship moves  each frame.
	 * Setter for speedX property.
	 */
	public void setSpeed(int speedX) {
		this.speedX = speedX;
	}
	
	/**
	 * Draws this alien to the PApplet screen.   Each alien draws itself to the main app  screen in this way.
	 */
	public void draw() {
		// draw the image using PApplet's image method... 
		// the reason we store a reference to the App object in this class's constructor is so that we can use it to draw this image to the screen here
		this.app.image(this.img, this.x, this.y);
	}

	/**
	 * Move this spaceship in the opposite  direction from which it is currently moving
	 */
	public void toggleDirection() {
		this.speedX = -this.speedX; //invert the  sign of the speed it's currently moving
	}
	
	/**
	 * Set speed such that the spaceship moves  to the right.
	 */
	public void goRight() {
		//set speed to a positive value
		this.speedX = Math.abs(this.speedX);
	}

	/**
	 * Set speed such that the spaceship moves to the right.
	 */
	public void goLeft() {
		//set speed to a negative value
		this.speedX = -Math.abs(this.speedX);
	}

	/**
	 * Set speed such that the spaceship moves to up.
	 */
	public void goUp() {
		//set speed to a negative value
		this.y = this.y - Math.abs(this.speedY);
		
		//check bounds
		boolean isTooFarUp = this.y < 0 + this.getHeight();

		//if the spaceship is too far up...
		if (isTooFarUp) {
			//reposition this spaceship at the bottom of the screen
			this.y = app.height - this.getHeight();
		}
	}
	
	/**
	 * Set speed such that the spaceship moves to up.
	 */
	public void goDown() {
		//set speed to a negative value
		this.y = this.y + Math.abs(this.speedY);

		//check bounds
		boolean isTooFarDown = this.y > this.app.height - this.getHeight();

		//if the spaceship is too far up...
		if (isTooFarDown) {
			//reposition this spaceship at the bottom of the screen
			this.y = 0;
		}
	}
	
	/**
	 * Shoots a bullet out of the spaceship.
	 */
	public void shoot() {
		//create a new bullet object positioned  at the center of this spaceship
		int x = (int) (this.x + (this.getWidth()  / 2)); //the center x position of this  spaceship
		int y = this.y; // the top of the spaceship

		//create bullet object
		Bullet bullet = new Bullet(x, y, this.app);
		
	}

}