package com.springbootcommonlib.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.springbootcommonlib.model.MailStructure;
import com.springbootcommonlib.service.MailService;

@Service
public class MailServiceImpl implements MailService {
	
	@Autowired
	JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username:dummy}")
	private String fromMail;
	
	public void sendMail(String mail, MailStructure mailStructure) {
		
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(fromMail);
		simpleMailMessage.setSubject(mailStructure.getSubject());
		simpleMailMessage.setText(mailStructure.getMessage());
		simpleMailMessage.setTo(mail);
		
		javaMailSender.send(simpleMailMessage);
	}

}
