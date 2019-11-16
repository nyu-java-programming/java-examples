package edu.nyu.cs.fb1258.oop.cars;

public class PlayWithCars {

	public static void main(String[] args) {
		
		Car delorean = new Car("DMC", "Delorean", 1975, 10, "silver", 10);
		System.out.println("The mileage on the " + delorean.getModel() + " is " + delorean.getMileage());
		delorean.playMusic();

		Car mator = new Car("Chevrolet", "Mator", 2006, 1, "brown", 2);
		System.out.println("The mileage on the " + mator.getModel() + " is " + mator.getMileage());
		mator.playMusic();

	}

}
