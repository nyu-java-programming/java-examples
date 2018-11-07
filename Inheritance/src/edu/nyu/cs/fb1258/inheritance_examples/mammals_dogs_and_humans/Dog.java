package edu.nyu.cs.fb1258.inheritance_examples.mammals_dogs_and_humans;

/**
 * A virtual representation of a Dog, which is, of course, a type of Mammal
 * @author Foo Barstein
 * @version 2.9
 *
 */
public class Dog extends Mammal {

	// constructors
	
	/**
	 * no-args constructor simply calls the Mammal class's no-args constructor
	 */
	public Dog() {
		super(); //the Mammal class's constructor assigns a random sex to this Dog
	}
	
	/**
	 * overloaded constructor assigns a random sex and sets the Dog object's name
	 * @param n String name of the new Dog object
	 */
	public Dog(String n) {
		super(); //the Mammal class's constructor assigns a random sex to this Dog

		//set this dog's name using the setter designed for this purpose
		this.setName(n);
	}
	
	
	/**
	 * the name of this Dog object
	 */
	private String name;

	/**
	 * Setter for the name property
	 * @param n the new name of this Dog 
	 */
	public void setName(String n) {
		if (n.length() > 0) {
			this.name = n;			
		}
	}
	

	/**
	 * override the default Mammal sleep method with a Dog-specific sleep style.
	 */
	public void sleep() {
		super.sleep(); //calling the Mammal's version of the sleep method first
		
		//then doing some additional Dog type sleeping...
		System.out.printf("%s is sleeping ...woof whimper whoof.\n", this.name);
	}
	
	/**
	 * How we compare this dog to other dogs... they are equal if they have the same name
	 * @param dog The dog to compare this Dog to
	 * @return True if the same name, false otherwise
	 */
	public boolean equals(Dog dog) {
        return (this.name.equals(dog.name));
    }
	
}