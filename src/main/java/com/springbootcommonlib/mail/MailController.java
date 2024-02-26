package com.springbootcommonlib.mail;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping
public class MailController {
	
	@Autowired
	MailServiceImpl mailServiceImpl;
	
	@PostMapping("path")
	public String sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure ) {
		mailServiceImpl.sendMail(mail, mailStructure);
		return "sucessfully send the mail";
	}
	
	

}
