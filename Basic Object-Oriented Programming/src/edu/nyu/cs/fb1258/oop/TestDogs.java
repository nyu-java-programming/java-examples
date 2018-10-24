package edu.nyu.cs.fb1258.oop;

/**
 * Class that instantiates a few objects from our Dog class and tests them out.
 * @author Foo Barstein
 * @version 2
 */
public class TestDogs {

	public static void main(String[] args) {
		//create a new Dog object using the no-args constructor
		Dog fluffy = new Dog();
		fluffy.setName("Fluffy");
		fluffy.giveGender(Dog.FEMALE);
		fluffy.fetch();
		
		//create a new Dog object using one of the overloaded constructors
		Dog spot = new Dog("Spot", 2);
		spot.removeTail();
		spot.fetch();
		System.out.println("This dog is called " + spot.getName());
		
		//create a new Dog object using another of the overloaded constructors
		Dog zeke = new Dog("Zeke", 14, Dog.MALE, true);
		zeke.setName("Sheila");

	}
	
}