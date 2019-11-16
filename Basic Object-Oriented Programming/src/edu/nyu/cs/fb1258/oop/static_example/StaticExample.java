package edu.nyu.cs.fb1258.oop.static_example;

public class StaticExample {

	public static void main(String[] args) {
		for (int i=0; i<8; i++) {
			A a = new A();
			System.out.println(A.counter);
			A.printSomething();
		}
		
		

	}

}

class A {
	public A() {
		counter++;
	}
	
	static int counter = 0;
	String message = "hello";
	
	public static void printSomething() {
		//System.out.println(this.message);
	}
	
	public void printSomethingElse() {
		System.out.println(A.counter);
	}
}
