package edu.nyu.cs.fb1258.abstract_class_examples;

/**
 * A 'regular' class that inherits from an abstract class.
 * @author Foo Barstein
 * @version 1
 *
 */
public class C2 extends C1 {

	/**
	 * Because the abstract class C1 declared an abstract method doSomething, this class, which inherits from that class, must contain a concrete implementation of that method.
	 */
	public void doSomething() {
		System.out.println("C2 doingSomething");
	}
	
}
