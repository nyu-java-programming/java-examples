package edu.nyu.cs.fb1258.inheritance.people_and_students;

/**
 * Representation of a Person, with some features and behaviors of a person.
 * @author Foo Barstein
 * @version 0.2
 *
 */
public class Person {

	/**
	 * Sex of the person, as either 'M' or 'F'
	 */
	private char sex;
	
	/**
	 * The name of the person.
	 */
	private String name;
	
	/**
	 * Age of the person, in years
	 */
	private int age;
	
	/**
	 * No-args constructor assigns a few default values
	 */
	public Person() {
		this.setAge(0); // no age specified, so use a default value
		//this.name = "John Doe";
		
		// randomly assign sex
		double rand = Math.random();
		if (rand > 0.5) this.sex = 'F';
		else this.setSex('M');
		
		//assign appropriate unknown name
		if (this.sex == 'F') this.setName("Jane Doe");
		else this.setName("John Doe");
		
	}
	
	/**
	 * A constructor that applies the arguments to the object
	 * @param name The name of the Person object
	 * @param age The age of the Person object
	 * @param sex The sex of the Person object, as char 'F' or 'M'
	 */
	public Person(String name, int age, char sex) {
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
	}
	
	// setters and getters
	
	/**
	 * Set the name, but do some validation first!
	 * @param name The name to apply to this Person
	 */
	public void setName(String name) {
		// validate the name
		if (name.length() > 0) {
			// set the name!
			this.name = name;
		}
	}
	
	/**
	 * @return This Person's name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Set the age, but do some validation first!
	 * @param age The age to apply to this Person
	 */
	public void setAge(int age) {
		// validate the age
		if (age >= 0 && age <= 130) {
			this.age = age;
		}
	}

	/**
	 * @return This Person's age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * Set the sex, but do some validation first!
	 * @param sex The sex to apply to this Person
	 */
	public void setSex(char sex) {
		// validate the sex
		if (sex == 'M' || sex == 'F') {
			this.sex = sex;
		}
	}

	/**
	 * @return This Person's sex
	 */
	public char getSex() {
		return this.sex;
	}

	/**
	 * Return the String representation of this Person
	 * @return This Person's name
	 */
	public String toString() {
		return this.name;
	}
	
}
