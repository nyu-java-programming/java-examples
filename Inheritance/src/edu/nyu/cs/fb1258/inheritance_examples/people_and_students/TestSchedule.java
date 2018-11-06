package edu.nyu.cs.fb1258.inheritance_examples.people_and_students;

public class TestSchedule {
	
	public static void main(String[] args) {

		// make a course schedule
		NYUStudent me = new NYUStudent();
		String school = "New York University";
		String semester = "Spring";
		int year = 2019;
		
		// instantiate a basic course schedule, minus the courses
		ClassSchedule mySchedule = new ClassSchedule(me, school, semester, year);
		
		// add the courses!
		mySchedule.addCourse(new Course("Writing the Essay", "Rubin 110", "Prof. Michael Rectenwald", "MW 9:30AM - 10:45AM"));
		mySchedule.addCourse(new Course("Math For Econ 2", "Silver Center 207", "Prof. Amos Bloomberg", "TR 11:00AM - 12:15PM"));
		mySchedule.addCourse(new Course("Brain & Behavior", "Silver Center 110", "Prof. Andrew Something", "TR 1:00PM - 2:15PM"));
		mySchedule.addCourse(new Course("Data Structure", "WWH 109", "Prof. Joanna Kuklowska", "MWTR 8:00AM - 9:15AM"));

	}

}
