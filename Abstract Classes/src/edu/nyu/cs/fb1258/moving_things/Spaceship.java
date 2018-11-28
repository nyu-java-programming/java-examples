package edu.nyu.cs.fb1258.moving_things;

import processing.core.*;

/**
 * A representation of a spaceship, which inherits from the abstract class, MovingThing
 * @author Foo Barstein
 * @version 2
 *
 */
public class Spaceship extends MovingThing {

	/**
	 * Constructor that takes a reference to the App object that Processing automatically instantiates from the App class
	 * @param app A reference to the App object, which contains lots of useful methods inherited from the PApplet class.
	 */
	public Spaceship(App app) {
		super(app, "src/spaceship.jpg");
	}
	
	/**
	 * Update the position of this Spaceship.  This is an implementation of the abstract class, MovingThing's abstract method move().
	 */
	@Override
	public void move() {
		// randomly calculate a change in the x and y directions
		int dx = (int) (Math.random() * 5 - 2.5);
		int dy = (int) (Math.random() * 5 - 2.5);
		
		// set the new x and y coordinates using the parent class's setX and setY methods
		this.setX(this.getX() + dx);
		this.setY(this.getY() + dy);
	}
}
