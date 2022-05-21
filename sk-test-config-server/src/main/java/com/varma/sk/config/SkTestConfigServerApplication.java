package com.varma.sk.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class SkTestConfigServerApplication {
	
	private static Logger logger=LoggerFactory.getLogger(SkTestConfigServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SkTestConfigServerApplication.class, args);
		logger.debug("Application Start!!!!!!!!!!!");
	}

}
