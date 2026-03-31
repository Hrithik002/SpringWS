package com.mphasis.secondspringapp.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service("orderService")
public class OrderService {
	@Autowired
	private EmailService emailService;
	
	
	public EmailService getEmailService() {
		return emailService;
	}
 
 
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
 
 
	public void placeorder() {
		emailService.sendMail();
		System.out.println("Order Placed..");
	}
 
}
 
 