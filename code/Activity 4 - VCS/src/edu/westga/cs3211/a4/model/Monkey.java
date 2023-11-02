package edu.westga.cs3211.a4.model;

/**
 * Represents a monkey
 * 
 * @author Christian Turner
 * @version Fall 2023
 */

public class Monkey {

	private int bananas;
	private int mangos;

	/**
	 * Instantiates a new monkey
	 * 
	 * @precondition bananas >= 0, mangos >= 0
	 * @postcondtion none
	 * 
	 * @param bananas the number of bananas the monkey has
	 * @param mangos  the number of mangos the monkey has
	 */

	public Monkey(int bananas, int mangos) {
		if (bananas < 0) {
			throw new IllegalArgumentException("Can't have less than 0 bananas");
		}

		if (mangos < 0) {
			throw new IllegalArgumentException("Can't have less than 0 mangos");
		}

		this.bananas = bananas;
		this.mangos = mangos;
	}

	/**
	 * Returns the number of bananas
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the number of bananas
	 */

	public int getBananas() {
		return this.bananas;
	}

	/**
	 * Returns the number of mangos
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the number of mangos
	 */

	public int getMangos() {
		return this.mangos;
	}
}