package edu.nyu.cs.fb1258.oop_recap;

public class PlayWithPenciles {

	public static void main(String[] args) {
			
		Pencil pencil1 = new Pencil();
		Pencil pencil2 = new Pencil();
		pencil1.sharpen();
		pencil1.sharpen();
		pencil1.sharpen();
		pencil1.sharpen();
		pencil1.sharpen();
		pencil1.sharpen();
		pencil1.sharpen();
		pencil1.sharpen();
		pencil1.sharpen();
		pencil1.sharpen();
		pencil2.sharpen();
		pencil2.sharpen();
		pencil2.sharpen();
		System.out.println("Pencil 1 is " + pencil1.getSharpness() + "% sharp");
		pencil1.write("hello world!");
		
		pencil2.write("hello class!");
		pencil2.write("hello class!", 80);

	}

}
