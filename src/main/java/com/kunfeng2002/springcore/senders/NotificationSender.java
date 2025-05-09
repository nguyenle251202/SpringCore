package com.kunfeng2002.springcore.senders;

import com.kunfeng2002.springcore.services.NotificationServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationSender {
    private NotificationServices notificationServices;


    public NotificationSender(@Qualifier("emailNotificationImp") NotificationServices notificationServices) {
        this.notificationServices = notificationServices;
    }
    public void sendNotification(String message) {
        notificationServices.sendNotification(message);
    }
}
