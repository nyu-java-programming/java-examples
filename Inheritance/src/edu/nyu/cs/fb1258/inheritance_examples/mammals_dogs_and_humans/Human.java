package edu.nyu.cs.fb1258.inheritance_examples.mammals_dogs_and_humans;

/**
 * A virtual representation of a Human, which is, of course, a type of Mammal
 * @author Foo Barstein
 * @version 2.9
 *
 */
public class Human extends Mammal {
	
	// constructors
	
	/**
	 * no-args constructor simply calls the Mammal class's default constructor
	 */
	public Human() {
		super(); //call parent class's default constructor
	}
	
	/**
	 * overloaded constructor sets the Human object's first name
	 * @param firstName String of first name of the new Human object
	 */
	public Human(String firstName) {
		super();  //call parent class's no-args constructor to assign a random sex to this Human
		this.firstName = firstName;
		this.lastName = null; //no last name... this is redundant since the default value for un-assigned Strings is null
	}
	
	/**
	 * overloaded constructor sets the Human object's first and last names
	 * @param firstName String of first name of the new Human object
	 * @param sex int representing the Human's sex: 0=male, 1=female
	 */
	public Human(String firstName, int sex) {
		super(sex);  //call parent class's constructor and pass it the sex to assign to this Human
		
		//set some Human-specific properties
		this.firstName = firstName;
		this.lastName = null;
	}
	
	/**
	 * overloaded constructor that sets the Human object's first and last names
	 * @param firstName String of first name of the new Human object
	 * @param lastName String of last name of the new Human object
	 */
	public Human(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * overloaded constructor that sets the Human object's first and last names, as well as sex.
	 * @param firstName String of first name of the new Human object
	 * @param lastName String of last name of the new Human object
	 * @param sex int representing the Human's sex: 0=male, 1=female
	 */
	public Human(String firstName, String lastName, int sex) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * the first name of this Human object
	 */
	private String firstName;
	
	/**
	 * the last name of this Human object
	 */
	private String lastName;


	/**
	 * override the default Mammal sleep method with a Human-specific sleep style.
	 */
	public void sleep() {
		super.sleep(); //calling the Mammal's version of the sleep method first

		//then doing some additional Human type sleeping...
		System.out.printf("%s is sleeping ...snore snore snore.\n", this.firstName);
	}
	
	/**
	 * A specifically human method that other Mammals don't have
	 */
	public void speak() {
		System.out.printf("%s is saying something interesting...\n", this.firstName);
	}

}