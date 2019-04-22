package edu.nyu.cs.fb1258.interface_basics;

/**
 * An example of how to use the interfaces and classes defined in the other files.
 * Note how interfaces can be used to do polymorphism.
 * @author Foo Barstein
 * @version 1
 */
public class TestInterfaces {

	public static void main(String[] args) {
		
		// instantiate a few objects that implement abstract interface methods
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();
		
		// initiate a few objects and store in references of an interface type
		Interface1 c3 = new Class1();
		Interface1 c4 = new Class2();

		// store a bunch of objects in an array typed as an interface
		Interface1[] objs = { c1, c2, c3, c4 };
		
		// loop through the array
		for (Interface1 o : objs) {
			// call each object's method declared within the interface code
			o.firstMethod();
			
			// check whether this object also implements the Interface3 interface
			if (o instanceof Interface3) {
				// if so, call a method declared within Interface3
				((Interface3) o).fourthMethod();
			}
			
			// check whether this object is also a Class2 class
			if (o instanceof Class2) {
				// if so, call a method declared within Interface3
				((Class2) o).thirdMethod();
			}

		}
		
		// refer to a few static properties and methods of Interface1
		Interface1.doSomething();
		System.out.println(Interface1.pi);
		
		// call the default method that were inherited from Interface1
		c1.doSomethingElse();
		c2.doSomethingElse();
		
		
	}

}
