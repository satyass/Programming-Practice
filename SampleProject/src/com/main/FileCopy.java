package com.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	
	public boolean copyFile(String inputFile, String outputFile){
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
		
			in = new FileInputStream (inputFile);
			out = new FileOutputStream(outputFile);
			int c = in.read();
			while ( c != -1){
				out.write(c);
				c = in.read();
				
			}
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally{
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileCopy fc = new FileCopy();
		String inputFile = "C:\\UmaTest\\ResumeNotesSatya.docx";
		String outputFile = "C:\\UmaTest\\MyTestOut.docx";
		
		boolean isCopied = fc.copyFile(inputFile, outputFile);
		
		System.out.println("isCOpied="+isCopied);
		
		
		

	}

}
