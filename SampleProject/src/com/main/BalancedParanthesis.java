package com.main;

public class BalancedParanthesis {

	public boolean isItBalancedParanthesis(String astring) {
		char[] chars = astring.toCharArray();
		int counter = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '(') {
				counter++;
			} else if (chars[i] == ')') {
				counter--;

			}

		}
		if (counter == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		BalancedParanthesis bps = new BalancedParanthesis();
		String astring = "(This (a+b))";
		boolean value = bps.isItBalancedParanthesis(astring);
		System.out.println("Value ="+value);
		
	}

}
