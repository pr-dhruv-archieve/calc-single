package com.soma.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void addTest1() {
		int a = 25;
		int b = 26;
		int expectedResult = 51;
		assertEquals(expectedResult, Calculator.add(a, b));
	}

	@Test
	public void addTest2() {
		int a = 100;
		int b = 100;
		int expectedResult = 1000;
		assertNotEquals(expectedResult, Calculator.add(a, b));
	}

	@Test
	public void addTest3() {
		int a = 2;
		int b = 2;
		int expectedResult = 5;
		assertNotEquals(expectedResult, Calculator.add(a, b));
	}

	@Test
	public void addTest4() {
		int a = 100 + 1;
		int b = 100 + 1;
		int expectedResult = 2 * 100 + 1;
		assertNotEquals(expectedResult, Calculator.add(a, b));
	}

	@Test
	public void subtractTest1() {
		int a = 5;
		int b = 5;
		double expectedResult = 0;
		assertEquals(expectedResult, Calculator.subtract(a, b));
	}
	@Test
	public void subtractTest2() {
		int a = Integer.MIN_VALUE;
		int b = Integer.MIN_VALUE;
		int expectedResult = 0;
		assertEquals(expectedResult, Calculator.subtract(a, b));
	}
	@Test
	public void subtractTest3() {
		int a = 0;
		int b = 0;
		int expectedResult = 0;
		assertEquals(expectedResult, Calculator.subtract(a, b));
	}
	@Test
	public void subtractTest4() {
		int a = 10;
		int b = 25;
		int expectedResult = -15;
		assertEquals(expectedResult, Calculator.subtract(a, b));
	}
	@Test
	public void multiplicationTest1() {
		int a = 5;
		int b = 0;
		int expectedResult = 0;
		assertEquals(expectedResult, Calculator.multiply(a, b));
	}
	@Test
	public void multiplicationTest2() {
		int a = 5;
		int b = 1;
		int expectedResult = 5;
		assertEquals(expectedResult, Calculator.multiply(a, b));
	}
	@Test
	public void multiplicationTest3() {
		int a = 0;
		int b = 0;
		int expectedResult = 0;
		assertEquals(expectedResult, Calculator.multiply(a, b));
	}
	@Test
	public void multiplicationTest4() {
		int a = 100;
		int b = 100;
		int expectedResult = 10000;
		assertEquals(expectedResult, Calculator.multiply(a, b));
	}
	@Test
	public void divideTest1() {
		int a = 5;
		int b = 2;
		int expectedResult = 2;
		assertEquals(expectedResult, Calculator.divide(a, b));
	}
	@Test
	public void divideTest2() {
		int a = 9;
		int b = 3;
		int expectedResult = 3;
		assertEquals(expectedResult, Calculator.divide(a, b));
	}
	@Test
	public void divideTest3() {
		int a = 15;
		int b = 1;
		int expectedResult = 15;
		assertEquals(expectedResult, Calculator.divide(a, b));
	}
	@Test
	public void divideTest4() {
		int a = 2;
		int b = 2;
		int expectedResult = 1;
		assertEquals(expectedResult, Calculator.divide(a, b));
	}

}
