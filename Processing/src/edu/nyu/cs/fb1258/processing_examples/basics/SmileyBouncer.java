package edu.nyu.cs.fb1258.processing_examples.basics;

import processing.core.*;

/**
 * This program creates a circle that bounces around the screen and collides off of a smiley face that follows the user's pointer around.
 * To run this, you must have imported and added the Processing core.jar file to your build path.
 * @author Foo Barstein
 * @version 88.1
 *
 */
public class SmileyBouncer extends PApplet {

	//instance properties	
	
	//basic window size settings
	private final int h = 600;
	private final int w = 400;
	
	//the starting settings of the circle
	private int x = 200;
	private int y = 200;
	private int circle_radius = 25;
	private int speedX = 1;
	private int speedY = 2;

	//flag indicating whether or not there has been a collision
	private boolean isCollision = false;

	//define a processing-specific image data type that will hold the smiley face image
	private PImage smiley;

	/**
	 * This method is automatically called by Java when the program first starts.
	 * @param args any command line arguments (not used)
	 */
	public static void main(String[] args) {
		//must call PApplet's static main method, and supply the full package and class name of this class as an argument
		PApplet.main("edu.nyu.cs.fb1258.processing_examples.basics.SmileyBouncer");
	}
	
	//application-wide settings
	public void settings() {
	  this.size(this.w, this.h);
	  
	  //load up our smiley face icon
	  this.smiley = this.loadImage("src/smiley.png");
	}

	//settings for the first frame
	public void setup() {
	
	  this.background(255, 255, 255); //white background
	  
	  //set up the fill and stroke colors
	  this.fill(0, 0, 255); //rgb
	  this.stroke(255, 0, 0); //rgb
	}

	//frame-by-frame animation settings
	public void draw() {
		  this.background(255, 255, 255); //white background

	  //draw the cursor image
	  this.imageMode(PConstants.CENTER); //make the x, y coordinate of the image center
	  this.image(this.smiley, this.mouseX, this.mouseY);  //draw the smiley image at the mouse's position
	  
	  //draw the ellipse
	  this.ellipse(this.x, this.y, this.circle_radius*2,  this.circle_radius*2); //draw the ellipse

	  //adjust the position of the ellipse
	  this.x = this.x + this.speedX; //move in the x  direction
	  this.y = this.y + this.speedY; //move in the y  direction
	  
	  //check the bounds of the x position  of the ellipse
	  if (this.x >= this.width - this.circle_radius || this.x  <= 0 + this.circle_radius) {
	   this.speedX = this.speedX * -1;
	  } 

	  //check the bounds of the y position  of the ellipse
	  if (this.y >= this.height - this.circle_radius || this.y  <= 0 + this.circle_radius) {
	   this.speedY = this.speedY * -1;
	  } 
	  
	  //check for collision between circle  and smiley
	  if (this.isCollision == false && (abs( this.mouseX - this.x) < 50 && abs(this.mouseY - this.y) <  50)) {
	    //if we have a collision, reverse  the direction of the ball
	    this.speedX = this.speedX * -1;
	    this.speedY = this.speedY * -1;
	    //remember that we have a collsion  so we don't look for more collisions
	    this.isCollision = true;
	  }
	  else if (abs(this.mouseX - this.x) > 50 && abs( this.mouseY - this.y) > 50) {
	      //if we had a collsion, but we  don't have one any more, reset  the flag
	      this.isCollision = false;
	  }
	    
	}

}
