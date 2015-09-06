package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	
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
	
	public void printElements(List list){
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			System.out.println(element);
		}
		
	}
	public void printReverse(List list){
		Object[] elements = list.toArray();
		for(int i= elements.length-1; i >=0;i--){
			System.out.println(elements[i]);
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
		//print elements
		le.printElements(list);
		//print reverse
		le.printReverse(list);

	}

}
