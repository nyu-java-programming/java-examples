package edu.nyu.cs.fb1258.vehicles_example;

/**
 * Test out some vehicles... a few bicycles and a few cars
 * @author Foo Barstein
 * @version 2
 *
 */
public class TestVehicles {

	public static void main(String[] args) {

		// make a few bicycles
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		// make a few cars
		Car car1 = new Car();
		Car car2 = new Car();
		
		// put them all into an array... since Bicycle and Car are child classes of Vehicle, you can store them into a Vehicle array
		Vehicle[] vehicles = {
				bike1, 
				bike2,
				car1,
				car2
		};
		
		// make these vehicles do some stuff as a batch
		for (Vehicle vehick : vehicles) {
			// if it's a bicycle, make it go forward
			if (vehick instanceof Bicycle) {
				vehick.goForward();
			}
			else if (vehick instanceof Car) {
				// it's not a bicycle, it's a car!
				
				// check whether the car is turned on... 
				//notice that since vehick is typed as a Vehicle, we have to cast it to a Car before we can do car-specific things with it
				if (((Car) vehick).isOn()) {
					// if so, make it go forward
					vehick.goForward();					
				}
				else {
					// it's not on, so it can't go anywhere
					System.out.printf("Sorry, Car #%d is not on.\n", vehick.getVehicleId());
					
					// turn it on
					//notice that since vehick is typed as a Vehicle, we have to cast it to a Car before we can do car-specific things with it
					((Car) vehick).turnOn();
				}
			}
			
			// make all Vehicles turn a few times
			vehick.turnLeft();
			vehick.turnLeft();
			vehick.goBackward();
			vehick.turnRight();
		}
		
	}

}
