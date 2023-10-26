package edu.westga.cs3211.a4.model;

/**
 * Defines a Goat class.
 * @author Javon Townsend, Nicholas Newberry, Nate Schaab
 */
public class Goat {
	private String firstName;
	private String lastName;
	
	/**
	 * Defines a Goat constructor
	 * 
	 * @pre firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()
	 * @post none
	 * 
	 * @param firstName the first name
	 * @param lastName the last name
	 */
	public Goat(String firstName, String lastName) {
		if (firstName == null) {
			throw new IllegalArgumentException("firstName cannot be null");
		}
		
		if (lastName == null) {
			throw new IllegalArgumentException("lastName cannot be null");
		}
		
		if (firstName.isEmpty()) {
			throw new IllegalArgumentException("firstName cannot be empty");
		}
		
		if (lastName.isEmpty()) {
			throw new IllegalArgumentException("lastName cannot be null");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Gets the firstName
	 * 
	 * @pre none
	 * @post none
	 * 
	 * @return the first name
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Gets the last name
	 * 
	 * @pre none
	 * @post none
	 * 
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

}
