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
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author ssi234
 * Created Date Jul 14, 2016
 * com.unilever.d2.configuration.domain
 * TreeNodeKeys
 */
@Entity
@Table(name="[Cnf.TreeNodeKeys]")
public class TreeNodeKeys implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TREE_NODE_ID")
	private ConfigTree configTree;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "KEY_NAME")
	private KeyMaster keyMaster;
	
	@Column(name = "KEY_VALUE", nullable = true)
	private String keyValue;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE", nullable = false)
	private Date createdDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_DATE", nullable = false)
	private Date updatedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ConfigTree getConfigTree() {
		return configTree;
	}

	public void setConfigTree(ConfigTree configTree) {
		this.configTree = configTree;
	}

	public KeyMaster getKeyMaster() {
		return keyMaster;
	}

	public void setKeyMaster(KeyMaster keyMaster) {
		this.keyMaster = keyMaster;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
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