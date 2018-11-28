package edu.nyu.cs.fb1258.total_inheritance;

/**
 * An interface with several abstract methods and one default method.
 * @author Foo Barstein
 * @version 2
 *
 */
public interface I1 {

	public static int x = 5;
	
	/**
	 * An abstract method named method1().
	 */
	public abstract void method1();

	/**
	 * An abstract method named method2().
	 */
	public abstract void method2();
	
	/**
	 * A default concrete method named method3().
	 */
	public default void method3() {
		System.out.println("Method3 defined in interface I1.");
	}

}
