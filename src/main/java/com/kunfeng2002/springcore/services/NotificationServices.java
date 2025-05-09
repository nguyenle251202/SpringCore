package com.kunfeng2002.springcore.services;

import org.springframework.stereotype.Component;

@Component("notificationService")
public interface NotificationServices {

    default void sendNotification(String message) {}
}
