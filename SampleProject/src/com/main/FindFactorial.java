package com.main;

public class FindFactorial {
	public int calculateFactorial(int number){
		int factorial=1;
		for(int i=1; i<= number;i++){
			factorial = factorial *i;		
		}
		System.out.println("Factorial="+ factorial);
		return factorial;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindFactorial ff = new FindFactorial();
		int output = ff.calculateFactorial(5);

	}

}
