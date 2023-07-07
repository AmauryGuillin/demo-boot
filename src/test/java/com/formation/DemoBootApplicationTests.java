package com.formation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.formation.service.Calculator;

@SpringBootTest
class DemoBootApplicationTests {
	
	Calculator calculator = new Calculator();

	@Test
	void testSum() {
		
		assertEquals(6, calculator.sum(2, 4));
	}
	
	@Test
	void testMult() {
		assertEquals(6, calculator.mult(2, 3));
	}
	
	@Test
	void testDiv() {
		assertEquals(1, calculator.divide(2, 2));
	}

}
