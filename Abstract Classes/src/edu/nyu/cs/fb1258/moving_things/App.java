package edu.nyu.cs.fb1258.moving_things;

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
	
	/**
	 * The flying dog
	 */
	private FlyingDog fido;
	
	/**
	 * The spaceship
	 */
	private Spaceship ship;
	
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
		
		//instantate the dog and spaceship and store them in instance variables
		this.fido = new FlyingDog(this);
		this.ship = new Spaceship(this);
	}
	
	/**
	 * Draw a single frame of the animation
	 */
	public void draw() {
		// wipe out the background
		this.background(255, 255, 255);

		// draw the dog
		fido.draw();
		
		// draw the spaceship
		ship.draw();
		
		// update the dog's position
		fido.move();
		
		// update the spaceship's position
		ship.move();
		
	}

}
