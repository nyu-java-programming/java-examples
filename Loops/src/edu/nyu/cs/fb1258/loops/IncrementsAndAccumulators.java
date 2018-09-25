package edu.nyu.cs.fb1258.loops;

/**
 * Comparison of popular increment techniques ++var, var++, and accumulator loops
 * @author Foo Barstein
 * @version 0.00012
 *
 */
public class IncrementsAndAccumulators {

	public static void main(String[] args) {

		// declare two variables
		int sum, hum;

		// #1 - let's see what sum++ does
		sum=0;
		hum = 0;
		hum = sum++; //hum will be zero
		
		// print out the values of the two variables
		System.out.println("#1 - Hum is " + hum + " and sum is " + sum);
		
		// #2 - let's see what ++sum does
		sum=0;
		hum = 0;
		hum = ++sum; //hum will be one, because the increment happens before anything else.
		
		// print out the values of the two variables
		System.out.println("#2 - Hum is " + hum + " and sum is " + sum);
		
		// #3 - some people prefer ++i instead of i++ everywhere
		sum = 0;
		
		// iterate 10 times
		for (int i =0; i< 10; ++i) {
			
			// accumulate value onto the sum variable
			sum = sum + i;
		}
		
		// print out the value of the sum variable
		System.out.println("#3 - Sum is " + sum);
		
		// #4 - but most people use i++ not ++i unless it's important, which it's not in a for loop
		sum = 0;
		
		// iterate ten times
		for (int i =0; i<10; i++) {

			// accumulate value onto the sum variable
			sum = sum + i;
		}
		
		// print out the value of the sum variable
		System.out.println("#4 - Sum is " + sum);

	}

}
