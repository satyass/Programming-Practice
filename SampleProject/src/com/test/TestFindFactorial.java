package com.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.FindFactorial;

public class TestFindFactorial {

	@Test
	public void testFactorial(){
		FindFactorial ff = new FindFactorial();
		int output= ff.calculateFactorial(5);
		System.out.println(output);
		Assert.assertEquals(output,120 );
	}
	@Test
	public void testFactorialNegativeNum(){
		FindFactorial ff = new FindFactorial();
		int output= ff.calculateFactorial(-5);
		System.out.println(output);
		Assert.assertEquals(output,1 );
	}
	

}
