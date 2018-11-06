package edu.nyu.cs.fb1258.inheritance_examples.people_and_students;

/**
 * Instantiate a few NYUStudent objects
 * @author Foo Barstein
 * @version 0.2
 *
 */
public class TestPersons {

	public static void main(String[] args) {
		
		// instantiate three student objects
		NYUStudent x = new NYUStudent(); // instantiate using no-args constructor
		NYUStudent y = new NYUStudent("Rafaela Barros Cardoso", 57, 'F'); // instantiate using full args constructor
		
		// just because we can, let's store a NYUStudent object into a Person-typed reference... polymorphism!
		Person z = new NYUStudent("Jennifer Rong Do", 19, 'F'); // instantiate using full args constructor, store in a Person-typed variable!
		
		// and just because we can, let's put all 
		
		// output the string representations of all three
		System.out.printf("The three students are:\n* %s\n* %s\n* %s\n", x, y, z);

	}

}
