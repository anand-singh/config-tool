package com.unilever.d2.configurations.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.unilever.d2.configurations.repository.BrandMasterRepository;
import com.unilever.d2.configurations.repository.ComponentMasterRepository;
import com.unilever.d2.configurations.repository.EntityMasterRepository;
import com.unilever.d2.configurations.repository.EnvironmentRepository;
import com.unilever.d2.configurations.repository.KeyMasterRepository;
import com.unilever.d2.configurations.repository.LocaleMasterRepository;
import com.unilever.d2.configurations.repository.RootMasterRepository;
import com.unilever.d2.configurations.service.MasterDataService;

public class MasterDataServiceImpl implements MasterDataService {

	@Autowired
	private RootMasterRepository rootMasterRepository;

	@Autowired
	private ComponentMasterRepository compMasterRepository;

	@Autowired
	private BrandMasterRepository brandMasterRepository;

	@Autowired
	private EntityMasterRepository entityMasterRepository;

	@Autowired
	private KeyMasterRepository keyMasterRepository;

	@Autowired
	private LocaleMasterRepository localeMasterRepository;

	@Autowired
	private EnvironmentRepository environmentRepository;

}
