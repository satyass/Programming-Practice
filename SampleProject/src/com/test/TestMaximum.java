package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Maximum;

public class TestMaximum {
	
	@Test
	public void testPositiveNumbers(){		
		Maximum max = new Maximum();
		int[] arr = {5,10,34,12,0,56};
		int m = max.findMaximumNumber(arr);
		Assert.assertEquals(m, 56);				
	}
	
	@Test
	public void testNegativeNumbers(){
		Maximum max = new Maximum();
		int[] arr = {-5,-10,-34,-12,0,-56};
		int n= max.findMaximumNumber(arr);
		Assert.assertEquals(n, 0);
		
	}
	
	@Test
	public void testDuplicateNumbers(){
		Maximum max = new Maximum();
		int[]arr = {5,10,10,12,0,56};
		int d = max.findMaximumNumber(arr);
		Assert.assertEquals(d, 56);
	}

}
