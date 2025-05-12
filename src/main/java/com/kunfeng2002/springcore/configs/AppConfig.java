package com.kunfeng2002.springcore.configs;

import com.kunfeng2002.springcore.beans.Prototype;
import com.kunfeng2002.springcore.beans.Singleton;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Prototype prototypeBean() {
        return new Prototype();
    }

    @Bean
    public Singleton singletonBean() {
        return new Singleton();
    }
}
