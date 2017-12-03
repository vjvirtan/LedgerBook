package com.ledgerbook.dao;

import org.springframework.data.mongodb.core.mapping.Document;

import com.ledgerbook.config.CreatedModifiedStamp;

@Document
public class CostPoolDao extends CreatedModifiedStamp {
	private int number;
	private String name;

	public CostPoolDao(int number, String name) {
		super();
		this.number = number;
		this.name = name;
		super.setCreatorData();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * TODO: implement following to business system private Organisation
	 * organisation; private Customer customer;
	 * 
	 */
}
