package com.mphasis.secondspringapp.notification;

import org.springframework.stereotype.Component;

@Component("smsNotificationService")
public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("SMS to " + recipient + ": " + message);
    }
}
