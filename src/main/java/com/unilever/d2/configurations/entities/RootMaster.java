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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ssi234
 * Created Date Jul 13, 2016
 * com.unilever.d2.configuration.domain
 * RootMaster
 */
@Entity
@Table(name="[Cnf.RootMaster]")
public class RootMaster implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", length = 10)
	private String id;
	
	@Column(name = "DESCRIPTION", nullable = true, length = 50)
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "RootMaster [id=" + id + ", description=" + description + "]";
	}
}