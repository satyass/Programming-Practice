package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.BalancedParanthesis;

public class TestBalancedParanthesis {
	@Test
	public void testPositiveBalancedParanthesis() {
		BalancedParanthesis bps = new BalancedParanthesis();
		String astring = "(This (a+b))";
		boolean value = bps.isItBalancedParanthesis(astring);
		Assert.assertEquals(value, true);

	}
	@Test
	public void testNegativeBalancedParanthesis() {
		BalancedParanthesis bps = new BalancedParanthesis();
		String astring = "(This (a+b)";
		boolean value = bps.isItBalancedParanthesis(astring);
		Assert.assertEquals(value, false);

	}
}