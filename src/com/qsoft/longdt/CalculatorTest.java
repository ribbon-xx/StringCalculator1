package com.qsoft.longdt;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void shouldReturnEmptyOnEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void shouldReturnNumberOnNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void shouldReturnSumOfTwoNumberWithComma() {
		assertEquals(3, Calculator.add("1,2"));
	}
	
	@Test
	public void shouldReturnSumOnMultipleNumbers()
	{
		assertEquals(6, Calculator.add("1,2,3"));
	}
}
