package edu.westga.cs3211.a4.model;

public class Tiger {

	private String name;
	private int clawLength;
	
	/**
	 * Instantiates a new tiger.
	 *
	 * @precondition !name.isEmpty() && name != null
	 * 				 clawLength > 0
	 * @postcondition this.name = name && this.clawLength = clawLength
	 * @param name the name
	 * @param clawLength the claw length
	 */
	public Tiger(String name, int clawLength) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("name must be valid");
		}
		if (clawLength <= 0) {
			throw new IllegalArgumentException("claw length must be greater than 0");
		}
		
		this.name = name;
		this.clawLength = clawLength;
	}
	
	/**
	 * Gets the claw length.
	 *
	 * @return the claw length
	 */
	public int getClawLength() {
		return this.clawLength;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
}
