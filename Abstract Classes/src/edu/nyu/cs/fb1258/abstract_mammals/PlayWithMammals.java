package edu.nyu.cs.fb1258.abstract_mammals;

public class PlayWithMammals {

	public static void main(String[] args) {
		// a dog!
		Dog spot = new Dog("Spot");
		
		// a human!
		Human hume = new Human("Foo", "Barstein");
		
		// polymorphism allows us to perform bulk operations on objects of related but different classes
		Mammal[] mammies = {spot, hume};
		for (Mammal mam : mammies) {
			System.out.println(""); // line break
			
			mam.lactate();
			mam.eat(); // remember to eat after lactation!
			mam.sleep(); // tired!
			
			// have any human objects also speak in their sleep
			if (mam instanceof Human) {
				((Human) mam).speak();
			}
			
		}
		
		
		
	}
}
