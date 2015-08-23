package com.main;

public class PingPong {
	public String findPingPong(int x){
		
		if(x%3 == 0 && x%5 == 0){
			System.out.println("PingPong");
			return "PingPong";
		} else if (x%3 ==0){
			return "Ping";
		}else if(x%5 == 0){
			return "Pong";
		}else{
			return ""+x;
		}			
	}	
}
