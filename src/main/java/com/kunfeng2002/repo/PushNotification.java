package com.kunfeng2002.repo;

import com.kunfeng2002.service.NotificationService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PushNotification implements NotificationService {

    @PostConstruct
    public void init() {
        System.out.println("PushNotification bean is created: " + this);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PushNotification bean is about to be destroyed: " + this);
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("Push: " + message);
    }
}
