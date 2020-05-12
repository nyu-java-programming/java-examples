package edu.nyu.cs.fb1258.fractals.koch_snowflake;

import processing.core.*;

/**
 * Example of recursion.  This class  represents a simplified Koch Snowflake
 * @author Foo Barstein
 * @version 2
 */
public class KochSnowflake extends PApplet {

	public static void main(String[] args) {
		PApplet.main("edu.nyu.cs.fb1258.fractals.koch_snowflake.KochSnowflake");
	}
	
	/**
	 * width and height of the window
	 **/
	int width = 600;
	int height = 600;
	
	final int MARGIN = 10; // margins around the edge of the window
	
	/**
	 * how many levels deep of recursion  dive... note that this is not the  same concept as how many times a loop  iterates
	 */
	int levelsOfRecursion = 8;
	
	/**
	 * a counter to keep track of how many  times our recursive method is called
	 */
	int methodCallCounter = 0;
	
	/**
	 * override PApplet's settings method
	 */
	public void settings() {
		this.size(width, height);
	}
	
	/**
	 * override PApplet's setup() method
	 */
	public void setup() {
		
		//create the points that represent  the beginning and ending of the  first line
		Point p1 = new Point(MARGIN, height-MARGIN); // bottom left point
		Point p2 = new Point(width-MARGIN,  height-MARGIN); //bottom right point
		
		//call the makeLine method for the  first time
		this.makeLine(p1, p2, levelsOfRecursion);
	}

	/**
	 * This method takes two points and  draws a line between them.  It also  calculates the midpoint of this line,  offsets its y coordinate a bit, and  draws a line from the first point to  this midpoint, and another from this  midpoint to the second point.
	 * @param p1 starting point of a line
	 * @param p2 ending point of a line
	 * @param recursionLevel keeps track  of which level of recursion we are  currently at... in descending order
	 */
	public void makeLine(Point p1, Point  p2, int recursionLevel) {

		//increment the counter that keeps  track of how many times we called  this method
		methodCallCounter++; 
		
		//debugging
		System.out.printf("method call #%2d; recursion level %2d.\n", methodCallCounter, recursionLevel);

		//subtract from the counter that  keeps track of how many recursive  levels we've processed
		recursionLevel--; 
		
		//stop recursing after we've  reached the last level
		if (recursionLevel > 0) {
			
			//draw a line between the two  points with different color for each level of recursion
			float r = (float) (255*recursionLevel/levelsOfRecursion);
			float g = (float) (128*recursionLevel);
			float b = (float) (255*recursionLevel/levelsOfRecursion);
			this.stroke(r, g, b);
			
			// draw a line between the two points
			this.line(p1.x, p1.y, p2.x, p2.y);

			//calculate the midpoint of  the line
			float midX = ((p2.x + p1.x) /  2); //the mid x coordinate
			float midY = ((p2.y + p1.y) /  2); //the mid y coordinate
			midY = midY - midY/2; // subtract some factor from the  y position so that each  successive line is higher up  the screen.
			Point midPoint = new Point(( int) midX, (int) midY); //new  point object representing this  midpoint
//			System.out.println(midPoint.x  + ":" + midPoint.y); //debugging
			
			//recursively call this method  again to do the same thing  with each of the new lines we  just made
			this.makeLine(p1, midPoint,  recursionLevel); //repeat this  procedure with the line from  p1 to the midpoint
			this.makeLine(midPoint, p2,  recursionLevel); //repeat this  procedure with the line from  the midpoint to p2
		}
		
	}

	public void draw() {
	}
	
}
