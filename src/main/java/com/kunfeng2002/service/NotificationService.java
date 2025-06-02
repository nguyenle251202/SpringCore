package com.kunfeng2002.service;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier
public interface NotificationService {
    void sendNotification(String message);
}
