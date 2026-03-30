package com.mphasis.firstspringapp;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mphasis.firstspringapp.service.EmailService;
import com.mphasis.firstspringapp.service.GreetService;
import com.mphasis.firstspringapp.service.MailServerConfig;
import com.mphasis.firstspringapp.service.OrderService;
 
public class MainAppOrderService {
    
    public static void main(String args[]) {
     
        ClassPathXmlApplicationContext container =
                new ClassPathXmlApplicationContext("Spring-config.xml");
        
     
        
        OrderService orderservice = container.getBean("orderService", OrderService.class);
       // System.out.println(orderservice);
        orderservice.placeOrder();
        
        container.close();
        container.registerShutdownHook();
    }
}
 
 