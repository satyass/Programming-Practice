package com.main;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsIn2Arrays {
	public List findCommonElements(int[]array1, int[]array2){
		System.out.println("Common Elements are :");
		List commonElements   = new ArrayList();		
		for (int i=0; i<array1.length; i++){
			for (int j=0; j<array2.length; j++){
				if (array1[i] == array2[j]){
					//System.out.println( array2[j]);
					commonElements.add(array2[j]);					
				}
			}
			
		}
		return commonElements;
	}

	public static void main(String[] args) {
		CommonElementsIn2Arrays ce = new CommonElementsIn2Arrays();
		int[] array1 = {1,2,3,4,5,6,7,8};
		int[] array2 = {4,5,6,7,8,9,10,11};
		
		List result = ce.findCommonElements(array1, array2);
		
		System.out.println("Result="+result);
		

	}

}
