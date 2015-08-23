package com.main;

public class Fibonacci {
	public int findFibonacci(int number){
		int f1=0; int f2 =0;
		int fibonacci = 1;
		
		for(int i=0; i< number;i++){
			
			f1 = f2;
			f2 = fibonacci;
			fibonacci= f1+f2;
			System.out.print(fibonacci+" " );
		}
		return fibonacci;
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fib = new Fibonacci();
		int fb=fib.findFibonacci(9);
		System.out.println("Fibonacci ="+ fb);
		
		
		

	}

}
