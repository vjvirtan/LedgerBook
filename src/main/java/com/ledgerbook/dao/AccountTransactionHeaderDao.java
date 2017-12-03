package com.ledgerbook.dao;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.ledgerbook.config.CreatedModifiedStamp;

@Document
public class AccountTransactionHeaderDao extends CreatedModifiedStamp {

	private String description;
	private String note;
	private List<CostPoolDao> costPool;
	private List<ProjectDao> project;
	private List<AttachmentDao> attachement;
	private List<AccountTransactionRowDao> transactionRows;
	// TODO: Connect this to your business system
	// private List<BusinessCounterparty> counterpartyId;
	// private SystemUser creator;
	// private List <SystemUser> modifier;

	public AccountTransactionHeaderDao(String description, String note, List<CostPoolDao> costPool,
			List<ProjectDao> project, List<AttachmentDao> attachement) {
		super();

		this.description = description;
		this.note = note;
		this.costPool = costPool;
		this.project = project;
		// super.setCreatorData();
	}

	public List<AttachmentDao> getAttachement() {
		return attachement;
	}

	public void setAttachement(List<AttachmentDao> attachement) {
		this.attachement = attachement;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<CostPoolDao> getCostPool() {
		return costPool;
	}

	public void setCostPool(List<CostPoolDao> costPool) {
		this.costPool = costPool;
	}

	public List<ProjectDao> getProject() {
		return project;
	}

	public void setProject(List<ProjectDao> project) {
		this.project = project;
	}

}
