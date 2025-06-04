package com.kunfeng2002.repo;

import com.kunfeng2002.service.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("smsNotification")
@Scope
@Primary
public class SMSNotification implements NotificationService {

    @PostConstruct
    public void init() {
        System.out.println("SMSNotification bean is created: " + this);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("SMSNotification bean is about to be destroyed: " + this);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS: " + message);
    }
}
