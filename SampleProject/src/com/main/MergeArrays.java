package com.main;

import java.util.ArrayList;
import java.util.List;

public class MergeArrays {
	public List toMerge2Arrays (int[] arr1, int[] arr2){
		List mergeArrays = new ArrayList();
		for(int i=0; i<arr1.length; i++){
			mergeArrays.add(arr1[i]);
		}
		for (int j=0; j< arr2.length;j++){
			mergeArrays.add(arr2[j]);
			
		}
		return mergeArrays;
	}

	public static void main(String[] args) {
		 MergeArrays ma = new  MergeArrays();
		 int[]arr1 = {2,4,6,8};
		 int[]arr2 = {5,10,15,20};
		 List result = ma.toMerge2Arrays(arr1, arr2);
		 System.out.println("Result ="+result);
		

	}

}
