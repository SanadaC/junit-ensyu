package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
	void power1() {
		Counter counter = new Counter();
		assertEquals(1, counter.increment());
	}
	
	@Test
	void power2() {
		Counter counter2 = new Counter();
		// TODO:‚³‚«‚Éincrement‚ð1‰ñŒÄ‚ñ‚Å‚¨‚­
		counter2.increment();
		
		int actual = counter2.increment();
		assertEquals(2, actual);
		
	}
	
	@Test
	void power3() {
		Counter counter50 = new Counter();
		// TODO:‚³‚«‚Éincrement‚ð50‰ñŒÄ‚ñ‚Å‚¨‚­
		for (int i = 0; i < 50; i++) {
			counter50.increment();
		}
		assertEquals(51, counter50.increment());

	}

}
