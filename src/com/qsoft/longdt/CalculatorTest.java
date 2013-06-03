package com.qsoft.longdt;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void shouldReturnEmptyOnEmptyString()
	{
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void shouldReturnNumberOnNumber()
	{
		assertEquals(1, Calculator.add("1"));
	}
}
