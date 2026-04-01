package com.bank.banking_aop_demo;

import com.bank.config.AppConfig;
import com.bank.service.BankService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

    	AnnotationConfigApplicationContext context =
    	        new AnnotationConfigApplicationContext(AppConfig.class);
    	

        BankService service = context.getBean(BankService.class);

        service.createAccount("John Doe", 500);
        service.deposit("ACC123", 200);
        service.withdraw("ACC123", 100);   // Validation error

        context.close();
    }
}
