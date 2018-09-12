package edu.nyu.cs.fb1258;

/**
 * An abstract virtual representation of a Mammal.  We will never want to instantiate a Mammal object, yet child classes of Mammal will share many implemented methods in comon.  So this makes sense as an abstract class.
 * @author Foo Barstein
 * @version 2.9
 *
 */
public abstract class Mammal {
	/**
	 * constant class attribute representing male gender.
	 * This makes it easy to refer to male or female gender by intuitive names, rather than integers
	 */
	final static int MALE = 0;
	
	/**
	 * constant class attribute representing female gender.
	 * This makes it easy to refer to male or female gender by intuitive names, rather than integers
	 */
	final static int FEMALE = 1;
	
	/**
	 * whether or not  a given mammal has mammary glands
	 */
	boolean hasMammaryGlands = true;
	
	/**
	 * whether or not a given mammal is warm blooded
	 */
	boolean isWarmBlooded = true;
	
	/**
	 * whether or not a given mammal has hair
	 */
	boolean hasHair = true;
	
	/**
	 * the gender of a given mammal: 0 represents male, 1 represents female
	 */
	private int gender;
	
	/**
	 * a method representing the action of eating
	 */
	public abstract void eat();
	
	/**
	 * a method representing the action of sleeping
	 */
	public abstract void sleep();
	
	/**
	 * a method representing the action of lactating
	 */
	public abstract void lactate();
	
	/**
	 * An overloaded lactate() method, which takes a boolean argument
	 * @param aLot whether to lactate a lot or not
	 */
	public abstract void lactate(boolean aLot);

	/**
	 * no-args constructor randomly assigns the Mammal object's gender
	 */
	public Mammal() {
		//not sure what to do here
		//this.gender = Mammal.NEUTRAL;
		double rand = Math.random() * 2;
		int g = (int) rand;
		this.gender = g;		
	}
	
	/**
	 * overloaded constructor to explicitly assign the Mammal object's gender
	 * @param g integer representing this Mammal's gender: 0 represents male, 1 represents female
	 */
	public Mammal(int g) {
		this.gender = g;
	}	
	
	
	//accessor methods
	
	/**
	 * method to return the private gender property as an integer
	 * @return int representing the current object's gender: 0 represents male, 1 represents female
	 */
	public int getGender() {
		return this.gender;
	}
	
	/**
	 * overloaded accessor method to return the private gender property as a user-friendly string
	 * @return User-friendly String representing the current object's gender: 'male' or 'female'
	 */
	public String getGender(boolean userFriendly) {
		if (userFriendly) {
			switch (this.gender) {
			case Mammal.MALE:
				return "male";
			case Mammal.FEMALE:
				return "female";
			}
		}
		
		return "unknown";
	}

	
	public static void main(String[] args) {
		//make a dog object and call its eat method
		Dog spot = new Dog("Spot");
		spot.eat();
		
		//polymorphism!
		Mammal fido = new Dog("Fido");
		fido.eat();
		
		
	}
	
}