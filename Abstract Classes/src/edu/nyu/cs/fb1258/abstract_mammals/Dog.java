package edu.nyu.cs.fb1258.abstract_mammals;

/**
 * A virtual representation of a Dog, which is, of course, a type of Mammal
 * @author Foo Barstein
 * @version 2.9
 *
 */
public class Dog extends Mammal {
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
	 * no-args constructor simply calls the Mammal class's no-args constructor
	 */
	public Dog() {
		super(); //the Mammal class's constructor assigns a random sex to this Dog
	}
	
	/**
	 * overloaded constructor assigns a random sex and sets the Dog object's name
	 * @param n String name of the new Dog object
	 */
	public Dog(String name) {
		super(); //the Mammal class's constructor assigns a random sex to this Dog

		//set this dog's name using the setter designed for this purpose
		this.setName(name);
	}
	
	public boolean equals(Dog dog) {
        return (this.name.equals(dog.name));
    }

	/**
	 * override the default Mammal sleep method with a Dog-specific sleep style.
	 */
	public void sleep() {
		super.sleep();
		System.out.println(this.name + " is sleeping dog style ...woof whimper whoof.");
	}
	
	@Override
	public void eat() {
		System.out.println(this.name + " is eating dog style");
	}

	@Override
	public void lactate() {
		super.lactate();
		System.out.println(this.name + " is lactating dog style");
	}

	@Override
	public void lactate(boolean aLot) {
		if (aLot) {
			System.out.println(this.name + " is lactating a lot dog style");
		}
		else {
			this.lactate();
		}
	}
	
}