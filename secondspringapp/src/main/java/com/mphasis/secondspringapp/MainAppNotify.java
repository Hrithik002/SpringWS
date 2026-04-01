package com.mphasis.secondspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.secondspringapp.notification.UserService;

public class MainAppNotify {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = context.getBean(UserService.class);
        userService.notifyUser();

        // ✅ Proper way to shut down Spring container
        context.close();
    }
}