package com.jt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.jt.sso.mapper")
public class RunAppProvider01 {

	public static void main(String[] args) {
		SpringApplication.run(RunAppProvider01.class, args);
	}

}
