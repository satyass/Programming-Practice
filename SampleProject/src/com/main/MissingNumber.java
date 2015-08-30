package com.main;
public class MissingNumber{

public int findMissingNumber(int[] inputValues){
	  
	  int n = inputValues.length+1;
	  int expectedSum = n*(n+1)/2;
	  int actualSum = 0;
	  for(int i =0; i< inputValues.length; i++ ){
	   actualSum = actualSum + inputValues[i];
	  }
	  
	  int missingNumber = expectedSum - actualSum;
	  
	  System.out.println("Missing Number is:"+missingNumber);
	  return missingNumber;
	  
	  
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
