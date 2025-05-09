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
        String dbName = (dbUrl.substring(dbUrl.lastIndexOf("/") + 1)).split("\\?")[0];
        System.out.println("DB Name: " + dbName);
        System.out.println("DB User: " + dbUser);
    }
}
