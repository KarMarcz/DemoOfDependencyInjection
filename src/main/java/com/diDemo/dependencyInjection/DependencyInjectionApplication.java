package com.diDemo.dependencyInjection;

import com.diDemo.dependencyInjection.controllers.ConstructorInjectedController;
import com.diDemo.dependencyInjection.controllers.MyController;
import com.diDemo.dependencyInjection.controllers.PropertyInjectedController;
import com.diDemo.dependencyInjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myController = (MyController) applicationContext.getBean("myController");

		System.out.println(applicationContext.getBean(MyController.class).hello());
		System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(applicationContext.getBean(SetterInjectedController.class).sayHello());
		System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());
	}

}
