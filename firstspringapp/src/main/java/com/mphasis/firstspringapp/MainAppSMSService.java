package com.mphasis.firstspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mphasis.firstspringapp.service.EmailService;
import com.mphasis.firstspringapp.service.GreetService;
import com.mphasis.firstspringapp.service.MailServerConfig;
import com.mphasis.firstspringapp.service.OrderService;
import com.mphasis.firstspringapp.service.Providerservice;
import com.mphasis.firstspringapp.service.SMSService;

public class MainAppSMSService {
    
    public static void main(String args[]) {
     
        ClassPathXmlApplicationContext container = 
                new ClassPathXmlApplicationContext("Spring-config.xml");
        
        SMSService smsService = container.getBean("smsService",SMSService.class);
        smsService.sendSMS();
        
        Providerservice providerService = container.getBean("providerService",Providerservice.class);
        providerService.configureProvider();
        
        
        container.close();
        container.registerShutdownHook();
    }
}
