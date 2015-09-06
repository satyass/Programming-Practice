package com.main;

import java.util.ArrayList;
import java.util.List;

public class MergeCollectionSeries {

	public static List mergeCollections( List list1, List list2){
		List mergedList = new ArrayList();
		int m = list1.size();
		int n = list2.size();
		int j = m > n? m:n;		
		for(int i=0; i< j; i++){
			if(i < m)  {
				mergedList.add(list1.get(i));				
			}
			if(i < n)  {
				mergedList.add(list2.get(i));				
			}
		}
		return mergedList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		list1.add("a1");
		list1.add("a2");
		list1.add("a3");
		list2.add("b1");
		list2.add("b2");
		list2.add("b3");
		list2.add("b4");		
		List list = mergeCollections(list1,list2);
		System.out.println(list);

	}

}
