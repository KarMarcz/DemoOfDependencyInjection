package com.diDemo.dependencyInjection;

import com.diDemo.dependencyInjection.controllers.MyController;
import com.diDemo.dependencyInjection.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myController = (MyController) applicationContext.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) applicationContext.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());

	}

}
