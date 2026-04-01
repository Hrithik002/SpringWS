package com.mphasis.firstspringapp.service;

public class OrderService {
	private EmailService emailService;

	public EmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	public void placeOrder() {
		System.out.println("order placed");
		emailService.sendMail();
	}

}
