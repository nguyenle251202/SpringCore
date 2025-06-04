package com.kunfeng2002.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Singleton {
    public Singleton() {
        System.out.println("Singleton bean created");
    }
}
