package com.test;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.MergeArrays;

public class TestMergeArrays {
	@Test
	public void testtoMerge2Arrays(){
		MergeArrays ma = new MergeArrays();
		int[]arr1 = {2,4,};
		 int[]arr2 = {5,10,};
		 List expected = new ArrayList();
		 expected.add(2);
		 expected.add(4);
		 expected.add(5);
		 expected.add(10);
		 List actual = ma.toMerge2Arrays(arr1, arr2);
		 Assert.assertEquals(actual, expected);
	}
	

}
