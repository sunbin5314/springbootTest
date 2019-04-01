package com.sunbin.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.sunbin.demo.mapper")
@SpringBootApplication
public class SpringbootMybitisXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybitisXmlApplication.class, args);
	}

}
