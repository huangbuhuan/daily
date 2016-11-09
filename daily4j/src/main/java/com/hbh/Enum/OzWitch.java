package com.hbh.Enum;

public enum OzWitch {
	WEST("west"),
	NORTH("north"),
	EAST("east"),
	SOUTH("south");
	
	private String description;
	
	private OzWitch(String str) {
		this.description = str;
	}
	
	public String getDescription() {
		return this.description;
	}
}
