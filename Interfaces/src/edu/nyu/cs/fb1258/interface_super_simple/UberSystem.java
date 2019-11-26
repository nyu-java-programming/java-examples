package edu.nyu.cs.fb1258.interface_super_simple;

public class UberSystem implements FordCar {
	
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
	
	@Override
	public void goLeft() {
		String className = this.getClass().getSimpleName();
		System.out.printf("%s going left\n", className);		
	}
	
	@Override
	public void goRight() {
		String className = this.getClass().getSimpleName();
		System.out.printf("%s going right\n", className);		
	}

}
