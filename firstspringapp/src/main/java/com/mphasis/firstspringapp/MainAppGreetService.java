package com.mphasis.firstspringapp;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mphasis.firstspringapp.service.EmailService;
import com.mphasis.firstspringapp.service.GreetService;
import com.mphasis.firstspringapp.service.MailServerConfig;
import com.mphasis.firstspringapp.service.OrderService;
 
public class MainAppGreetService {
    
    public static void main(String args[]) {
     
        ClassPathXmlApplicationContext container =
                new ClassPathXmlApplicationContext("Spring-config.xml");
        
        GreetService greetService = container.getBean("greetService", GreetService.class);
        System.out.println(greetService);
        greetService.greet();
        
        MailServerConfig mailConfig = container.getBean("mailServerConfig", MailServerConfig.class);
        System.out.println("Mail Server IP: " + mailConfig.getIp());
        System.out.println("Login: " + mailConfig.getLogin());
        System.out.println("Token: " + mailConfig.getToken());
        
        EmailService emailservice = container.getBean("emailService", EmailService.class);
        System.out.println(emailservice);
        emailservice.sendMail();
        
        OrderService orderservice = container.getBean("orderService", OrderService.class);
        System.out.println(orderservice);
        orderservice.placeOrder();
        
        container.close();
        container.registerShutdownHook();
    }
}
 
 