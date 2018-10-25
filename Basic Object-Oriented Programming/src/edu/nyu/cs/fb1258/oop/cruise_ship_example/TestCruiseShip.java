package edu.nyu.cs.fb1258.oop.cruise_ship_example;

/**
 * A wrapper around a main method where we test out a few CruiseShip objects.
 * @author Foo Barstein
 * @version 1
 *
 */
public class TestCruiseShip {

	public static void main(String[] args) {
		
		// make a cruise ship object from the CruiseShip class
		CruiseShip maria = new CruiseShip("Maria");
		
		// instantiate a destination representing Aruba, at 1700 nautical miles away from our starting point, New York
		Destination d1 = new Destination("Aruba", 1700);
		
		System.out.println("...sending maria to Aruba...");
		maria.setDestination(d1); // set destination = Aruba!
		maria.startUpPropellors(); // start the engines!
		maria.setSpeed(18); // set speed to 18 knots, a pretty typical speed for a cruise ship (1 knot = 1 nautical mile / hour)
		maria.go(24); // send maria to her destination, and report her position every 1 hours!
		
		System.out.println("\n");
		
		System.out.println("...sending Maria back to New York...");
		Destination d2 = new Destination("New York", 1700);
		maria.setDestination(d2); // return destination = New York!
		maria.startUpPropellors(); // start the engines!
		maria.setSpeed(18); // set speed to 18 knots, a pretty typical speed for a cruise ship (1 knot = 1 nautical mile / hour)
		maria.go(24); // send maria to her destination, and report her position every 1 hours!

		System.out.println("\n");

		// Make another cruise ship called Bobby, and send it to Fiji
		CruiseShip bobby = new CruiseShip("Bobby");
		Destination d3 = new Destination("Fiji", 6905); // Fiji is 6905 nautical miles from our starting position, NYC

		System.out.println("...sending Bobby to Fiji...");
		bobby.setDestination(d3);
		bobby.startUpPropellors();
		// let's pretend like we forgot to set the speed and try to go somewhere
		bobby.go(2); // send bobby to his destination, and report his position every 2 hours... won't work since bobby has no speed
		bobby.shutDownPropellors(); // shut down bobby

	}

}
