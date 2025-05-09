package com.kunfeng2002.springcore.senders;

import com.kunfeng2002.springcore.services.NotificationServices;

public class NotificationSender {
    private NotificationServices notificationServices;

    public NotificationSender(NotificationServices notificationServices) {
        this.notificationServices = notificationServices;
    }

    public void send(String message) {
        notificationServices.sendNotification(message);
    }
}
