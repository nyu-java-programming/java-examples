package edu.nyu.cs.fb1258.circles;

public class TestCircles {

	public static void main(String[] args) {
		
		Circle myCirc1 = new Circle(50);
		System.out.println( myCirc1.getArea() );
		
		Circle myCirc2 = new Circle(25);
		System.out.println( myCirc2.getArea() );
		
		// output how many circles have been created
		int numCircles = Circle.getNumCirclesInWorld();
		System.out.println(numCircles);

	}

}
