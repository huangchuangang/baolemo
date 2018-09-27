package com.sie.full;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.sie.full.dao")
@SpringBootApplication
public class FullApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullApplication.class, args);
	}
}
