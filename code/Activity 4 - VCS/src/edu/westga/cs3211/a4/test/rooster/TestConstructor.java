package edu.westga.cs3211.a4.test.rooster;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Rooster;

class TestConstructor {

	@Test
	void test() {
		Rooster r = new Rooster("John", "Silkie");
		assertEquals(r.getName(), "John", "Name is wrong");
		assertEquals(r.getBreed(), "Silkie", "Breed is wrong");
	}

}
