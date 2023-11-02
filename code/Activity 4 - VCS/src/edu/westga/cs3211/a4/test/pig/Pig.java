package edu.westga.cs3211.a4.test.pig;

/**
 * 
 * @author Ahmad & Jabesi
 *
 * The class Pig
 * 
 */
public class Pig {

	private boolean isMale;
	private int age;
	
	public Pig(boolean isMale, int age) {
		if (age < 0 ) {
			throw new IllegalArgumentException("Age cannot be lower than 0.");
		}
		
		this.isMale = isMale;
		this.age = age;
	}
	
	public boolean getIsMale() {
		return this.isMale;
	}
	
	public int getAge() {
		return this.age;
	}
}
