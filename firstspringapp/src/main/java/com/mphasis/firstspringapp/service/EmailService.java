package com.mphasis.firstspringapp.service;

public class EmailService {
	private MailServerConfig config;

	public EmailService(MailServerConfig config) {
				this.config = config;
	}

	public MailServerConfig getConfig() {
		return config;
	}
	
	public void sendMail() {
		System.out.println("Sending Email using + " + config.getIp());
	}
	
	
}
