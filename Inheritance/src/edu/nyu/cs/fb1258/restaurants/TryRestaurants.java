package edu.nyu.cs.fb1258.restaurants;

public class TryRestaurants {

	public static void main(String[] args) {
		Address eatalyAddress = new Address("200 5th Ave", "New York", "New York", "10010", "USA");
		Restaurant eataly = new Restaurant("Eataly", eatalyAddress, 100, "Italian");
		System.out.println("\nThe address of " + eataly.getName() + " is:");
		System.out.println(eatalyAddress);
		
		System.out.println("\nThe string representation of " + eataly.getName() + " is:");
		System.out.println(eataly);
		
		// make a fast food place
		Address inOutAddress = new Address("7940 N Central Expy", "Dallas", "Texas", "75206", "USA");
		FastFoodPlace inOut = new FastFoodPlace("In-N-Out", inOutAddress, 50, "Burgers", true);
		
		System.out.println("\nThe address of " + inOut.getName() + " is:");
		System.out.println(eatalyAddress);
		
		System.out.println("\nThe string representation of " + inOut.getName() + " is:");
		System.out.println(inOut);
	}

}
