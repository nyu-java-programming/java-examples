package edu.nyu.cs.fb1258.artworks;

public class Country {
	public Country(String name) {
		this.setName(name);
	}
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
