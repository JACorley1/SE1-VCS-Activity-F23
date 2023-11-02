package edu.westga.cs3211.a4.test.monkey;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Monkey;

class TestCosntructor {

	@Test
	void testValidMonkey() {
		Monkey testMonkey = new Monkey(0, 0);

		assertAll(() -> assertEquals(0, testMonkey.getBananas()), () -> assertEquals(0, testMonkey.getMangos())

		);

	}

	@Test
	void testValidMonkey1Banana() {
		Monkey testMonkey = new Monkey(1, 0);

		assertAll(() -> assertEquals(1, testMonkey.getBananas()), () -> assertEquals(0, testMonkey.getMangos())

		);

	}

	@Test
	void testValidMonkey1BananaAndMango() {
		Monkey testMonkey = new Monkey(1, 1);

		assertAll(() -> assertEquals(1, testMonkey.getBananas()), () -> assertEquals(1, testMonkey.getMangos())

		);
	}

	@Test
	void testValidMonkey1Mango() {
		Monkey testMonkey = new Monkey(0, 1);

		assertAll(() -> assertEquals(0, testMonkey.getBananas()), () -> assertEquals(1, testMonkey.getMangos())

		);

	}

	@Test
	void testInvalidBananas() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Monkey(-1, 0);
		});

	}

	@Test
	void testInvalidMangos() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Monkey(0, -1);
		});

	}

	@Test
	void testInvalidMonkey() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Monkey(-1, -1);

		});

	}

}