package com.main;

public class Palindrome {
	public boolean IsItPalindrome(String OrigStr){
		StringBuffer strbfr = new StringBuffer(OrigStr);
		  strbfr.reverse();
		  String reversedString = strbfr.toString();
		  if(reversedString.equalsIgnoreCase(OrigStr)){
		   System.out.println(OrigStr+" is a Palindrome");
		   return true;
		  }else{
		   System.out.println(OrigStr+ " is not a palindrome");
		   return false; 
		  }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
