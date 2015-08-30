package com.main;

public class ChangeOutputString {
	public String changingOutputString (String inputStr ){
		String[ ] words = inputStr.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i=0; i< words.length;i++){
			sb.append(words[i]);
			sb.append(i+1);
		}
		return sb.toString();	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeOutputString ch = new ChangeOutputString();
		ch.changingOutputString("Life is beautiful");

	}

}
