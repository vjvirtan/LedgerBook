package com.ledgerbook.dto;

import com.ledgerbook.config.UserDao;

public class CreatedModifiedDto {
	private String id;
	private String created;
	private String modified;
	private UserDao creator;
	private UserDao lastModifier;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public UserDao getCreator() {
		return creator;
	}

	public void setCreator(UserDao creator) {
		this.creator = creator;
	}

	public UserDao getLastModifier() {
		return lastModifier;
	}

	public void setLastModifier(UserDao lastModifier) {
		this.lastModifier = lastModifier;
	}

}
