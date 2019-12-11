package edu.nyu.cs.fb1258.exception_examples.coffee;

/**
 * A coffee drink, meant to serve as an example for using exceptions
 * @author Foo Barstein
 * @version 1
 *
 */
public class Coffee {

	// constants that are shared by all coffees
	public static final int MAX_TEMPERATURE_FOR_COMFORT = 200; // 200 degrees Farenheit is the max gulpable temperature
	public static final int TEMPERATURE_LOSS_PER_SIP = 10; // how many degrees Farenheit the coffee loses with each sip
	public static final int SIP_SIZE = 5; // what percentage of coffee is drunk with each sip
	public static final int GULP_SIZE = 20; // what percentage of coffee is drunk with each gulp
	
	// properties of coffee
	private String type;
	private int numSips = 0;
	private int temperature;
	private boolean caffeinated = true;
	private boolean hasMilk = false;
	private int percentFull = 100; // how much is left in the cup (percentage)
		
	/**
	 * Constructor of the Coffee object
	 * @param type The type of coffee drink, e.g. "latte"
	 * @param hasMilk Whether the coffee drink has milk in it
	 * @param caffeinated Whether the coffee bean is cafeeinated
	 * @param temperature The temperature, in degrees Farenheit
	 */
	public Coffee(String type, boolean hasMilk, boolean caffeinated, int temperature) {
		// set the properties of this coffee
		this.setType(type);
		this.setHasMilk(hasMilk);
		this.setCaffeinated(caffeinated);
		this.setTemperature(temperature);
	}
	
	/**
	 * Take a sip of the coffee
	 * @throws OutOfCoffeeException An exception object indicating that the sip could not be completed due to a lack of coffee
	 */
	public void sip() throws OutOfCoffeeException {
		// keep track of how many sips we take
		this.setNumSips(this.getNumSips() + 1); 

		// output some debugging info
		System.out.printf("Sipping the %d%% full %d°F %s for the %dth time...\n", this.getPercentFull(), this.getTemperature(), this.getType(), this.getNumSips());

		// make sure we have coffee
		if (this.getPercentFull() > 0) {
			// there's some coffee to sip!
			
			// update the quantity of coffee left
			this.setPercentFull(this.getPercentFull() - Coffee.SIP_SIZE);
			
			// make the coffee a bit cooler as a result of the contact with the mouth
			this.setTemperature(this.getTemperature() - Coffee.TEMPERATURE_LOSS_PER_SIP);
		}
		else {
			// there isn't enough coffee for a sip!  throw an exception!
			throw new OutOfCoffeeException(this.getType());
		}
	}
	
	/**
	 * 
	 * @throws BurnedMouthException
	 * @throws OutOfCoffeeException
	 */
	public void gulp() throws BurnedMouthException, OutOfCoffeeException {

		// output some debugging info
		System.out.printf("Gulping the %d%% full %d° Farenheit %s...\n", this.getPercentFull(), this.getTemperature(), this.getType());

		// check whether there's enough coffee for a gulp
		if (this.percentFull >= Coffee.GULP_SIZE) {
			// there's enough... take a gulp!
			
			// update the quantity of coffee left
			this.setPercentFull(this.getPercentFull() - Coffee.GULP_SIZE);

			// make the coffee a bit cooler as a result of the contact with the mouth
			this.setTemperature(this.getTemperature() - Coffee.TEMPERATURE_LOSS_PER_SIP);

			// check whether this is mouth burning temperature
			if (this.getTemperature() >= Coffee.MAX_TEMPERATURE_FOR_COMFORT) {
				BurnedMouthException e = new BurnedMouthException(this.type, this.temperature);
				throw e;
			}
			

		}
		else {
			OutOfCoffeeException e = new OutOfCoffeeException(this.type);
			throw e;
		}
		
	}

	// generic getters and setters...
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the numSips
	 */
	public int getNumSips() {
		return numSips;
	}

	/**
	 * @param numSips the numSips to set
	 */
	public void setNumSips(int numSips) {
		this.numSips = numSips;
	}

	/**
	 * @return the temperature
	 */
	public int getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the caffeinated
	 */
	public boolean isCaffeinated() {
		return caffeinated;
	}

	/**
	 * @param caffeinated the caffeinated to set
	 */
	public void setCaffeinated(boolean caffeinated) {
		this.caffeinated = caffeinated;
	}

	/**
	 * @return the hasMilk
	 */
	public boolean isHasMilk() {
		return hasMilk;
	}

	/**
	 * @param hasMilk the hasMilk to set
	 */
	public void setHasMilk(boolean hasMilk) {
		this.hasMilk = hasMilk;
	}

	/**
	 * @return the quantity
	 */
	public int getPercentFull() {
		return percentFull;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setPercentFull(int quantity) {
		this.percentFull = quantity;
	}
	
}
