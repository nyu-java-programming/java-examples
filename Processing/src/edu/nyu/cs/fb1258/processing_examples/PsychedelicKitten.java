package edu.nyu.cs.fb1258.processing_examples;

import processing.core.*;

/**
 * This program creates a psychedelic image of ellipses behind a floating kitten and box.
 * To run this, you must have imported and added the Processing core.jar file to your build path.
 * @author Foo Barstein
 * @version 2.2
 */
public class PsychedelicKitten extends PApplet {

	//instance properties
	
	//properties of the window
	private int w = 600;
	private int h = 400;
	
	//properties of the rectangle
	private int rectXPos = 50;
	private int rectYPos = 50;
	private int rectWidth = 50;
	private int rectHeight = 50;
	
	//properties of ellipses
	private int ellipseWidth = 50;
	private int ellipseHeight = 50;
	private int ellipseSpacing = 100;
	
	//image 
	private PImage kitten;
	private int kittenXPos = 200;
	private int kittenYPos = 200;
	
	/**
	 * This method is automatically called when the program first is executed.
	 * @param args any command line arguments (ignored)
	 */
	public static void main(String[] args) {
		//run PApplet's static main method, and give it our class's full name, including package
		PApplet.main("edu.nyu.cs.fb1258.processing_examples.PsychedelicKitten");
	}
	
	/**
	 * This method is automatically called by PApplet's main method.
	 * Use it to make some app-wide settings
	 */
	public void settings() {
		//set the width and height of the window that pops open
		this.size(this.w, this.h);
	}
	
	/**
	 * This method is also called automatically by PApplet's main method
	 * Use it to set the stage... put some things on the screen when the window first pops open.
	 */
	public void setup() {
		//load the image file and store it in the PImage object
		this.kitten = this.loadImage("src/kitten.jpg");
	}
	
	/**
	 * This method is automatically called by PApplet's main method within a loop that iterates 30 times per second by default
	 */
	public void draw() {
		//wipe out the screen
		this.background(255, 128, 16);
		
		//draw the ellipses
		this.drawLotsOfEllipses();
		
		//draw a rectangle
		this.rect(this.rectXPos, this.rectYPos, this.rectWidth, this.rectHeight);
		
		//draw the kitten image
		this.image(this.kitten, this.kittenXPos, this.kittenYPos);
		
		//generate new x and y coords for the rectangle with a slight change
		this.rectXPos = this.rectXPos + this.getRandomOffset(10);
		this.rectYPos = this.rectYPos + this.getRandomOffset(10);
		
		//modify the size of the rectangle ever so slightly
		this.rectWidth = this.rectWidth + this.getRandomOffset(2);
		this.rectHeight = this.rectHeight + this.getRandomOffset(2);
		
		//if the rectangle goes out of bounds, we wrap it around the other side of the screen
		if (this.rectXPos > this.w) this.rectXPos = 0;
		if (this.rectYPos > this.h) this.rectYPos = 0;
		if (this.rectXPos < 0) this.rectXPos = this.w;
		if (this.rectYPos < 0) this.rectYPos = this.h;
		
		//generate new x and y coords for the kitten
		this.kittenXPos = this.kittenXPos + this.getRandomOffset(10);
		this.kittenYPos = this.kittenYPos + this.getRandomOffset(10);
		
		//if the kitten goes out of bounds, we wrap it around the other side of the screen
		if (this.kittenXPos > this.w) this.kittenXPos = 0;
		if (this.kittenYPos > this.h) this.kittenYPos = 0;
		if (this.kittenXPos < 0) this.kittenXPos = this.w;
		if (this.kittenYPos < 0) this.kittenYPos = this.h;
		
	}
	
	public void drawLotsOfEllipses() {
		//draw a grid of ellipses
		for (int x = 0; x <= this.w; x = x + this.ellipseSpacing) {
			for (int y = 0; y <= this.h; y = y + this.ellipseSpacing) {

				//set the fill color to random r,g,b values (each is an 8-bit number)
				int r = this.getRandomColor();
				int g = this.getRandomColor();
				int b = this.getRandomColor();
				this.fill(r, g, b);
				
				//draw the ellipse
				this.ellipse(x, y, this.ellipseWidth, this.ellipseHeight);							
				
			} //end inner for loop
		} //end outer for loop
	}
	
	/**
	 * This method returns an 8-bit int value suitable for setting a color in processing.
	 * @return
	 */
	public int getRandomColor() {
		//generate a pseudo-random int between 0 - 255
		int color = (int) (255 * Math.random()) + 1;
		return color;
	}
	
	/**
	 * This method adds a pseudo-random number to a value within a limited range
	 * @param val the original value to change
	 * @param range the maximum amount to change the value, in either the positive or negative directions
	 * @return the new value with the change applied
	 */
	public int getRandomOffset(int range) {
		//generate a new value that is at most either +range/2 or -range/2 from the original.
		double rand = (range * Math.random()) - (range / 2); //get a number from -range/2 to +range/2;
		long offset = Math.round(rand); //round it to the nearest whole number
		int offsetInt = (int) offset; // cast to integer
		return offsetInt;
	}
	

}
