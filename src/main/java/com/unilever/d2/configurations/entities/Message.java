/*******************************************************************************
 * Copyright (c) 2015 Unilever.
 *
 * All rights reserved. Do not distribute any of these files without prior consent from Unilever.
 *
 * Contributors:
 *     Publicis.Sapient - Configuration auther and implementation
 *******************************************************************************/
package com.unilever.d2.configurations.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author ssi234
 * Created Date Jul 13, 2016
 * com.unilever.d2.configuration.domain
 * Message
 */
@Entity
public class Message implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@NotEmpty(message = "Anand is required.")
	@Column(nullable = false)
	private String text;

	@NotEmpty(message = "Summary is required.")
	@Column(nullable = false)
	private String summary;

	
	@Column(nullable = false)
	private Calendar created = Calendar.getInstance();

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getCreated() {
		return this.created;
	}

	public void setCreated(Calendar created) {
		this.created = created;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
}