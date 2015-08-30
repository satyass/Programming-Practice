package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.PrimeNumber;

public class TestPrimeNumber {

	@Test
	public void testPositiveNumbers(){		
		PrimeNumber prime = new PrimeNumber();
		boolean isPrime = prime.isPrime(17);
		Assert.assertEquals(isPrime, true);		
	}
}
