package edu.nyu.cs.fb1258.processing_examples.alien_invasion;

import java.util.ArrayList;

import edu.nyu.cs.fb1258.processing_examples.alien_invasion.Alien;
import edu.nyu.cs.fb1258.processing_examples.alien_invasion.Spaceship;
import edu.nyu.cs.fb1258.processing_examples.alien_invasion.Bullet;
import processing.core.*;

/**
 * Basic controller for Space Invaders containing the main business logic of the game.
 * @author Foo Barstein
 * @version 0.2
 */
public class App extends PApplet {
	
	//window size of this app
	private final int w = 800;
	private final int h = 400;
	
	//make constants for some common colors... it's ok to make constants public
	public final int BLACK = this.color(0,0,0);
	public final int WHITE = this.color(255,255,255);
	
	//make constants for some common spacing... it's ok to make constants public
	public final static int ALIEN_SPACING = 20; 
	public final static int APP_MARGIN = 60; 
	public final static int NUM_ALIENS = 20;
	
	//variable to hold the spaceship
	private Spaceship spaceship;

	//an array to hold our friendly aliens
	private ArrayList<Alien> aliens = new  ArrayList<Alien>(); //will hold a bunch of  aliens

	//an array list that will hold any bullets  that are currently on screen.
	private ArrayList<Bullet> bullets = new  ArrayList<Bullet>();

	//setters and getters
	
	/**
	 * Getter for the ArrayList of Alien objects currently on the screen
	 * @return ArrayList of Alien objects
	 */
	public ArrayList<Alien> getAliens() {
		return this.aliens;
	}

	/**
	 * Setter for the ArrayList of Alien objects currently on the screen.
	 * @param aliens An ArrayList of Alien objects
	 */
	public void setAliens(ArrayList<Alien> aliens) {
		this.aliens = aliens;
	}

	/**
	 * Getter for the ArrayList of Bullet objects currently on the screen
	 * @return ArrayList of Bullet objects
	 */
	public ArrayList<Bullet> getBullets() {
		return this.bullets;
	}

	/**
	 * Setter for the ArrayList of Bullet objects currently on the screen.
	 * @param aliens An ArrayList of Bullet objects
	 */
	public void setBullets(ArrayList<Bullet> bullets) {
		this.bullets = bullets;
	}

	
	/**
	 * Called once to set up window
	 */
	public void settings() {
		this.size(this.w, this.h); //set window size		
	}
	
	/**
	 * Called once on load. Used to create the  window and "global" settings.
	 */
	public void setup() {
		this.background(this.BLACK); //set background  color
		
		//initialize spaceship
		this.spaceship = new Spaceship(this); // pass reference to this App object
		
		//initialize all aliens
		int x = App.APP_MARGIN; //x position of  first alien
		int y = App.APP_MARGIN; //y position of  first alien

		//loop as many times as there are aliens
		for (int i=0; i<App.NUM_ALIENS; i++) {
			
			//create a new alien for each  element of the array
			Alien alien = new Alien(x, y, this);  //pass the x,y coords and a  reference to this App class
			this.aliens.add(alien); //add this  alien to the array list

			//update x so the  next alien we draw appears further  to the right
			x += alien.getWidth() + App.ALIEN_SPACING; 
			
			//stay within bounds of the screen
			if (x > this.width - alien.getWidth() - App.APP_MARGIN) {
				//move down to the next line  before drawing next alien
				x = App.APP_MARGIN; //reset back  to left side of screen
				y += alien.getHeight() + App.ALIEN_SPACING; //upadte y so the  next row of aliens appears  further down the screen
			}
			
		}
	}
	
	/**
	 * Called repeatedly approximately 24 times  per second (Processing's default "frame  rate").  Used to update the animation and  enforce game play logic.
	 */
	public void draw() {
		//wipe the screen blank
		this.background(this.BLACK);
		
		//draw the spaceship
		this.spaceship.move(); //have the spaceship  move itself to a new location
		this.spaceship.draw(); //have the spaceship  draw itself to the screen
		
		//loop through ArrayList of bullets
		for (int i=0; i<this.bullets.size(); i++) {
			Bullet bullet = this.bullets.get(i);
			bullet.move(); //have the bullet  move itself to a new location
			bullet.draw(); //have the bullet  draw itself to the screen
		}
		
		//loop through ArrayList of aliens
		for (int i=0; i<this.aliens.size(); i++) {
			Alien alien = this.aliens.get(i);
			alien.move(); //have each alien move  itself to a new location
			alien.draw(); //have each alien draw  itself to the screen
		}
		
		//detect any collisions between bullets  and aliens
		//do this by brute force looping through  all combinations of bullets and aliens  and checking their positions
		ArrayList<Alien> aliensToRemove = new  ArrayList<Alien>(); //will hold the next  generation of aliens
		ArrayList<Bullet> bulletsToRemove = new  ArrayList<Bullet>(); //will hold the  next generation of bullets
		for (Bullet bullet : this.bullets) {
			for (Alien alien : this.aliens) {
				//our Bullet class has a static  method that checks whether there  is a collision
				if (Bullet.isCollision(bullet,  alien)) {
					//if there is a collision,  remove the bullet and the  alien from the screen
					aliensToRemove.add(alien); // add this alien to the list  that we will remove
					bulletsToRemove.add(bullet);  //add this bullet to the  list that we will remove
				}
			}
		}
		
		//enter all aliens we earmarked as  removable into removal proceedings
		for (Alien alien : aliensToRemove) {
			alien.kill(); //tell the alien to  kill itself
		}
		
		//remove all bullets we earmarked as  removable
		for (Bullet bullet:bulletsToRemove) {
			bullet.kill(); //tell the bullet to  kill itself
		}

	}

	/**
	 * Called whenever a key is pressed by the  user.  Move the spaceship left or right or  fires a bullet, depending on the key.
	 */
	public void keyPressed() {
		//the variable key holds a char  representing the key that was pressed.
		//processing has a few constants that  come in handy in determining which key  was pressed

		//left and right keys have codes
		if (this.key == PConstants.CODED) {
			switch (this.keyCode) {
				case PConstants.LEFT:
					this.spaceship.goLeft(); //turn left
					break;
				case PConstants.RIGHT:
					this.spaceship.goRight(); //turn right
					break;
				case PConstants.UP:
					this.spaceship.goUp(); //turn up
					break;
				case PConstants.DOWN:
					this.spaceship.goDown(); //turn down
					break;
			}
		}
		//space key does not have a code
		else if (key == ' ') {
			//handle space key
			this.spaceship.shoot();
		}
	}	
	
	/**
	 * Automatically called to start your program.  This method calls PApplet's main method and passes it the class name of this class.
	 * @param args Command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		PApplet.main("edu.nyu.cs.fb1258.processing_examples.alien_invasion.App");
	}
	
}