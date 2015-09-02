package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArray {
	
	public static List sortArray(int[] array1){		
		List list = new ArrayList();
		for(int i =0; i < array1.length; i++){
			list.add(array1[i]);
		}
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = { 3, 9, 0, 2, 7};
		List output = sortArray(array);
		System.out.println("Sorted Array ="+output.toString());

	}

}
