package com.qsoft.longdt;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void ShouldReturnEmptyOnEmptyString()
	{
		assertEquals(0, Calculator.add(""));
	}
}
