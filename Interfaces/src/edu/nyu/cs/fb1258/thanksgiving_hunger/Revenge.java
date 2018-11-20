package edu.nyu.cs.fb1258.thanksgiving_hunger;

/**
 * A class based on the phrase, "Revenge is a dish best served cold."
 * Implements the Servable interface, which means it must implement 'serve' and 'isReadyToServe' methods.
 * Revenge is quite different from a Meal, although both implement the same behaviors defined in the Servable interface.
 * @author Foo Barstein
 * @version 1
 *
 */
public class Revenge implements Servable {
		
	/**
	 * No-args constructor for Revenge
	 */
	public Revenge() {
		System.out.println("\nConstructing your revenge...");
	}
	
	/**
	 * Whether this revenge is cold or not.
	 */
	private boolean isCold = false;

	/**
	 * Determine whether this revenge is ready to be served.  Revenge must be cold in order to be served.
	 * @return true if cold, false otherwise
	 */
	public boolean isReadyToServe() {
		// "revenge is a dish best served cold"
		return this.isCold(); // if it's cold, it's ready to be served
	}
	
	/**
	 * Serve the revenge, so long as it's ready to be served.
	 * A method by this name must be present, by the rules of the Servable interface.
	 */
	public void serve() {
		if (this.isReadyToServe()) {
			// the revenge is cold, so serve it!
			System.out.println("Serving your revenge.  Enjoy!");
		}
		else {
			// the revenge is not cold, so do not serve it.
			System.out.println("This revenge cannot be served.  Please make sure your revenge is cold and try serving again.");
		}
	}
	
	// classic 'getter' and setter' methods

	/**
	 * @return the isCold
	 */
	public boolean isCold() {
		return isCold;
	}

	/**
	 * @param isCold the isCold to set
	 */
	public void setIsCold(boolean isCold) {
		this.isCold = isCold;
	}

}
