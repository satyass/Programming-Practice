package com.main;

public class Maximum {
	public int findMaximumNumber(int[] inputValues){
		int max=inputValues[0];
		for(int i=0;i<inputValues.length; i++){
			if ( max < inputValues[i]){
				max=inputValues[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximum max= new Maximum();
		//int[] array = {4,8,12,16,20,24,28,32};
		int[] array = {0,4,5,-12,16,20,24,28,-32};
		int outPut = max.findMaximumNumber(array);
		System.out.println("Maximum number in an Array ="+ outPut);
		

	}

}
