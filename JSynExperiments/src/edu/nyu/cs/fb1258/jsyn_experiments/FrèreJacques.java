package edu.nyu.cs.fb1258.jsyn_experiments;

import java.time.Duration;

//import jsyn libraries
import com.jsyn.*; // JSyn and Synthesizer classes
import com.jsyn.swing.*; //graphical user interface tools
import com.jsyn.unitgen.*; //unit generator

/**
 * A song resembling Frère Jacques, the classic French nursery rhyme.  The song is usually sung in a round.
 * To run this, you must have imported and added the jsyn-20161201.jar file to your build path.
 * See https://en.wikipedia.org/wiki/Fr%C3%A8re_Jacques
 * @author Foo Barstein
 * @version 2
 *
 */
public class FrèreJacques {
	public static void main(String[] args) {
		
		//create a new synth and line out
		Synthesizer synth = JSyn.createSynthesizer();
		LineOut myOut = new LineOut();
		
		// create an octave of standard western tones, based on the piano: https://en.wikipedia.org/wiki/Piano_key_frequencies
		Tone A = new Tone("A", 440);
		Tone Asharp = new Tone("A♯", 466.1638);
		Tone Bflat = new Tone("B♭", 466.1638); // Bflat is the same frequency as Asharp
		Tone B = new Tone("B", 493.8833);
		Tone C = new Tone("C", 523.2511);
		Tone Csharp = new Tone("C♯", 554.3653);
		Tone Dflat = new Tone("D♭", 554.3653); // Dflat is the same frequency as Csharp
		Tone D = new Tone("D", 587.3295);
		Tone Dsharp = new Tone("D♯", 622.2540);
		Tone Eflat = new Tone("E♭", 622.2540); // Eflat is the same frequency as Dsharp
		Tone E = new Tone("E", 659.2551);
		Tone F = new Tone("F", 698.4565);
		Tone Fsharp = new Tone("F♯", 739.9888);
		Tone Gflat = new Tone("G♭", 739.9888); // Gflat is the same frequency as Fsharp
		Tone G = new Tone("G", 783.9909);
		Tone A2 = new Tone("A", 880);

		// create an Amoscillator
		SoundMaker a = new SoundMaker(synth, myOut);
		
		//start the synth and line out
		synth.start();
		myOut.start();

		// set the tempo (number of whole notes per second)
		a.setTempo(5);
	
		// create the loop
		while (true) {
			// play the notes for the correct durations to create the melody
			a.playTone(C, 1);
			a.playTone(D, 1);
			a.playTone(E, 1);
			a.playTone(C, 1);
			a.playTone(C, 1);
			a.playTone(D, 1);
			a.playTone(E, 1);
			a.playTone(C, 1);
			a.playTone(E, 1);
			a.playTone(F, 1);
			a.playTone(G, 2);
			a.playTone(E, 1);
			a.playTone(F, 1);
			a.playTone(G, 2);
			a.playTone(G, 0.5);
			a.playTone(A2, 0.5);
			a.playTone(G, 0.5);
			a.playTone(F, 0.5);
			a.playTone(E, 1);
			a.playTone(C, 1);
			a.playTone(G, 0.5);
			a.playTone(A2, 0.5);
			a.playTone(G, 0.5);
			a.playTone(F, 0.5);
			a.playTone(E, 1);
			a.playTone(C, 1);
			a.playTone(C, 1);
			a.playTone(G, 1);
			a.playTone(C, 2);
			a.playTone(C, 1);
			a.playTone(G, 1);
			a.playTone(C, 2);
		}
	}

}
