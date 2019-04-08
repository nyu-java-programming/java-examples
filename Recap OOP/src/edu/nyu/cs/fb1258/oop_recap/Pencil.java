package edu.nyu.cs.fb1258.oop_recap;

public class Pencil {
	// constructors
	public Pencil() {
		this.number = 6;
		this.setSharpness(100);
		this.hasEraser = false;
	}
	
	public Pencil(int number, int sharpness, boolean hasEraser) {
		this.number = number;
		this.setSharpness(sharpness);
		this.hasEraser = hasEraser;
	}
	
	public Pencil(int sharpness) {
		this.setSharpness(sharpness);
	}
	
	
	// properties (i.e. variables)
	private int number = 2;
	private int sharpness = 0;
	private boolean hasEraser = true;
	
	
	// behaviors (i.e. methods/functions)
	public void write(String textToWrite) {
		System.out.println("Writing with a " + this.sharpness + "% sharp pencil: " + textToWrite);
	}
	
	public void write(String textToWrite, int sharpness) {
		this.setSharpness(sharpness);
		this.write(textToWrite);
	}
	
	public void draw(String thingToDraw) {
		System.out.println("drawing " + thingToDraw);
	}
	
	public void erase() {
		System.out.println("Erasing...");
	}
	
	public void sharpen() {
		// increase sharpness by 10
		int newSharpness = this.getSharpness() + 10;
		this.setSharpness(newSharpness);
	}
	
	public void setHasEraser(boolean yesno) {
		this.sharpen();
		this.hasEraser = yesno;
	}
	
	public void setSharpness(int value) {
		if (value >0 && value <= 110) {
			this.sharpness = value;
		}
	}
	
	public int getSharpness() {
		return this.sharpness;
	}
}
