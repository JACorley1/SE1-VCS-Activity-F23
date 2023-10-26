package edu.westga.cs3211.a4.model;

/**
 * Represents a snake.
 * 
 * @author Jacob Wilson
 * @version Fall 2023
 */
public class Snake {
	private final String ERR_INVALID_LENGTH = "Length must be greater than 0.";
	
	private int lengthInches;
	private boolean venomous;
	
	/**
	 * Initializes a new Snake with the specified values.
	 * 
	 * @precondition length > 0
	 * @postcondition getLengthInches() == length && isVenomous() == venomous
	 * 
	 * @param length the length of the snake, in inches
	 * @param venomous whether the snake is venomous
	 */
	public Snake(int length, boolean venomous) {
		if (length <= 0) {
			throw new IllegalArgumentException(ERR_INVALID_LENGTH);
		}
		this.lengthInches = length;
		this.venomous = venomous;
	}
	
	/**
	 * Gets the length of the snake in inches.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the length.
	 */
	public int getLengthInches() {
		return lengthInches;
	}

	/**
	 * Sets the snake's length in inches.
	 * 
	 * @precondition lengthInches > 0
	 * @postcondition none
	 * 
	 * @param lengthInches the length in inches
	 */
	public void setLengthInches(int lengthInches) {
		if (lengthInches <= 0) {
			throw new IllegalArgumentException(ERR_INVALID_LENGTH);
		}
		this.lengthInches = lengthInches;
	}
	
	/**
	 * Gets whether the snake is venomous.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return true if the snake is venomous; false otherwise.
	 */
	public boolean isVenomous() {
		return venomous;
	}

	/**
	 * Sets whether the snake is venomous.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param venomous whether the snake is venomous
	 */
	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}
}
