package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.main.ReplaceSubstring;

public class TestReplaceSubstring {
	@Test
	public void testtoReplaceSubString(){
		ReplaceSubstring rs = new ReplaceSubstring();
		String output = rs.toReplaceSubString("You are so awesome", "awesome", "annoying");
		Assert.assertEquals(output,"You are so annoying");
	}
	@Test
	public void testNegativetoReplaceSubString(){
		ReplaceSubstring rs = new ReplaceSubstring();
		String output = rs.toReplaceSubString("You are not so awesome", "awesome", "annoying");
		Assert.assertEquals(output,"You are so annoying");
	}
	
		

}
