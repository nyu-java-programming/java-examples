package edu.nyu.cs.fb1258.inheritance_examples.people_and_students;

import java.util.ArrayList;

/**
 * A Student's class schedule
 * @author Foo Barstein
 * @version 1
 *
 */
public class ClassSchedule {
	
	// constructors

	/**
	 * Constructor that does basic setup of a course schedule, not including the courses!
	 * @param student The student whose schedule this is
	 * @param semester The semester of the year
	 * @param year The year to which the schedule is relevant
	 */
	public ClassSchedule(Student student, String semester, int year) {
		// set all the basic properties of the object
		this.setStudent(student);
		this.setSemester(semester);
		this.setYear(year);
		
		// add this class schedule to the student object
		this.student.setCurrentClassSchedule(this);
	}

	/**
	 * Constructor that sets up a course schedule, including a bunch of courses
	 * @param student The student whose schedule this is
	 * @param semester The semester of the year
	 * @param year The year
	 * @param courses The courses this student will take at this school in this semester during this year
	 */
	public ClassSchedule(Student student, String semester, int year, ArrayList<Course> courses) {
		// run the other constructor that sets up the basic properties
		this(student, semester, year);
		
		// do what's different about this constructor... adding the courses
		this.courses = courses;
	}
	
	// properties of a student's class schedule
	
	/**
	 * A list of courses
	 */
	private ArrayList<Course> courses = new ArrayList<Course>(); 
	
	/**
	 * The student whose schedule this is
	 */
	private Student student;
	
	/**
	 * The semester for which this schedule is relevant
	 */
	private String semester; // Fall or Spring
	
	/**
	 * The year for which this schedule is relevant
	 */
	private int year; //2018, etc.
	

	/**
	 * Add a new course this this schedule
	 * @param course Course object representing the course to add to the schedule
	 */
	public void addCourse(Course course) {
		// add a new element to the array list of courses in this schedule
		this.courses.add(course);
		
		// add the student whose schedule this is to the course's list of registered students
		course.registerStudent(this.getStudent());
		
		
	}

	// generic getters and setters
	// note that we are not currently doing any validation in the setters, but should really do so
	
	/**
	 * @return the courses
	 */
	public ArrayList<Course> getCourses() {
		return this.courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return this.student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * @return the semester
	 */
	public String getSemester() {
		return this.semester;
	}

	/**
	 * @param semester the semester to set
	 */
	public void setSemester(String semester) {
		this.semester = semester;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return this.year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
