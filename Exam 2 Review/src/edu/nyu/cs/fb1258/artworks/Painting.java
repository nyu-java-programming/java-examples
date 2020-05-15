package edu.nyu.cs.fb1258.artworks;

import java.util.Arrays;

public class Painting extends Artwork {
	public Painting(String title, String[] materials, Country country, int year, Painter painter) {
		super(title, materials, country, year);
		this.setPainter(painter);
	}
	
	private Painter painter;
	
	public String toString() {
		return String.format("%10s (%4d); %10s; %10s", this.getTitle(), this.getYear(), Arrays.toString(this.getMaterials()), this.getPainter().getName());
	}

	/**
	 * @return the painter
	 */
	public Painter getPainter() {
		return painter;
	}

	/**
	 * @param painter the painter to set
	 */
	public void setPainter(Painter painter) {
		this.painter = painter;
	}
	
}
