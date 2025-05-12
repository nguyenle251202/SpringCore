package com.kunfeng2002.springcore.services.imp;

import com.kunfeng2002.springcore.services.NotificationServices;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emailNotificationImp")
@Primary
@Scope("prototype")
public class EmailNotificationImp implements NotificationServices {

    @Override
    public void sendNotification(String message) {
        System.out.println("EMAIL: " + message);
    }
}
