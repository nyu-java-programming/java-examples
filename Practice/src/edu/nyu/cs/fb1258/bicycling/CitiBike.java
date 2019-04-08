package edu.nyu.cs.fb1258.bicycling;

public class CitiBike extends Bicycle {

	// constructor
	public CitiBike(int idNumber) {
		super(3, 30, 10);
		this.idNumber = idNumber;
	}
	
	// properties
	private int idNumber;
	
	private boolean isLocked = true;

	// behaviors
	
	public void spinWheels(int speed) {
		if (!this.isLocked) {
			super.spinWheels(speed);
		}
	}
	
	public void unlock() {
		this.isLocked = false;
	}
	
}
