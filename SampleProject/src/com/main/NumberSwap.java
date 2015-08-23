package com.main;

public class NumberSwap {
	public String  swapNumberUsingTemp(int x, int y){
		System.out.println("before Swap");
		System.out.println("x="+x);
		System.out.println("y="+y);
		int temp = 0;
		temp= x;
		x = y;
		y = temp;
		System.out.println("After Swap");
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		return x+","+y;
		
	}
	public String swapNumberNotUsingTemp(int x, int y){
		System.out.println("before Swap");
		System.out.println("x="+x);
		System.out.println("y="+y);
		x= x+y;
		y= x-y;
		x= x-y;
		
		System.out.println("After Swap");
		System.out.println("x="+x);
		System.out.println("y="+y);
		return x+","+y;
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberSwap swap = new NumberSwap();
		swap.swapNumberUsingTemp(5, 10);
		NumberSwap sw = new NumberSwap();
		swap.swapNumberNotUsingTemp(5, 10);


	}

}
