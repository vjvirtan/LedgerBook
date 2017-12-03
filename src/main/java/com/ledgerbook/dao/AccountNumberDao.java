package com.ledgerbook.dao;

//INFO: this is ledger book numbers like 
import org.springframework.data.mongodb.core.mapping.Document;

import com.ledgerbook.config.CreatedModifiedStamp;

@SuppressWarnings("serial")
@Document
public class AccountNumberDao extends CreatedModifiedStamp {

	private String number;

	private String name;
	private String description;
	private AccountLevelDao accountLevel; // INFO: Show level and positon on
											// reports

	public AccountNumberDao(String number, String name, String description, AccountLevelDao accountLevel) {
		super();
		this.number = number;
		this.name = name;
		this.description = description;
		this.accountLevel = accountLevel;
		super.setCreatorData();

	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return this.number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
