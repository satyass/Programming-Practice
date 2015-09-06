package com.main;	

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class ScannerExample {
	 
	 
	 public int divideNumbersFromConsole(){
	  System.out.println("Please Enter the Dividend");
	  Scanner sc = new Scanner(System.in);
	  int dividend = sc.nextInt();
	  System.out.println("Please Enter the Divisor");	  
	  int divisor = sc.nextInt();
	  int result = dividend/divisor;
	  return result;
	 }
	 

	public static void main(String[] args) {
		
		ScannerExample sc = new ScannerExample();
		int result = sc.divideNumbersFromConsole();
		System.out.println("Result from console = "+ result);
		
		
		

	}

}
