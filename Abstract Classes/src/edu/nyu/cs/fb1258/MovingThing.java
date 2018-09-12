package edu.nyu.cs.fb1258;

import processing.core.*;

public abstract class MovingThing {
	
	private int x = 0;
	private int y = 0;
	
	private PApplet app;
	private PImage img;

	public int getX() {
		return x;
	}
 
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public MovingThing(PApplet app, String imgPath) {
		this.setApp(app);
		this.img = app.loadImage(imgPath);
	}
	
	public void draw() {
		app.image(this.img, this.x, this.y);
	}
	
	public abstract void move();
	
}
