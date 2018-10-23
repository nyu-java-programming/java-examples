package edu.nyu.cs.fb1258.oop;

/**
 * A template from which to make cats
 * @author Foo Barstein
 * @version 1
 *
 */
public class Cat {
	
	// properties that each cat has
	
	/**
	 * The name of the cat
	 */
	private String name; // each cat has a different name
	
	/**
	 * The age of the cat
	 */
	private int age = 0; // each cat has a different age, but let's assume 0 years is the default
	
	/**
	 * The type of fur coat on the cat, if any
	 */
	private String coat;  // each cat has a different fur coat type
	
	/**
	 * The sex of the cat
	 */
	private String sex = "female";  // each cat will be assigned one of two biological sexes

	/**
	 * Whether this cat meows
	 */
	private boolean isMeowable = true; // let's assume most cats say can meow

	// properties that all cats share... 
	
	/**
	 * The range of possible fur coat types.  Any given cat is assigned one of these.
	 * These are static, since they belong to the Cat class as a type, not to any one individual Cat
	 * These are final since we are unlikely to change them.  However, in Java, arrays that are constants can, in fact, be modified... it's just bad practice to do so.
	 */
	private static final String[] COATS = {
		"bland",
		"calico",
		"solid",
		"tabby",
		"bicolor",
		"tortoiseshell",
		"colorpoint"
	};
	
	/**
	 * The minimum age a Cat is allowed to be
	 */
	private static final int MIN_AGE = 0;

	/**
	 * The maximum age a Cat is allowed to be
	 */
	private static final int MAX_AGE = 30;
	

	// actions that all cats can do come in the form of methods
	
	public void meow() {
		// you can code differences in the behavior of your objects, even though they all share the same code
		// for example, let's assume any cat called Mittens refuses to meow on demand
		if (!this.getIsMeowable()) {
			// output a non-meow message for any cat named Mittens
			this.utter("Sorry, I don't meow");
		}
		else {
			// other cats will meow happily with their full information
			this.utter("Meow");
		}
	}
	
	public void eat() {
		// output an eating message
		this.utter("[Insert wet squooshy sound here]");
	}
	
	public void sleep() {
		// output a sleeping message
		this.utter("Purrrrr");
	}
	
	public void utter(String utterance) {
		// output a message from this cat in a standardized format
		// for every utterance, we output the name of the cat, it's memory address (using the hashCode() method that all objects have), its coat, and age.
		System.out.printf("%s (Cat @%s), a %s, %d year-old cat, says '%s'!\n", this.getName(), Integer.toHexString(this.hashCode()), this.getCoat(), this.getAge(), utterance);		
	}
	
	// constructor - a special method with no return type and always has the name of the class
	
	/**
	 * No args constructor, which sets the name and coat to two placeholder values.
	 */
	public Cat() {
		// set any defaults of an anonymous Cat here
		this.setName("Anonymous Cat"); // set this to a default value
		this.setCoat("bland"); // set this to a default value
		// age, sex, and isMeowable are already set to default values
	}
	
	/**
	 * "No args" constructor that accepts no arguments
	 */
	public Cat(String name) {
		// set some default values for important properties
		this.setName(name);
		this.setCoat("bland"); // set this to a default value
		// age, sex, and isMeowable are already set to default values
	}
	
	/*
	 * Constructor that accepts the Cat's name and age as arguments, and applies a default coat property.
	 */
	public Cat(String name, int age) {
		this.setName(name);
		this.setAge(age);
		this.setCoat("bland"); // set this to a default value
		// sex and isMeowable are already set to default values
	}
	
	/*
	 * Constructor that accepts the Cat's name, age, and coat as arguments
	 */
	public Cat(String name, int age, String coat) {
		this.setName(name);
		this.setAge(age);
		this.setCoat(coat);
		// sex and isMeowable are already set to default values
	}
	
	/*
	 * Constructor that accepts the Cat's name, age, coat, and sex as arguments
	 */
	public Cat(String name, int age, String coat, String sex) {
		this.setName(name);
		this.setAge(age);
		this.setCoat(coat);
		this.setSex(sex);
		// isMeowable is already set to a default value
	}
	
	// setter methods
	
	/**
	 * Setter method for the name property.  Does some validation to avoid naming any cat "Squeaky".
	 * @param name The name to give to this Cat
	 */
	public void setName(String name) {
		// disallow any cat from being named 'Squeaky'
		if (!name.equals("Squeaky")) {
			// allow any other name to be set
			this.name = name;
		}
		else {
			this.name = "Unlucky Cat";
		}
	}
	
	/**
	 * Setter method for the age property.  Does some validation to only allow ages between 0 and 30, inclusive.
	 * @param age The age to give to this Cat
	 */
	public void setAge(int age) {
		// validate the age before setting it.. 
		// make sure this Cat is not under 0 or over 30
		if (age >= Cat.MIN_AGE && age <= Cat.MAX_AGE) {
			// allow cats to be between 0 and 30
			this.age = age;
		}
	}
	
	/**
	 * Setter method for the coat property.  Does some validation and only accepts coats that are represented in the array of officially allowed coats.
	 * @param coat The coat to give to this Cat
	 */
	public void setCoat(String coat) {
		// check whether the coat we're trying to set is in the list of acceptable coats
		
		// iterate through all acceptable coats
		for (String goodCoat : Cat.COATS) {
			// if we find this coat in the array, then it's a valid coat
			if (goodCoat.equals(coat)) {
				// it's ok! so set it 
				this.coat = coat;
			}
		}
	}
	
	/**
	 * Setter method for the sex property.  Does some validation and only accepts "male" and "female".
	 * @param sex The sex to give to this Cat
	 */
	public void setSex(String sex) {
		// validate the sex of the cat
		if (sex.equals("male") || sex.equals("female")) {
			this.sex = sex;
		}
	}
	
	/**
	 * Setter method for the isMeowable property, a boolean property that indicates whether this Cat can say 'meow' or not.
	 * @param isMeowable Boolean indicating whether this cat can meow
	 */
	public void setIsMeowable(boolean isMeowable) {
		this.isMeowable = isMeowable;
	}
	
	// getter methods
	
	/**
	 * Classic getter method for the name property.
	 * @return The name of this Cat
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Classic getter method for the age property.
	 * @return The age of this Cat
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * Classic getter method for the coat property.
	 * @return The coat of this Cat
	 */
	public String getCoat() {
		return this.coat;
	}
	
	/**
	 * Classic getter method for the sex property.
	 * @return The sex of this Cat
	 */
	public String getSex() {
		return this.sex;
	}
	
	/**
	 * Classic getter method for the isMeowable property.
	 * @return The isMeowable value of this Cat, indicating whether this Cat can say 'meow'.
	 */
	public boolean getIsMeowable() {
		return this.isMeowable;
	}

}
