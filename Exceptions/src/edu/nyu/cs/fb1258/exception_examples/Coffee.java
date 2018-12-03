package edu.nyu.cs.fb1258.exception_examples;

public class Coffee {

	// static properties that belong to all coffees
	static final int MAX_TEMPERATURE_FOR_COMFORT = 200; // 200 farenheit is the max gulpable temperature
	
	// properties of coffee
	int numSips = 0;
	int temperature;
	boolean caffeinated = true;
	boolean hasMilk = false;
	int quantity = 100; // how much is left in the cup (percentage)
		
	public Coffee(boolean hasMilk, boolean caffeinated, int temperature) {
		this.hasMilk = hasMilk;
		this.caffeinated = caffeinated;
		this.temperature = temperature;
	}
	
	/**
	 * Remove a bit of the quantity from the cup of coffee
	 */
	public void sip() throws OutOfCoffeeException {
		this.numSips++;
		
		if (this.quantity > 0) {
			System.out.printf("Sipping for the %dth time...\n", this.numSips);
			// take off 1 percent of the quantity in the cup
			this.quantity = this.quantity - 5;		
		}
		else {
			throw new OutOfCoffeeException();
		}
	}
	
	public void gulp() throws BurnedMouthException, OutOfCoffeeException {
		if (this.quantity >= 20) {
			// take a gulp
			
			System.out.println("Gulping...");
			this.quantity = this.quantity - 20;
			
			// check whether this is mouth burning temperature
			if (this.temperature >= Coffee.MAX_TEMPERATURE_FOR_COMFORT) {
				throw new BurnedMouthException();
			}
			

		}
		else {
			throw new OutOfCoffeeException();
		}
		
	}
	
}
