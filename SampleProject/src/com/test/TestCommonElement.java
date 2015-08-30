package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.CommonElements;

public class TestCommonElement {
	@Test
	public void testPositivechangingOutputString(){
		CommonElements cs = new CommonElements();
		int[] a = { 3, 5, 7, 8};
		int[] b = { 2, 4, 5, 6, 9};
		int output = cs.findCommonElement(a, b);
		Assert.assertEquals(output,5);
	}
}
