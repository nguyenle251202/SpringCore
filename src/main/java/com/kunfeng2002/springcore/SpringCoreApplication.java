package com.kunfeng2002.springcore;

import com.kunfeng2002.springcore.senders.InitializeMessage;
import com.kunfeng2002.springcore.senders.NotificationSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        InitializeMessage initializeMessage1 = new InitializeMessage("Hello, I'm KunFeng2002");

        InitializeMessage initializeMessage2 = initializeMessage1.clone();  // Clone the object for Prototype

        System.out.println("Message1:" + initializeMessage1.getMessage());

        initializeMessage1.setMessage("Hi, I'm KunFeng2002");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringCoreApplication.class);

        NotificationSender sender = context.getBean(NotificationSender.class);
        sender.sendNotification("Message1:" + initializeMessage1.getMessage());
        System.out.println("======================================");
        sender.sendNotification("Message2:" + initializeMessage2.getMessage());
    }

}
