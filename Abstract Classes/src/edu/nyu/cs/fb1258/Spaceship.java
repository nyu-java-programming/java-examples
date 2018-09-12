package edu.nyu.cs.fb1258;

import processing.core.*;

public class Spaceship extends MovingThing {

	public Spaceship(PApplet app) {
		super(app, "src/spaceship.jpg");
	}
	
	@Override
	public void move() {
		int dx = (int) (Math.random() * 5 - 2.5);
		int dy = (int) (Math.random() * 5 - 2.5);
		
		this.setX(this.getX() + dx);
		this.setY(this.getY() + dy);
	}
}
