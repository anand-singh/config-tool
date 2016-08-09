/*******************************************************************************
 * Copyright (c) 2015 Unilever.
 *
 * All rights reserved. Do not distribute any of these files without prior consent from Unilever.
 *
 * Contributors:
 *     Publicis.Sapient - Configuration auther and implementation
 *******************************************************************************/
package com.unilever.d2.configurations.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.unilever.d2.configurations.domains.ConfigTreeDomain;
import com.unilever.d2.configurations.domains.SearchOptions;
import com.unilever.d2.configurations.entities.ConfigTree;
import com.unilever.d2.configurations.entities.RootMaster;
import com.unilever.d2.configurations.repository.ConfigTreeRepository;
import com.unilever.d2.configurations.repository.RootMasterRepository;

/**
 * @author ssi234 Created Date Jul 15, 2016
 *         com.unilever.d2.configuration.controller ConfigTreeController
 */
@Controller
@RequestMapping("/configuration")
public class ConfigTreeController {

	@Autowired
	private ConfigTreeRepository configTreeRepository;
	
	@Autowired
	private RootMasterRepository rootMasterRepository;

	@RequestMapping
	public ModelAndView list() {
		Iterable<ConfigTree> configurations = configTreeRepository.findAll();
		return new ModelAndView("configs/list", "configurations", configurations);
	}

	@RequestMapping(params = "form", method = RequestMethod.GET)
	public String createForm(@ModelAttribute ConfigTreeDomain configTreeDomain, Model model) {
		List<SearchOptions> searchOptionsList = new ArrayList<>(); 
		List<String> authoritiesList = new ArrayList<>(); 
		 for (RootMaster rootMaster : rootMasterRepository.findAll()) { 
		       searchOptionsList.add(new SearchOptions(rootMaster.getId(), rootMaster.getDescription())); 
		       authoritiesList.add(rootMaster.getId()); 
		} 
		model.addAttribute("rootOptions", searchOptionsList); 
		model.addAttribute("selectedOptionsList", authoritiesList);
		return "configs/form";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView create(@Valid ConfigTreeDomain configTreeDomain, BindingResult result,
			RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return new ModelAndView("configs/form", "formErrors", result.getAllErrors());
		}
		
		//configTree = configTreeRepository.save(configTree);
		redirect.addFlashAttribute("globalMessage", "Successfully created a new message");
		return new ModelAndView("redirect:/{configTreeDomain.id}", "configTreeDomain.id", configTreeDomain.getId());
	}

	@RequestMapping("{id}")
	public ModelAndView view(@PathVariable("id") Long id) {
		ConfigTree configTree = configTreeRepository.findOne(id);
		return new ModelAndView("configs/view", "configTree", configTree);
	}
	
	@RequestMapping(value = "modify/{id}", method = RequestMethod.GET)
	public ModelAndView modifyForm(@PathVariable("id") ConfigTree configTree) {
		return new ModelAndView("configs/form", "configTree", configTree);
	}
}