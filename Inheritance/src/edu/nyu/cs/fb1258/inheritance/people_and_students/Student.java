package edu.nyu.cs.fb1258.inheritance.people_and_students;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

/**
 * The definition of an NYU student
 * @author Foo Barstein
 * @version 0.1
 *
 */
public class Student extends Person {
	// constructors

	// the no-args constructor has been inherited... so no need to redefine if you don't want to changer it
	public Student() {
		// call the parent class's no-args constructor to set up the properties all Persons have
		super(); 
		
		// now do things that are unique to Student objects...
		
		// generate an N Number for this student
		this.nNumber = Student.generateIDNumber();

		// get this student's Net Id
		this.netId = this.generateNetId(this.getName());
	}
	
	/**
	 * A constructor that creates a student with some basic Person information
	 * @param name The name of the Student
	 * @param age The age of the Student
	 * @param sex The sex of the Student
	 */
	public Student(String name, int age, char sex) {
		// call the parent class's constructor with arguments to set up the properties all Persons have
		super(name, age, sex);
		
		// now do things that are unique to Student objects...

		// assign an N number to this student
		this.nNumber = Student.generateIDNumber();
		
		// get this student's Net Id
		this.netId = this.generateNetId(this.getName());
	}
	
	
	// properties that are shared among all students
	
	/**
	 * How many students have been instantiated
	 */
	private static int numStudents = 0;
	
	/**
	  * This hash map consists of key/value pairs that help us to make sure all Net IDs are unique
	  * The key will be a set of initials as a String, and the value will be how many students have those initials as an Integer
	 */
	private static HashMap<String, Integer> initialsCounters = new HashMap<String, Integer>();
	
	
	// some properties that students have in addition to the basic Person stuff
	
	/**
	 * The current course schedule for this student
	 */
	private ClassSchedule currentClassSchedule;
	
	/**
	 * The NYU ID number of this student... e.g. "N12345678";
	 */
	private String nNumber;
	
	/**
	 * The NYU Net ID of this student... e.g. "fb1258"
	 */
	private String netId;
	
	/**
	 * The major of the student... e.g. "Computer Science"
	 */
	private String major = "Computer Science";
	
	/**
	 * The year the student is in
	 */
	private String year; // e.g. "Freshman"

	/**
	 * NYU ID numbers are the letter 'N', followed by 8 digits.  We simply increment a static counter and use that as the ID for each new student.
	 * This is a static method, so we can reference only static properties within it
	 * @return A new ID Number for a new student
	 */
	public static String generateIDNumber() {
		// increment the student counter
		Student.numStudents++;

		// figure out what number this student is
		int studentNum = Student.numStudents;
		
		// determine how many characters are in this number
		int numCharsInStudentNumber = Integer.toString(studentNum).length();
		
		//fill in 0s so that the number consumes 8 characters
		//using char array to do this, because it's easy
		int numZerosToFill = 8 - numCharsInStudentNumber; // how many 0's we need to fill in
		char[] zerosInStudentId = new char[numZerosToFill];
		Arrays.fill(zerosInStudentId, '0'); // fill with zeros!
		String zeros = new String(zerosInStudentId);  // convert char array of zeros to String
		
		// assemble the completed ID... N number, followed by zeros, followed by the student number
		String nNumber = "N" + zeros + studentNum;
		
		return nNumber;
	}
	
	/**
	 * Generate a valid NYU Net ID, based on the student's name.
	 * @param name The name of the Student
	 * @return The Net ID, e.g. 'fb1258';
	 */
	public String generateNetId(String name) {
		
		// get the first and last initials of this student
		String[] names = name.split(" "); // split by space to separate any first/middle/last names
		char firstInitial = names[0].charAt(0); // the first char of the first name
		char lastInitial = names[names.length - 1].charAt(0); // the first char of the last name
			
		// add the initials to the Net Id
		String initials = Character.toString(firstInitial) + Character.toString(lastInitial); // convert the two chars to Strings and concatenate to the Net Id
		
		// determine how many existing students have these same initials
		Integer count = (Integer) Student.initialsCounters.get(initials);
		if (count == null) {
			// no existing students have these same initials
			count = 0;
		}
		
		// add one to this counter, since we now have a new student with these initials
		count++;
		Student.initialsCounters.put(initials, count); // store this update in the hash map
		
		//fill in 0s so that the number consumes 8 characters
		//using char array to do this, because it's easy
		int numCharsInStudentNetId = Integer.toString(count).length(); // the number of chars in this number 
		int numZerosToFill = 4 - numCharsInStudentNetId; // how many 0's we need to fill in
		char[] zerosInStudentNetId = new char[numZerosToFill];
		Arrays.fill(zerosInStudentNetId, '0'); // fill with zeros!
		String zeros = new String(zerosInStudentNetId);  // convert char array of zeros to String

		// assemble a unique Net Id... all lowercase
		String netId = initials.toLowerCase() + zeros + count;

		return netId;
	}
	
	public int getNumberOfCredits() {
		// loop through all the courses this student is taking and calculate sum of credits
		int sum = 0;
		for (Course cursely : this.getCurrentClassSchedule().getCourses()) {
			sum += cursely.getNumCredits();
		}
		
		return sum;
			
	}
	// generic getters and setters
	// note that we are not doing any validation in the setters, which really should be done

	/**
	 * @return the currentClassSchedule
	 */
	public ClassSchedule getCurrentClassSchedule() {
		return currentClassSchedule;
	}

	/**
	 * @param currentClassSchedule the currentClassSchedule to set
	 */
	public void setCurrentClassSchedule(ClassSchedule currentClassSchedule) {
		this.currentClassSchedule = currentClassSchedule;
	}

	/**
	 * @return the nNumber
	 */
	public String getnNumber() {
		return this.nNumber;
	}

	/**
	 * @param nNumber the nNumber to set
	 */
	public void setnNumber(String nNumber) {
		this.nNumber = this.nNumber;
	}

	/**
	 * @return the netId
	 */
	public String getNetId() {
		return this.netId;
	}

	/**
	 * @param netId the netId to set
	 */
	public void setNetId(String netId) {
		this.netId = this.netId;
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return this.major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return this.year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	
	/**
	 * The string representation of this object... uses the default parent class's .toString() method, and adds the N Number to it.
	 * @return the String that represents this Student
	 */
	public String toString() {
		// get the string version of this object as the parent class generates it
		String str = super.toString();
		
		// attach this student's Net Id
		str +=  " (Net ID: " + this.netId + ";"; 

		// attach this student's N number
		str +=  " N Number: " + this.nNumber + ")"; 
		
		return str;
	}
	
}
