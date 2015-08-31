package com.main;

public class PrintStars {
	
	public static void printStars(int numberOfLines){
		
		for(int i =0; i < numberOfLines; i++ ){
			for(int k = 0; k <= i; k++ ){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	public static void main(String[] args){
		printStars(7);
	}

}
