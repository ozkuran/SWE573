package com.ozkuran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class BukoopApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
            SpringApplication.run(BukoopApplication.class, args);
	}
}
