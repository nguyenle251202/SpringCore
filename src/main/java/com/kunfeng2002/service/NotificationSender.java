package com.kunfeng2002.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("pushNotification") // Use "pushNotification" for PushNotification
public class NotificationSender {

    private final NotificationService notificationService;

    @Autowired
    public NotificationSender(
              // Use "pushNotification" for PushNotification
            NotificationService notificationService
    )
    {
        this.notificationService = notificationService;
    }
    public void send(String message) {
        notificationService.sendNotification(message);
    }
}
