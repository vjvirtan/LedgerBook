package com.ledgerbook.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

// importing from 
public class AccountNumbersDto {
	@NotNull
	@Length(max = 6)
	private String number;
	@NotNull
	private String name;
	private String description;
	private String accountLevelId;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public String getAccountLevelId() {
		return accountLevelId;
	}

	public void setAccountLevelId(String accountLevelId) {
		this.accountLevelId = accountLevelId;
	}

}
