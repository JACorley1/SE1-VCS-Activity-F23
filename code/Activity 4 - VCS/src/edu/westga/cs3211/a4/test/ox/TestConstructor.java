package edu.westga.cs3211.a4.test.ox;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Ox;

class TestConstructor {

	@Test
	void TestNullName() {
		assertThrows(IllegalArgumentException.class, () ->
			new Ox(null, 5)
				);
	}
	
	@Test
	void TestBlankName() {
		assertThrows(IllegalArgumentException.class, () ->
			new Ox("  ", 5)
				);
	}
	
	@Test
	void TestNegativeAge() {
		assertThrows(IllegalArgumentException.class, () ->
			new Ox("Carl", -1)
				);
	}

	@Test
	void TestValidConstructor() {
		Ox ox = new Ox("Evan", 2);
		assertTrue(ox.getName().equals("Evan"));
		assertEquals(2, ox.getAge());
	}
}
