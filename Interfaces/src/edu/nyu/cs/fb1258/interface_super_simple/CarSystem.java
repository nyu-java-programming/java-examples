package edu.nyu.cs.fb1258.interface_super_simple;

public class CarSystem {

	public void goLeft() {
		String className = this.getClass().getSimpleName();
		System.out.printf("%s going left\n", className);		
	}

	public void goRight() {
		String className = this.getClass().getSimpleName();
		System.out.printf("%s going right\n", className);		
	}

}
