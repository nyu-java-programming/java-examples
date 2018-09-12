package edu.nyu.cs.fb1258;

import processing.core.*;

public class FlyingDog extends MovingThing {

	public FlyingDog(PApplet app) {
		super(app, "src/dog.jpg");
	}
	
	@Override
	public void move() {
		int dx = 2;
		this.setX(this.getX() + dx);
		if (this.getX() > this.getApp().width) {
			this.setX(0);
		}
		
	}
	
}
