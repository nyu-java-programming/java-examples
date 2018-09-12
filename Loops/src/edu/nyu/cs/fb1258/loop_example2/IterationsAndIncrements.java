package edu.nyu.cs.fb1258.loop_example2;

/**
 * Counting iterations and showing off the behavior of the var++ operator.
 * @author Foo Barstein
 * @version 0.00012
 *
 */
public class IterationsAndIncrements {
	
	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;
		while (i < 10) {
			System.out.println("Iteration " + j);
			j++;
			if ((i++ % 2) == 0) {
				System.out.println(i);
			}
		}

	}
}
