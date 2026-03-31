package com.mphasis.secondspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mphasis.secondspringapp.service.BankingService;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        BankingService service = context.getBean(BankingService.class);

        service.createAccount("John Doe", 500);
        service.deposit("ACC123", 100);

        try {
            service.deposit("ACC123", -50);
        } catch (Exception e) {
            // handled by aspect
        }

        context.close();
    }
}