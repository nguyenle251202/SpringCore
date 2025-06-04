package com.kunfeng2002.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
@ComponentScan("com.kunfeng2002")
public class ApplicatonContext {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Singleton singleton() {
        return new Singleton();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Prototype prototype() {
        return new Prototype();
    }

    @PostConstruct
    public void init() {
        System.out.println("Application context initialized with custom beans");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Cleaning up resources before shutdown");
    }
}
