package com.diDemo.dependencyInjection.config;

import com.diDemo.dependencyInjection.examplebeans.FakeDataSource;
import com.diDemo.dependencyInjection.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
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

    @Value("${jms.username}")
    String jmsUserName;

    @Value("${jms.password}")
    String jmsPassword;

    @Value("${jms.url}")
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
