package com.mphasis.secondspringapp.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private NotificationService notificationService;

    @Autowired
    public UserService(
        @Qualifier("emailNotificationService")
        NotificationService notificationService
    ) {
        this.notificationService = notificationService;
    }

    public void notifyUser() {
        notificationService.sendNotification(
            "Welcome to Spring!",
            "meghana@email.com"
        );
    }
}