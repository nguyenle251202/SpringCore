package com.kunfeng2002.springcore.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Lifecycle {

    @PostConstruct
    public void init() {
        System.out.println("Lifecycle bean initialized");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Lifecycle bean destroyed");
    }

}
