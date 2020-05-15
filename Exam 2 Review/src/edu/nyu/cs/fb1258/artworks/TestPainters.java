package edu.nyu.cs.fb1258.artworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestPainters {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scn = new Scanner(new File("src/painters.csv"));
		int counter = 0;
		while (scn.hasNext()) {
			counter++;
			String line = scn.nextLine();
			if (counter < 2 || counter > 3) continue;
			
			// parse data
			String[] data = line.split(",");
			String name = data[0];
			int yearBorn = Integer.parseInt(data[1]);
			Country countryBorn = new Country(data[2]);
			int yearDied = Integer.parseInt(data[3]);
			Country countryDied = new Country(data[4]);
			
			// instantiate object
			Painter painter = new Painter(name, yearBorn, yearDied, countryBorn, countryDied);
			String[] materials = {"oil", "canvas"};
			painter.addPainting(new Painting("Lorem ipsum", materials, new Country("Spain"), 2019, painter));
			
		}
		
		// output all titles
		for (Painter painter : Painter.getPainters()) {
			for (Painting painting : painter.getPaintings()) {
				System.out.println(painting);
			}
		}
		
		scn.close();

	}

}
