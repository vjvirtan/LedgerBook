package com.ledgerbook.dao;

import org.springframework.data.mongodb.core.mapping.Document;

import com.ledgerbook.config.CreatedModifiedStamp;

@SuppressWarnings("serial")
@Document
public class AccountTransactionRowDao extends CreatedModifiedStamp {
	private String accountNumber;
	private String definition;
	private String ammount;
	private String documentDate;
	private double tax;
	private ProjectDao project;
	private CostPoolDao costPool;

	public AccountTransactionRowDao(String accountNumber, String definition, String ammount, String documentDate,
			double tax, ProjectDao project, CostPoolDao costPool) {
		super();
		this.accountNumber = accountNumber;
		this.definition = definition;
		this.ammount = ammount;
		this.documentDate = documentDate;
		this.tax = tax;
		this.project = project;
		this.costPool = costPool;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getAmmount() {
		return ammount;
	}

	public void setAmmount(String ammount) {
		this.ammount = ammount;
	}

	public String getDocumentDate() {
		return documentDate;
	}

	public void setDocumentDate(String documentDate) {
		this.documentDate = documentDate;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public ProjectDao getProject() {
		return project;
	}

	public void setProject(ProjectDao project) {
		this.project = project;
	}

	public CostPoolDao getCostPool() {
		return costPool;
	}

	public void setCostPool(CostPoolDao costPool) {
		this.costPool = costPool;
	}

}
