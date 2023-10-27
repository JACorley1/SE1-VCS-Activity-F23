package edu.westga.cs3211.a4.test.goat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Goat;

class TestCosntructor {

	@Test
	void testValidConstructor() {
		Goat goat = new Goat("LeBron", "James");
		
		assertEquals("LeBron", goat.getFirstName());
		assertEquals("James", goat.getLastName());
	}

	@Test
	void testNullFirstName() {		
		assertThrows(IllegalArgumentException.class, () -> new Goat(null, "James"), "firstName cannot be null");
	}
	

	@Test
	void testNullLastName() {		
		assertThrows(IllegalArgumentException.class, () -> new Goat("LeBron", null), "lastName cannot be null");
	}
	
	@Test
	void testEmptyFirstName() {		
		assertThrows(IllegalArgumentException.class, () -> new Goat("", "James"), "firstName cannot be empty");
	}
	
	@Test
	void testEmptyLastName() {		
		assertThrows(IllegalArgumentException.class, () -> new Goat("LeBron", ""), "lastName cannot be empty");
	}
}
