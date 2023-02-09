package org.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	

	static Calculator c = new Calculator();
	
	
	@Test
	@DisplayName("Test addizione")
	void addTest() {
		float value = c.add(3, 2);
		assertEquals(5, value, "La somma deve essere: 5");
	}
	
	@Test
	@DisplayName("Test sotrazzione")
	void subtractTest() {
		float value = c.subtract(10, 5);
		assertEquals(5, value, "La sotrazzione deve essere: 5");
	}
	
	@Test
	@DisplayName("Test divisione")
	void divideTest() throws Exception {
		float value = c.divide(10, 2);
		assertEquals(5, value, "La divisione deve essere: 5");
	}
	
	@Test
	@DisplayName("Test moltiplicazione")
	void multiplyTest() {
		float value = c.multiply(1, 5);
		assertEquals(5, value, "La moltiplicazione deve essere: 5");
	}
	
	@Test
	@DisplayName("Test eccezione divisione /0")
	void exceptionDivideTest() {
		assertThrows(Exception.class, () -> c.divide(4, 0), "La divisione per 0 non valida" );
	}
}
