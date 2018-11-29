package edu.nyu.cs.fb1258.total_inheritance;

/**
 * This is an abstract class that inherits from the concrete class C2.  C4 inherits from this class.
 * @author Foo Barstein
 * @version 2
 */
public abstract class C3 extends C2 {

	/*
	 * This abstract class inherits the following from C2:
	 *     public void method1(), which C2 inherited from C1
	 *     public void method2(), which C2 inherited from C1
	 *     public void method3(), which C2 inherited from C1, which inherited it as a default method from I2, which got it from I1
	 *     public void method4(), which C2 overrode from C1
	 *     public void method5()
	 */

	/**
	 * An abstract method which is specific to this class.
	 */
	public abstract void method6();
	
	/**
	 * A concrete implementation of a method which is specific to this class.
	 */
	public void method7() {
		System.out.println("Method7 defined in abstract class C3.");
	}

}
