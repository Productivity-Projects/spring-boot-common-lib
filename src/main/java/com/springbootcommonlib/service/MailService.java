package com.springbootcommonlib.service;

import com.springbootcommonlib.model.MailStructure;

public interface MailService {

	void sendMail(String mail, MailStructure mailStructure);

}
