package com.kunfeng2002.repo;

import com.kunfeng2002.service.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class PushNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Push: " + message);
    }
}
