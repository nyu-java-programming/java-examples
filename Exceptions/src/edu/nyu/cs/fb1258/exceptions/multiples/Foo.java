package edu.nyu.cs.fb1258.exceptions.multiples;

public class Foo {
	
	public static void doSomething() throws ExceptionA, ExceptionB {
		int num = (int) (Math.random() * 10);
		if (num > 5) {
			throw new ExceptionA();
		}
		else {
			throw new ExceptionB();
		}
	}
	
	public static void main(String[] args) {
		try {
			doSomething();
		}
		catch (ExceptionB e) {
			System.out.println("Got an exception B");
		}
		catch (ExceptionA e) {
			System.out.println("Got an exception A");
		}
	}

}

class ExceptionA extends Exception {
	
}

class ExceptionB extends ExceptionA {
	
}