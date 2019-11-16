package edu.nyu.cs.fb1258.inheritance.phones;

public class PhoneNumber {

	/**
	 * Constructor that instantiates a PhoneNumber object from a String
	 * @param number The String to use to create a PhoneNumber object
	 */
	public PhoneNumber(String number) {
		// make a phone number object from this string
		String[] parts = number.split("[ -]");
		String countryCode = parts[0].substring(1, parts[0].length());
		String areaCode = parts[1].substring(1, parts[1].length() - 1);
		String localCode = parts[2];
		String specificCode = parts[3];
		
		// store the integer equivalents of each of these strings
		this.countryCode = Integer.parseInt(countryCode);
		this.areaCode = Integer.parseInt(areaCode);
		this.localCode = Integer.parseInt(localCode);
		this.specificCode = Integer.parseInt(specificCode);
	}

	/**
	 * Constructor that sets all properties of a phone number from their individual pieces
	 * @param countryCode The country code of the phone number
	 * @param areaCode The area code of the phone number
	 * @param localCode The local code of the phone number
	 * @param specificCode The specific code of the phone number
	 */
	public PhoneNumber(int countryCode, int areaCode, int localCode, int specificCode) {
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.localCode = localCode;
		this.specificCode = specificCode;
	}
	
	/**
	 * Get the entire phone number as an integer
	 * @return The phone number, as an int
	 */
	public int getNumber() {
		// put together a string with all the digits from this phone number
		String totalNum = String.format("%d%d%d%d", this.countryCode, this.areaCode, this.localCode, this.specificCode);
		int finalNum = Integer.parseInt(totalNum);
		return finalNum;		
	}
	
	/**
	 * The string representation of this object
	 * @return The phone number as a string
	 */
	public String toString() {
		String num = String.format("+%d (%d) %d-%d", this.countryCode, this.areaCode, this.localCode, this.specificCode);
		return num;
	}
	
	// properties of a Phone Number
	private int countryCode;
	
	private int areaCode;
	
	private int localCode;
	
	private int specificCode;
	
	
	

}
