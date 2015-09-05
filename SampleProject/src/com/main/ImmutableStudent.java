package com.main;

public final class ImmutableStudent {
	
	final int id;
	final String name;
	
	public ImmutableStudent(int id, String name){
		this.id = id;
		this.name = name;		
	}

	public static void main(String[] args) {		
		ImmutableStudent is = new ImmutableStudent(10, "Satya");
		
		System.out.println("Id = "+is.id);
		System.out.println("Name ="+is.name);
		
		ImmutableStudent is1 = new ImmutableStudent(20, "Uma");
		
		
	}

}
