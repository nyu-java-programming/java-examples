package edu.nyu.cs.fb1258.abstract_classes.basics;

public abstract class ClassA {
	public int x = 10;
	private int y = 20;
	public static int z = 30;
	private static int a = 40;
	public final int b = 50;
	private final int c = 60;
	public static final int d = 70;
	private static final int e = 80;
	
	private void doSomething1() {
		System.out.println("doSomething1");
	}
	public void doSomething2() {
		System.out.println("doSomething2");
	}
	public static void doSomething3() {
		System.out.println("doSomething3");
	}
	private static void doSomething4() {
		System.out.println("doSomething3");
	}
	
	public abstract void doSomething5();
	

}
