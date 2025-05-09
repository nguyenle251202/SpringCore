package com.kunfeng2002.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringCoreApplication.class);

//        SpringApplication.run(SpringCoreApplication.class, args);
//        System.out.println("Hello, I'm KunFeng2002");
    }

}
