package edu.westga.cs3211.a4.test.rabbit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Rabbit;

class TestConstructor {

	@Test
	void testValidConstructor() {
		Rabbit rabbit = new Rabbit("John", "Hello");
		assertEquals(rabbit.name, "John");
		assertEquals(rabbit.message, "Hello");
	}
	
	@Test
	void testNullName() {
		assertThrows(IllegalArgumentException.class,
	            ()->{
	            	Rabbit rabbit = new Rabbit(null, "Hello");
	                });
	}
	
	@Test
	void testNullMessage() {
		assertThrows(IllegalArgumentException.class,
	            ()->{
	            	Rabbit rabbit = new Rabbit("John", null);
	                });
	}
	
	@Test
	void testEmptyName() {
		assertThrows(IllegalArgumentException.class,
	            ()->{
	            	Rabbit rabbit = new Rabbit("", "Hello");
	                });
	}
	
	@Test
	void testEmptyMessage() {
		assertThrows(IllegalArgumentException.class,
	            ()->{
	            	Rabbit rabbit = new Rabbit("John", "");
	                });
	}


}

