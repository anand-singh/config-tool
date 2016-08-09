/*******************************************************************************
 * Copyright (c) 2015 Unilever.
 *
 * All rights reserved. Do not distribute any of these files without prior consent from Unilever.
 *
 * Contributors:
 *     Publicis.Sapient - Configuration auther and implementation
 *******************************************************************************/
package com.unilever.d2.configurations.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.unilever.d2.configurations.entities.Message;
import com.unilever.d2.configurations.repository.MessageRepository;

/**
 * @author ssi234
 * Created Date Jul 13, 2016
 * com.unilever.d2.configuration.controller
 * MessageController
 */
@Controller
@RequestMapping("/")
public class MessageController {
	private final MessageRepository messageRepository;

	@Autowired
	public MessageController(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}

	@RequestMapping
	public ModelAndView list() {
		Iterable<Message> messages = this.messageRepository.findAll();
		return new ModelAndView("messages/list", "messages", messages);
	}

	@RequestMapping("{id}")
	public ModelAndView view(@PathVariable("id") Long id) {
		System.out.println("Satya Pal Singh    " + id);
		Message message = this.messageRepository.findOne(id);
		return new ModelAndView("messages/view", "message", message);
	}

	@RequestMapping(params = "form", method = RequestMethod.GET)
	public String createForm(@ModelAttribute Message message) {
		return "messages/form";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView create(@Valid Message message, BindingResult result,
			RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return new ModelAndView("messages/form", "formErrors", result.getAllErrors());
		}
		message = this.messageRepository.save(message);
		redirect.addFlashAttribute("globalMessage", "Successfully created a new message");
		return new ModelAndView("redirect:/{message.id}", "message.id", message.getId());
	}

	@RequestMapping("foo")
	public String foo() {
		throw new RuntimeException("Expected exception in controller");
	}

	@RequestMapping(value = "delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		this.messageRepository.delete(id);
		Iterable<Message> messages = this.messageRepository.findAll();
		return new ModelAndView("messages/list", "messages", messages);
	}

	@RequestMapping(value = "modify/{id}", method = RequestMethod.GET)
	public ModelAndView modifyForm(@PathVariable("id") Message message) {
		return new ModelAndView("messages/form", "message", message);
	}
}