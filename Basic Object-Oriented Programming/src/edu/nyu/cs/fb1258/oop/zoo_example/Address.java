package edu.nyu.cs.fb1258.oop.zoo_example;

/**
 * A simple representation of a street address
 * @author Amos Bloomberg
 * @version 1
 */
public class Address {
	
	//properties of each address... all are private to maintain abstraction
	private String city;
	private String street1;
	private String street2;
	private String state;
	private int zip;
	
	//getters and setters for each private property...
	//note that the setState method towards the bottom is the only one we've bothered to do validation in... ideally we would do validation in most setters
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getStreet1() {
		return street1;
	}
	
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	
	public String getStreet2() {
		return street2;
	}
	
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		//make sure the state argument is a good state before setting it as the object's property
		boolean isGoodState = false;
		String[] states = {"Alabama ","Alaska ","Arizona ","Arkansas ","California ","Colorado ","Connecticut ","Delaware ","Florida ","Georgia ","Hawaii ","Idaho ","Illinois Indiana ","Iowa ","Kansas ","Kentucky ","Louisiana ","Maine ","Maryland ","Massachusetts ","Michigan ","Minnesota ","Mississippi ","Missouri ","Montana Nebraska ","Nevada ","New Hampshire ","New Jersey ","New Mexico ","New York ","North Carolina ","North Dakota ","Ohio ","Oklahoma ","Oregon ","Pennsylvania Rhode Island ","South Carolina ","South Dakota ","Tennessee ","Texas ","Utah ","Vermont ","Virginia ","Washington ","West Virginia ","Wisconsin ","Wyoming"};

		//linear search through the list of states to look for this state
		for (String s : states) {
			s = s.trim(); //remove whitespace from the state name before comparing
			if (state.equals(s)) {
				//we found the state we're looking for
				this.state = state; //assign it to the instance variable
				isGoodState = true;
			}
		}
		if (!isGoodState) {
			//we didn't find the state we were looking for
			System.out.println("Sorry, " + state + " is not a valid state");
		}
	}

	public int getZip() {
		return zip;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
	
}
