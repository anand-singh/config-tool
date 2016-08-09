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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author ssi234
 * Created Date Jul 14, 2016
 * com.unilever.d2.configuration.domain
 * ConfigTree
 */
@Entity
@Table(name="[Cnf.ConfigTree]")
public class ConfigTree implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID", length = 10)
	private Long id;
	
	@Column(name = "PARENT_ID", nullable = false)
	private Long parentId;
	
	@Column(name = "NODE_LEVEL", nullable = false)
	private Integer nodeLevel;
	
	@NotEmpty(message = "Anand1 is required.")
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ROOT")
	private RootMaster rootMaster;
	
	@NotEmpty(message = "Anand2 is required.")
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "COMPONENT")
	private ComponentMaster componentMaster;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ENVIRONMENT")
	private Environment environment;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BRAND")
	private BrandMaster brandMaster;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LOCALE")
	private LocaleMaster localeMaster;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ENTITY")
	private EntityMaster entityMaster;
	
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

	public RootMaster getRootMaster() {
		return rootMaster;
	}

	public void setRootMaster(RootMaster rootMaster) {
		this.rootMaster = rootMaster;
	}

	public ComponentMaster getComponentMaster() {
		return componentMaster;
	}

	public void setComponentMaster(ComponentMaster componentMaster) {
		this.componentMaster = componentMaster;
	}

	public Environment getEnvironment() {
		return environment;
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public BrandMaster getBrandMaster() {
		return brandMaster;
	}

	public void setBrandMaster(BrandMaster brandMaster) {
		this.brandMaster = brandMaster;
	}

	public LocaleMaster getLocaleMaster() {
		return localeMaster;
	}

	public void setLocaleMaster(LocaleMaster localeMaster) {
		this.localeMaster = localeMaster;
	}

	public EntityMaster getEntityMaster() {
		return entityMaster;
	}

	public void setEntityMaster(EntityMaster entityMaster) {
		this.entityMaster = entityMaster;
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

	@Override
	public String toString() {
		return "ConfigTree [id=" + id + ", parentId=" + parentId + ", nodeLevel=" + nodeLevel + ", rootMaster="
				+ rootMaster + ", componentMaster=" + componentMaster + ", environment=" + environment
				+ ", brandMaster=" + brandMaster + ", localeMaster=" + localeMaster + ", entityMaster=" + entityMaster
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
}