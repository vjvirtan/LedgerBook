package com.ledgerbook.dao;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import com.ledgerbook.config.CreatedModifiedStamp;

@Document
public class TaxDao extends CreatedModifiedStamp {

	@NotNull
	private String name;
	@NotNull
	private double tax;
	private String taxArea;
	private String description;
	private boolean beforeTax; // True is you calculate tax from net sum. False
								// tax is calculated from sum where is included
								// another taxies;
	private int taxLevel; // this is rarely used situations where is multiple
							// taxies like onion layers. 0 is default and
							// calculated from net.

	public TaxDao(String name, double tax, String taxArea, String description, boolean beforeTax, int taxLevel) {
		super();
		this.name = name;
		this.tax = tax;
		this.taxArea = taxArea;
		this.description = description;
		this.beforeTax = beforeTax;
		this.taxLevel = taxLevel;
		super.setCreatorData();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String getTaxArea() {
		return taxArea;
	}

	public void setTaxArea(String taxArea) {
		this.taxArea = taxArea;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isBeforeTax() {
		return beforeTax;
	}

	public void setBeforeTax(boolean beforeTax) {
		this.beforeTax = beforeTax;
	}

	public int getTaxLevel() {
		return taxLevel;
	}

	public void setTaxLevel(int taxLevel) {
		this.taxLevel = taxLevel;
	}

}
