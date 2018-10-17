package edu.nyu.cs.fb1258.array_examples;

public class SimpleExample {

	public static void main(String[] args) {
		
		// declaring, allocation, populating a 2-dimensional array
		String[][] x = {
				// a 'triangular array'! triangle arrays are one type of 'ragged array' - arrays with different lengthed sub-arrays
				{"semantic", "nonsense", "befuddle", "yuckers"},
				{"pedagogic", "drivvle", "puddle"},
				{"didactic", "diaspora"},
				{"plethora"}
		};
		
		// read a value from this array
		String[] firstRow = x[0];
		String firstRowSecondColumn = firstRow[1];
		System.out.println("The value in row 1 column 2 is " + firstRowSecondColumn);
		
		// read a value from this array the 'normal' way
		String firstRowSecondColumnAgain = x[0][1];
		System.out.println("The value in row 1 column 2 is " + firstRowSecondColumnAgain);
		
		// modify a value in the array
		x[1][0] = "meticulous";
		System.out.println("The value in row 2 column 1 is " + x[1][0]);
		
		// assign a new sub-array to one of the spots of the outer array
		x[1] = new String[1];
		
		

	}

}
