package edu.nyu.cs.fb1258.inheritance_examples.people_and_students;

import java.util.ArrayList;

/**
 * Put together a course schedule for a student
 * @author Foo Barstein
 * @version 1
 */
public class TestSchedule {
	
	public static void main(String[] args) {

		// set up the values necessary to create a course schedule
		
		// some basic info about the schedule
		String semester = "Spring";
		int year = 2019;
		
		// create a few student whose schedules we will create
		Student me = new Student(); // an pseudononymous student, of random sex, aged zero
		Student you = new Student("Rafaela Barros Cardoso", 57, 'F'); // instantiate using full args constructor
		Student another = new Student("Jennifer Rong Do", 19, 'F'); // instantiate using full args constructor, store in a Person-typed variable!
		
		// put these students into an array list, so we can loop through them easily later on
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(me);
		students.add(you);
		students.add(another);

		// create a few courses
		Course essayCourse = new Course("Writing the Essay", "Prof. Michael Rectenwald", 16, semester, year, "Rubin 110", "MW 9:30AM - 10:45AM", 4);
		Course mathEconCourse = new Course("Math For Econ 2", "Prof. Amos Bloomberg", 350, semester, year, "Silver Center 207", "TR 11:00AM - 12:15PM", 4);
		Course brainCourse = new Course("Brain & Behavior", "Prof. Andrew Something", 100, semester, year, "Silver Center 110", "TR 1:00PM - 2:15PM", 4);
		Course dataStructuresCourse = new Course("Data Structures", "Prof. Joanna Klukowska", 60, semester, year, "WWH 109", "MWTR 8:00AM - 9:15AM", 4);

		// put these courses into an array list, so we can loop through them easily later on
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(essayCourse);
		courses.add(mathEconCourse);
		courses.add(brainCourse);
		courses.add(dataStructuresCourse);

		
		// instantiate a few course schedules for each student, minus the courses for now
		for (Student studly : students) {
			
			// make a class schedule object for each student... a reference to this class schedule is actually stored inside the student's object.. the courseschedule object constructor does that
			ClassSchedule schedule = new ClassSchedule(studly, semester, year);
			
			// add the same courses to each student's schedules, just for example... in reality, of course, each student's schedule is a bit different
			schedule.addCourse(essayCourse);
			schedule.addCourse(mathEconCourse);
			schedule.addCourse(brainCourse);
			schedule.addCourse(dataStructuresCourse);
		}

		
		// prove that this all works!
		
		//print out each student's info, including their name, email address, and list of courses:
		for (Student studly : students) {
			
			// print out this student's info:
			int numCourses = studly.getCurrentClassSchedule().getCourses().size();
			System.out.printf("%s (%s@nyu.edu) is registered for %d courses in %s %d:\n", studly.getName(), studly.getNetId(), numCourses, semester, year);
			
			// print out the list of courses for this student
			for (Course course : studly.getCurrentClassSchedule().getCourses()) {
				System.out.printf("* %s (%d students enrolled / %d capacity)\n", course.getTitle(), course.getStudents().size(), course.getCapacity());
			}
			
			// line break
			System.out.println();
		}
		
		// alternatively, of course you could print out each course's list of students
		for (Course cursely : courses) {
			
			// print out this course's info:
			int numStudents = cursely.getStudents().size();
			System.out.printf("%s (%s %d), with %s, has the following %d students registered:\n", cursely.getTitle(), cursely.getSemeseter(), cursely.getYear(), cursely.getProfessor(), numStudents);
			
			// print out the list of courses for this student
			for (Student studly : cursely.getStudents()) {
				System.out.printf("%s (email: %s@nyu.edu, N#: %s) is taking %d credits total\n", studly.getName(), studly.getNetId(), studly.getnNumber(), studly.getNumberOfCredits());
			}
			
			// line break
			System.out.println();
		}
		
	}

}
