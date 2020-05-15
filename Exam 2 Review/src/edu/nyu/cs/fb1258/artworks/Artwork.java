package edu.nyu.cs.fb1258.artworks;

public class Artwork {
	public Artwork(String title, String[] materials, Country country, int year) {
		this.setTitle(title);
		this.setMaterials(materials);
		this.setCountry(country);
		this.setYear(year);
	}
	private String title;
	private String[] materials;
	private Country country;
	private int year;
	
	// assume all getters and setters have been created
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the materials
	 */
	public String[] getMaterials() {
		return materials;
	}
	/**
	 * @param materials the materials to set
	 */
	public void setMaterials(String[] materials) {
		this.materials = materials;
	}
	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
}
