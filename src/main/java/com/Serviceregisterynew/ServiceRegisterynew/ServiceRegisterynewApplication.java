package com.Serviceregisterynew.ServiceRegisterynew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegisterynewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegisterynewApplication.class, args);
	}

}
