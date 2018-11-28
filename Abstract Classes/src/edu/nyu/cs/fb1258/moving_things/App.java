package edu.nyu.cs.fb1258.moving_things;

import java.util.ArrayList;

import processing.core.PApplet;

/**
 * A Processing-enabled app with a flying dog and a flying spaceship
 * @author Foo Barstein
 * @version 2
 *
 */
public class App extends PApplet {

	// width and height of the window
	private int w = 800;
	private int h = 600;
	
	// blank arraylist that will hold our moving things
	private ArrayList<MovingThing> things = new ArrayList<MovingThing>();

	public static void main(String[] args) {
		PApplet.main("edu.nyu.cs.fb1258.moving_things.App");
	}
	
	/**
	 * Set the size of the window
	 */
	public void settings() {
		this.size(w, h);
	}
	
	/**
	 * Do any setup before the first frame
	 */
	public void setup() {
		this.background(255, 255, 255);
		
		//instantate several dogs and spaceships and store them in instance variables
		for (int i=0; i<5; i++) {
			
			FlyingDog dog = new FlyingDog(this); // make a new dog
			this.things.add(dog); // add to the array list
			
			Spaceship ship = new Spaceship(this); // make a new ship
			this.things.add(ship); // add to the array list
		}
	}
	
	/**
	 * Draw a single frame of the animation
	 */
	public void draw() {
		
		// wipe out the background
		this.background(255, 255, 255);

		// loop through all the things
		for (MovingThing thing : things) {
			thing.draw();
			thing.move();
		}

	}

}
