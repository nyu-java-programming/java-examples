package edu.nyu.cs.fb1258.oop.rocket_example;

public class PlayWithRockets {

	public static void main(String[] args) {
		
		
		//make a rocket object
		System.out.println("Making rocket #1...");
		Rocket rock1 = new Rocket(); //use the no-args constructor
		rock1.setAgency("NASA"); //use the setter to assign an agency
		rock1.setFuel(10); // give it some fuel
		rock1.setThrust(10); //a nice abstract way of setting thrust
		//rock1.thrust = -10; //no longer abstract
		rock1.blastOff();
		//check how much fuel there is
		System.out.printf("The %s rocket is at thrust %d and has %d cubic meters of fuel left.\n", 
				rock1.getAgency(), 
				rock1.getThrust(), 
				rock1.getFuel() );

		//make another rocket object
		System.out.println("\nMaking rocket #2...");
		Rocket rock2 = new Rocket(200, "Roscosmos", 9); // Roscosmos is not a licensed space agency
		rock2.setFuel(300);
		rock2.blastOff();
		//check how much fuel there is
		System.out.printf("The %s rocket is at thrust %d and has %d cubic meters of fuel left.\n", 
				rock2.getAgency(), 
				rock2.getThrust(), 
				rock2.getFuel() );

	}

}
