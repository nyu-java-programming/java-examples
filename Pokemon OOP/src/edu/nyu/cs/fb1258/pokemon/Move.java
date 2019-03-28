package edu.nyu.cs.fb1258.pokemon;

/**
 * A representation of a Move that a Pokemon character could make
 * @author Foo Barstein
 * @version 0.1
 *
 */
public class Move {
	
	// constructors
	
	/**
	 * Constructor that sets the important properties of a move
	 * @param name The name of the move
	 * @param accuracy The accuracy of the move
	 * @param healthImpact The amount of points that will be subtracted from the recipient of this move
	 */
	public Move(String name, int accuracy, int healthImpact) {
		this.setName(name);
		this.setAccuracy(accuracy);
		this.setHealthImpact(healthImpact);
	}
	// properties
	
	private String name;
	
	private int accuracy;
	
	private int healthImpact;
	
	// capabilities
	
	// getters
	
	/**
	 * Classic 'getter method' for the name property
	 * @return The name impact of this Move
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Classic 'getter method' for the healthImpact property
	 * @return The health impact of this Move
	 */
	public int getHealthImpact() {
		return this.healthImpact;
	}
	
	// setters
	/**
	 * Classic 'getter method' for the name property
	 * @return The name of this Move
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Classic 'getter method' for the accuracy property
	 * @return The accuracy of this Move
	 */
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	/**
	 * Classic 'getter method' for the healthImpact property
	 * @return The healthImpact of this Move on its recipient
	 */
	public void setHealthImpact(int healthImpact) {
		this.healthImpact = healthImpact;
	}
	
}






