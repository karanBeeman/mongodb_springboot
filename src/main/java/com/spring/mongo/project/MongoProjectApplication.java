package com.spring.mongo.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class MongoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoProjectApplication.class, args);
	}

}
