package com.cts.learning;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinTestApplication {

	public static Logger logger=LoggerFactory.getLogger(SpringJenkinTestApplication.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("Application is running...");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinTestApplication.class, args);
	}

}
