package com.api.models;

public class Inventory {
	private long Id;
	private String type;
	private String code;
	private String description;

	public Inventory(long id, String type, String code, String desc) {
		this.Id = id;
		this.type = type;
		this.code = code;
		this.description = desc;
	}

	public long getId() {
		return this.Id;
	}

	public String getType() {
		return this.type;
	}

	public String getCode() {
		return this.code;
	}

	public String getDescription() {
		return this.description;
	}

}
