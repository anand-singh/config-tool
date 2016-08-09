/*******************************************************************************
 * Copyright (c) 2015 Unilever.
 *
 * All rights reserved. Do not distribute any of these files without prior consent from Unilever.
 *
 * Contributors:
 *     Publicis.Sapient - Configuration auther and implementation
 *******************************************************************************/
package com.unilever.d2.configurations.domains;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author ssi234 Created Date Jul 29, 2016 com.unilever.d2.configurations
 *         ConfigTree
 */
public class ConfigTreeDomain implements Serializable {

	private static final long serialVersionUID = 7055364185127020009L;
	private Long id;
	private Long parentId;
	private Integer nodeLevel;
	private String root;
	private String component;
	private String environment;
	private String brand;
	private String locale;
	private String entity;
	private Date createdDate;
	private Date updatedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getNodeLevel() {
		return nodeLevel;
	}

	public void setNodeLevel(Integer nodeLevel) {
		this.nodeLevel = nodeLevel;
	}

	@NotEmpty(message = "Root is required.")
	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	@NotEmpty(message = "Component is required.")
	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	@NotEmpty(message = "Environment is required.")
	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	@NotEmpty(message = "Brand is required.")
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@NotEmpty(message = "Locale is required.")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	@NotEmpty(message = "Entity is required.")
	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}