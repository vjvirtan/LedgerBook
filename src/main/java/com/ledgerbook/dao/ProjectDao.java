package com.ledgerbook.dao;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.ledgerbook.config.CreatedModifiedStamp;

@Document
public class ProjectDao extends CreatedModifiedStamp {

	private String name;
	private Date startDate;
	private Date endDate;

	/*
	 * INFO implement to your own system private List<Organisation>
	 * organisation; private List<User> user;
	 * 
	 */

	public ProjectDao(String name, Date startDate, Date endDate) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		super.setCreatorData();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
