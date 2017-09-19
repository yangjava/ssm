package com.ssm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.model.User;
import com.ssm.service.UserService;

@RequestMapping
@Controller
public class UserController {
	
	private   Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(){
		LOGGER.info("Hello world ssm ! ");
		User selectByPrimaryKey = userService.selectByPrimaryKey(1L);
		LOGGER.info("User: "+selectByPrimaryKey);
		return "hello";
	}

}
