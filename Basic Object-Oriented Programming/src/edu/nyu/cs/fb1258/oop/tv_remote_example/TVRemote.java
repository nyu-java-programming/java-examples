package edu.nyu.cs.fb1258.oop.tv_remote_example;

/**
 * Model of a television remote control
 * @author Foo Barstein
 * @version 00.0000001
 *
 */
public class TVRemote {

	// properties of a tv remote	
	
	/**
	 * Whether the tv is currently on or off
	 */
	private boolean tvOn = false;
	
	/**
	 * The current volume of the tv
	 */
	private int volume = 0;
	
	/**
	 * The current channel of the tv
	 */
	private int channel = 1;
	
	/**
	 * The current source the tv is watching.
	 */
	private Source source = Source.STREAMING_BOX; // default to streaming box
	
	/**
	 * A list of all possible sources for the tv audio/video feed.
	 * Note that this is static, meaning it belongs to the entire class as a whole.
	 * An enum is a group of related constants.
	 */
	public static enum Source {
			STREAMING_BOX,
			NETFLIX,
			CABLE,
			DVD,
			GAMING_CONSOLE,
			HDMI
	}
	
	/**
	 * The minimum acceptable channel that any remote can be set to.
	 * Note that this is static, meaning it belongs to the entire class as a whole.
	 */
	static final int MIN_CHANNEL = 1;

	/**
	 * The maximum acceptable channel that any remote can be set to.
	 * Note that this is static, meaning it belongs to the entire class as a whole.
	 */
	static final int MAX_CHANNEL = 900;

	/**
	 * The minimum acceptable volume that any remote can be set to.
	 * Note that this is static, meaning it belongs to the entire class as a whole.
	 */
	static final int MIN_VOLUME = 0;

	/**
	 * The maximum acceptable volume that any remote can be set to.
	 * Note that this is static, meaning it belongs to the entire class as a whole.
	 */
	static final int MAX_VOLUME = 11;

	// actions a tv remote control can take
	
	/**
	 * Toggle the power on whichever tv remote control we're currently using
	 */
	public void togglePower() {
		this.tvOn = !this.tvOn;
	}
	
	/**
	 * Classic 'getter' method for the tvOn property.
	 * @return whether the tv is currently on or off.
	 */
	public boolean getTVOn() {
		return this.tvOn;
	}
	
	// a classic 'setter' method!

	/**
	 * Set the volume property to a new value, including some validation to make sure the new value makes sense.
	 * @param newVolume the new volume to set this TVRemote to
	 */
	private void setVolume(int newVolume) {
		if (this.tvOn && newVolume >= TVRemote.MIN_VOLUME && newVolume <= TVRemote.MAX_VOLUME) {
			// the tv is currently on!  change the volume
			this.volume = newVolume;
			System.out.println("The volume is now " + this.volume);
		}
		else {
			// the tv is currently off!
			System.out.println("Sorry, couldn't do that!");
		}
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	/**
	 * Increase the volume by 1
	 */
	public void increaseVolume() {
		this.setVolume(this.volume + 1);
	}
	
	/**
	 * Decrease the volume by 1
	 */
	public void decreaseVolume() {
		this.setVolume(this.volume - 1);
	}

	/**
	 * Set the channel property to a new value, including some validation to make sure the new value makes sense.
	 * @param newChannel the new channel to set this TVRemote to
	 */
	public void setChannel(int newChannel) {
		if (this.tvOn && newChannel >= TVRemote.MIN_CHANNEL && newChannel <= TVRemote.MAX_CHANNEL) {
			// the tv is currently on!  change the volume
			this.channel = newChannel;
			System.out.println("The channel is now " + this.channel);
		}
		else {
			// the tv is currently off!
			System.out.println("Sorry, couldn't do that!");
		}
	}
	
	/**
	 * Increase the channel by 1
	 */
	public void increaseChannel() {
		this.setChannel(this.channel + 1);
	}
	
	/**
	 * Decrease the channel by 1
	 */
	public void decreaseChannel() {
		this.setChannel(this.channel - 1);
	}	
	
	/**
	 * Classic 'setter' method for the source property.
	 * @param source  The source to set the tv to watch
	 */
	public void setSource(Source source) {
		// since the argument must be one of the Source enum values, we don't need additional validation
		this.source = source;
	}
	
	/**
	 * Classic 'getter' method for the source property returns the current source of the tv signal.
	 * @return The current source this tv remote is tuned to.
	 */
	public Source getSource() {
		return this.source;
	}
	
}
