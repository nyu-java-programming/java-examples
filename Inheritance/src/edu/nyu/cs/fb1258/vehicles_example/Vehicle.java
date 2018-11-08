package edu.nyu.cs.fb1258.vehicles_example;

/**
 * A representation of a generic Vehicle
 * @author Foo Barstein
 * @version 2
 *
 */
public class Vehicle {

	/**
	 * No-args constructor simply assigns this Vehicle a unique ID, so we can distinguish it from other Vehicles
	 */
	public Vehicle() {
		
		// increment the Vehicle counter
		Vehicle.vehicleCounter++;
		
		//give this Vehicle a unique ID number
		this.setVehicleId(Vehicle.vehicleCounter);
		
		// output some debugging message
		System.out.printf("Instantiating %s...\n", this);
		
	}

	/**
	 * some orientations a Vehicle could possibly be facing
	 */
	public static enum Orientation {
		NORTH,
		SOUTH,
		EAST,
		WEST
	}
	
	/**
	 * The possible directions of drive train movement of a Vehicle
	 */
	public static enum DirectionsOfMovement {
		FORWARDS,
		BACKWARDS
	}

	/**
	 * Keep track of how many vehicles have been instantiated
	 */
	public static int vehicleCounter = 0;
	
	/**
	 * This Vehicle's unique ID number helps us distinguish it from other Vehicles
	 */
	private int vehicleId;
	
	/**
	 * The orientation this Vehicle is currently facing
	 */
	private Orientation orientation = Vehicle.Orientation.NORTH;
	
	/**
	 * The direction of movement of the drive train, either forwards or backwards (reverse)
	 */
	private DirectionsOfMovement direction = Vehicle.DirectionsOfMovement.FORWARDS;
	
	// behaviors of Vehicles
	
	/**
	 * Turn right, and adjust this Vehicle's orientation appropriately
	 */
	public void turnRight() {
		// output a debugging message
		System.out.printf("%s is turning right...\n", this);
		
		// adjust the orientation
		switch (this.orientation) {
		case NORTH:
			// if currently facing north, turning right means facing east
			this.setOrientation(Orientation.EAST);
			break;
		case SOUTH:
			// if currently facing south, turning right means facing west
			this.setOrientation(Orientation.WEST);
			break;
		case EAST:
			// if currently facing east, turning right means facing south
			this.setOrientation(Orientation.SOUTH);
			break;
		case WEST:
			// if currently facing west, turning right means facing north
			this.setOrientation(Orientation.NORTH);
			break;
		}
		
		//output which orientation we're now facing
		this.outputStatus();
	}
	
	/**
	 * Turn left, and adjust this Vehicle's orientation appropriately
	 */
	public void turnLeft() {
		// output a debugging message
		System.out.printf("%s is turning left...\n", this);
		
		// adjust the orientation
		switch (this.orientation) {
		case NORTH:
			// if currently facing north, turning left means facing west
			this.setOrientation(Orientation.WEST);
			break;
		case SOUTH:
			// if currently facing south, turning left means facing east
			this.setOrientation(Orientation.EAST);
			break;
		case EAST:
			// if currently facing east, turning left means facing north
			this.setOrientation(Orientation.NORTH);
			break;
		case WEST:
			// if currently facing west, turning left means facing south
			this.setOrientation(Orientation.SOUTH);
			break;
		}
		
		//output which orientation we're now facing
		this.outputStatus();
	}
	
	/**
	 * Make the Vehicle move forwards
	 */
	public void goForward() {
		// output a debugging message
		System.out.printf("%s is going forwards...\n", this);

		this.setDirection(Vehicle.DirectionsOfMovement.FORWARDS);
		
		//output which orientation we're now facing
		this.outputStatus();
	}
	
	/**
	 * Make the Vehicle move backwards
	 */
	public void goBackward() {
		// output a debugging message
		System.out.printf("%s is shifting into reverse...\n", this);

		this.setDirection(Vehicle.DirectionsOfMovement.BACKWARDS);
		
		//output which orientation we're now facing
		this.outputStatus();
	}
	
	/**
	 * Output the current orientation and drive train direction of this Vehicle
	 */
	public void outputStatus() {
		System.out.printf("%s is now driving %s, facing %s.\n", this, this.getDirection(), this.getOrientation());
	}

	/**
	 * @return what type of Vehicle, and which Vehicle number this Vehicle has
	 */
	public String toString() {
		return String.format("Vehicle #%d", this.getVehicleId());
	}


	// generic setters and getters
	
	
	/**
	 * @return the vehicleId
	 */
	public int getVehicleId() {
		return vehicleId;
	}

	/**
	 * @param vehicleId the vehicleId to set
	 */
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	/**
	 * @return the orientation
	 */
	public Orientation getOrientation() {
		return this.orientation;
	}

	/**
	 * @param orientation the orientation to set
	 */
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	/**
	 * @return the direction
	 */
	public DirectionsOfMovement getDirection() {
		return this.direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(DirectionsOfMovement direction) {
		this.direction = direction;
	}
	
	
	
}
