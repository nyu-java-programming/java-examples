package edu.nyu.cs.fb1258.jsyn_experiments;

import com.jsyn.*; // JSyn and Synthesizer classes
import com.jsyn.unitgen.*;

/**
 * Some code to instantiate a synthesizer, connect the line out, and play some tones.
 * To run this, you must have imported and added the jsyn-20161201.jar file to your build path.
 * @author Foo Barstein
 * @version 2
 *
 */
public class FirstInFlight {

	public static void main(String[] args) throws InterruptedException {
		//create a new Synth
		Synthesizer synth = JSyn.createSynthesizer(); //make a synth
		LineOut myOut = new LineOut();

		//create a few Amoscillators
		SoundMaker a = new SoundMaker(synth, myOut);
		SoundMaker b = new SoundMaker(synth, myOut);

		//start the synth
		synth.start();
		myOut.start(); //start up the line out to the speakers
		
		//play some sounds in each oscillator
		a.doFrequencySweep(0.1);
		b.randomFrequencyRandomTime();

	}

}
