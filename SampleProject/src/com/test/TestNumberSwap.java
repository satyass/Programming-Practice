package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.NumberSwap;

public class TestNumberSwap {
	@Test
	public void testswapNumberUsingTemp(){
		NumberSwap swap = new NumberSwap();
		String output= swap.swapNumberUsingTemp(5,10);
		Assert.assertEquals(output,"10,5");		
	}
	@Test
	public void testswapNumberNotUsingTemp(){
		NumberSwap swap = new NumberSwap();
		String output= swap.swapNumberNotUsingTemp(6,3);
		Assert.assertEquals(output,"3,6");	
		
	}

}
