package com.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWords {
	
	public int countWordsInFile(String fileName){
		int counter = 0;
		try {
			Scanner  sc = new Scanner(new File(fileName));		
			
			while(sc.hasNext()){
				String word = sc.next();
				 counter++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return counter;
	}
	
	public int countWords(String fileName){
		System.out.println("Counting Words");		
		int count = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			count = 0;
			while (line != null) {
				String[] parts = line.split(" ");
				for (String w : parts) {
					count++;
				}
				line = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {

		CountWords cw = new CountWords();
		int count = cw.countWordsInFile("C:\\JavaEx\\words.txt");
		System.out.println("Word count= "+count);
		int count1 = cw.countWords("C:\\JavaEx\\JavaExFile.rtf");
		System.out.println("Word count= "+count1);
	}

}
