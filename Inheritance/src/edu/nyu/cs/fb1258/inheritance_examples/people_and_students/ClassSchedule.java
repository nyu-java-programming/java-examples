package edu.nyu.cs.fb1258.inheritance_examples.people_and_students;

import java.util.ArrayList;

/**
 * A student's class schedule
 * @author Foo Barstein
 * @version 1
 *
 */
public class ClassSchedule {

	// properties of a student's class schedule
	
	/**
	 * A list of courses
	 */
	private ArrayList<Course> courses = new ArrayList<Course>(); 
	
	/**
	 * The student whose schedule this is
	 */
	private NYUStudent student;
	
	/**
	 * The school to which this schedule is related
	 */
	private String school;
	
	private String semester; // Fall or Spring
	
	private int year; //2018, etc.
	
	/**
	 * Constructor that does basic setup of a course schedule, not including the courses!
	 * @param student The student whose schedule this is
	 * @param school The school at which the courses will be offered
	 * @param semester The semester of the year
	 * @param year The year
	 */
	public ClassSchedule(NYUStudent student, String school, String semester, int year) {
		this.student = student;
		this.school = school;
		this.semester = semester;
		this.year = year;
	}

	/**
	 * Constructor that sets up a course schedule, including a bunch of courses
	 * @param student The student whose schedule this is
	 * @param school The school at which the courses will be offered
	 * @param semester The semester of the year
	 * @param year The year
	 * @param courses The courses this student will take at this school in this semester during this year
	 */
	public ClassSchedule(NYUStudent student, String school, String semester, int year, ArrayList<Course> courses) {
		// run the other constructor
		this(student, school, semester, year);
		
		// do what's different about this constructor
		this.courses = courses;
	}
	
	/**
	 * Add a new course this this schedule
	 * @param course Course object representing the course to add to the schedule
	 */
	public void addCourse(Course course) {
		// add a new element to the array list of courses
		this.courses.add(course);
	}
	
}
