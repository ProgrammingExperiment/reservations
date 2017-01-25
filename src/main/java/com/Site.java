package com;

public class Site {
	private String name;
	private long id;
	
	//Constructor
	public Site( long id, String name){
		this.name =name;
		this.id = id;		
	}
	
	public String getName(){
		return this.name;
	}
	public long getId(){
		return this.id;
	}
}
