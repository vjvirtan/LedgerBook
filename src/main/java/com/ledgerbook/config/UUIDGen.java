package com.ledgerbook.config;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
public abstract class UUIDGen implements Persistable<String> {

	@Id
	private String id;

	public UUIDGen() {
		this.id = UUID.randomUUID().toString();
	}

	@Override
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonIgnore
	@Override
	public boolean isNew() {
		return false;
	}
}