package edu.nyu.cs.fb1258.inheritance.polymorphism;

/**
 * Simple code exhibiting polymorphism in all its charms.
 * @author Foo Barstein
 * @version 0.1
 *
 */
public class PolymorphismExample {

	public static void main(String[] args) {
		// instantiate one object of each type into specifically-typed variables
		A a = new A();
		B b = new B();
		C c = new C();
		
		// instantiate one object of each type, all stored in A-typed variables
		// this is polymorphism!
		A d = new A();
		A e = new B();
		A f = new C();
		
		// question: why would we want to be able to do this?
		// answer: because we often want to do batch processes on objects
		
		// create an array of supposedly A-type objects
		A[] myObjects = new A[3];
		
		// put an A, B, and C object into this array
		// polymorphism!
		myObjects[0] = a;
		myObjects[1] = b;
		myObjects[2] = c;
		
		// A[] myObjects = {a, b, c}; // syntactic sugar alternative syntax
		
		// iterate through each object in the A-type array
		System.out.println("\nIterating through each object...");
		int counter = 0;
		for (A myObject : myObjects) {
			System.out.printf("\nObject at array index %d...\n", counter);
			
			// all of these objects inherit from A, so they all have a .getX() method
			System.out.printf("This A object has an x value of %d.\n", myObject.getX());
			
			// only C objects have a .getZ() method, so this wouldn't work for an object referred to as an A-type
			//System.out.println(myObject.getZ()); // error!
			
			// do specifically B-type things
			if (myObject instanceof B) {
				B myB = (B) myObject;
				System.out.printf("This B object has an x value of %d and a y value of %d.\n", myB.getX(), myB.getY());
			}
			
			// do specifically C-type things
			if (myObject instanceof C) {
				C myC = (C) myObject;
				System.out.printf("This C object has an x value of %d, a y value of %d, and a z value of %d.\n", myC.getX(), myC.getY(), myC.getZ());
			}
			
			counter++;
		}
		
		// call a static method
		A.printX();

	}

}

/**
 * Contains one private instance property, x
 * @author Foo Barstein
 * @version 0.1
 */
class A {
	public A() {
		A.instanceCounter++; // we made another one!
		System.out.printf("\nMade A #%s!\n", A.instanceCounter);
	}
	
	private int x = 5;
	protected static int instanceCounter = 0; // how many A objects are instantiated
	
	public static void printX() {
		// error!
		//System.out.println(this.x); // there is no 'this' in a static method
	}
	
	/**
	 * Classic 'getter' for the x property
	 * @return
	 */
	public int getX() {
		return this.x;
	}
	
	/**
	 * Classic 'setter' for the x property
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
}

/**
 * Inherits from A and adds one instance property, y
 * @author Foo Barstein
 * @version 0.1
 */
class B extends A {
	/**
	 * Calls A's no-args constructor, then prints out a specifically C-type message.
	 */
	public B() {
		super();
		System.out.printf("A #%s is actually a B!\n", A.instanceCounter);
	}
	
	private int x = 20;
	private int y = 10;
	
	/**
	 * Overriden getter method... hides the parent class's method by the same name
	 * Does nothing useful, sadly, since it just calls the parent class's method by the same name.
	 * It would only make sense to override a method if the new implementation did something different.
	 * @return the value of x
	 */
	public int getX() {
		return super.getX();
	}
	
	/**
	 * Overloaded getter method... sets and gets at the same time!
	 * @param x The new value to set x to
	 * @return the value of x
	 */
	public int getX(int x) {
		this.x = x;
		return this.x;
	}
	
	/**
	 * Classic 'getter' for the y property
	 * @return The value of y
	 */
	public int getY() {
		return this.y;
	}
	
	/**
	 * Classic 'setter' for the y property.
	 * @param y The new value of y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
}

/**
 * Inherits from B and adds one instance property, z
 * @author Foo Barstein
 * @version 0.1
 */
class C extends B {
	/**
	 * Calls B's no-args constructor, then prints out a specifically C-type message.
	 */
	public C() {
		super();
		System.out.printf("A #%s is also a C!\n", A.instanceCounter);
	}
	
	private int z = 15;
	
	/**
	 * Overriden getter method... hides the parent class's method by the same name
	 * Does nothing useful, sadly, since it just calls the parent class's method by the same name.
	 * It would only make sense to override a method if the new implementation did something different.
	 */
	public int getX() {
		return super.getX();
	}

	/**
	 * Class getter for the z property
	 * @return
	 */
	public int getZ() {
		return this.z;
	}
	
}

