package com.main;

public class NullPointerExp {
	public static boolean throwNullPointer(String str) {
		try {
			str.split("");
			System.out.println("print split string=" + str);
		} catch (NullPointerException ex) {
			System.out.println(" Inside null pointer");
			return true;

		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println("return value=" + throwNullPointer("test"));

	}

}
