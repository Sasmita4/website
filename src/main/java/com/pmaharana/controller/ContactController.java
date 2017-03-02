package com.pmaharana.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pmaharana.dto.ContactDto;
import com.pmaharana.sevice.MailService;

@Controller
public class ContactController {

	Logger log = LoggerFactory.getLogger(ContactController.class);
	
	@Autowired
	MailService mailService;
	
	@RequestMapping(value="/sendEmail", method=RequestMethod.POST)
	public void getContactPersonDetails(@RequestBody ContactDto contactDto){
		log.info("inside getContactPersonDetails() method"); 
		String subject="from fan";
		mailService.sendEmail(contactDto.getContactPersonEmail(), subject, contactDto.getContactPersonMsg());
	}
}
	