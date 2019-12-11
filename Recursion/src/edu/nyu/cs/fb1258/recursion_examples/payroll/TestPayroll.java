package edu.nyu.cs.fb1258.recursion_examples.payroll;

import java.util.Scanner;

/**
 * Test class to read payroll data and output how many employees worked overtime.
 * @author Foo Barstein
 * @version 2
 *
 */
public class TestPayroll {

	public static void main(String[] args) {
		String filename;		//Name of the file containing employee data
		int numOvertimeWorkers; //Number of workers who worked overtime

		Scanner scn = new Scanner(System.in);
		
		System.out.println("\nPayroll Program");
		System.out.print("Enter the name of the file containing payroll data.\nFor example, payroll.txt or payroll2.txt.\nFilename: ");

		//get the name of the file from the user
		filename = scn.nextLine();
		
		//instantiate a Payroll object
		Payroll p = new Payroll();
		
		//read in the data from the file
		p.readPayrollInfo("src/edu/nyu/cs/fb1258/recursion_examples/payroll/" + filename);
		
		//if the payroll data has been read, analyze the data
		if (p.hasData) {
			//Print the number of workers who worked overtime.
			numOvertimeWorkers = p.numOvertime();
			System.out.println(numOvertimeWorkers + " workers worked overtime.");		
		}
		
		//close the file
		scn.close();
	}
}
