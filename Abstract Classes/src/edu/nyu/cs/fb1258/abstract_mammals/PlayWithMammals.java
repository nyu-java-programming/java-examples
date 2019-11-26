package edu.nyu.cs.fb1258.abstract_mammals;

public class PlayWithMammals {

	public static void main(String[] args) {
		//make a dog object and call its eat method
		Dog spot = new Dog("Spot");
		spot.eat();
		
		//polymorphism!
		Mammal fido = new Dog("Fido");
		fido.lactate();
		
		Human hume1 = new Human("Foo", "Barstein");
		hume1.speak();
		hume1.eat();
		
		// polymorphism!
		Mammal hume2 = new Human("Bar", "Bazburger");
		if (hume2 instanceof Human) {
			((Human) hume2).speak();
		}
		hume2.eat();
		
	}
}
