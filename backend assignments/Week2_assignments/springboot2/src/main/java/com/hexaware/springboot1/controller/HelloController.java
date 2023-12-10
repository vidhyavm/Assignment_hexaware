package com.hexaware.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot1.entities.User;

@Controller
@RequestMapping("/Controller")
public class HelloController {
	
	@RequestMapping("/hlo")
	@ResponseBody
	public String sayHello() {
		
		return "hi friends!";
	}
	
	
	@RequestMapping("/user")
	@ResponseBody
	public String getData() {
		User user=new User(101,"vidhya","premium",500);
		return user.toString();
		
	}

}
