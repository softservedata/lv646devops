package com.softserve.edu;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdd1() {
		/*-
		int i = 0;
		i = 10 / i;
		System.out.println(i);
		*/
		double actual;
		double expected;
		Calc calc = new Calc();
		//
		expected = 8.0001;
		actual = calc.add(4, 4);
		Assert.assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testAdd2() {
		double actual;
		double expected;
		Calc calc = new Calc();
		//
		expected = 8;
		actual = calc.add(3, 5);
		Assert.assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testDiv1() {
		double actual;
		double expected;
		Calc calc = new Calc();
		//
		expected = 4;
		actual = calc.div(20, 5);
		Assert.assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testDiv2() {
		double actual;
		double expected;
		Calc calc = new Calc();
		//
		expected = 2.5;
		actual = calc.div(20, 8);
		Assert.assertEquals(expected, actual, 0.001);
	}

}
