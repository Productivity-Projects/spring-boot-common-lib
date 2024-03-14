package com.springbootcommonlib.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcommonlib.model.MailStructure;
import com.springbootcommonlib.service.MailService;
import com.springbootcommonlib.service.impl.MailServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/mail")
public class MailController {
	
	@Autowired
	MailService mailService;
	
	@PostMapping("send/{mail}")
	public String sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure ) {
		mailService.sendMail(mail, mailStructure);
		return "sucessfully send the mail";
	}
	
	

}
