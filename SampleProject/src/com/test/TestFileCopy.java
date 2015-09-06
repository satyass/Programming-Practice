package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.ChangeOutputString;
import com.main.FileCopy;

public class TestFileCopy {
	
	@Test
	public void testPositiveCopyFile(){
		FileCopy fc = new FileCopy();
		String inputFile = "C:\\UmaTest\\ResumeNotesSatya.docx";
		String outputFile = "C:\\UmaTest\\MyTestOut.docx";		
		boolean isCopied = fc.copyFile(inputFile, outputFile);		
		Assert.assertEquals(isCopied,true);
	}
	
	@Test
	public void testNegativeCopyFile(){
		FileCopy fc = new FileCopy();
		String inputFile = "C:\\UmaTest\\ResumeNotesSatya1.docx";
		String outputFile = "C:\\UmaTest\\MyTestOut.docx";		
		boolean isCopied = fc.copyFile(inputFile, outputFile);		
		Assert.assertEquals(isCopied,false);
	}

}
