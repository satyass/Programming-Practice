package com.main;

public class StringReversal {
	public String reverseString(String origstring){
		char[]chars = origstring.toCharArray();
		StringBuffer reversedString = new StringBuffer();
		for (int i= chars.length-1;i>=0;i--){
			reversedString.append(chars[i]);
			 
		}
		return reversedString.toString();
	}
		public String reverseString2(String origstring){			
			char[] chars = origstring.toCharArray();
			char[] reverseChars = new char[chars.length];
			int m=0;
			for (int i= chars.length-1;i>=0;i--){
				 reverseChars[m] = chars[i];
				   m++;
				
			}
			
			  return String.copyValueOf(reverseChars);	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
