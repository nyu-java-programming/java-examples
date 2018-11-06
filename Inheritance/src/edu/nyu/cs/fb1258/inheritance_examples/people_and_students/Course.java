package edu.nyu.cs.fb1258.inheritance_examples.people_and_students;

/**
 * A course in a university
 * @author Foo Barstein
 * @version 1
 *
 */
public class Course {
	
	private String title;
	private String location;
	private String professor;
	private String time;
	
	public Course(String title, String location, String professor, String time) {
		// set up all the properties of this object
		this.title = title;
		this.location = location;
		this.professor = professor;
		this.time = time;
	}

}
