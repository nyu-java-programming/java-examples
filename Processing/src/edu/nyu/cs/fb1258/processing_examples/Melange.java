package edu.nyu.cs.fb1258.processing_examples;

import processing.core.*;

/**
 * This program shows a mélange some objects that oscillate around the screen, a button that can be clicked on to display a message, and an object that follows the cursor around the screen.
 * To run this, you must have imported and added the Processing core.jar file to your build path.
 * @author Foo Barstein
 * @version 2.2
 *
 */
public class Melange extends PApplet {
	
	//instance properties
	
	//constants that hold the width and height of the window
	final private int w = 600;
	final private int h = 400;

	//circle-related properties
	private int circleX = 200;
	private int circleY = 200;
	private int circleDiameter = 100;
	private int circleSpeedX = 1; //how much to change the circle's X position with every frame
	
	//rectangle-related properties
	private int rectX = 30;
	private int rectY = 20;
	private int rectWidth = 100;
	private int rectHeight = 100;
	private int rectSpeedY = 5; //how much to change the rectangle's Y position with every frame
	
	//image-related properties
	private PImage puppy;
	private PImage button;

	/**
	 * This method is automatically called when the program runs.
	 * @param args any command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		//call PApplet's main method and supply your class name
		//note that any package name must be prefixed
		PApplet.main("edu.nyu.cs.fb1258.processing_examples.Melange");
	}
	
	/**
	 * This method is used for general app settings.  We set the size of the window, and load up the images into instance properties.
	 */
	public void settings() {
		//set the width and height of the app window
		this.size(this.w, this.h);
		
		//get a PImage object and store it in the instance property
		puppy = this.loadImage("src/puppy.jpg");
		button = this.loadImage("src/button.png");
	}
	
	/**
	 * This is used to compose the first frame
	 */
	public void setup() {
		//using colors from colourlovers.com: http://www.colourlovers.com/palette/4535252/unfinished_2nd
		
		//fill the window with a solid color
		this.background(240, 224, 7); //in R,G,B 8-bit values
		
		//draw the puppy at its original starting position
		this.image(this.puppy, width/2, height/2);
		
	}
	
	/**
	 * This method determines the contents of all subsequent frames.
	 * This method is automatically called many times per second (usually 30 times per second by default)
	 */
	public void draw() {
		//re-fill the window with a solid color to wipe out any existing graphics
		this.background(240, 224, 7); //in R,G,B 8-bit values
		
		//change the fill color
		this.fill(85, 178, 202); //'another chance'
		this.stroke(201, 108, 85); //'C96C55'
		
		//draw a simple ellipse: x coord, y coord, width, height
		this.ellipse(this.circleX, this.circleY, this.circleDiameter, this.circleDiameter);
		
		//draw a rectangle: x coord, y coord, width, height
		this.rect(this.rectX, this.rectY, this.rectWidth, this.rectHeight);
		
		//draw a poor puppy centered wherever the cursor is pointing
		this.image(puppy, this.mouseX - 75, this.mouseY - 75);
		
		//draw the button at the top left of the screen
		this.image(button, 0, 0);

		//check whether the circle is out of bounds
		if (this.circleX > this.width - (this.circleDiameter / 2) || this.circleX - (this.circleDiameter / 2) < 0) {
			//if so, change its direction
			this.circleSpeedX = this.circleSpeedX * -1;
		}
		//now move the rectangle horizontally
		this.circleX = this.circleX + circleSpeedX;
		
		//check whether the rectangle is out of bounds
		if (this.rectY > this.height - this.rectWidth || this.rectY < 0) {
			//if so, change its direction
			this.rectSpeedY = this.rectSpeedY * -1;
		}
		//now move the rectangle vertically
		this.rectY = this.rectY + this.rectSpeedY;
		
	}
	
	/**
	 * This method is automatically called whenever the user clicks the mouse/trackpad
	 */
	public void mouseClicked() {
		String message = "woof"; //a default message to draw to the screen
		
		//check whether the click happened "inside" the button area
		if (this.mouseX > 0 && this.mouseX < this.button.width && this.mouseY > 0 && this.mouseY < this.button.height) {
			//change the message
			message = "CLICK!";
		}

		//set the font size
		this.textSize(100);
		
		//generate a random x and y coordinate where to put the text
		int x = (int) (Math.random() * this.width);
		int y = (int) (Math.random() * this.height);
		
		//debugging...
		//System.out.println(x + ":" + y);
		
		//draw the text
		this.fill(0, 0, 0);
		this.text(message, x, y);
		
	}
	
	

}
