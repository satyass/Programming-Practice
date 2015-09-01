package com.test;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.CommonElementsIn2Arrays;

public class TestCommonElements {
	@Test
	public void testPositiveCommonELements(){
		CommonElementsIn2Arrays cs = new CommonElementsIn2Arrays();
		int[] array1 = { 3, 5, 7, 8};
		int[] array2 = { 2, 4, 5, 6, 7, 9};
		List expected = new ArrayList();
		expected.add(5);
		expected.add(7);		
		List actual = cs.findCommonElements(array1, array2);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testNegativeCommonELements(){
		CommonElementsIn2Arrays cs = new CommonElementsIn2Arrays();
		int[] array1 = { -3, -4,-1, 7, -8};
		int[] array2 = { 2, -4, -1, 6, 7, -9};
		List expected = new ArrayList();
		expected.add(-4);
		expected.add(-1);
		expected.add(7);
		List actual = cs.findCommonElements(array1, array2);
		Assert.assertEquals(actual, expected);
	}
	

}
