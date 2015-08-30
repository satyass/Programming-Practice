package com.main;

public class CommonElements {
	
	public int findCommonElement(int[] a, int[] b){
		for(int i=0; i < a.length; i++){
			for(int k =0; k < b.length; k++){
				if(a[i] == b[k]) return a[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
