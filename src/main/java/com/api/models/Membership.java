package com.api.models;

public class Membership {
	private long Id;
	private String past;
	private String future;

	public Membership() {

	}

	public Membership(long id, String past, String future) {
		this.Id = id;
		this.past = past;
		this.future = future;
	}

	public long getId() {
		return this.Id;
	}

	public String getPast() {
		return this.past;
	}

	public String getFuture() {
		return this.future;
	}

	public String getMembership1() {
		// TODO Auto-generated method stub
		return null;
	}
}
