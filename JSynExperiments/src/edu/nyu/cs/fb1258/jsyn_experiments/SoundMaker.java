package edu.nyu.cs.fb1258.jsyn_experiments;

//import jsyn libraries
import com.jsyn.*; // JSyn and Synthesizer classes
import com.jsyn.swing.*; //graphical user interface tools
import com.jsyn.unitgen.*; //unit generator

/**
 * Everything necessary to play tones using JSyn.
 * To run this, you must have imported and added the jsyn-20161201.jar file to your build path.
 * @author Foo Barstein
 * @version 2
 *
 */
public class SoundMaker {

	//properties
	private Synthesizer synth;
	private LineOut myOut;
	private LinearRamp lag;
	private UnitOscillator osc;
	
	// musical defaults
	private int tempo = 1; // whole notes per second
	
	/**
	 * Constructor
	 * The synthesizer to which this Amoscillator will attach itself
	 * @param synth
	 */
	public SoundMaker(Synthesizer synth, LineOut myOut) {
		this.synth = synth;
		this.myOut = myOut;
		this.setupDefaults();
	}

	/**
	 * Play a musical note for a particular duration
	 * @param tone The tone to play.
	 * @param duration How long to play it (1=whole note, 0.5=half note, etc)
	 */
	public void playTone(Tone tone, double duration) {
		int freq = (int) tone.getFrequency();
		this.setFrequency(freq);
		this.sleep(duration / tempo); // convert duration (in whole notes, half notes, etc) to seconds, based on tempo
		this.setFrequency(0);
	}
	
	/**
	 * Set up a sawtooth oscillator with a linear ramp lag
	 */
	public void setupDefaults() {
		
		//create some unit generators
		this.osc = new SawtoothOscillatorBL();
		this.lag = new LinearRamp();

		//set the minimum, current, and maximum values for the port
		this.lag.output.connect( osc.amplitude );
		this.lag.input.setup( 0.0, 0.5, 1.0 );
		this.lag.time.set( 0.2 );

		this.osc.frequency.setup(20.0, 300.0, 10000.0);

		//add these to this synth
		this.synth.add( this.osc ); //tone generator
		this.synth.add( this.lag ); //add a lag to smooth out amplitude changes and avoid pops
		this.synth.add( this.myOut ); // connect the oscillator to the output

		//connect the output of our oscillator to the input of our line out (i.e. the speakers)
		this.osc.output.connect(0, this.myOut.input, 0);		
	}

	/**
	 * Change the frequency of the oscillator
	 * @param newFreq the new frequency
	 */
	public void setFrequency(int freq) {
		this.osc.frequency.set(freq);
		//System.out.println(freq); //debugging
	}

	/**
	 * Set the tempo, in number of whole notes per second
	 * @param tempo the tempo to set
	 */
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	/**
	 * Getter for the tempo property
	 * @return the tempo to play the notes at, in whole notes per second
	 */
	public int getTempo() {
		return tempo;
	}
	
	/**
	 * Do nothing for a certain number of seconds
	 * @param seconds how long to do nothing
	 * @throws InterruptedException
	 */
	public void sleep(double seconds) {
		//get current time
		double time = this.synth.getCurrentTime();
		
		//calculate time to wake up
		time  += seconds; 
		try {
			this.synth.sleepUntil(time);
		}
		catch(InterruptedException e) {
			System.out.println("Sorry... couldn't fall asleep");
		}

	}
	
	/**
	 * Method to play frequencies in normal human range of hearing, from 20Hz to 20kHz.
	 * @param latency how long to hold each frequency tone, in seconds
	 * @throws InterruptedException
	 */
	public void doFrequencySweep(double latency) {
		
		//loop through each frequency
		for (int i=20; i<20000; i++) {

			//change the oscillator frequency
			this.setFrequency(i);

			//sleep for a 10th of a second
			this.sleep(latency);
		}
		
	}

	public void randomFrequencyRandomTime() {
		int freq = (int) (Math.random() * 20000);
		
		//change the oscillator frequency
		this.setFrequency(freq);

		//sleep for a random amount of time
		double latency = Math.random() * 2;
		this.sleep(latency);
		
		//recursive call
		this.randomFrequencyRandomTime();
		
	}
	
}
