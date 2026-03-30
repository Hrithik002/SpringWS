package com.mphasis.firstspringapp;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mphasis.firstspringapp.service.EmailService;
import com.mphasis.firstspringapp.service.GreetService;
import com.mphasis.firstspringapp.service.MailServerConfig;
import com.mphasis.firstspringapp.service.OrderService;
import com.mphasis.firstspringapp.service.ProviderService;
import com.mphasis.firstspringapp.service.SMSService;
 
public class MainAppSMSService {
    
    public static void main(String args[]) {
     
        ClassPathXmlApplicationContext container =
                new ClassPathXmlApplicationContext("Spring-config.xml");
        
     
        
        SMSService smsservice = container.getBean("smsService", SMSService.class);
       // System.out.println(orderservice);
        smsservice.sendSMS();
        
        ProviderService providerservice = container.getBean("providerService", ProviderService.class);
        // System.out.println(orderservice);
         providerservice.configureProvider();
         
        
        container.close();
        container.registerShutdownHook();
    }
}
 
 