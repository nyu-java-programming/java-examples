package edu.nyu.cs.fb1258.processing_examples.basics;

import processing.core.*;

/**
 * Pops open an applet window that displays several circles that trace the user's mouse around and leave a trail behind.
 * To run this, you must have imported and added the Processing core.jar file to your build path.
 * @author Foo Barstein
 * @version 9
 *
 */
public class CircleTrailsMirrors extends PApplet {

	//instance properties
	
	//constant instance variables used to hold the width and height and the window we will make
	private final int h = 600;
	private final int w = 600;
	
	//instance variables to hold the diameter of the circle we will draw
	private final int circleDiameter = 20;
	
	/**
	 * This method is automatically called by Java when the program first starts.
	 * @param args any command line arguments (ignored)
	 */
	public static void main(String[] args) {
		//must call PApplet's static main method, and supply the full package and class name of this class as an argument
		PApplet.main("edu.nyu.cs.fb1258.processing_examples.basics.CircleTrailsMirrors");
	}
	
	/**
	 * Method to draft general settings of the app
	 */
	public void settings() {
		//set the site of the window in pixels to the value of these two instance properties
		this.size(this.w, this.h); 
	}
	
	/**
	 * Method to compose the first 'frame' of the app
	 */
	public void setup() {
		
		//fill the background with this color (specified in 8-bit Red, Green, Blue values)
		this.background(255, 255, 255); //white

	}
	
	/**
	 * This method is called repeatedly many times per second (usually 30 times per second by default) for the lifetime of the app.
	 */
	public void draw() {

		//generate pseudo-random R,G,B values
		float r = 255 * (second() * 1.0f/60); //between 0 - 255 based on current number of seconds
		float g = 0f; //hard-coded amount of blue
		float b = 255 - r; //between 255 - 0 based on current number of seconds
		//System.out.printf("Setting fill color to %f, %f, %f\n", r, g, b); //debug
		
		//set the fill color to these pseudo-random values
		this.fill(r, g, b);
		
		// set the stroke color (the border around the circle) to be white
		this.stroke(255, 255, 255);
		
		//draw an ellipse at the current position of the mouse (notice the use of mouseX and mouseY properties inherited from PApplet)
		this.ellipse(this.mouseX, this.mouseY, this.circleDiameter, this.circleDiameter);

		//draw an ellipse across from the mouse in the horizontal direction
		this.ellipse(this.w - this.mouseX, this.mouseY, this.circleDiameter, this.circleDiameter);

		//draw an ellipse across from the mouse in the vertical direction
		this.ellipse(this.mouseX, this.h - this.mouseY, this.circleDiameter, this.circleDiameter);

		//draw an ellipse across from the mouse in both the horizontal and vertical directions
		this.ellipse(this.w - this.mouseX, this.h - this.mouseY, this.circleDiameter, this.circleDiameter);

	}
	
	/**
	 * This method is automatically called whenever the user clicks the mouse on the window.  It wipes out what's on the screen and fills it with a solid color.
	 */
	public void mouseClicked() {
		//fill the window with this color (specified in 8-bit R,G,B values)
		this.background(255, 255, 255); //white wash
	}

}
