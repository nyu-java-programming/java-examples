package edu.nyu.cs.fb1258.oop;

/**
 * A wrapper around the main method where we test a few virtual TV Remote controls.
 * @author Foo Barstein
 * @version 0.0001
 *
 */
public class TestTVRemotes {

	public static void main(String[] args) {
		
		// instantiate a remote control from the class
		TVRemote remote1 = new TVRemote();
		TVRemote remote2 = new TVRemote();
		
		// toggle the power button on both remote controls
		remote1.togglePower(); // on!
		remote2.togglePower(); // on!

		// turn the second remote control off again
		remote2.togglePower(); // off!
		
		// change the source that each TV is tuned to.  Source is a static enum containing an array of tv signal sources as constants
		remote1.setSource(TVRemote.Source.NETFLIX);
		remote2.setSource(TVRemote.Source.CABLE);
		
		// prove to ourselves that we have updated this source
		//System.out.println(TVRemote.sources[0]); // bad! - it technically works, but it breaks the layer of abstraction that separates a user of a class from the inner workings of that class
		System.out.println(remote1.getSource()); // better!
		System.out.println(remote2.getSource()); // better!
		
		//  print out the tvOn values for both remotes
		System.out.printf("The remote1 is on: %s\n", remote1.getTVOn());
		System.out.printf("The remote2 is on: %s\n", remote2.getTVOn());
		
		// hack the volume!
		// our code prevents bypassing of the validation on the volume... the following hacks will not work:
//		remote2.volume = -33; // bad value!
//		remote1.setVolume(2000); // bad volume!
//		remote2.setVolume(-33); // bad volume!
		
		// increase the volume using abstract methods to do so
		remote1.increaseVolume();
		remote2.decreaseVolume();
		
		// change the channels
		//remote1.channel = 55; // bad!  does not work since the channel property is private
		remote1.setChannel(55);
		remote2.setChannel(13);
		
		// change the source
		
		// print out the volume setting of each remote
		//System.out.println("The remote1 has volume: " + remote1.volume); // bad!  does not work, since the volume property is private
		System.out.println("The remote1 has volume: " + remote1.getVolume());
		System.out.println("The remote1 has volume: " + remote2.getVolume());
		
		// what is the current source?
		System.out.printf("%s is currently set to %s.\n", "remote1", remote1.getSource());
		System.out.printf("%s is currently set to %s.\n", "remote2", remote2.getSource());

	}

}
