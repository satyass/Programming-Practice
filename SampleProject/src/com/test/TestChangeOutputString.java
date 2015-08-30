package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.ChangeOutputString;

public class TestChangeOutputString {
	@Test
	public void testPositivechangingOutputString(){
		ChangeOutputString cs = new ChangeOutputString();
		String output = cs.changingOutputString("Life is beautiful");
		Assert.assertEquals(output,"Life1is2beautiful3");
	}
	@Test
	public void testNegativechangingOutputString(){
		ChangeOutputString cs = new ChangeOutputString();
		String output = cs.changingOutputString("Life is  beautiful");
		Assert.assertEquals(output,"Life1is2beautiful3");
	}
	

}
