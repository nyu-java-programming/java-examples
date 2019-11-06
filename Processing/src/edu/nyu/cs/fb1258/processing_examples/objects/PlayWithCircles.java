package edu.nyu.cs.fb1258.processing_examples.objects;

import java.util.ArrayList;

import processing.core.PApplet;

/**
 * Creates a bunch of circles using the Circle class and animates them on screen using code inherited from Processing's PApplet class.
 * @author Foo Barstein
 * @version 1
 *
 */
public class PlayWithCircles extends PApplet {
	
	// the number of circles to create
	public static final int NUM_CIRCLES = 750;
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 600;
	
	// a mutable ArrayList of Circle objects
	private ArrayList<Circle> circles = new ArrayList<Circle>();

	/**
	 * Calls PApplet's static main method and passes it the full identifier of this class.
	 * @param args
	 */
	public static void main(String[] args) {
		// the main method must call PApplet's main method and pass it this class's package and class name as a String 
		PApplet.main("edu.nyu.cs.fb1258.PlayWithCircles");
	}
	
	/**
	 * Sets up the window width and height
	 */
	public void settings() {
		//System.out.println("settings");
		this.size(PlayWithCircles.WIDTH, PlayWithCircles.HEIGHT); // set the window width and height
	}
	
	/**
	 * Instantiates a bunch of Circle objects and adds them to an ArrayList
	 */
	public void setup() {
		//System.out.println("setup");
		
		// make some circles
		for (int i = 0; i<PlayWithCircles.NUM_CIRCLES; i++) {
			Circle myCircle = new Circle();
			this.circles.add(myCircle);
		}
		
	}
	
	/**
	 * This method is automatically called 60 times per second.
	 * It iterates through each Circle object, draws it to the screen, and moves it to a new pair of coordinates.
	 */
	public void draw() {
		
		//System.out.println("draw");
		
		this.background(255, 0, 0); // blood red background

		// draw all circles
		for (int i=0; i< circles.size(); i++) {
			
			// get one of the circles
			Circle thisCircle = circles.get(i);
			
			// set the fill color to the circle's color
			this.fill(thisCircle.getR(), thisCircle.getG(), thisCircle.getB());
			
			// draw the circle at its x an y coordinates
			this.ellipse(thisCircle.getX(), thisCircle.getY(), thisCircle.getWidth(), thisCircle.getHeight());			
			
			// update the circle's position
			thisCircle.setX(thisCircle.getX() + thisCircle.getSpeedX() );
			thisCircle.setY(thisCircle.getY() + thisCircle.getSpeedY() );
			
			// reverse the circle's direction, if it goes out of bounds
			if (thisCircle.getX() > PlayWithCircles.WIDTH || thisCircle.getX() <= 0) thisCircle.setSpeedX(thisCircle.getSpeedX() * -1);
			if (thisCircle.getY() > PlayWithCircles.HEIGHT || thisCircle.getY() <= 0) thisCircle.setSpeedY(thisCircle.getSpeedY() * -1);

		}

		
	}

}
