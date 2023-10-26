package edu.westga.cs3211.a4.test.snake;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Snake;

public class TestSetLengthInches {

	@Test
	public void testLengthBelowThreshold() {
		Snake test = new Snake(1, true);
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			test.setLengthInches(-1);
		});
		assertEquals(exception.getMessage(), Snake.ERR_INVALID_LENGTH);
	}
	
	@Test
	public void testLengthAtThreshold() {
		Snake test = new Snake(1, true);
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			test.setLengthInches(0);
		});
		assertEquals(exception.getMessage(), Snake.ERR_INVALID_LENGTH);
	}
	
	@Test
	public void testLengthAboveThreshold() {
		Snake test = new Snake(1, true);
		test.setLengthInches(1);
		assertEquals(1, test.getLengthInches());
	}

}
