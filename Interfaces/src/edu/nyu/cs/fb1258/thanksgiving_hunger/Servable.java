package edu.nyu.cs.fb1258.thanksgiving_hunger;

/**
 * An interface that specifies two abstract methods.  Classes that implement this interface must implement these methods.
 * In version 2, a new method, 'reject' is added with a default implementation so as not to break backwards compatibility for classes that switch from implementing v1 of this interface to the new v2.
 * @author Foo Barstein
 * @version 2
 *
 */
public interface Servable {
	
	/**
	 * Whether the servable object is ready to be served.
	 * @return true if ready to be served, false otherwise
	 */
	public abstract boolean isReadyToServe();
	
	/**
	 * Serve the servable thing
	 */
	public abstract void serve();
	
	/**
	 * Reject the servable thing.  New in v2 of this interface!  
	 * A default implementation is provided so as not to break backwards compatibility with classes switching from v1 of this interface to the new v2.
	 */
	public default void reject() {
		System.out.println("Sorry, this is rejected");
	}	

}
