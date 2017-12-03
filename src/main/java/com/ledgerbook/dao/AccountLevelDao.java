package com.ledgerbook.dao;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import com.ledgerbook.config.CreatedModifiedStamp;

@Document
public class AccountLevelDao extends CreatedModifiedStamp {

	@NotNull
	private String level; // INFO: Method parse this by level. You can use
							// letters and numbers.
							// one char is main level. Add characters to depth
	@NotNull // levels.
	private String name; // INFO: Printed to sheet
	private boolean result; // false is balance
	private int balance; // INFO: 0 is liabilities and 1 is assets
	private String description;

	public AccountLevelDao(String level, String name, String description) {
		super();
		this.level = level;
		this.name = name;
		this.description = description;
		super.setCreatorData();
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
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
