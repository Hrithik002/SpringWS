package com.mphasis.firstspringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Component("smsService") //other bean
//@Repository("smsService") //DAO bean
@Service("smsService") // Service bean
public class SMSService {
	@Autowired
	private Providerservice providerService;
	public void sendSMS() {
		providerService.configureProvider();
		System.out.println("SMS Sent...");
	}

}
