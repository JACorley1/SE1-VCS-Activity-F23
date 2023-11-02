package edu.westga.cs3211.a4.model;

/**
 * Represents an Ox
 */
public class Ox {
	public String name;
	public int age;
	
	/**
	 * Instantiates a new ox.
	 *
	 * @param name the name
	 * @param age the age
	 */
	public Ox (String name, int age) {
		if (name == null) {
			throw new IllegalArgumentException("Name can not be null");
		}
		if (name.isBlank()) {
			throw new IllegalArgumentException("Name can not be blank");
		}
		if (age < 0) {
			throw new IllegalArgumentException("Age must be postive");
		}
		
		this.name = name;
		this.age = age;
	}

	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
}
