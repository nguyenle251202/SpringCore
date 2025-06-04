package com.kunfeng2002.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Prototype {
    public Prototype() {
        System.out.println("Prototype bean created");
    }
}
