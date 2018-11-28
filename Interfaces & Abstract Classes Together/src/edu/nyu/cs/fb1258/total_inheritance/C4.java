package edu.nyu.cs.fb1258.total_inheritance;

/**
 * A concrete class that inherits from abstract class C3.
 * @author Foo Barstein
 * @version 2
 * 
 */
public class C4 extends C3 {

	//because this is a concrete class, any abstract methods it inherits must be implemented
	
	/*
	 * This class inherits the following from C3:
	 *     public void method1(), which C3 inherited from C2, which inherited it from C1
	 *     public void method2(), which C3 inherited from C2, which inherited it from C1
	 *     public void method3(), which C3 inherited from C2, and C2 inherited from C1, which inherited it as a default method from I2
	 *     public void method4(), which C3 inherited from C2, which C2 overrode from C1
	 *     public void method5(), which C3 inherited from C2
	 *     public abstract void method6(), which C3 declared as abstract
	 */

	/**
	 * A concrete implementation of the abstract method6() in abstract class C3.
	 */
	@Override
	public void method6() {
		System.out.println("Method6 defined in C4.");
	}
	
}
