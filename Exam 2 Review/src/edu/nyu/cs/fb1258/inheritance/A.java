package edu.nyu.cs.fb1258.inheritance;

public class A {
	
	public static final String word = "hello";
	private String myMessage;
	
	public A() {
		this.setMyMessage("nothing much");
	}
	
	public A(String myMessage) {
		this.setMyMessage(myMessage);
	}
	
	public void doSomething() {
		System.out.println(this.myMessage);
	}
	
	public void doSomething(boolean announceType) {
		if (announceType) {
			System.out.printf("%s says '%s'\n", this.getClass(), this.myMessage);
		}
		else {
			this.doSomething();
		}
	}
	
	public void setMyMessage(String myMessage) {
		if (myMessage.trim().length() > 3) {
			this.myMessage = myMessage;
		}
	}
	
	/**
	 * @return the word
	 */
	public static String getWord() {
		return word;
	}

	public String getMyMessage() {
		return this.myMessage;
	}
}
