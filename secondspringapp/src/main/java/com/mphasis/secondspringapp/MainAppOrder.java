package com.mphasis.secondspringapp;
 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
import com.mphasis.secondspringapp.service.OrderService;
 
public class MainAppOrder {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext container = new
				AnnotationConfigApplicationContext(SpringConfig.class);
		
		OrderService orderService = container.getBean("orderService",OrderService.class);
		orderService.placeorder();
		
		container.close();
	}
 
}
 
 