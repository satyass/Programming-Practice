package com.main;

public class HandleNullPointer {
	
	public void throwNullPointerExp() throws Exception {		
		String s = null;
		s.split("");		
	}
	
	public void catchNullPointerExcpetion(){
		try {
			this.throwNullPointerExp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		HandleNullPointer hn = new HandleNullPointer();
		hn.catchNullPointerExcpetion();
	}

}
