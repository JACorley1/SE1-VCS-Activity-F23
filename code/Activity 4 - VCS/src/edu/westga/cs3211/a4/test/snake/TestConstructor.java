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

}
