package com.mphasis.secondspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.secondspringapp.service.GreetService;

public class MainApp {
	public static void main(String args[]) {
		System.out.println("Welcome to java based annotation");
		
		AnnotationConfigApplicationContext container = new
				AnnotationConfigApplicationContext(SpringConfig.class);
		
		GreetService greetService = container.getBean("greetService",GreetService.class);
		greetService.greet();
		
		container.close();
	}

}