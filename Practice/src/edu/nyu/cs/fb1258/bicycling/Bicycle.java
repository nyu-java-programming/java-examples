package edu.nyu.cs.fb1258.bicycling;

public class Bicycle {
	
	
	// constructors

	/**
	 * Constructor for a basic bicycle
	 * @param numGears The number of gears this bike has
	 * @param frameSize The size of frame, in inches
	 * @param tireSize The size of the tires... unknown units
	 */
	public Bicycle(int numGears, int frameSize, int tireSize) {
		this.setNumGears(numGears);
		this.frameSize = frameSize;
		this.tireSize = tireSize;
		Bicycle.incrementNumBicyclesInTheWorld();
		
	}
	
	//properties
	private int numGears;
	
	private int frameSize;
	
	private int tireSize;
	
	private int wheelSpeed;
	
	public final static int numWheels = 2;
	
	private static int numBicyclesInTheWorld = 0;

	
	//behaviors
	
	public void spinWheels(int speed) {
		this.setWheelSpeed(speed);
	}
	
	
	
	
	
	// setters & getters
	
	private void setWheelSpeed(int wheelSpeed) {
		this.wheelSpeed = wheelSpeed;
	}
	
	public int getWheelSpeed() {
		return this.wheelSpeed;
	}
	
	/**
	 * Classic 'setter' method for the numGears instance property.
	 * @param numGears The number of gears that this bicycle has
	 */
	public void setNumGears(int numGears) {
		if (numGears >= 0) {
			this.numGears = numGears;
		}
	}
	
	/**
	 * Classic 'getter' method for the numGears instance property
	 * @return The number of gears this bicycle has
	 */
	public int getNumGears() {
		return this.numGears;
	}
	
	public static void incrementNumBicyclesInTheWorld() {
		Bicycle.numBicyclesInTheWorld++;
	}
	
	public static int getNumBicyclesInTheWorld() {
		return Bicycle.numBicyclesInTheWorld;
	}
}
