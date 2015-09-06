package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.CountWords;

public class TestCountWords {
	
	@Test
	public void testPositiveWordCount(){
		CountWords cw = new CountWords();
		int count = cw.countWordsInFile("C:\\JavaEx\\words.txt");
		Assert.assertEquals(count,4);
	}
	@Test
	public void testNagativeWordCount(){
		CountWords cw = new CountWords();
		int count = cw.countWordsInFile("C:\\JavaEx\\words1.txt");
		Assert.assertEquals(count,0);
	}

}
