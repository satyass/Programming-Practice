package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.NullPointerExp;



public class TestNullPointerExp {
	@Test
	public void testthrowNullPointer(){
		
		boolean output = NullPointerExp.throwNullPointer("test");
		Assert.assertEquals(output,false);	
		
	}
	@Test
	public void testnegativethrowNullPointer(){
		
		boolean output = NullPointerExp.throwNullPointer(null);
		Assert.assertEquals(output,true);
	}

}
