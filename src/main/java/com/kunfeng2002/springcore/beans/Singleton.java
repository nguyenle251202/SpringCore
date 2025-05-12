package com.kunfeng2002.springcore.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Singleton {
    public Singleton() {
    }
}
