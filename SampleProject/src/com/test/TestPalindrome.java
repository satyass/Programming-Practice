package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Palindrome;

public class TestPalindrome {
	@Test
	public void testIsItPalindrome(){
		Palindrome pp = new Palindrome();
		boolean output = pp.IsItPalindrome("madam");
		Assert.assertEquals(output, true);
		
	}
	@Test
	public void testNotPalindrome(){
		Palindrome pp = new Palindrome();
		boolean output = pp.IsItPalindrome("mary");
		Assert.assertEquals(output, false);
		
		
	}

}
