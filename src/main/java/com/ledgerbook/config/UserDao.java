package com.ledgerbook.config;

import org.springframework.data.mongodb.core.mapping.Document;

//FIX: this class is helper for test. Use user from main system when implemented

@Document
public class UserDao extends CreatedModifiedStamp {
	private String name;

	public UserDao(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserDao [name=" + name + ", getCreated()=" + getCreated() + ", getModified()=" + getModified()
				+ ", getCreator()=" + getCreator() + ", getLastModifier()=" + getLastModifier() + " id " + getId()
				+ "]";
	}

}
