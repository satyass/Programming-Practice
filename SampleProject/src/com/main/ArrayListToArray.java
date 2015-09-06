package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListToArray {
	
	public Object[] copyArrayListToArray(List list){
		Object[] objects = list.toArray();
		return objects;
	}

	public static void main(String[] args) {
		ArrayListToArray ala = new ArrayListToArray();
		List list = new ArrayList();
		list.add(23);
		list.add("Ram");
		Object[] objs = ala.copyArrayListToArray(list);		
		System.out.println(Arrays.asList(objs));

	}

}
