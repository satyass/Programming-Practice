package com.main;

public class EachWordReverse {
	public String reverseString(String origstring){
		String [] words = origstring.split(" ");
		//StringReversal reveral = new StringReversal();
		
		StringBuffer sbr = new StringBuffer();		
		for ( int i= 0; i< words.length;i++ ){			
			//words[i] = reveral.reverseString(words[i]);
			words[i] = new StringBuffer().append((words[i])).reverse().toString();
			System.out.println(words[i] );
			sbr.append(words[i]).append(" ");						
		}		
		return sbr.toString();		 
	}

	public static void main(String[] args) {
		EachWordReverse er = new EachWordReverse();
		
		String output = er.reverseString("This is incredible");
		
		System.out.println(output);

	}

}
