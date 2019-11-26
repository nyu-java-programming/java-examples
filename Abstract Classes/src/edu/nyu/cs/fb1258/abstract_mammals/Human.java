package edu.nyu.cs.fb1258.abstract_mammals;

/**
 * A virtual representation of a Human, which is, of course, a type of Mammal
 * @author Foo Barstein
 * @version 2.9
 *
 */
public class Human extends Mammal {
	/**
	 * the first name of this Human object
	 */
	private String firstName;
	
	/**
	 * the last name of this Human object
	 */
	private String lastName;

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
	}
	
	/**
	 * overloaded constructor sets the Human object's first and last names
	 * @param firstName String of first name of the new Human object
	 * @param sex int representing the Human's gender: 0=male, 1=female
	 */
	public Human(String firstName, int sex) {
		super(sex);  //call parent class's constructor and pass it the gender to assign to this Human
		
		//set some Human-specific properties
		this.firstName = firstName;
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
	 * overloaded constructor that sets the Human object's first and last names, as well as gender.
	 * @param firstName String of first name of the new Human object
	 * @param lastName String of last name of the new Human object
	 * @param sex int representing the Human's gender: 0=male, 1=female
	 */
	public Human(String firstName, String lastName, int sex) {
		super(sex);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * A specifically human method that other Mammals don't have
	 */
	public void speak() {
		System.out.println(this.firstName + " is saying something interesting...");
	}

	/**
	 * override the default Mammal sleep method with a Human-specific sleep style.
	 */
	public void sleep() {
		super.sleep();
		//then doing some additional Human type sleeping...
		System.out.println(this.firstName + " is sleeping ...snore snore snore.");
	}
	
	@Override
	public void eat() {
		System.out.println(this.firstName + " is eating human style");
	}


	@Override
	public void lactate(boolean aLot) {
		if (aLot) {
			System.out.println(this.firstName + " is lactating a lot dog style");
		}
		else {
			this.lactate();
		}
	}

}