package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer		//启动EurekaServer服务端
public class RunAppEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(RunAppEurekaServer.class, args);
	}

}
