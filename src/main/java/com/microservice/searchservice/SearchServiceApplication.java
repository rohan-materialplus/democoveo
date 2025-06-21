package com.microservice.searchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SearchServiceApplication {
	public static void main(String[] args) {SpringApplication.run(SearchServiceApplication.class, args);}
}