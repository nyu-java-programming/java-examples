package edu.nyu.cs.fb1258.array_examples;

/**
 * Example of using a two-dimensional array to manipulate two-dimensional grid-like tabular data
 * @author Foo Barstein
 * @version 0.2
 *
 */

public class Grid {

	public static void main(String[] args) {
		
		//INITIALIZE MULTI-DIMENSIONAL ARRAY
		String[][] grades = new String[44][3]; //imagine a grade chart for 44 students taking 3 exams

		//WRITE VALUES TO EVERY ELEMENT IN MULTI-DIMENSIONAL ARRAY
		for (int i=0; i<grades.length; i++) { //loop through each row
			for (int j=0; j<grades[i].length; j++) { //loop through all columns within the current row
				grades[i][j] = "F"; //enter F for each element 
			}
		}

		//read each element of our multi-dim array and make it look nicely formatted
		System.out.printf("%5s%10s%10s%10s", "", "Exam 1", "Exam 2", "Exam 3"); //print out column headings
		System.out.println(); //print a line break
		for (int i=0; i<grades.length; i++) { //loop through each row
			System.out.printf("%5s", i); //print the row number
			for (int j=0; j<grades[i].length; j++) { //loop through each column
				System.out.printf("%10s", grades[i][j]); //print the grade in each column
			}
			System.out.println(); //print a line break
		}
	}

}