package com.kunfeng2002;

import com.kunfeng2002.config.ApplicatonContext;
import com.kunfeng2002.config.Prototype;
import com.kunfeng2002.config.Singleton;
import com.kunfeng2002.service.NotificationSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(ApplicatonContext.class);
        context.refresh();

        System.out.println("");

        System.out.println("---- Singleton Bean ----");
        Singleton s1 = context.getBean(Singleton.class);
        Singleton s2 = context.getBean(Singleton.class);
        System.out.println("Singleton instance: " + s1);
        System.out.println("Singleton instance: " + s2);
        System.out.println("Same? " + (s1 == s2));

        System.out.println("\n---- Prototype Bean ----");
        Prototype p1 = context.getBean(Prototype.class);
        Prototype p2 = context.getBean(Prototype.class);
        System.out.println("Prototype instance: " + p1);
        System.out.println("Prototype instance: " + p2);
        System.out.println("Same? " + (p1 == p2));

        System.out.println("");
        NotificationSender notificationSender = context.getBean(NotificationSender.class);
        notificationSender.send("Hello World!");
        context.close();
    }
}