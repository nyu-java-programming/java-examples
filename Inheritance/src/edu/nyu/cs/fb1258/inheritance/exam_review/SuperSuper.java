package edu.nyu.cs.fb1258.inheritance.exam_review;

public class SuperSuper {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(B.y);

	}

}

class A {
	public A(int x) {
		this.setX(x);
	}

	private int x = 1;
	public static final int y = 20;
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return this.x;
	}
}

class B extends A {
	public B() {
		super(5);
		int x = this.getX();
		System.out.println(x);
	}
	public B(int x) {
		super(x);
	}
	public int getX() {
		return super.getX() + 10;
	}

}

class C {
	
}