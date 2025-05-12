package com.kunfeng2002.springcore.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;

@Component
@Scope("prototype")
public class Prototype {
    public Prototype() {
        System.out.println("Prototype bean created");
    }
}
