package com.main;

import java.util.ArrayList;
import java.util.List;

public class CreateListAndSearch {

	public List createList(){		
		List list = new ArrayList();
		list.add("Ram");
		list.add(54);
		list.add(1,45);
		return list;		
	}
	
	public boolean seachElement(List list, Object element){
		if(list.indexOf(element) != -1){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		ListExample le = new ListExample();
		//to create List
		List list = le.createList();
		System.out.println(" LIst = "+list);
		//to find for element
		boolean isFound = le.seachElement(list, "Ram");
		System.out.println("Element found = "+isFound);
	}

}
