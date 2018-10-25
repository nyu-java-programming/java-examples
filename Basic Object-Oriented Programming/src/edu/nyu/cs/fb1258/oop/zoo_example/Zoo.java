package edu.nyu.cs.fb1258.oop.zoo_example;

/**
* A simple representation of a zoo
* @author Foo Barstein
* @version 1
*/

public class Zoo {

	//properties of a zoo
	
	/**
	 * The number of people employed by the zoo.
	 */
	private int numberOfEmployees;
	
	/**
	 * The hours of operation in 24 hours notation
	 */
	private int[][] hours;

	/**
	 * Price of admission, in dollars
	 */
	private double priceOfAdmission;
	
	/**
	 * An array of all the animals that exist in the zoo
	 */
	private String[] animals;
	
	/**
	 * The name of the zoo
	 */
	private String name;
	
	/**
	 * How much money the zoo has in its budget each year
	 */
	private int operatingBudget;

	/**
	 * The fraction of the budget that is reserved for employees pension plans
	 */
	private double fractionOfBudgetGoingToPensions;
	
	/**
	 * The dollar amount going into pensions
	 */
	private double dollarsForPensions;

	/**
	 * The address of the zoo
	 */
	private Address address;
	
	/**
	 * Current status of the zoo, open or closed
	 */
	private boolean isOpen = false;
	
	//getter and setter methods:
	
	/**
	 * Classic 'getter' method for the hours property
	 * @return The hours of operation of the zoo
	 */
	public int[][] getHours() {
		return hours;
	}

	/**
	 * Classic 'setter' method for the hours property
	 * @param hours the hours of operation of the zoo, as a two-dimensional int array
	 */
	public void setHours(int[][] hours) {
		this.hours = hours;
	}

	/**
	 * Classic 'getter' method for the priceOfAdmission property
	 * @return The price of admission to the zoo
	 */
	public double getPriceOfAdmission() {
		return priceOfAdmission;
	}

	/**
	 * Classic 'setter' method for the priceOfAdmission property
	 * @param priceOfAdmission the price of admission to the zoo
	 */
	public void setPriceOfAdmission(double priceOfAdmission) {
		this.priceOfAdmission = priceOfAdmission;
	}

	/**
	 * Classic 'getter' method for the animals property
	 * @return The array of animals in the zoo
	 */
	public String[] getAnimals() {
		return animals;
	}

	public void setAnimals(String[] animals) {
		this.animals = animals;
	}

	/**
	 * Classic 'getter' method for the operatingBudget property
	 * @return The operating budget of the zoo
	 */
	public int getOperatingBudget() {
		return operatingBudget;
	}

	public void addToPensions(double amount) {
		System.out.println("We are going to add " + amount + " to each employee's pension");
	}
	
	public double getFractionOfBudgetGoingToPensions() {
		return this.fractionOfBudgetGoingToPensions;
	}

	public void setFractionOfBudgetGoingToPensions(double fractionOfBudgetGoingToPensions) {
		this.fractionOfBudgetGoingToPensions = fractionOfBudgetGoingToPensions;
	}

	public double getDollarsForPensions() {
		return this.dollarsForPensions;
	}

	public void setDollarsForPensions(double dollarsForPensions) {
		this.dollarsForPensions = dollarsForPensions;
	}

	public int getNumberOfEmployees() {
		return this.numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public void setOperatingBudget(int operatingBudget) {
		//validate the property before setting it
		if (operatingBudget > 0 ) {
			//set it!
			this.operatingBudget = operatingBudget;
			
			//figure out how much of the budget is going towards pensions
			double totalBudgetForPensions = (this.operatingBudget * this.fractionOfBudgetGoingToPensions);
			this.setDollarsForPensions(totalBudgetForPensions);

			//figure out how much to deposit in each employees pension plan
			double pensionDepostForEachEmployee = totalBudgetForPensions / this.numberOfEmployees;
			this.addToPensions(pensionDepostForEachEmployee);
		}
		else {
			System.out.println("Sorry, that budget doesn't work for us.");
		}
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	//things a zoo can do (or... things you can do to a zoo)
	public void addAnimal(String animal) {
		String[] newAnimals = new String[this.animals.length + 1];
		
		//brute-force copy of the values from the old array to the new array
		for (int i = 0; i< this.animals.length; i++) {
			//copy each animal from the old array to the new array
			newAnimals[i] = this.animals[i];
		}
		
		//add the new animal to the end of the new array at the last spot
		newAnimals[newAnimals.length - 1] = animal;
		
		//store this new array as the old array
		this.animals = newAnimals;
	}
	
	//setter method for the name property
	public void setName(String name) {
		this.name = name;
	}
	
	//setter method for the isOpen property
	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	//getter method for the isOpen property
	public boolean getIsOpen() {
		return this.isOpen;
	}
	
	
	
}
