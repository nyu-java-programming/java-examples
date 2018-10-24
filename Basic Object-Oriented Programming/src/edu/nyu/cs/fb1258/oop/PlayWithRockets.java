package edu.nyu.cs.fb1258.oop;

public class PlayWithRockets {

	public static void main(String[] args) {
		
		
		//make a rocket object
		System.out.println("Making rocket #1");
		Rocket rock1 = new Rocket(); //use the no-args constructor
		rock1.setAgency("NASA"); //use the setter to assign an agency
		rock1.setThrust(10); //a nice abstract way of setting thrust
		//rock1.thrust = -10; //no longer abstract
		rock1.blastOff();
		//check how much fuel there is
		System.out.println("The " + rock1.getAgency() + " rocket is at thrust " + rock1.getThrust() + " and has " + rock1.getFuel() + " cubic meters of fuel left");

		//make another rocket object
		System.out.println("\nMaking rocket #2");
		Rocket rock2 = new Rocket(200, "Roscosmos", 9);
		rock2.setFuel(300);
		rock2.blastOff();
		//check how much fuel there is
		System.out.println("The " + rock2.getAgency() + " rocket is at thrust " + rock2.getThrust() + " and has " + rock2.getFuel() + " cubic meters of fuel left");

	}

}
