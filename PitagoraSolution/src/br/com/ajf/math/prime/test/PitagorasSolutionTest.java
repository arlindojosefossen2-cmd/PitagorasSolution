package br.com.ajf.math.prime.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.ajf.math.prime.PitagorasSolution;

final class PitagorasSolutionTest
{
	private int xValue;
	private long expected;
	private long atual;
	
	@Test
	void testIfXValueIsLessThanZero()
	{
		xValue = -10;
		expected = -1;		
		atual = PitagorasSolution.prime(xValue);
		Assertions.assertEquals(expected, atual);;
	}
	@Test
	void testIfPrimeOfZeroIs2()
	{
		xValue = 0;
		expected = 2;		
		atual = PitagorasSolution.prime(xValue);
		
		Assertions.assertEquals(expected, atual);;
	}
	@Test
	void testIfPrimeOfOneIs3()
	{
		xValue = 1;
		expected = 3;	
		atual = PitagorasSolution.prime(xValue);
		
		Assertions.assertEquals(expected,atual);
	}
	@Test
	void testIfPrimeOfTwoIs5()
	{
		xValue = 2;
		expected = 5;
		atual = PitagorasSolution.prime(2);
		
		Assertions.assertEquals(expected,atual);
	}
	@Test
	void testIfPrimeOfTenIs31()
	{
		xValue = 10;
		expected = 31;
		atual = PitagorasSolution.prime(xValue);
		
		Assertions.assertEquals(expected,PitagorasSolution.prime(xValue));
	}
	@Test
	void testIfPrimeOfANumberMoreThanMaxShortValueDividByTwoIs180503()
	{
		xValue = Short.MAX_VALUE;
		expected = -1;
		atual = PitagorasSolution.prime(xValue);
		
		Assertions.assertEquals(expected,PitagorasSolution.prime(xValue));
	}
	@Test
	void testIfPrimeOfMaxShortValueDividByTwoIs180503()
	{
		xValue = Short.MAX_VALUE/2;
		expected = 180503;
		atual = PitagorasSolution.prime(xValue);
		
		Assertions.assertEquals(expected,PitagorasSolution.prime(xValue));
	}
}