package edu.westga.cs3211.a4.test.rooster;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Rooster;

class TestConstructor {

	@Test
<<<<<<< HEAD
	void testValidConstructor() {
		//ARRANGE
		Rooster roosta = new Rooster("Rico" , "Silkie");

		//ASSERT
		assertEquals("Rico", roosta.getName());
		assertEquals("Silkie" , roosta.getBreed());
=======
	void test() {
		Rooster r = new Rooster("John", "Silkie");
		assertEquals(r.getName(), "John", "Name is wrong");
		assertEquals(r.getBreed(), "Silkie", "Breed is wrong");
>>>>>>> 77e7e785b0f47cce2004290b11e096585755565e
	}

}
