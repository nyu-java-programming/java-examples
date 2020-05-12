package edu.nyu.cs.fb1258.exceptions.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClassA {
	
	public static void openFile(String filename) throws FileNotFoundException {
		Scanner scn = new Scanner(new File(filename));			
		String line = scn.nextLine();
		System.out.println(line);
	}
	
	public static void main(String[] args) {
		String filename = "non_existent_file.txt";
		boolean open = false;
		while (!open) {
			try {
				openFile(filename);
				open = true;
			}
			catch (FileNotFoundException e) {
				System.out.println("Couldn't find the file named '" + filename + "'");
				Scanner scn = new Scanner(System.in);
				System.out.println("Please enter a valid filename: ");
				filename = scn.nextLine();
			}
		}
	}

}
