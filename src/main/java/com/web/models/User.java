package com.web.models;

public class User {
	private String username;
	private long id;

	public User() {

	}
	public User(long id, String username) {
		this.username=username;
		this.id	= id;
	}

	public User(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
