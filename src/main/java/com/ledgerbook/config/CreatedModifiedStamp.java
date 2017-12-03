package com.ledgerbook.config;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ledgerbook.repository.UserRepository;

// TODO: clean this

@SuppressWarnings("serial")
public abstract class CreatedModifiedStamp extends UUIDGen {
	@CreatedDate
	private Date created;

	@LastModifiedDate
	private Date modified;
	// FIX: Change to UserDao -> use dto in rest
	private String creator;
	private String lastModifier;

	protected CreatedModifiedStamp() {
		setCreated();
		setCreator();
	}

	protected void setCreatorData() {
		setCreated();
		setCreator();
	}

	public void setModifierData() {
		setLastModifier(); // FIX most probably null pointer err.
							// TODO: Principal method
		setModified();
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated() {
		this.created = new Date();
	}

	public Date getModified() {
		return modified;
	}

	public void setModified() {
		this.modified = new Date();
	}

	public String getCreator() {
		return creator;
	}

	// FIX: Use Principal production. only testing
	public void setCreator() {

		UserRepository userRepo = null;
		try {
			this.creator = "testaaja";
		} catch (Exception e) {

		}

	}

	/*
	 * TODO: implement Spring security public void setCreator(Principal
	 * principal) { this.creator = principal.getName(); }
	 */
	public String getLastModifier() {
		return lastModifier;
	}

	public void setLastModifier() {
		this.lastModifier = "muokkaaja";
	}

	@Override
	@JsonIgnore
	public boolean isNew() {
		return false;
	}

}
