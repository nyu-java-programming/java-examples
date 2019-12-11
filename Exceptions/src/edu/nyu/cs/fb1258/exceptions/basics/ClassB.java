package edu.nyu.cs.fb1258.exceptions.basics;

public class ClassB {
	public static void method1() throws ProfBloombergException {
		ProfBloombergException e = new ProfBloombergException();
		throw e;
	}

	public static void main(String[] args) {
		try {
			method1();
		}
		catch (ProfBloombergException e) {
			System.out.println(e);
		}
	}

}

class ProfBloombergException extends Exception {
	
	public String toString() {
		return "This is not acceptable!";
	}
	
}



