package com.api.models;

public class Member {
	private long Id;
	private String name;
	private String middleInitial;
	private String lastName;
	private String address;
	private String phone1;
	private String phone2;
	private String email;
	
	public Member(long id, String name ,String middleInitial, String lastName, String homeAddress, String homePhone, String cellPhone, String email){
		this.Id = id;
		this.name = name;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.address = homeAddress;
		this.phone1 = homePhone;
		this.phone2 = cellPhone;
		this.email =  email;
}
	
		public long getId(){
		return this.Id;
	}
	public String getname(){
		return this.name;
	}
	public String getmiddleInitial(){
		return this.middleInitial;
	}
	public String getlastName(){
		return this.lastName;
	}
	public String getphone1(){
		return this.phone1;
	}
	public String getphone2(){
		return this.phone2;
	}
	public String getemail(){
		return this.email;
	}
	
	
		
}
