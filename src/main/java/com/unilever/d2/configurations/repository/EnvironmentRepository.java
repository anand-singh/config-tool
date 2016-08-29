/*******************************************************************************
 * Copyright (c) 2015 Unilever.
 *
 * All rights reserved. Do not distribute any of these files without prior consent from Unilever.
 *
 * Contributors:
 *     Publicis.Sapient - Configuration auther and implementation
 *******************************************************************************/
package com.unilever.d2.configurations.repository;

import org.springframework.data.repository.CrudRepository;

import com.unilever.d2.configurations.entities.Environment;

/**
 * @author ssi234
 * Created Date Aug 9, 2016
 * com.unilever.d2.configuration.repository
 * EnvironmentMasterRepository
 */
public interface EnvironmentRepository extends CrudRepository<Environment, String> {

}
