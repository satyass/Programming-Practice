package com.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringCountInFile {
	
	public int countWordOccurences(String file, String inputWord){
		int counter =0;
		Scanner sc = null;
		try {
			sc = new Scanner(new File(file));
			while(sc.hasNext()){
				String word = sc.next();
				System.out.println(word);
				if(word.equalsIgnoreCase(inputWord)) {
					counter++;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			counter = 0;
		}				
		
		return counter;
		
	}

	public static void main(String[] args) {
		StringCountInFile scf = new StringCountInFile();
		int count = scf.countWordOccurences("C:\\JavaEx\\WordCount.txt", "method");
		System.out.println("Word count="+count);

	}

}
