package com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
	
	public List findDuplicates(List list) {		
		Set s = new HashSet();
		List duplicatesList = new ArrayList();
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			if(!s.add(element)) {
				duplicatesList.add(element);
			}			
		}
		return duplicatesList;
		
	}
	public static void main(String[] args) {
		FindDuplicates fd = new FindDuplicates();
		List list = new ArrayList();
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(5);
		
		List duplicatesList = fd.findDuplicates(list);
		System.out.println(duplicatesList);
		
	}
	
	

}
