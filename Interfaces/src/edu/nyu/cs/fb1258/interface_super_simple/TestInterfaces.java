package edu.nyu.cs.fb1258.interface_super_simple;

public class TestInterfaces {

	public static void main(String[] args) {
		
		WaymoSystem w = new WaymoSystem();
		w.goForward();
		w.goRight();
		
		UberSystem u = new UberSystem();
		u.goForward();
		u.goRight();

		TeslaSystem t = new TeslaSystem();
		t.sayHelloOnStartup();
		t.goForward();
		t.goRight();
		t.orderLunchFromYelp();
		
		// polymorphism!!!
		FordCar[] cars = {w, u, t};
		
		for (FordCar car : cars) {
			car.goLeft();
			
			if (car instanceof TeslaSystem) {
				((TeslaSystem) car).orderLunchFromYelp();
			}
		}
		
		

	}

}
