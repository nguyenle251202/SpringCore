package com.kunfeng2002.springcore;

import com.kunfeng2002.springcore.senders.InitializeMessage;
import com.kunfeng2002.springcore.senders.NotificationSender;
import com.kunfeng2002.springcore.services.imp.EmailNotificationImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        InitializeMessage initializeMessage1 = new InitializeMessage("Hello, I'm KunFeng2002");
        InitializeMessage initializeMessage2 = initializeMessage1.clone();  // Clone the object for Prototype
        initializeMessage1.setMessage("Hi, I'm KunFeng2002");
        //
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringCoreApplication.class);
        NotificationSender sender = context.getBean(NotificationSender.class);
//        sender.sendNotification("Message2: " + initializeMessage2.getMessage());
        EmailNotificationImp emailNotificationImp1 = (EmailNotificationImp) context.getBean("emailNotificationImp");
        EmailNotificationImp emailNotificationImp2 = (EmailNotificationImp) context.getBean("emailNotificationImp");
        //
        emailNotificationImp1.sendNotification("Message1: " + initializeMessage1.getMessage());
        emailNotificationImp2.sendNotification("Message2: " + initializeMessage2.getMessage());
        //
        context.close();
    }
}
