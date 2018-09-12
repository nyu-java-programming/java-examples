package edu.nyu.cs.ab1258.loop_example2;

public class Foo {
	
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
