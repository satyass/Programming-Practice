package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.PingPong;

public class TestPingPong {
	
	@Test
	public void testPingPong(){
		PingPong pp =new PingPong();
		String output= pp.findPingPong(15);
		Assert.assertEquals(output, "PingPong");
	}
	@Test
	public void testPing(){
		PingPong pp =new PingPong();
		String output= pp.findPingPong(18);
		Assert.assertEquals(output, "Ping");
	}
	@Test
	public void testPong(){
		PingPong pp =new PingPong();
		String output= pp.findPingPong(20);
		Assert.assertEquals(output, "Pong");
	}
	@Test
	public void testneitherDivisible(){
		PingPong pp =new PingPong();
		String output= pp.findPingPong(26);
		Assert.assertEquals(output, "26");
	}

}
