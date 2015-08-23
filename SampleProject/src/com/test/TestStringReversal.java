package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.StringReversal;



public class TestStringReversal {
	@ Test
	public void testReverseString(){
		StringReversal sr =new StringReversal();
		String output= sr.reverseString("Welcome");
		Assert.assertEquals(output, "emocleW");
	}
	@ Test
	public void testReverseString2(){
		StringReversal sr =new StringReversal();
		String output= sr.reverseString2("KOOL");
		Assert.assertEquals(output, "LOOK");
	}

}
