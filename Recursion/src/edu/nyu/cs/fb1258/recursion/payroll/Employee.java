package edu.nyu.cs.fb1258.recursion.payroll;

/**
 * Represents a wage laborer, including their name, the number of hours they've worked, and their hourly pay rate.
 * @author Foo Barstein
 * @version 2
 */
public class Employee {

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
	

	/**
	 * The name of the employee
	 */
	String name;
	
	/**
	 * The hours worked by this employee
	 */
	int hours;
	
	/**
	 * The hourly wage of this employee
	 */
	double rate;
	
}
