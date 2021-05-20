package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class StringUtilsTest {

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
	@DisplayName("aaaがスネイクケースになるかテスト")
	void testPower1() {
		String actualAnswer = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", actualAnswer, "エラー");
	}

	@Test
	@DisplayName("HelloWorldがスネイクケースになるかテスト")
	void testPower2() {
		String actualAnswer = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", actualAnswer, "エラー");
	}
	
	@Test
	@DisplayName("practiceJunitがスネイクケースになるかテスト")
	void testPower3() {
		String actualAnswer = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", actualAnswer, "エラー");
	}
}
