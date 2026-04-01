package com.mphasis.secondspringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailService {
	@Autowired
	//@Qualifier("mailServerConfigB")
	private MailServerConfig mailServerConfig;

	public MailServerConfig getMailServerConfig() {
		return mailServerConfig;
	}

	public void setMailServerConfig(MailServerConfig mailServerConfig) {
		this.mailServerConfig = mailServerConfig;
	}
	
	public void sendMail() {
		System.out.println("Email sent using"+mailServerConfig.getIp());
	}

}
