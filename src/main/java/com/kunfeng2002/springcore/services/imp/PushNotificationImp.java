package com.kunfeng2002.springcore.services.imp;

import com.kunfeng2002.springcore.services.NotificationServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("pushNotificationImp")
@Primary
@Scope("singleton")
public class PushNotificationImp implements NotificationServices {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
