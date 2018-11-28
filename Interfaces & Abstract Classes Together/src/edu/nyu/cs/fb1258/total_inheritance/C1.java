package edu.nyu.cs.fb1258.total_inheritance;

/**
 * A concrete class that implements the interface I2.
 * @author Foo Barstein
 * @version 2
 */
public class C1 implements I2 {

	// this class must include implementations of all abstract methods in I2, including those abstract methods I2 inherits from I1.

	/**
	 * Implementation of I1's abstract method1().
	 */
	@Override
	public void method1() {
		System.out.println("Method1 defined in concrete class C1.");
	}

	/**
	 * Implementation of I2's abstract method2(), which itself was an override of I1's method2()
	 */
	public void method2() {
		System.out.println("Method2 defined in concrete class C1.");
	}
	
	// method3 has a default implementation in I1, so does not need to be implemented here.

	/**
	 * Implementation of I2's abstract method4().
	 */
	@Override
	public void method4() {
		System.out.println("Method4 defined in concrete class C1.");
	}

}
