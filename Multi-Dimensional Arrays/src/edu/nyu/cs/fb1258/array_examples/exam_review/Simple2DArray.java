package edu.nyu.cs.fb1258.array_examples.exam_review;

public class Simple2DArray {
	
	public static void hackString(String name) {
		name = "Bob";
	}
	
	public static void giveEveryoneAnA(String[][] grades) {
		for (int i = 0; i<grades.length; i++) {
			// change all grades to A... starting form index 1
			for (int j=1; j<grades[i].length; j++) {
				grades[i][j] = "A"; //hoorah!
			}
			
		}
	}
	
	public static void changeExam1Grade(String name, String newGrade) {
		
		for (int i = 0; i<grades.length; i++) {
			if (grades[i][0].equals(name)) {
				grades[i][1] = newGrade;
			}
		}
	}
	
	public static void printAllGrades() {
		System.out.printf("%10s%10s%10s", "Name", "Exam 1", "Exam 2\n");
		System.out.printf("%10s%10s%10s\n", "-----", "-----", "-----");
		for (String[] student : grades) {
			for (String val : student) {
				System.out.printf("%10s", val);
			}
			// line break
			System.out.println("");
		}
	}
	
	public static String[][] grades = {
			//name		//exam1	//exam2
			{"Kenan", 	"A-", 	"A+"},
			{"Yury", 	"A", 	"A-"},
			{"Michael", "C", 	"C"}
	};
	
	public static void main(String[] args) {
		// change Yury's grade
		changeExam1Grade("Yury", "B+");
		
		// load up Yury's exam1 grade
		System.out.println(grades[1][1]);
		
		giveEveryoneAnA(grades); // boost evaluations!
		System.out.println(grades[1][1]);
		printAllGrades();
		
		char[] x = {'a', 'm', 'o', 's'};
		String name = new String(x);
		hackString(name);
		System.out.println(name);
		
		
		
	}

}
