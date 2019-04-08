package edu.nyu.cs.fb1258.example_oop;

public class Car {
	
	// properties of a Car
	private double engineCapacity;
	
	private String make;
	
	private String model;
	
	private int year;
	
	private String color;
	
	private int numDoors;
	
	private int mileage = 0; // a default value
	
	private double milesPerGallon;
	
	private int numWheels = 4;
	
	private static String[] listOfAcceptableColors = {
			"brown",
			"blue",
			"silver",
			"aqua",
			"green"
	};
	
	// constructors
	
	/**
	 * Set up a Car the way we like it!
	 * @param make The make of the car
	 * @param model The model of the car
	 * @param year The year the car was released
	 * @param mileage The mileage on the car
	 * @param color The color of the car
	 * @param engineCapacity The engine capacity, in liters.
	 */
	public Car(String make, String model, int year, int mileage, String color, double engineCapacity) {
		// use setters to set the two properties
		this.setEngineCapacity(engineCapacity);
		this.setColor(color);
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setMileage(mileage);
	}
	
	// setters
	
	public void setEngineCapacity(double cap) {
		// validate the value
		if (cap > 0) {
			this.engineCapacity = cap;
		}
	}
	
	public void setColor(String color) {
		// validate the value
		
		// loop through all acceptable colors
		for (String acceptableColor : Car.listOfAcceptableColors) {
			// if one of the acceptable colors is the same as the argument, accept it!
			if (acceptableColor.equals(color)) {
				this.color = color;
			}
		}
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	// getters
	public String getModel() {
		return this.model;
	}
	
	public int getMileage() {
		return this.mileage;
	}
	
	// things a Car can do!
	
	public void drive() {
		// placeholder
		System.out.println("Driving...");
	}
	
	public void brake() {
		// placeholder
		System.out.println("Braking...");
	}
	
	public void turnLeft() {
		// placeholder
		System.out.println("Turning left...");
	}

	public void turnRight() {
		// placeholder
		System.out.println("Turning right...");
	}

	public void playMusic() {
		// placeholder
		System.out.println("The " + this.make + " " + this.model + " is playing Music...");
	}
	

}
