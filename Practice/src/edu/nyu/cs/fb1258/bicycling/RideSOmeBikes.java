package edu.nyu.cs.fb1258.bicycling;

public class RideSOmeBikes {

	public static void main(String[] args) {
		

		System.out.println("Bicycles have " + Bicycle.numWheels + " wheels!");
		System.out.println("CitiBikes have " + CitiBike.numWheels + " wheels also!");

		Bicycle bike1 = new Bicycle(2, 12, 50);
		CitiBike bike2 = new CitiBike(98765);
		bike1.spinWheels(10);
		bike2.unlock();
		bike2.spinWheels(5);

		
		System.out.println("The regular bike has " + bike1.getNumGears() + " gears and wheels are turning at " + bike1.getWheelSpeed() + "mph.");;
		System.out.println("The citibike has " + bike2.getNumGears() + " gears and wheels are turning at " + bike2.getWheelSpeed() + "mph.");;

		// polymorphism
		Bicycle[] bikes = new Bicycle[4];
		bikes[0] = bike1;
		bikes[1] = bike2;
		bikes[2] = new Bicycle(5,122, 55);
		bikes[3] = new CitiBike(12345);
		
		// some batch operation on all bikes in the array
		for (Bicycle bike : bikes) {
			if (bike instanceof Bicycle) {
				System.out.println("Yes, this is a bicycle!");
			}
			if (bike instanceof CitiBike) {
				((CitiBike) bike).unlock();
				System.out.println("Yes, this is a Citi Bike!");
			}
			
			
			System.out.println("The bike is going at " + bike.getWheelSpeed() + "mph.");
		}
		
		System.out.println("There are " + Bicycle.getNumBicyclesInTheWorld() + " bicycles in the world!");
		
	}

}
