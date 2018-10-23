package edu.nyu.cs.fb1258.oop;

public class TestCats {

	public static void main(String[] args) {
		// play around with a few cats

		// create a new Cat object using the no-args constructor
		Cat whiskers = new Cat();
		//whiskers.name = "Whiskers"; // won't work because the name property is private
		whiskers.setName("Squeaky"); // this won't be set as the name, since the setName method does not accept the name "Squeaky" for any cat
		String whiskersName = whiskers.getName(); // this will return 'Unlucky Cat', since this cat has had its intended name rejected
		System.out.println("Whiskers' name is actually " + whiskersName);
		whiskers.setAge(20); // this age will be accepted, since it's between 0 and 30
		whiskers.setCoat("tabby"); // this coat is one of the acceptable coats for our cats
		whiskers.setIsMeowable(false); // make it so whiskers refuses to say 'meow'
		whiskers.meow(); // whiskers is not meowable
		
		// instantiate another cat and try to give it the name 'Squeaky' again by using its constructor
		Cat amber = new Cat("Squeaky"); // this won't be set as the name, since the setName method does not accept the name "Squeaky" for any cat
		amber.meow(); // this cat is meowable
		
		Cat mittens = new Cat("Mittens", 50); // use the constructor to set the name and age
		mittens.meow(); // this cat is meowable

		// two identically-valued cat objects
		
		Cat simba1 = new Cat("Simba", 15, "colorpoint"); // use the constructor to set the name, age, and coat type
		simba1.meow(); // this cat is meowable

		Cat simba2 = new Cat("Simba", 15, "colorpoint"); // use the constructor to set the name, age, and coat type
		simba2.meow(); // this cat is meowable
		
		// compare the references of these two cats... 
		if (simba1 == simba2) {
			// this will never be output, since simba1 == simba2 is never true... they are different cat objects
			System.out.printf("Simba1 and Simba2 are stored in the same place in memory, @%s!\n", Integer.toHexString(simba1.hashCode()));
		}
		else {
			// this will be output, since simba1 and simba1 refer to two different cat objects in memory
			System.out.printf("Simba1 and Simba2 are stored in different places in memory, @%s and @%s, respectively!\n", Integer.toHexString(simba1.hashCode()), Integer.toHexString(simba2.hashCode()));
		}
	}

}
