package edu.nyu.cs.fb1258;

import processing.core.PApplet;

public class ProcessingExample extends PApplet {

	private int w = 800;
	private int h = 600;
	private FlyingDog fido;
	private Spaceship ship;
	
	public static void main(String[] args) {
		PApplet.main("edu.nyu.cs.fb1258.ProcessingExample");
	}
	
	public void settings() {
		this.size(w, h);
	}
	
	public void setup() {
		this.background(255, 255, 255);
		//instantate the dog and spaceship and store them in instance variables
		this.fido = new FlyingDog(this);
		this.ship = new Spaceship(this);
	}
	
	public void draw() {
		this.background(255, 255, 255);

		fido.draw();
		ship.draw();
		
		fido.move();
		ship.move();
		
	}

}
