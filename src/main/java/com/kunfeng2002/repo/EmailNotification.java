package com.kunfeng2002.repo;

import com.kunfeng2002.service.NotificationService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class EmailNotification implements NotificationService {

    @PostConstruct
    public void init() {
        System.out.println("EmailNotification bean is created: " + this);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("EmailNotification bean is about to be destroyed: " + this);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Email: " + message);
    }
}
