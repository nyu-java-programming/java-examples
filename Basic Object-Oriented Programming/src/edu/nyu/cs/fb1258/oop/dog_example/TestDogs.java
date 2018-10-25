package edu.nyu.cs.fb1258.oop.dog_example;

/**
 * Class that instantiates a few objects from our Dog class and tests them out.
 * @author Foo Barstein
 * @version 2
 */
public class TestDogs {

	public static void main(String[] args) {
		//create a new Dog object using the no-args constructor
		System.out.println("... creating Fluffy ...");
		Dog fluffy = new Dog();
		fluffy.setName("Fluffy");
		fluffy.giveSex(Dog.Sex.FEMALE);
		fluffy.fetch();
		
		System.out.println(""); // line break
		
		System.out.println("... creating Spot ...");
		//create a new Dog object using one of the overloaded constructors
		Dog spot = new Dog("Spot", 2);
		spot.removeTail();
		spot.fetch();
		System.out.printf("This dog is called %s.\n", spot.getName());
		
		System.out.println(""); // line break
		
		//create a new Dog object using another of the overloaded constructors
		System.out.println("... creating Zeke ...");
		Dog zeke = new Dog("Zeke", 14, Dog.Sex.MALE, true);
		zeke.setName("Sheila");

	}
	
}