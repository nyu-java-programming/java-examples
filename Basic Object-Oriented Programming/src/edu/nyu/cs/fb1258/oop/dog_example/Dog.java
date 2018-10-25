package edu.nyu.cs.fb1258.oop.dog_example;

/**
 * Definition of the Dog class.  Models a real dog in code.
 *
 * @author Foo Barstein
 * @version 1.0
 *
 */
public class Dog {

	//properties (a.k.a. data fields) of any dog object
	public String furType;
	public boolean hasTail = true; //by default, our Dogs have tails
	private String name;
	public int age = 0; //by default, our Dogs are pups
	public Sex sex; // the sex of this Dog
	
	// define the available sexes for any given dog
	// these are defined as an enum of related constants
	// static properties belong to the class, not to any specific object
	public static enum Sex {
		MALE,
		FEMALE
	}
	
	/**
	 * Getter method for the name property
	 * @return the name of this dog
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Setter method for the name property.  All names except "Randy" are  allowed.
	 * @param name The name to give the dog
	 */
	public void setName(String name) {
		//allow all dog names except randy
		if (!name.equals("Randy")) {
			this.name = name;			
		}
	}
	
	/**
	 * Setter method for the hasTail property of any given Dog object.  Sets it  to true.
	 */
	public void makeTail() {
		this.hasTail = true;
	}
	
	/**
	 * Setter method for the hasTail property of any given Dog object.  Sets it  to false.
	 */
	public void removeTail() {
		this.hasTail = false;
	}	

	/**
	 * Setter method for the gender property of any given Dog object.  Allows  gender to be set to either 0 or 1, which are represented in this class as  two static constants called MALE and FEMALE.
	 * @param sex The biological sex to assign to this dog
	 */
	public void giveSex(Sex sex) {
		//validate to make sure the gender is one of our accepted genders
		if (sex == Sex.MALE || sex == Sex.FEMALE) {
			this.sex = sex;
		}
	}
	
	/**
	 * Method to simulate fetching for any given Dog object.
	 * @return randomly returns either true or false, indicating whether  fetching was successful
	 */
	public boolean fetch() {
		double rand = Math.random();
		if (rand > 0.5) {
			System.out.printf("%s fetched the stick.\n", this.name);
			return true;
		}
		else {
			System.out.printf("%s conscientiously objected to your command to fetch the stick\n", this.name);
			return false;
		}
	}
	
	/**
	 * No-args constructor.  All Dog properties remain with their default  values, if any.
	 * 
	 */
	public Dog() {
		System.out.println("You created a new generic dog");
	}
	
	/**
	 * Constructor that sets the dog's name and age
	 * @param name The name to give it
	 * @param age The age to give it
	 */
	public Dog(String name, int age) {
		this.name = name;
		if (age >= 0) {
			this.age = age;			
		}
		System.out.printf("You created new dog with the name %s and age %d.\n", this.name, this.age);
	}
	
	/**
	 * Constructor that sets a dog's name, age, gender, and hasTail properties.
	 * @param name The name to give the Dog
	 * @param age The age to give the Dog
	 * @param sex The biological sex to assign to the Dog: either Dog.Sex.MALE or Dog.Sex.FEMALE
	 * @param hasTail Boolean value representing whether this dog has a tail or  not
	 */
	public Dog(String name, int age, Sex sex, boolean hasTail) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.hasTail = hasTail;
		System.out.printf("You created new dog with the name %s, age %d, sex %s, and has tail = %b.\n", this.name, this.age, this.sex, this.hasTail);
	}
	
}