package edu.nyu.cs.fb1258.array_examples;

public class PassingAsArgument {
	
	public static void foo(int[] x) {
		x[2] = 5;
	}

	public static void bar(Foo y) {
		y.x = 5;
	}
	
	public static void main(String[] args) {
		
		//int[] x = {1,2,3,4};
		int[] x = new int[4];
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		x[3] = 4;
		foo(x);
		System.out.println(x[2]);
		
		Foo y = new Foo();
		bar(y);
		System.out.println(y.x);

	}

}

class Foo {
	public int x = 3;
}