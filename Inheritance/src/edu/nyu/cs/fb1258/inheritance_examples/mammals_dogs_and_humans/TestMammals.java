package edu.nyu.cs.fb1258.inheritance_examples.mammals_dogs_and_humans;

/**
 * A program that creates a few Mammal, Human, and Dog objects, and plays around with them in order to exhibit some properties of inheritance and polymorphism in Java.
 * @author Foo Barstein
 * @version 2.9
 *
 */
public class TestMammals {

	/**
	 * Play around with our custom classes.
	 * @param args array of command line arguments
	 */
	public static void main(String[] args) {

		//create a mammal object
		Mammal geoff = new Mammal(Mammal.MALE);
		System.out.printf("Geoff the mammal is %s.\n", geoff.getSex(true));

		//create a dog object
		Dog lassy = new Dog("Lassy");
		System.out.printf("Lassy the Dog is %s.\n", lassy.getSex(true));
		lassy.sleep();

		//create a dog object
		Human rodrigo = new Human("Rodrigo", "Barstein", Mammal.MALE);
		System.out.printf("Rodrigo the Human is %s.\n", rodrigo.getSex(true));
		rodrigo.sleep();
		rodrigo.eat();
		
		Mammal x = new Human();
		//x.speak();
		
		//it's possible to store our objects in an array of type Mammal since Dog and Human are descendants of the Mammal type and share the basic Mammal properties and methods
		Mammal[] myMammals = new Mammal[3];
		myMammals[0] = geoff;
		myMammals[1] = lassy;
		myMammals[2] = rodrigo;
		
		//loop through and call the sleep() method that all Mammal and Mammals and descendants of Mammals have
		for (int i=0; i<myMammals.length; i++) {
			//Mammals and all its sub-classes have a speak method, so this works:
			myMammals[i].sleep();
		}
		
		//polymorphism is easy!
		Mammal meAsAMammal = new Human("Amos", "Bloomberg");
		
		Human meAsAHuman = (Human) meAsAMammal; //cast to the more specific type
		
		//more polymorphism
		Mammal spotAsAMammal = new Dog("Spot");
		Dog spotAsADog = (Dog) spotAsAMammal; //more casting
		spotAsADog.lactate(); //call the lactate method
		spotAsADog.lactate(true); //call an overlloaded version of the method that accepts a boolean argument
		
		//Human spotAsAHuman = (Human) spotAsADog; //can't cast to "sister" types... Dog and Human both inherit from Mammal, but Humans do not necessarily have all the methods that Dogs have
		
		//meAsAMammal.speak(); //this is not allowed!!!  Mammals do not have a speak method.
		meAsAHuman.speak(); //call a specifically Human method
		
		// make a few dogs
		Dog dog1 = new Dog("Spot");
		Dog dog2 = new Dog("Fido");
		
		// is a Dog a Mammal?
		if (dog1 instanceof Mammal) {
			System.out.println("This dog is a Mammal!");
		}
		
		// is a Dog a Dog?
		if (dog1 instanceof Dog) {
			System.out.println("This dog is a Dog!");
		}
		
		// are two dogs the same?
		if (dog1.equals(dog2)) {
			System.out.println("They're the same dog!");
		}
		
		
	}

}