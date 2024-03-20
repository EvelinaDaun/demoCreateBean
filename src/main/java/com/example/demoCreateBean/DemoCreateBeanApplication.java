package com.example.demoCreateBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoCreateBeanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoCreateBeanApplication.class, args);
		HelloInterface helloInterface = applicationContext.getBean(Hello.class);
		helloInterface.sayHello();
		helloInterface.sayHello(); // Samma objekt används flera gånger.
		helloInterface.sayHello();
	}

}
