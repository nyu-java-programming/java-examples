package edu.nyu.cs.fb1258.recursion_examples.payroll;

import java.io.*;
import java.util.*;

/**
 * Represents a list of employees.
 * @author Foo Barstein
 * @version 2
 * 
 */
public class Payroll {

	final int MAX = 30;
	Employee[] payroll = new Employee[MAX];
	int numEmployees = 0;
	boolean hasData = false;
	
	/**
	 * Reads the list of employee wage data from the given file.
	 * @param file The name of the file to read from.
	 */
	public void readPayrollInfo(String file) {
		String line;		//a line in the file
		String name;		//name of an employee
		int hours;		//hours worked
		double rate;		//hourly pay rate
		
		Scanner fileScan, lineScan;
		
		try {
			//open the file
			fileScan = new Scanner(new File(file));
			
			//loop as many times as there are lines in the file
			while (fileScan.hasNext()) {
				//get the next available line
				line = fileScan.nextLine();
	
				lineScan = new Scanner(line); //did you know you could make a Scanner out of each line?!
				
				//get the name out of the line
				name = lineScan.next();
				
				//try to get the hour sand rate data out of the line... this may fail if the data is not suitable for the data types of these variables, or if the array of Employees is full already
				try {
					//get the hours and rate out of the line
					hours = lineScan.nextInt();
					rate = lineScan.nextDouble();

					//System.out.println(name + "," + hours + "," + rate); //debugging

					//create a new Employee with this data and add to the array
					payroll[numEmployees] = new Employee(name, hours, rate);
					
					//increment the employee counter
					numEmployees++;
				}
				catch(InputMismatchException e) {
					//one of the values in the line was of the wrong data type
					System.out.println("Error in input.  Line ignored.");
					System.out.println(line);
				}
				catch (ArrayIndexOutOfBoundsException e) {
					//the employees array is full
					System.out.println("Too many employees!");
				}
				
			} //try
			
			//close the file
			fileScan.close();
			
			//keep track that we have read the data
			hasData = true;
			
		}
		catch(FileNotFoundException e) {
			//the data file could not be opened
			System.out.println("The file " + file + " was not found.");
		}
		
	} //readPayrollInfo
	
	/**
	 * Returns the number of employees who worked over 40 hours;  the helper method overtime is called to do all the work.
	 * @return number of employees who worked over 40 hours.
	 */
	public int numOvertime() {
		return overtime(0);
	}
	
	/**
	 * Returns the number of employees in the part of the list from index start to the end who worked more than 40 hours.  This value is calculated recursively.
	 * @param start The index of the starting position in the list
	 * @return The number of employees in the part of the list from the index start to the end who worked more than 40 hours.
	 */
	private int overtime(int start) {
		int numOvertimeWorkers = 0;
		
		//make sure the start position is a valid index in the payroll array
		if (start >= 0 && start < MAX && payroll[start] != null) {

			//System.out.println(start); //debugging
		 	
			//handle the base case here: get the employee at the start index and determine overtime status
			Employee laborer = payroll[start];
			
			//if this employee worked overtime, add to the counter
			if (laborer.hours > 40) {
				numOvertimeWorkers++;
			}			
			
			//handle the rest recursively: calculate how many of the rest of the employees worked overtime
			numOvertimeWorkers += overtime(start + 1);
		}
				
		return numOvertimeWorkers;
	}

}
