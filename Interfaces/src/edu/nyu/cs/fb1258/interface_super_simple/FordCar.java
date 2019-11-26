package edu.nyu.cs.fb1258.interface_super_simple;

// an interface is essentially a public API (application programming interface)
public interface FordCar {
	
	public static final int NORTH = 1;
	public static final int SOUTH = 2;
	public static final int EAST = 3;
	public static final int WEST = 4;
	
	public final static int y = 20;	
	public final static int x = 10;
	
	public abstract void goForward();
	
	public abstract void goBackward();
	
	public abstract void goLeft();
	
	public default void goRight() {
		String className = this.getClass().getSimpleName();
		System.out.printf("%s going right\n", className);		
	}
	
}
