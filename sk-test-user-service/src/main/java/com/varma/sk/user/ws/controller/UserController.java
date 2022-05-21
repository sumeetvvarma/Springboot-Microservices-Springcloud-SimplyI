package com.varma.sk.user.ws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private Environment environment;
	
	
	final Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@GetMapping(path="/check")
	public String status() {
		logger.info("inside status check....");
		return "users working port : "+environment.getProperty("local.server.port")+" test property "+environment.getProperty("test.property");
	}

}
