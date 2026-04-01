package com.mphasis.secondspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mphasis.secondspringapp.config.DatabaseConfig;
import com.mphasis.secondspringapp.repository.UserRepository;

public class MainAppData {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();

        // ✅ THIS LINE IS REQUIRED
        context.getEnvironment().setActiveProfiles("dev");

        context.register(DatabaseConfig.class);
        context.refresh();

        UserRepository repo = context.getBean(UserRepository.class);
        repo.show();

        context.close();
    }
}