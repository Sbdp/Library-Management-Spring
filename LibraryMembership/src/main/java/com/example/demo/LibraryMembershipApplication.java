package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@EnableMongoRepositories("com.example.demo.repository")
@SpringBootApplication(scanBasePackages={
"com.example.demo", "com.example.demo.service", "com.example.demo.controller"})
@ComponentScan(basePackages = {"com.example.demo","com.example.demo.service","com.example.demo.controller"})
public class LibraryMembershipApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryMembershipApplication.class, args);
	}

}
