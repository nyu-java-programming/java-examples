package edu.nyu.cs.fb1258.inheritance.exam_review.section2;

public class SimpleExample {

	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C();
		B b1 = new B();
		B b2 = new B();
		A a1 = new A();
		A a2 = new A();
		
		A[] myObjs = {c1, c2, b1, b2, a1, a2};
		
		for (A myObj : myObjs) {
			myObj.print();
		}
		
	}

}

class A {
	public A() {
		super();
		//System.out.println("Made an A object!");
	}

	int x = 5;

	public void print() {
		//System.out.println(this.x);
	}
}

class B extends A {
	public B() {
		super();
		//System.out.println("Made a B object!");
	}
	
	// B objects inherit A's x property and print() method
	String y = "hello";
}

class C extends B {
	public C() {
		super();
		//System.out.println("Made a C object!");
	}
	
	private int x = 10; // overriding

	// overriding!
	public void print() {
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(super.x);
	}
	
	public int getX() { 
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void foobar() {
		System.out.println("foobar");
	}

}