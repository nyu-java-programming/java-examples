package edu.nyu.cs.fb1258.artworks;

import java.util.ArrayList;

public class Painter {
	
	public Painter(String name, int yearBorn, int yearDied, Country countryBorn, Country countryDied) {
		this.setName(name);
		this.setYearBorn(yearBorn);
		this.setYearDied(yearDied);
		this.setCountryBorn(countryBorn);
		this.setCountryDied(countryDied);
		this.painters.add(this);
	}
	
	public Painter(String name, int yearBorn, Country countryBorn) {
		this.setName(name);
		this.setYearBorn(yearBorn);
		this.setCountryBorn(countryBorn);
		this.painters.add(this);
	}
	
	public void addPainting(Painting painting) {
		this.paintings.add(painting);
	}
	
	private static ArrayList<Painter> painters = new ArrayList<Painter>();
	
	private String name;
	private int yearBorn;
	private int yearDied = -1;
	private Country countryBorn;
	private Country countryDied;
	private ArrayList<Painting> paintings = new ArrayList<Painting>();;
	
	/**
	 * @return the year_born
	 */
	public int getYearBorn() {
		return yearBorn;
	}
	/**
	 * @param year_born the year_born to set
	 */
	public void setYearBorn(int year_born) {
		if (year_born > 0 && year_born < 2019) {
			this.yearBorn = year_born;			
		}
	}
	/**
	 * @return the painters
	 */
	public static ArrayList<Painter> getPainters() {
		return painters;
	}
	/**
	 * @param painters the painters to set
	 */
	public static void setPainters(ArrayList<Painter> painters) {
		Painter.painters = painters;
	}
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
	/**
	 * @return the year_died
	 */
	public int getYearDied() {
		return yearDied;
	}
	/**
	 * @param year_died the year_died to set
	 */
	public void setYearDied(int year_died) {
		this.yearDied = year_died;
	}
	/**
	 * @return the country_born
	 */
	public Country getCountryBorn() {
		return countryBorn;
	}
	/**
	 * @param country_born the country_born to set
	 */
	public void setCountryBorn(Country country_born) {
		this.countryBorn = country_born;
	}
	/**
	 * @return the country_died
	 */
	public Country getCountryDied() {
		return countryDied;
	}
	/**
	 * @param country_died the country_died to set
	 */
	public void setCountryDied(Country country_died) {
		this.countryDied = country_died;
	}
	/**
	 * @return the paintings
	 */
	public ArrayList<Painting> getPaintings() {
		return paintings;
	}
	/**
	 * @param paintings the paintings to set
	 */
	public void setPaintings(ArrayList<Painting> paintings) {
		this.paintings = paintings;
	}
}
