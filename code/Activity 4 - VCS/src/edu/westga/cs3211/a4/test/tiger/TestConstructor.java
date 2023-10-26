package edu.westga.cs3211.a4.test.tiger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Tiger;

class TestConstructor {

	@Test
	public void TestValidTiger() {
		var name = "tony";
		var clawLength = 6;

		var tiger = new Tiger(name, clawLength);

		assertEquals(6, tiger.getClawLength());
		assertEquals("tony", tiger.getName());
	}

	@Test
	public void TestInvalidName() {
		var name = "";
		var clawLength = 6;
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Tiger(name, clawLength);
		});

	}
	
	@Test
	public void TestNameNull() {
		var clawLength = 6;
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Tiger(null, clawLength);
		});

	}
	
	@Test
	public void TestInvalidLength() {
		var name = "Tony";
		var clawLength = 0;
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Tiger(name, clawLength);
		});

	}

}