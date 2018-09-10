package com.chinasie.baoleme;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.chinasie.baoleme.dao")
@SpringBootApplication
public class BaolemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaolemeApplication.class, args);
	}
}
