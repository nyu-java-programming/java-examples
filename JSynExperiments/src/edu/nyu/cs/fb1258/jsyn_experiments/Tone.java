package edu.nyu.cs.fb1258.jsyn_experiments;

/**
 * A class representing a musical tone in the 8-note Western standard pitch notation.
 * @author Foo Barstein
 * @version 1
 */
public class Tone {
	
	/**
	 * The scientific name of the tone
	 */
	private String note;
	
	/**
	 * The frequency of the tone, in Hertz
	 */
	private double frequency;
	
	/**
	 * Constructor that sets a tone's note and frequency
	 */
	public Tone(String note, double frequency) {
		this.setNote(note);
		this.setFrequency(frequency);
	}

	/**
	 * 'Getter' method for the 'note' property.
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * 'Setter' method for the 'note' property.
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * 'Getter' method for the 'frequency' property.
	 * @return the frequency
	 */
	public double getFrequency() {
		return frequency;
	}

	/**
	 * 'Setter' method for the 'frequency' property.
	 * @param frequency the frequency to set
	 */
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	
}