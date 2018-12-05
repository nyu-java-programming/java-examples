package edu.nyu.cs.fb1258.recursion_examples;

/**
 * Represents an hourly wage laborer.
 * @author Foo Barstein
 * @version 2
 */
public class Employee {
	String name;
	int hours;	//hours worked
	double rate; //hourly pay rate
	
	/**
	 * Sets up the Employee object with the given data.
	 * @param name Name of employee
	 * @param hours hours worked
	 * @param rate hourly pay rate
	 */
	public Employee(String name, int hours, double rate) {
		this.name = name;
		this.hours = hours;
		this.rate = rate;
	}
	
}
