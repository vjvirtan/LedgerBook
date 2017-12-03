package com.ledgerbook.dto;

import java.util.List;

import com.ledgerbook.dao.AccountTransactionRowDao;
import com.ledgerbook.dao.AttachmentDao;
import com.ledgerbook.dao.CostPoolDao;
import com.ledgerbook.dao.ProjectDao;

public class AccountTransactionsHeaderDto extends CreatedModifiedDto {
	private String id;
	private String description;
	private String note;
	private List<CostPoolDao> costPool;
	private List<ProjectDao> project;
	private List<AttachmentDao> attachement;
	private List<AccountTransactionRowDao> transactionRows;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
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

	public List<AttachmentDao> getAttachement() {
		return attachement;
	}

	public void setAttachement(List<AttachmentDao> attachement) {
		this.attachement = attachement;
	}

	public List<AccountTransactionRowDao> getTransactionRows() {
		return transactionRows;
	}

	public void setTransactionRows(List<AccountTransactionRowDao> transactionRows) {
		this.transactionRows = transactionRows;
	}

}
