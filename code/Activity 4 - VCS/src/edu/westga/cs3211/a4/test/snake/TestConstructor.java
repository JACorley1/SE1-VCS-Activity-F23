package edu.westga.cs3211.a4.test.snake;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Snake;

public class TestConstructor {

	@Test
	public void testLengthBelowThreshold() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Snake(-1, true);
		});
		assertEquals(exception.getMessage(), Snake.ERR_INVALID_LENGTH);
	}
	
	@Test
	public void testLengthAtThreshold() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Snake(0, true);
		});
		assertEquals(exception.getMessage(), Snake.ERR_INVALID_LENGTH);
	}
	
	@Test
	public void testLengthAboveThreshold() {
		Snake test = new Snake(1, true);
		assertEquals(1, test.getLengthInches());
	}
	
	public void testValidConstructor() {
		Snake test1 = new Snake(7, true);
		Snake test2 = new Snake(5, false);
		
		assertEquals(7, test1.getLengthInches());
		assertEquals(true, test1.isVenomous());
		
		assertEquals(5, test2.getLengthInches());
		assertEquals(false, test2.isVenomous());
	}

}
