package com.kunfeng2002.springcore.services.imp;

import com.kunfeng2002.springcore.services.NotificationServices;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("smsNotificationImp")
@Primary
public class SMSNotificationImp implements NotificationServices {

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS: " + message);
    }
}
