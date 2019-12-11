package edu.nyu.cs.fb1258.exception_examples.coffee;

public class TestCoffee {

	public static void main(String[] args) {

		// make a coffee
		Coffee americano = new Coffee("americano", false, false, 210);
		
		// try to take a gulp... but be careful for the burned mouth scenario
		try {
			americano.gulp();
		}
		catch (BurnedMouthException e) {
			System.out.println(e);
		}
		catch (OutOfCoffeeException e) {
			System.out.println(e);
		}
		
		// take infinite sips of coffee
		boolean isCoffeeLeft = true;
		while (isCoffeeLeft) {
			try {
				americano.sip();
			}
			catch (OutOfCoffeeException e) {
				System.out.println(e);
				isCoffeeLeft = false;
			}
		}
		
		// try to take a gulp... but be careful for the burned mouth scenario
		try {
			americano.gulp();
		}
		catch (BurnedMouthException e) {
			System.out.println(e);
		}
		catch (OutOfCoffeeException e) {
			System.out.println(e);
		}

	}

}
