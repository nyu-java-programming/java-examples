 package edu.nyu.cs.fb1258.total_inheritance;

/**
 * A concrete class that inherits from concrete class C1.
 * @author Foo Barstein
 * @version 2
 */
public class C2 extends C1 {

	/*
	 * This class inherits the following from C1:
	 *     public void method1()
	 *     public void method2()
	 *     public void method3(), which C1 inherited as a default method from I2
	 *     public void method4()
	 */

	/**
	 * Override of C1's concrete method4().
	 */
	@Override
	public void method4() {
		System.out.println("Method4 defined in concrete class C2.");
	}

	/**
	 * A new concrete method specific to C2.
	 */
	public void method5() {
		System.out.println("Method5 defined in concrete class C2.");
	}
	
}
