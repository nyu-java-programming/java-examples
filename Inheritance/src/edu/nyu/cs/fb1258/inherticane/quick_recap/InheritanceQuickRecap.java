package edu.nyu.cs.fb1258.inherticane.quick_recap;

public class InheritanceQuickRecap {

	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.getX());
		
		B b1 = new B();
		System.out.println(b1.getX());
		
		A b2 = new B(); // polymorphism!
		System.out.println(b2.getX());
		
		C c = new C();
		System.out.println(c.getX());
		System.out.println(c.getMessage());

		
	}

}

class A {
	public A() {
		System.out.println("\nMaking an A object!");
	}
	private int x = 10;
	private String message = "hello";

	// classic 'setter' and 'getter' methods.
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getMessage() {
		return this.message;
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("Making a B object!");
	}
	
	int x = 20; // overriding
	
	// classic 'setter' and 'getter' methods.
	public int getX() {
		return super.getX();
	}
	public void setX(int x) {
		super.setX(x);
	}
	
	public String getMessage() {
		return super.getMessage();
	}
}

class C extends B {
	public C() {
		super();
		System.out.println("Making a C object!");
	}
	
}