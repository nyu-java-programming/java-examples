package edu.nyu.cs.fb1258.string_examples.poetry_generator;

/**
 * Make a poem using the PoetryGenerator class.
 * @author Foo Barstein
 * @version 2
 */
public class TestPoetryGenerator {

	public static void main(String[] args) {

		// instantiate a poetry generator
		PoetryGenerator g = new PoetryGenerator();

		// get a ten-line poem.
		String poem = g.getAPoem(2); 
		System.out.println(poem);

	}

}
