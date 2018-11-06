package edu.nyu.cs.fb1258.inheritance_examples.people_and_students;

import java.util.ArrayList;

/**
 * A course in a university
 * @author Foo Barstein
 * @version 1
 *
 */
public class Course {

	/**
	 * Construct to set up all properties of a Course
	 * @param title The title of the course
	 * @param professor The professor teaching that course
	 * @param capacity The number of students allowed to register for this course
	 * @param semester The semester, e.g. "Fall", "Spring"
	 * @param year The year in which the course is offered, e.g. 2019
	 * @param location The building and room of the course is held in
	 * @param time The days and time that the course takes place
	 * @param numCredits The number of credits this course is worth
	 */
	public Course(String title, String professor, int capacity, String semester, int year, String location, String time, int numCredits) {
		// set up all the properties of this object
		
		// note that we are not doing any validation of these fields... 
		// we should really add validation into these setter methods.
		this.setTitle(title);
		this.setProfessor(professor);
		this.setCapacity(capacity);
		this.setLocation(location);
		this.setSemeseter(semester);
		this.setYear(year);
		this.setTime(time);
		this.setNumCredits(numCredits);
	}

	// properties of a course
	
	/**
	 * A list of students
	 */
	private ArrayList<Student> students = new ArrayList<Student>(); 

	/**
	 * The title of the course
	 */
	private String title;
	
	/**
	 * The professor who teaches the course
	 */
	private String professor;
	
	/**
	 * The number of students allowed to register for this course
	 */
	private int capacity;
	
	/**
	 * The semester in which the course is offered
	 */
	private String semeseter;
	
	/**
	 * The year in which the course is offered
	 */
	private int year;
	
	/**
	 * The location where the course takes place
	 */
	private String location;
	
	/**
	 * The day and time that the course takes place
	 */
	private String time;

	/**
	 * The number of credits this course is worth
	 */
	private int numCredits;


	/**
	 * Register a new student this this Course, as long as there is capacity
	 * @param student Student object representing a student who is registering for this course
	 */
	public void registerStudent(Student student) {
		// make sure there's capacity for a new student
		if (this.getCapacity() > this.getStudents().size()) {
			// if so, add a new element to the array list of courses
			this.students.add(student);
		}
	}

	
	// generic getters and setters
	// note that we are not currently doing any validation in the setters, but should really do so
	
	/**
	 * @return the students
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}


	/**
	 * @param students the students to set
	 */
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}


	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return this.location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the professor
	 */
	public String getProfessor() {
		return this.professor;
	}

	/**
	 * @param professor the professor to set
	 */
	public void setProfessor(String professor) {
		this.professor = professor;
	}

	/**
	 * @return the semeseter
	 */
	public String getSemeseter() {
		return this.semeseter;
	}

	/**
	 * @param semeseter the semeseter to set
	 */
	public void setSemeseter(String semeseter) {
		this.semeseter = semeseter;
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

	/**
	 * @return the time
	 */
	public String getTime() {
		return this.time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}


	/**
	 * @return the numCredits
	 */
	public int getNumCredits() {
		return numCredits;
	}


	/**
	 * @param numCredits the numCredits to set
	 */
	public void setNumCredits(int numCredits) {
		this.numCredits = numCredits;
	}

}
