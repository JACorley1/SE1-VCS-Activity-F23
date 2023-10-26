package edu.westga.cs3211.a4.test.rooster;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Rooster;

class TestConstructor {

	@Test
	void testValidConstructor() {
		//ARRANGE
		Rooster roosta = new Rooster("Rico" , "Silkie");

		//ASSERT
		assertEquals("Rico", roosta.getName());
		assertEquals("Silkie" , roosta.getBreed());
	}

}
