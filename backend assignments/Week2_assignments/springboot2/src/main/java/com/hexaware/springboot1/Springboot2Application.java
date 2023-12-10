package com.hexaware.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexaware.springboot1.entities.User;

@SpringBootApplication
public class Springboot2Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Springboot2Application.class,args);
		User user= context.getBean(User.class);
		System.out.println(user);
	}

}
