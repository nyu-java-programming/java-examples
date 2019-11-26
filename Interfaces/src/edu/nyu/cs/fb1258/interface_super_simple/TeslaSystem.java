package edu.nyu.cs.fb1258.interface_super_simple;

public class TeslaSystem extends CarSystem implements FordCar, LuxuryCarSystem {

	@Override
	public void goForward() {
		String className = this.getClass().getSimpleName();
		System.out.printf("%s going forward\n", className);
	}

	@Override
	public void goBackward() {
		String className = this.getClass().getSimpleName();
		System.out.printf("%s going backward\n", className);
	}
	
	// implement the method that make a car luxury!

	@Override
	public void sayHelloOnStartup() {
		String className = this.getClass().getSimpleName();
		System.out.printf("%s says 'Hello' in 20 different languages\n", className);
	}

	@Override
	public void orderLunchFromYelp() {
		String className = this.getClass().getSimpleName();
		System.out.printf("%s ordering a burger right now! \n", className);
	}

}
