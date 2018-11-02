package edu.nyu.cs.fb1258.processing_examples.basics;

import processing.core.*;

/**
 * Pops open an applet window that displays a circle that follows the user's mouse around and leaves a trail behind.
 * To run this, you must have imported and added the Processing core.jar file to your build path.
 * @author Foo Barstein
 * @version 9
 *
 */
public class CircleTrails extends PApplet {

	//instance properties
	
	//constant instance variables used to hold the width and height and the window we will make
	private final int h = 600;
	private final int w = 600;
	
	//instance variables to hold the diameter of the circle we will draw
	private final int circleDiameter = 100;
	
	/**
	 * This method is automatically called by Java when the program first starts.
	 * @param args any command line arguments (ignored)
	 */
	public static void main(String[] args) {
		//must call PApplet's static main method, and supply the full package and class name of this class as an argument
		PApplet.main("edu.nyu.cs.fb1258.processing_examples.basics.CircleTrails");
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
		float g = 100f; //hard-coded amount of green
		float b = 92f; //hard-coded amount of blue
		
		//set the fill color to these pseudo-random values
		this.fill(r, g, b);
		
		// set the stroke color (the border around the circle) to be black
		this.stroke(0, 0, 0);
		
		//draw an ellipse at the current position of the mouse (notice the use of mouseX and mouseY properties inherited from PApplet)
		this.ellipse(this.mouseX, this.mouseY, this.circleDiameter, this.circleDiameter);
		
	}
	
	/**
	 * This method is automatically called whenever the user clicks the mouse on the window.  It wipes out what's on the screen and fills it with a solid color.
	 */
	public void mouseClicked() {
		//fill the window with this color (specified in 8-bit R,G,B values)
		this.background(255, 255, 255); //white wash
	}

}
