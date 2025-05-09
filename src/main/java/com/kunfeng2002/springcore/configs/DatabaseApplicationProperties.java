package com.kunfeng2002.springcore.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class DatabaseApplicationProperties {

    public DatabaseApplicationProperties(
            @Value("${spring.datasource.url}") String dbUrl,
            @Value("${spring.datasource.username}") String dbUser
    ) {
        System.out.println("DB URL: " + dbUrl);
        System.out.println("DB User: " + dbUser);
    }
}
