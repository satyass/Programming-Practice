package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.MissingNumber;

public class TestMissingNumber {
	@Test
	public void testPositivefindMissingNumber(){		
		MissingNumber mn = new MissingNumber();
		int[] arr = {1,2,3,4,5,7,8};
		int n = mn.findMissingNumber(arr);
		Assert.assertEquals(n, 6);		

	}
	@Test
	public void testNegativefindMissingNumber(){		
		MissingNumber mn = new MissingNumber();
		int[] arr = {1,2,3,4,5,7,8};
		int n = mn.findMissingNumber(arr);
		Assert.assertEquals(n, 7);		

	}
	
	
	
}
