package edu.nyu.cs.fb1258.inheritance_examples.mammals_dogs_and_humans;

/**
 * A virtual representation of a Mammal
 * @author Foo Barstein
 * @version 2.9
 *
 */
public class Mammal {
	/**
	 * constant class attribute representing male sex.
	 * This makes it easy to refer to male or female sex by intuitive names, rather than integers
	 */
	final static int MALE = 0;
	
	/**
	 * constant class attribute representing female sex.
	 * This makes it easy to refer to male or female sex by intuitive names, rather than integers
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
	 * the sex of a given mammal: 0 represents male, 1 represents female
	 */
	private int sex;
	
	/**
	 * a method representing the action of eating
	 */
	public void eat() {
		System.out.println("mammal eating... yum");
	}
	
	/**
	 * a method representing the action of sleeping
	 */
	public void sleep() {
		System.out.println("mammal sleeping zzzzzz.");
	}
	
	/**
	 * a method representing the action of lactating
	 */
	public void lactate() {
		System.out.println("mammal lactating...");
	}
	
	/**
	 * An overloaded lactate() method, which takes a boolean argument
	 * @param aLot whether to lactate a lot or not
	 */
	public void lactate(boolean aLot) {
		System.out.println("mammal lactating a lot...");
	}

	/**
	 * no-args constructor randomly assigns the Mammal object's sex
	 */
	public Mammal() {
		//not sure what to do here
		//this.sex = Mammal.NEUTRAL;
		double rand = Math.random() * 2;
		int g = (int) rand;
		this.sex = g;		
	}
	
	/**
	 * overloaded constructor to explicitly assign the Mammal object's sex
	 * @param g integer representing this Mammal's sex: 0 represents male, 1 represents female
	 */
	public Mammal(int g) {
		this.sex = g;
	}	
	
	
	//accessor methods
	
	/**
	 * method to return the private sex property as an integer
	 * @return int representing the current object's sex: 0 represents male, 1 represents female
	 */
	public int getSex() {
		return this.sex;
	}
	
	/**
	 * overloaded accessor method to return the private sex property as a user-friendly string
	 * @return User-friendly String representing the current object's sex: 'male' or 'female'
	 */
	public String getSex(boolean userFriendly) {
		if (userFriendly) {
			switch (this.sex) {
			case Mammal.MALE:
				return "male";
			case Mammal.FEMALE:
				return "female";
			}
		}
		
		return "unknown";
	}
	
}