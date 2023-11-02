package edu.westga.cs3211.a4.test.pig;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestConstructor {

	@Test
	void testValidConstructor() {
		Pig pig = new Pig(true, 0);
		
		assertTrue(pig.getIsMale());
		assertEquals(0, pig.getAge());
	}
	
	@Test
	void testInvalidConstructor() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Pig(true, -1);
		});
	}

}
