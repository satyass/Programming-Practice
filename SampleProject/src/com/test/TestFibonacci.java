package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Fibonacci;

public class TestFibonacci {
	@Test
	public void testfibo(){
		Fibonacci fib = new Fibonacci();
		int output=fib.findFibonacci(9);
		Assert.assertEquals(output,55 );
	}

}
