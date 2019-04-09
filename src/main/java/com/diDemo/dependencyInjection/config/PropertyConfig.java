package com.diDemo.dependencyInjection.config;

import com.diDemo.dependencyInjection.examplebeans.FakeDataSource;
import com.diDemo.dependencyInjection.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class PropertyConfig {

    @Value("${username2}")
//    @Value("username")
    String user;

    @Value("${password}")
//    @Value("password")
    String password;

    @Value("${url}")
//    @Value("url")
    String url;

    @Value("${someData.jms.username}")
    String jmsUserName;

    @Value("${someData.jms.password}")
    String jmsPassword;

    @Value("${someData.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUserName);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

}
