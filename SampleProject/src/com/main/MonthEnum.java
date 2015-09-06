package com.main;

public class MonthEnum {
	
	public enum months { JAN, FEB, MAR, APR, MAY,JUN, JUL, AUG, SEP, OCT, NOV, DEC};
	

	public static void main(String[] args) {
		
		months[] m = months.values();		
		for(int i=0; i< m.length;i++){
			System.out.println(m[i]);
		}

	}

}
