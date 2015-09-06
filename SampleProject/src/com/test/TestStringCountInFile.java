package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.StringCountInFile;

public class TestStringCountInFile {
	
	@Test
	public void testPositiveWordCount(){
		StringCountInFile scf = new StringCountInFile();
		int count = scf.countWordOccurences("C:\\JavaEx\\WordCount.txt", "method");	
		Assert.assertEquals(count,3);
	}
	@Test
	public void testNegativeWordCount(){
		StringCountInFile fc = new StringCountInFile();
		StringCountInFile scf = new StringCountInFile();
		int count = scf.countWordOccurences("C:\\JavaEx\\WordCount1.txt", "method");	
		Assert.assertEquals(count,0);
	}

}
