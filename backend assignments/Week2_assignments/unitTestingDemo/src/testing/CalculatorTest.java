package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calc.Calculator;

class CalculatorTest {
	static Calculator cal;
	@BeforeAll
	public static void beforeAll() {
		 cal=new Calculator();
		 System.out.println("beforeAll");
	}
	@BeforeEach
	public static void before() {
		System.out.println("beforeEach");
	}
	@Test
	@DisplayName("add")
	void testadd(){
		
		int actual=cal.add(5,2);
		assertEquals(7,actual);
		System.out.println("testadd()");
		//assertNotNull(cal);
	}

	@Test
	@DisplayName("sub")
	void testsub() {
		int actual1=cal.sub(2, 2);
		assertEquals(0,actual1);
		System.out.println("testadd()");
		
	}
	@AfterEach
	public static void after() {
		System.out.println("beforeEach");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("afterAll()");
	}

}
