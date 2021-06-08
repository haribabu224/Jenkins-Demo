package com.jenkins.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

private static final Logger log = LoggerFactory.getLogger(JenkinsDemoApplication.class);

	public static void main(String[] args) {
		log.info("===============================MAIN METHOD=========================>>>>>>>>");
		
		log.info("===============================MAIN METHOD 1=========================>>>>>>>>");
		
		log.info("===============================MAIN METHOD  2=========================>>>>>>>>");
		
		log.info("===============================MAIN METHOD  3=========================>>>>>>>>");
		log.info("===============================MAIN METHOD  4=========================>>>>>>>>");
		log.info("===============================MAIN METHOD  5=========================>>>>>>>>");
		log.info("===============================MAIN METHOD   5=========================>>>>>>>>");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}
	@PostConstruct
	public void init() {
		log.info("===============================INIT METHOD=========================>>>>>>>>");
	}

}
