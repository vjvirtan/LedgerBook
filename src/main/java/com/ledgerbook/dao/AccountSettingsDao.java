package com.ledgerbook.dao;

import org.springframework.data.mongodb.core.mapping.Document;

import com.ledgerbook.config.CreatedModifiedStamp;

@Document
public class AccountSettingsDao extends CreatedModifiedStamp {
	private boolean addTax; // INFO: do tax include price or not. TRUE is price
							// is with out tax and will be added
	private boolean useTax; // INFO: if FALSE no Tax is used anywhere

	public AccountSettingsDao(boolean addTax, boolean useTax) {
		super();
		this.addTax = addTax;
		this.useTax = useTax;
		super.setCreatorData();
	}

	public boolean isAddTax() {
		return addTax;
	}

	public void setAddTax(boolean addTax) {
		this.addTax = addTax;
	}

	public boolean isUseTax() {
		return useTax;
	}

	public void setUseTax(boolean useTax) {
		this.useTax = useTax;
	}

}
