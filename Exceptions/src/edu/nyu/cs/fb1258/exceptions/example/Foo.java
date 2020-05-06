package edu.nyu.cs.fb1258.exceptions.example;

public class Foo {

	public static void doSomethingElse() throws MyFavoriteException {
		System.out.println("Doing somethign else");
		throw new MyFavoriteException();
	}

	public static void doSomething() throws MyFavoriteException {
		doSomethingElse();
	}
	
	public static void main(String[] args) {
		try {
			doSomething();
		}
		catch (MyFavoriteException e) {
			System.out.println(e);
		}
	}

}
