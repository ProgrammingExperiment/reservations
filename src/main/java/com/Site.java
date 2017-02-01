package com;

public class Site {
	 private String name;
	 private long id;
	
	//Constructor
	// it initiates every new 'Site' you create.
	public Site(){
		
	}
	 public Site( long id, String name){
		this.name =name;
		this	.id = id;		
	}
	
	public String getName(){
		return this.name;
	}
	
	public long getId(){
		return this.id;
	}
	
	public void setName(String name){
		 this.name = name;
	}
	
	public void setId(long id){
		 this.id=id;
	}}
