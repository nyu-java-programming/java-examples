package edu.nyu.cs.fb1258.array_examples;

import java.util.Scanner;

/**
 * Using a two-dimensional array to hold student grades in a gradebook.
 * @author Foo Barstein
 * @version 2
 *
 */
public class Gradebook {

	// some useful constants to remember which index numbers represent which fields
	public static final int LAST_NAME = 0;
	public static final int FIRST_NAME = 1;
	public static final int EMAIL = 2;
	public static final int EXAM1 = 3;
	public static final int EXAM2 = 4;
	public static final int EXAM3 = 5;
	
	public static void main(String[] args) {
		// we think about single-dimension arrays as lists of stuff
		
		// imagine we had a class with 3 students and we wanted to store their first names, last names, email addresses, and 3 exam scores
		String[][] gradebook = generateGradebook();
		
		// get the number of students in the course
		System.out.printf("There are %d students in this course\n", gradebook.length);
		
		// read out a value in the two-dimensional gradebook array using hard-coded indices
		int vaderExam1Score = getGrade("darth", "vader", gradebook, EXAM1);
		System.out.printf("Darth Vader scored %d on Exam #1\n", vaderExam1Score);
		
		// read out the value of Darth Vader's grade from the gradebook using fancy linear search method
		int vaderExam1ScoreAgain = getGrade("darth", "vader", gradebook, EXAM1);		
		System.out.printf("Darth Vader scored %s on Exam #1\n", vaderExam1ScoreAgain);

		// modify the exam 2 score of darth vader using hard-coded indices
		int vaderExam2CurrentScore = Integer.parseInt(gradebook[1][4]); // convert to int
		int vaderExam2BoostedScore = vaderExam2CurrentScore + 2; // add 2
		gradebook[1][4] = Integer.toString(vaderExam2BoostedScore); // store new grade as a string in the gradebook, which is a string array
		System.out.printf("Darth Vader's Exam #2 score has been updated to %s\n", gradebook[1][4]);

		// modify the exam 2 score of darth vader using a fancy linear search technique
		changeGrade("darth", "vader", gradebook, EXAM2, 100);
		System.out.printf("Darth Vader's Exam #2 score has been updated to %s\n", gradebook[1][4]);

		// ask the user which student they'd like to find the score for
		lookupStudentExamScore(gradebook);
	}
	
	/**
	 * Create a gradebook with some nonsense data in it
	 * @return a two-dimensional string array with student names, email address, and exam grades
	 */
	public static String[][] generateGradebook() {
		// imagine we had a class with 3 students and we wanted to store their first names, last names, email addresses, and 3 exam scores
		String[][] gradebook = {
				// lname,	fname,	email,				exam1,	exam2,	exam3
				{"smith",	"bob",	"bs@nyu.edu", 		"100",	"43",	"45"},
				{"vader",	"darth","dv666@nyu.edu",	"95",	"86",	"60"},
				{"Jacobsen","Line",	"lj4321@nyu.edu",	"97",	"86",	"92"}
				// add as many students as you like in this format
		};
		return gradebook;
	}
	
	/**
	 * Update a student's exam grade.
	 * @param firstName The first name of the student whose grade we'd like to update.
	 * @param lastName The last name of the student whose grade we'd like to update.
	 * @param gradebook The gradebook within which to make the change
	 * @param whichExam The index number of the exam field in student data array
	 * @param newScore The new exam score to save in this field in the gradebook
	 */
	public static void changeGrade(String firstName, String lastName, String[][] gradebook, int whichExam, int newScore) {
		// classic linear search
		for (String[] student : gradebook) {
			if (student[FIRST_NAME].equalsIgnoreCase(firstName) && student[LAST_NAME].equalsIgnoreCase(lastName)) {
				// we've found the student we're looking for
				student[whichExam] = Integer.toString(newScore); // convert to string and store in gradebook, which is a string array
			}
		}
	}
	
	/**
	 * Find the grade for a particular student on a particular exam
	 * @param firstName The first name of the student to look up
	 * @param lastName The last name of the student to look up
	 * @param gradebook The gradebook in which the grades are stored
	 * @param whichExam The exam field we want to find the grade for
	 * @return The grade on the specified exam for the specified student, -1 if student is not found
	 */
	public static int getGrade(String firstName, String lastName, String[][] gradebook, int whichExam) {
		int grade = -1; // if the method returns -1, that is a sign we did not find the student's grade in the gradebook
		
		// foreach style linear search through gradebook
		for (String[] student : gradebook) {
			// see whether this student is the one we're looking for!
			if (student[FIRST_NAME].equalsIgnoreCase(firstName) && student[LAST_NAME].equalsIgnoreCase(lastName)) {
				// we've found the student!
				grade = Integer.parseInt(student[whichExam]);
			}
		}
		
		return grade;
	}
	
	/**
	 * Asks the user to enter a student's name and an exam number to look up the grade for.  Outputs the corresponding grade.
	 */
	public static void lookupStudentExamScore(String[][] gradebook) {
		Scanner scanly = new Scanner(System.in);
		
		// ask the user which student and which exam to look up
		System.out.println("\nPlease enter a student's name (enter their first name and last name separated by space): ");
		String[] names = scanly.nextLine().split(" "); // separate first and last names into array
		
		System.out.printf("Which exam would you like to know the grade for %s? (enter '1', '2', or '3') ", names[0]);
		int examNum = scanly.nextInt(); // presumably 1, 2, or 3
		int whichExam = examNum + 2; // convert the user's number into the proper array index for the exam field, which is either index 3, 4, or 5 ... a hack!
		
		System.out.printf("\n... looking up Exam #%d for student %s, %s ...\n", examNum, names[1], names[0]);
		
		// get the score for this student on this exam
		int score = getGrade(names[0], names[1], gradebook, whichExam);
		
		// output score to user
		System.out.printf("\n%s, %s scored a %d on Exam #%d.\n", names[1], names[0], score, examNum);
		
		
	}
	

}
