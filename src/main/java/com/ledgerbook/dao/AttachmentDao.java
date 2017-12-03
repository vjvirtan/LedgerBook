package com.ledgerbook.dao;

import org.springframework.data.mongodb.core.mapping.Document;

import com.ledgerbook.config.CreatedModifiedStamp;

@SuppressWarnings("serial")
@Document
public class AttachmentDao extends CreatedModifiedStamp {

	private byte[] xFile;
	private String name;

	public byte[] getxFile() {
		return xFile;
	}

	public AttachmentDao(byte[] xFile, String name) {
		super();
		this.xFile = xFile;
		this.name = name;
	}

	public void setxFile(byte[] xFile) {
		this.xFile = xFile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
