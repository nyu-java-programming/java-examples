package edu.nyu.cs.fb1258.interface_super_simple;

public class WaymoSystem implements FordCar {
	
	public void goForward() {
		String className = this.getClass().getSimpleName();
		System.out.printf("%s going forward\n", className);
	}
	
	public void goBackward() {
		String className = this.getClass().getSimpleName();
		System.out.printf("%s going backward\n", className);
	}
	
	public void goLeft() {
		String className = this.getClass().getSimpleName();
		System.out.printf("%s going left\n", className);		
	}

}
