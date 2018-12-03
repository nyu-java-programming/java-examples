package edu.nyu.cs.fb1258.exception_examples;

/**
 * Example program that shows how to throw a custom exception object and handle that.
 * @author Foo Barstein
 * @version 2
 *
 */
public class CustomExceptionExample {
	
	/**
	 * This method pseudo-randomly throws an exception object some of the time just for fun.
	 * @throws FailingCourseException
	 */
	public static void method2() throws FailingCourseException {
		int x = (int) (Math.random() + .1);
		if (x == 1) {
			FailingCourseException e = new FailingCourseException();
			throw e;
		}
	}
	
	/**
	 * This method calls method2, which sometimes throws exceptions.  So this method itself declares that it may throw those exceptions.
	 * @throws FailingCourseException The exception that is sometimes thrown by method2()
	 */
	public static void method1() throws FailingCourseException {
		method2();
	}

	/**
	 * This method calls method1, which sometimes throws exceptions.  So this method places the call to method1 within a try block.
	 */
	public static void main(String[] args)  {
		try {
			//try to call method1... if it results in an exception, the catch block will handle it.
			method1();
			System.out.println("I guess you must not be failing the course");
		}
		catch (FailingCourseException e) {
			//handle the exception
			System.out.println(e);
		}
	}

}

/**
 * Custom Exception class.  Any class that inherits from Exception is a custom exception type.
 * @author Foo Barstein
 * @version 2
 *
 */
class FailingCourseException extends Exception {
	/**
	 * The string representation of an object of this type.
	 */
	public String toString() {
		return "Sorry, you're failing the course!";
	}
}
