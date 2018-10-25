package edu.nyu.cs.fb1258.oop.cruise_ship_example;

public class CruiseShip {
	
	//properties of Cruise Ships (variables)
	
	/**
	 * The name of the ship.
	 */
	private String name;
	
	/**
	 * The destination of this ship (really should be in its own class, since it's not a property of the ship)
	 */
	private Destination destination;
	
	/**
	 * The distance of this ship from its destination
	 */
	private int distanceFromDestination; // in nautical miles (1 nautical mile = 1,852 kilometers)
		
	/**
	 * Whether the propellors are currently on or off for this ship
	 */
	private boolean propellorsAreOn = false;
	
	/**
	 * The speed of the ship
	 */
	private int speed = 0; //1 knot = 1 nautical mile / hour
	
	/**
	 * How many hours this ship has traveled to its destination.
	 */
	private int hoursTraveled = 0;
	
	
	// behaviors of the ship (methods)
	
	/**
	 * Turn on the propellers
	 * @return Whether the propellors are on
	 */
	public boolean startUpPropellors() {
		System.out.printf("[%s] Starting up the propellors...\n", this.name);
		
		// only start up the engines if the propellors are not already on
		if (!this.propellorsAreOn) {
			this.propellorsAreOn = true; // maintain internal state indicating the propellors are on
		}
		else {
			System.out.printf("[%s] The propellors are already on!...\n", this.name);
		}
		return this.propellorsAreOn;
	}
	
	/**
	 * Turn off the propellors
	 * @return whether the propellors are off
	 */
	public boolean shutDownPropellors() {
		System.out.printf("[%s] Shutting down the propellors...\n", this.name);
		
		if (this.propellorsAreOn) {
			this.setSpeed(0); // change speed to zero
			this.propellorsAreOn = false;
		}
		else {
			System.out.printf("[%s] The propellors can't be shut down because they were never turned on!...\n", this.name);
		}
		return !this.propellorsAreOn;
	}
	
	/**
	 * Sets the speed of the ship
	 * @param knots The new speed to achieve
	 * @return Whether the speed was attained
	 */
	public boolean setSpeed(int knots) {
		// if the speed is already the new speed, don't do anything.
		if (this.speed != knots) {
			System.out.printf("[%s] Setting speed to %d knots!\n", this.name, knots);
			
			// maintain state of the speed of this ship
			this.speed = knots;
		}
		return true; // it always works... for now
	}
	
	/**
	 * 'Setter' method for the destination propery
	 * @param destiny The new destination to set this ship towards
	 */
	public void setDestination(Destination destiny) {
		this.distanceFromDestination = destiny.getDistance(); // set the distance to the starting value
		System.out.printf("[%s] Setting course to %s, %d nautical miles away.\n", this.name, destiny.getName(), destiny.getDistance());
		this.destination = destiny;
	}
	
	/**
	 * Make this ship go towards her destination.
	 * @param interval Interval, in hours, indicating how frequently this ship will report its position
	 */
	public void go(int interval) {
		// we can only go somewhere if there is some speed and we have not already reached our destination
		if ( this.speed > 0 && !this.atDestination()) {
			// send this ship on to her destination
			while (!this.atDestination()) {
				// update the position to where it will be in the number of hours indicated in the interval
				this.updatePosition(interval);
			}
		}
		else {
			System.out.printf("[%s] Sorry, our speed is currently %d knots, so we are not going anywhere!\n", this.name, this.speed);
		}
	}
	
	/**
	 * Move the ship closer to its destination by the distance traveled in the specified number of hours
	 * @param hours The number of hours the ship should have been moving
	 */
	public void updatePosition(int hours) {
		// keep track of how many hours this ship has traveled
		this.hoursTraveled += hours;
		
		// determine how many nautical miles can be traveled by this ship in the given time period
		int nauticalMilesTraveled = this.speed * hours; //1 knot = 1 nautical mile / hour
				
		if (this.distanceFromDestination > 0) {
			this.distanceFromDestination -= nauticalMilesTraveled;			
			System.out.printf("[%s] %d nautical miles from %s after %d hours.\n", this.name, this.distanceFromDestination, this.destination.getName(), this.hoursTraveled);
		}
	}
	
	/**
	 * Whether we have reached the destination
	 * @return true if so, false otherwise
	 */
	public boolean atDestination() {
		// we know we're at the destination when the distance is zero
		if (this.distanceFromDestination <= 0) {
			
			// announce arrival
			System.out.printf("[%s] Land ahoy!\n", this.name);
			System.out.printf("[%s] Reached %s in %d hours!!! \n", this.name, this.destination.getName(), this.hoursTraveled);
			
			//stop the vehicle!
			this.setSpeed(0);
			
			return true;
		}
		else {
			return false;
		}
	}
	
	// constructors
	
	/**
	 * No-args constructor
	 */
	public CruiseShip() {
		// does nothing and is not used
	}
	
	/**
	 * Construct a new CruiseShip object with a particular name
	 * @param name The name to give the ship
	 */
	public CruiseShip(String name) {
		// maintain the state of the name
		this.name = name;
	}

}
