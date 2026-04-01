package com.mphasis.firstspringapp.service;
 
public class EmailService {
	private MailServerConfig config;

	public EmailService(MailServerConfig config) {
		super();
		this.config = config;
	}

	public MailServerConfig getConfig() {
		return config;
	}

	public void sendMail() {
		System.out.println("sending mail using+"+config.getIp());
	}
	
	}
	
	
 
 
 