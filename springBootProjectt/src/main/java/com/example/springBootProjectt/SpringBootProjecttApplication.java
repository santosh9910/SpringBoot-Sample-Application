package com.example.springBootProjectt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBootProjecttApplication {

	@Autowired
	private static Demo demo;

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(SpringBootProjecttApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();

		demo.demomethod();
	}


}
