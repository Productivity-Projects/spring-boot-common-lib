package com.springbootcommonlib.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class GmailCommonConfiguration {

	@Value("${spring.mail.host:dummy}")
	private String host;
	@Value("${spring.mail.port:587}")
	private Integer port;
	@Value("${spring.mail.username:dummy}")
	private String userName;
	@Value("${spring.mail.password:dummy}")
	private String password;
	@Value("${spring.mail.properties.mail.smtp.auth:dummy}")
	private String auth;
	@Value("${spring.mail.properties.mail.smtp.starttls.enable:dummy}")
	private String enable;

	@Bean
	public JavaMailSenderImpl mailSender() {
		JavaMailSenderImpl jms = new JavaMailSenderImpl();

		jms.setHost(host);
		jms.setPort(port);
		jms.setUsername(userName);
		jms.setPassword(password);
		jms.getJavaMailProperties().setProperty("mail.smtp.auth", auth);
		jms.getJavaMailProperties().setProperty("mail.smtp.starttls.enable", enable);
		return jms;
	}

}
