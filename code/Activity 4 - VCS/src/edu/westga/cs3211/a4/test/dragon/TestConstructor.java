package edu.westga.cs3211.a4.test.dragon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Dragon;

class TestConstructor {

	@Test
	void testValidParam() {
		Dragon dragon = new Dragon("Dragon", 500);
		
		assertEquals("Dragon", dragon.getName());
		assertEquals(500, dragon.getAge());
	}

}
