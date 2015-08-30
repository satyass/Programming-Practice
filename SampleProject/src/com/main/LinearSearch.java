package com.main;

public class LinearSearch {
	public int findMatchingNumber(int[]inputValues, int key){
		for (int i=0; i< inputValues.length; i++){
			if (inputValues[i]==key){
				System.out.println("Matched the key at index :"+i);
			}
		}
		return key;
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
