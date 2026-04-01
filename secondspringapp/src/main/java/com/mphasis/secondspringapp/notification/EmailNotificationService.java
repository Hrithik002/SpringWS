package com.mphasis.secondspringapp.notification;

import org.springframework.stereotype.Component;

@Component("emailNotificationService")
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Email to " + recipient + ": " + message);
    }
}
