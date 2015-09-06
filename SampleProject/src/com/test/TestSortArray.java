package com.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.SortArray;

public class TestSortArray {	
	
	@Test
	public void testsortArray(){
		SortArray sa = new SortArray();
		int[] array = { 3, 9, 0, 2, 7};
		int[] expected = {0,2,3,7,9};
		List actual = sa.sortArray(array);				
		Assert.assertEquals(actual.toArray(), expected);
	}

}
