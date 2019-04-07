package com.diDemo.dependencyInjection.config;

import com.diDemo.dependencyInjection.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${username}")
//    @Value("username")
    String user;

    @Value("${password}")
//    @Value("password")
    String password;

    @Value("${url}")
//    @Value("url")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertyPlaceholderConfigurer;
    }
}
