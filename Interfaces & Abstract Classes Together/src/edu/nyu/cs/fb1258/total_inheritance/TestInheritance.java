package edu.nyu.cs.fb1258.total_inheritance;

/**
 * A program that instantiates one of each of the kinds of objects in the project and calls their declared methods.
 * @author Foo Barstein
 * @version 2
 *
 */
public class TestInheritance {

	/**
	 * This main method creates objects of each of the concrete classes, and then calls each of their methods.
	 */
	public static void main(String[] args) {
		
		//make an array of objects of each type
		C1[] objects = {
				new C1(),
				new C2(),
				//new C3(); //C3 is an abstract class, so can't instantiate it.
				new C4()
		};
		
		// loop through each and call its methods
		for (Object obj : objects) {
			
			// determine the declared package and class name of each object
			String fullClassName = obj.getClass().getName(); //get the class name of this object, including package info
			String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1, fullClassName.length()); // remove package identifiers from class name
			System.out.println("\nCalling the " + className + " object's methods:");

			if (obj instanceof C4) {
				C4 c4 = (C4) obj;
				c4.method1();
				c4.method2();
				c4.method3();
				c4.method4();
				c4.method5();
				c4.method6();
				c4.method7();
			}
			else if (obj instanceof C3) {
				// there are no C3 objects, since C3 is an abstract class
				// but there are objects that inherit from C3 which could be considered C3 objects in a polymorphic kind of way
				// although given how we're using if/else if statements here, this block of code will never execute
				C3 c3 = (C3) obj;
				c3.method1();
				c3.method2();
				c3.method3();
				c3.method4();
				c3.method5();
				c3.method6();
				c3.method7();
			}
			else if (obj instanceof C2) {
				C2 c2 = (C2) obj;
				c2.method1();
				c2.method2();
				c2.method3();
				c2.method4();
				c2.method5();
			}
			else if (obj instanceof C1) {
				C1 c1 = (C1) obj;
				c1.method1();
				c1.method2();
				c1.method3();
				c1.method4();
			}

		}


	} //main method

}
