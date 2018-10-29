package edu.nyu.cs.fb1258.string_examples.custom_equals_and_to_string_examples;

/**
 * A virtual representation of Mondays.  
 * The point of this example is to notice the use of the equals() and toString() methods.
 * @author Foo Barstein
 * @version 1
 *
 */
public class Monday {
	
	/**
	 * Constructor that sets the dread and speed of a given Monday
	 * @param dread How much the day is to be dreaded.
	 * @param speed How quickly the day seems to fly by.
	 */
	public Monday(int dread, int speed) {
		// assign the two properties of this object
		this.dread = dread;
		this.speed = speed;
	}
	
	// properties of a Monday
	
	/**
	 * All Mondays are called "Monday", I think.
	 */
	private static final String name = "Monday";
	
	/**
	 * By default, Mondays impart a strong feeling of dread.
	 */
	private int dread = 8; // out of 10
	
	/**
	 * By default, Mondays move slowly.
	 */
	private int speed = 1; // out of 10
	
	/**
	 * Compare this Monday to another Monday
	 * @param m2 The other Monday to compare this Monday to.
	 * @return True if the two Mondays have the same property values.  False otherwise.
	 */
	public boolean equals(Monday m2) {
		// return true if the two mondays have the same dread factor and speed
		if (this.dread == m2.dread && this.speed == m2.speed) {
			return true;
		}
		else {
			// otherwise, return false
			return false;
		}
	}
	
	/**
	 * Customize how an object of this type is represented as a String.
	 * @return A string representation of this Monday object
	 */
	public String toString() {
		return "A Monday with dread=" + this.dread + " and speed=" + this.speed;
	}
	
	// behaviors of mondays
	
	/**
	 * Make the Monday move quickly.
	 */
	public void goQuickly() {
		this.speed = 10;
	}
	
	/**
	 * Make the Monday move slowly.
	 */
	public void goSlowly() {
		this.speed = 1;
	}
	
	/**
	 * Make the Monday seem dreadful.
	 */
	public void goDreadfully() {
		this.dread = 10;
	}
	
	/**
	 * Make the Monday seem painless.
	 */
	public void goPainlessly() {
		this.dread = 1;
	}

}
