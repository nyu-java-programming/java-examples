package edu.nyu.cs.fb1258.moving_things;

import processing.core.*;

/**
 * A representation of a flying dog, which inherits from the abstract class, MovingThing
 * @author Foo Barstein
 * @version 2
 *
 */
public class FlyingDog extends MovingThing {

	/**
	 * Constructor that takes a reference to the App object that Processing automatically instantiates from the App class
	 * @param app A reference to the App object, which contains lots of useful methods inherited from the PApplet class.
	 */
	public FlyingDog(App app) {
		super(app, "src/dog.jpg");
	}
	
	/**
	 * Update the position of this FlyingDog.  This is an implementation of the abstract class, MovingThing's abstract method move().
	 */
	@Override
	public void move() {
		// hard-coded change in x position
		int dx = 2;
		this.setX(this.getX() + dx);
		
		// bounds checking - wrap the dog around the screen if it goes too far to the right
		if (this.getX() > this.getApp().width) {
			// reset to zero
			this.setX(0);
		}
		
	}
	
}
